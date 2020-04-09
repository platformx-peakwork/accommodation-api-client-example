package com.peakwork.platformx.client.accommodationapi.data;


import static java.time.ZoneOffset.UTC;

import com.google.type.Date;
import com.peakwork.api.accommodation.v1.offerdata.Accommodation_OfferData;
import com.peakwork.api.accommodation.v1.offerdata.Board_OfferData;
import com.peakwork.api.accommodation.v1.offerdata.DateLosGroup;
import com.peakwork.api.accommodation.v1.offerdata.OfferGroup;
import com.peakwork.api.accommodation.v1.offerdata.OfferValue;
import com.peakwork.api.accommodation.v1.offerdata.Room_OfferData;
import java.time.LocalDate;
import java.time.temporal.ChronoField;

public class OfferDataSet {

    public static Accommodation_OfferData createOfferData() {

        Date tomorrow = fromDateTime(LocalDate.now(UTC).plusDays(1));
        Date dayAfterTomorrow = fromDateTime(LocalDate.now(UTC).plusDays(2));

        //create 'date and length of stay group'

        //for LOS=1
        //define DATE:LOS combinations
        //tomorrow:1 , dayAfterTomorrow:1
        DateLosGroup dateLosGroupWithLos1 = DateLosGroup.newBuilder()
                .addArrivalDates(tomorrow)
                .addArrivalDates(dayAfterTomorrow)
                .addLoses(1)
                .build();

        //for LOS=2
        //define DATE:LOS combinations:
        //tomorrow:2 , dayAfterTomorrow:2
        DateLosGroup dateLosGroupWithLos2 = DateLosGroup.newBuilder()
                .addArrivalDates(tomorrow)
                .addArrivalDates(dayAfterTomorrow)
                .addLoses(2)
                .build();

        //create 'offer value' with object prices

        //100 units of currency
        OfferValue offerValue100 = OfferValue.newBuilder()
                .setObjectPrice(100)
                .build();

        //60 units of currency
        OfferValue offerValue60 = OfferValue.newBuilder()
                .setObjectPrice(60)
                .build();

        //create 'offer group'
        //using object price(single complete price for each given DATE:LOS combination within offer group)

        //price for LOS=1
        OfferGroup offerGroupLOS1 = OfferGroup.newBuilder()
                .addDateLosGroups(dateLosGroupWithLos1)
                .setOffer(offerValue60)
                .build();

        //price for LOS=2
        OfferGroup offerGroupLOS2 = OfferGroup.newBuilder()
                .addDateLosGroups(dateLosGroupWithLos2)
                .setOffer(offerValue100)
                .build();

        //define offerGroupLOS1, offerGroupLOS2 for combination accommodationA->rateA->roomA->boardA

        //create 'board offer data'
        Board_OfferData boardOfferData = Board_OfferData.newBuilder()
                .setBoardIdentifier("boardA")
                .addOfferGroups(offerGroupLOS1)
                .addOfferGroups(offerGroupLOS2)
                .build();

        //create 'room offer data'
        //also adding previously created 'board offer data'
        Room_OfferData roomOfferData = Room_OfferData.newBuilder()
                .setRoomIdentifier("roomA")
                .addBoards(boardOfferData)
                .build();

        Accommodation_OfferData accommodationOfferData = Accommodation_OfferData.newBuilder()
                .setAccommodationIdentifier("accommodationA")
                .setRateIdentifier("rateA")
                .setCurrency("EUR")
                .addRooms(roomOfferData)
                .build();

        return accommodationOfferData;
    }

    private static Date fromDateTime(LocalDate dateTime) {
        return Date.newBuilder()
                .setDay(dateTime.get(ChronoField.DAY_OF_MONTH))
                .setMonth(dateTime.get(ChronoField.MONTH_OF_YEAR))
                .setYear(dateTime.get(ChronoField.YEAR))
                .build();

    }
}
