package com.peakwork.platformx.client.accommodationapi.data;

import com.peakwork.api.accommodation.v1.basedata.Accommodation;
import com.peakwork.api.accommodation.v1.basedata.Address;
import com.peakwork.api.accommodation.v1.basedata.Board;
import com.peakwork.api.accommodation.v1.basedata.Occupancy;
import com.peakwork.api.accommodation.v1.basedata.Rate;
import com.peakwork.api.accommodation.v1.basedata.Room;
import com.peakwork.api.accommodation.v1.common.GlobalType;

public class BaseDataSet {

    public static Accommodation createAccommodation() {
        return Accommodation.newBuilder()
                .setSupplierAccommodationId("accommodationA")
                .setStarRating(3.0)
                .setAddress(Address.newBuilder()
                        .setCountry("DE")
                        .setCity("Dusseldorf")
                        .setStreet("Sunset Blvd")
                        .build())
                .putName("en_US", "Cecil Hotel")
                .putName("de_DE", "Cecil Hotel")
                .addArrivalAirports("DUS")
                .build();
    }

    public static Room createRoom() {
        return Room.newBuilder()
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
                .build();
    }

    public static Board createBoard() {
        return Board.newBuilder()
                .putName("en_US", "All inclusive")
                .putName("de_DE", "All inclusive")
                .setBoardIdentifier("boardA")
                .addGlobalTypes(GlobalType.newBuilder()
                        .setGT("GT06-XX")
                        .build())
                .build();
    }

    public static Rate createRate() {
        return Rate.newBuilder()
                .setRateIdentifier("rateA")
                .addGlobalTypes(GlobalType.newBuilder()
                        .setGT("GT01-AP")
                        .build())
                .build();
    }
}
