package com.peakwork.platformx.client.accommodationapi;

import static java.time.ZoneOffset.UTC;

import com.google.rpc.Code;
import com.google.rpc.Status;
import com.google.type.Date;
import com.peakwork.api.accommodation.v1.AccommodationOfferDataDeliveryRequest;
import com.peakwork.api.accommodation.v1.AccommodationRequest;
import com.peakwork.api.accommodation.v1.BaseDataServiceGrpc;
import com.peakwork.api.accommodation.v1.BaseDataServiceGrpc.BaseDataServiceBlockingStub;
import com.peakwork.api.accommodation.v1.BoardRequest;
import com.peakwork.api.accommodation.v1.OfferDataServiceGrpc;
import com.peakwork.api.accommodation.v1.OfferDataServiceGrpc.OfferDataServiceBlockingStub;
import com.peakwork.api.accommodation.v1.RateRequest;
import com.peakwork.api.accommodation.v1.RoomRequest;
import com.peakwork.api.accommodation.v1.basedata.Accommodation;
import com.peakwork.api.accommodation.v1.basedata.Address;
import com.peakwork.api.accommodation.v1.basedata.Board;
import com.peakwork.api.accommodation.v1.basedata.Occupancy;
import com.peakwork.api.accommodation.v1.basedata.Rate;
import com.peakwork.api.accommodation.v1.basedata.Room;
import com.peakwork.api.accommodation.v1.common.GlobalType;
import com.peakwork.api.accommodation.v1.offerdata.Accommodation_OfferData;
import com.peakwork.api.accommodation.v1.offerdata.Board_OfferData;
import com.peakwork.api.accommodation.v1.offerdata.DateLosGroup;
import com.peakwork.api.accommodation.v1.offerdata.OfferGroup;
import com.peakwork.api.accommodation.v1.offerdata.OfferValue;
import com.peakwork.api.accommodation.v1.offerdata.Room_OfferData;
import io.grpc.CallOptions;
import io.grpc.Channel;
import io.grpc.ClientCall;
import io.grpc.ClientInterceptor;
import io.grpc.ClientInterceptors;
import io.grpc.ForwardingClientCall;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.Metadata;
import io.grpc.MethodDescriptor;
import java.time.LocalDate;
import java.time.temporal.ChronoField;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class App {

    private static final Logger logger = LoggerFactory.getLogger(App.class);

    public static void main(String[] args) {

        String url = getArgument(args, 0, "url");
        String apiKey = getArgument(args, 1, "api key");

        ManagedChannel managedChannel = getManagedChannel(url);

        try {
            // provide api key via call interceptor
            Channel channel = getChannel(apiKey, managedChannel);

            // execute all calls to send base and offer data
            sendBaseData(channel);
            sendOfferData(channel);

        } finally {
            // close connection
            managedChannel.shutdown();
        }
    }

    private static String getArgument(String[] args, int pos, String name) {
        if (args.length < pos + 1) {
            throw new IllegalArgumentException(String.format("Missing argument '%s' at position %d", name, pos));
        } else {
            return args[pos];
        }
    }

    private static ManagedChannel getManagedChannel(String url) {
        return ManagedChannelBuilder.forTarget(url)
                // use secured channel by default
                .build();
    }

    private static Channel getChannel(String apiKey, ManagedChannel managedChannel) {
        return ClientInterceptors.intercept(managedChannel, new ClientInterceptor() {
            @Override
            public <ReqT, RespT> ClientCall<ReqT, RespT> interceptCall(
                    MethodDescriptor<ReqT, RespT> methodDescriptor,
                    CallOptions callOptions, Channel channel1) {
                ClientCall<ReqT, RespT> call = channel1.newCall(methodDescriptor, callOptions);

                call = new ForwardingClientCall.SimpleForwardingClientCall<ReqT, RespT>(call) {
                    @Override
                    public void start(Listener<RespT> responseListener, Metadata headers) {
                        if (apiKey != null && !apiKey.isEmpty()) {
                            headers.put(
                                    Metadata.Key.of("x-api-key", Metadata.ASCII_STRING_MARSHALLER),
                                    apiKey);
                        }
                        super.start(responseListener, headers);
                    }
                };
                return call;
            }
        });
    }

    private static void sendBaseData(Channel channel) {
        // Create new base data gRPC service stub. This creates a blocking stub, but you can also use asynchronous and future based stubs.
        BaseDataServiceGrpc.BaseDataServiceBlockingStub baseDataService = BaseDataServiceGrpc.newBlockingStub(channel);

        // execute each call to insert/update an accommodation, a rate, a room and a board
        sendAccommodation(baseDataService);
        sendRate(baseDataService);
        sendRoom(baseDataService);
        sendBoard(baseDataService);
    }

    private static void sendAccommodation(BaseDataServiceGrpc.BaseDataServiceBlockingStub baseDataService) {
        logger.info("Upsert accommodation call...");

        Address address = Address.newBuilder()
                .setCountry("DE")
                .setCity("Dusseldorf")
                .setStreet("Sunset Blvd")
                .build();

        Accommodation accommodation = Accommodation.newBuilder()
                .setSupplierAccommodationId("accommodationA")
                .setStarRating(3.0)
                .setAddress(address)
                .putName("en_US", "Cecil Hotel")
                .putName("de_DE", "Cecil Hotel")
                .addArrivalAirports("DUS")
                .build();

        AccommodationRequest accommodationRequest = AccommodationRequest.newBuilder()
                .setAccommodation(accommodation)
                .build();

        // execute the call
        Status upsertAccommodation = baseDataService.upsertAccommodation(accommodationRequest);

        // get the status result
        logger.info("Status: {}", Code.forNumber(upsertAccommodation.getCode()).name());
    }

    private static void sendRate(BaseDataServiceBlockingStub baseDataService) {

        logger.info("Upsert rate call...");

        RateRequest rateRequest = RateRequest.newBuilder().setRate(Rate.newBuilder()
                .setRateIdentifier("rateA")
                .addGlobalTypes(GlobalType.newBuilder()
                        .setGT("GT01-AP")
                        .build())
                .build()).build();

        // execute the call
        Status upsertRate = baseDataService.upsertRate(rateRequest);

        // get the status result
        logger.info("Status: {}", Code.forNumber(upsertRate.getCode()).name());

    }

    private static void sendRoom(BaseDataServiceBlockingStub baseDataService) {
        logger.info("Upsert room call...");

        RoomRequest roomRequest = RoomRequest.newBuilder().setRoom(Room.newBuilder()
                .putName("en_US", "Deluxe double room")
                .putName("de_DE", "Deluxe Doppelzimmer")
                .setRoomIdentifier("roomA")
                .addGlobalTypes(GlobalType.newBuilder()
                        .setGT("GT04-RO")
                        .setST("ST04_DO")
                        .build())
                .setOccupancy(Occupancy.newBuilder()
                        .setMinPax(1)
                        .setMaxPax(2)
                        .setMinAdults(1)
                        .setMaxAdults(2)
                        .setMaxChildren(1)
                        .build())
                .build()).build();

        // execute the call
        Status upsertRoom = baseDataService.upsertRoom(roomRequest);

        // get the status result
        logger.info("Status: {}", Code.forNumber(upsertRoom.getCode()).name());
    }

    private static void sendBoard(BaseDataServiceBlockingStub baseDataService) {
        logger.info("Upsert board call...");

        BoardRequest boardRequest = BoardRequest.newBuilder().setBoard(Board.newBuilder()
                .putName("en_US", "All inclusive")
                .putName("de_DE", "All inclusive")
                .setBoardIdentifier("boardA")
                .addGlobalTypes(GlobalType.newBuilder()
                        .setGT("GT06-XX")
                        .build())
                .build()).build();

        // execute the call
        Status upsertBoard = baseDataService.upsertBoard(boardRequest);

        // get the status result
        logger.info("Status: {}", Code.forNumber(upsertBoard.getCode()).name());
    }

    private static void sendOfferData(Channel channel) {
        // Create new base data gRPC service stub. This creates a blocking stub, but you can also used asynchronous and future based stubs.
        OfferDataServiceBlockingStub offerDataService = OfferDataServiceGrpc
                .newBlockingStub(channel);

        // make an UpsertAccommodationOfferData call to insert/update all offers for one accommodation+rate combination
        sendAccommodationOfferData(offerDataService);
    }

    private static void sendAccommodationOfferData(OfferDataServiceBlockingStub offerDataService) {
        logger.info("Upsert accommodation offer data call...");

        Date tomorrow = fromDateTime(LocalDate.now(UTC).plusDays(1));
        Date dayAfterTomorrow = fromDateTime(LocalDate.now(UTC).plusDays(2));

        // create 'date and length of stay group'
        // for LOS=1
        // define DATE:LOS combinations
        // tomorrow:1 , dayAfterTomorrow:1
        DateLosGroup dateLosGroupWithLos1 = DateLosGroup.newBuilder()
                .addArrivalDates(tomorrow)
                .addArrivalDates(dayAfterTomorrow)
                .addLoses(1)
                .build();

        // create 'offer value' with object prices
        // 60 units of currency
        OfferValue offerValue60 = OfferValue.newBuilder()
                .setObjectPrice(60)
                .build();

        // create first 'offer group': all offers in this group have the same price
        // using object price(single complete price for each given DATE:LOS combination within offer group)
        // price for LOS=1
        OfferGroup offerGroupLOS1 = OfferGroup.newBuilder()
                .addDateLosGroups(dateLosGroupWithLos1)
                .setOffer(offerValue60)
                .build();

        // create second offer group with a different price

        // for LOS=2
        // define DATE:LOS combinations:
        // tomorrow:2 , dayAfterTomorrow:2
        DateLosGroup dateLosGroupWithLos2 = DateLosGroup.newBuilder()
                .addArrivalDates(tomorrow)
                .addArrivalDates(dayAfterTomorrow)
                .addLoses(2)
                .build();

        // create 'offer value' with object prices
        // 100 units of currency
        OfferValue offerValue100 = OfferValue.newBuilder()
                .setObjectPrice(100)
                .build();

        // price for LOS=2
        OfferGroup offerGroupLOS2 = OfferGroup.newBuilder()
                .addDateLosGroups(dateLosGroupWithLos2)
                .setOffer(offerValue100)
                .build();

        // define offerGroupLOS1, offerGroupLOS2 for combination accommodationA->rateA->roomA->boardA

        // create 'board offer data' for board "boardA" and add both offer groups
        Board_OfferData boardOfferData = Board_OfferData.newBuilder()
                .setBoardIdentifier("boardA")
                .addOfferGroups(offerGroupLOS1)
                .addOfferGroups(offerGroupLOS2)
                .build();

        // create 'room offer data' for room "roomA" and add previously created 'board offer data'
        Room_OfferData roomOfferData = Room_OfferData.newBuilder()
                .setRoomIdentifier("roomA")
                .addBoards(boardOfferData)
                .build();

        // create 'accommodation offer data' for accommodation "accommodationA" and rate "rateA" and add previously
        // created 'room offer data'
        // set currency here
        Accommodation_OfferData accommodationOfferData = Accommodation_OfferData.newBuilder()
                .setAccommodationIdentifier("accommodationA")
                .setRateIdentifier("rateA")
                .setCurrency("EUR")
                .addRooms(roomOfferData)
                .build();

        // create the request object
        AccommodationOfferDataDeliveryRequest accommodationOfferDataDeliveryRequest = AccommodationOfferDataDeliveryRequest
                .newBuilder()
                .setAccommodations(accommodationOfferData).build();

        // execute the call
        Status upsertAccommodationOfferData = offerDataService
                .upsertAccommodationOfferData(accommodationOfferDataDeliveryRequest);

        // get the status result
        logger.info("Status: {}", Code.forNumber(upsertAccommodationOfferData.getCode()).name());
    }

    private static Date fromDateTime(LocalDate dateTime) {
        return Date.newBuilder()
                .setDay(dateTime.get(ChronoField.DAY_OF_MONTH))
                .setMonth(dateTime.get(ChronoField.MONTH_OF_YEAR))
                .setYear(dateTime.get(ChronoField.YEAR))
                .build();

    }
}
