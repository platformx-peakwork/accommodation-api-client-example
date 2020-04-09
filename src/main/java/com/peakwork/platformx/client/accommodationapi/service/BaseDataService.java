package com.peakwork.platformx.client.accommodationapi.service;

import com.google.rpc.Status;
import com.peakwork.api.accommodation.v1.AccommodationRequest;
import com.peakwork.api.accommodation.v1.BaseDataServiceGrpc;
import com.peakwork.api.accommodation.v1.BoardRequest;
import com.peakwork.api.accommodation.v1.RateRequest;
import com.peakwork.api.accommodation.v1.RoomRequest;
import com.peakwork.api.accommodation.v1.basedata.Accommodation;
import com.peakwork.api.accommodation.v1.basedata.Board;
import com.peakwork.api.accommodation.v1.basedata.Rate;
import com.peakwork.api.accommodation.v1.basedata.Room;
import com.peakwork.platformx.client.accommodationapi.Connection;

public class BaseDataService {

    private final BaseDataServiceGrpc.BaseDataServiceBlockingStub baseDataService;

    public BaseDataService(Connection connection) {
        baseDataService = BaseDataServiceGrpc.newBlockingStub(connection.getChannel());
    }

    public Status upsertRate(Rate rate) {
        return baseDataService.upsertRate(RateRequest.newBuilder().setRate(rate).build());
    }


    public Status upsertBoard(Board board) {
        return baseDataService.upsertBoard(BoardRequest.newBuilder().setBoard(board).build());
    }

    public Status upsertRoom(Room room) {
        return baseDataService.upsertRoom(RoomRequest.newBuilder().setRoom(room).build());
    }

    public Status upsertAccommodation(Accommodation accommodation) {
        return baseDataService
                .upsertAccommodation(AccommodationRequest.newBuilder().setAccommodation(accommodation).build());
    }

}
