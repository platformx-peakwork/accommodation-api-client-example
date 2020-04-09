package com.peakwork.platformx.client.accommodationapi.service;

import com.google.rpc.Status;
import com.peakwork.api.accommodation.v1.AccommodationOfferDataDeliveryRequest;
import com.peakwork.api.accommodation.v1.OfferDataServiceGrpc;
import com.peakwork.api.accommodation.v1.offerdata.Accommodation_OfferData;
import com.peakwork.platformx.client.accommodationapi.Connection;

public class OfferDataService {

    private final OfferDataServiceGrpc.OfferDataServiceBlockingStub offerDataService;

    public OfferDataService(Connection connection) {
        offerDataService = OfferDataServiceGrpc.newBlockingStub(connection.getChannel());
    }

    public Status upsertOfferData(Accommodation_OfferData offerData) {
        return offerDataService.upsertAccommodationOfferData(AccommodationOfferDataDeliveryRequest.newBuilder()
                .setAccommodations(offerData).build());
    }

}
