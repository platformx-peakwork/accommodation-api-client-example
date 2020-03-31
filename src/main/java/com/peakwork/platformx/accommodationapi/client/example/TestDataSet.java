package com.peakwork.platformx.accommodationapi.client.example;

import com.google.type.Date;
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
import com.peakwork.api.accommodation.v1.offerdata.PersonFilter;
import com.peakwork.api.accommodation.v1.offerdata.PersonPrice;
import com.peakwork.api.accommodation.v1.offerdata.PriceSet;
import com.peakwork.api.accommodation.v1.offerdata.Room_OfferData;
import java.util.Calendar;

public class TestDataSet {

    public static Accommodation createAccommodation() {
        return Accommodation.newBuilder()
                .setSupplierAccommodationId("testId")
                .setStarRating(3.0)
                .setAddress(Address.newBuilder()
                        .setCountry("DE")
                        .setCity("Dusseldorf")
                        .setStreet("Sunset Blvd")
                        .build())
                .putName("en_US", "Hotel1")
                .addArrivalAirports("DUS")
                .build();
    }

    public static Room createRoom() {
        return Room.newBuilder()
                .putName("en_US", "Room1")
                .setRoomIdentifier("roomId")
                .addGlobalTypes(GlobalType.newBuilder()
                        .setGT("GT04-FH")
                        .setST("ST04_VI")
                        .build())
                .setOccupancy(Occupancy.newBuilder()
                        .setMinPax(1)
                        .setMaxPax(2)
                        .setMinAdults(1)
                        .setMaxAdults(2)
                        .setMaxChildren(1)
                        .build())
                .build();
    }

    public static Board createBoard() {
        return Board.newBuilder()
                .putName("en_US", "Board1")
                .setBoardIdentifier("boardId")
                .addGlobalTypes(GlobalType.newBuilder()
                        .setGT("GT06-XX")
                        .build())
                .build();
    }

    public static Rate createRate() {
        return Rate.newBuilder()
                .setRateIdentifier("rateId")
                .addGlobalTypes(GlobalType.newBuilder()
                        .setGT("GT01-AP")
                        .build())
                .build();
    }

    public static Accommodation_OfferData createOfferData() {
        return Accommodation_OfferData.newBuilder()
                .setAccommodationIdentifier("testId")
                .setRateIdentifier("rateId")
                .setCurrency("EUR")
                .putPriceSets(0, PriceSet.newBuilder().build())
                .putPriceSets(1, PriceSet.newBuilder()
                        .addPersonPrices(PersonPrice.newBuilder()
                                .setPersonPrice(1.0)
                                .addPersonFilters(PersonFilter.newBuilder().build())
                                .build())
                        .build())
                .addRooms(Room_OfferData.newBuilder()
                        .setRoomIdentifier("roomId")
                        .addBoards(Board_OfferData.newBuilder()
                                .setBoardIdentifier("boardId")
                                .addOfferGroups(OfferGroup.newBuilder()
                                        .addDateLosGroups(DateLosGroup.newBuilder()
                                                .addArrivalDates(getDateOfTomorrow())
                                                .addLoses(1)
                                                .build())
                                        .setOffer(OfferValue.newBuilder()
                                                .addPriceSetKeys(0) // the first key is currently ignored
                                                .addPriceSetKeys(1)
                                                .build())
                                        .build())
                                .build())
                        .build())
                .build();
    }

    private static Date getDateOfTomorrow() {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(new java.util.Date());
        calendar.add(Calendar.DATE, 1);

        return Date.newBuilder()
                .setDay(calendar.get(Calendar.DAY_OF_MONTH))
                .setMonth(calendar.get(Calendar.MONTH) + 1)
                .setYear(calendar.get(Calendar.YEAR))
                .build();
    }
}
