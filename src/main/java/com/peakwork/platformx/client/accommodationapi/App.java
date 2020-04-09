package com.peakwork.platformx.client.accommodationapi;

import com.google.rpc.Code;
import com.google.rpc.Status;
import com.peakwork.platformx.client.accommodationapi.data.BaseDataSet;
import com.peakwork.platformx.client.accommodationapi.data.OfferDataSet;
import com.peakwork.platformx.client.accommodationapi.service.BaseDataService;
import com.peakwork.platformx.client.accommodationapi.service.OfferDataService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class App {

    private static final Logger logger = LoggerFactory.getLogger(App.class);

    public static void main(String[] args) {

        String url = getArgument(args, 0, "url");
        String apiKey = getArgument(args, 1, "api key");

        try (Connection connection = new Connection(url, apiKey)) {

            BaseDataService baseDataService = new BaseDataService(connection);
            OfferDataService offerDataService = new OfferDataService(connection);

            sendBaseData(baseDataService);
            sendOfferData(offerDataService);
        }
    }

    private static void sendBaseData(BaseDataService baseDataService) {
        logger.info("Upsert accommodation call...");
        Status upsertAccommodation = baseDataService.upsertAccommodation(BaseDataSet.createAccommodation());
        logger.info("Status: {}", Code.forNumber(upsertAccommodation.getCode()).name());

        logger.info("Upsert rate call...");
        Status upsertRate = baseDataService.upsertRate(BaseDataSet.createRate());
        logger.info("Status: {}", Code.forNumber(upsertRate.getCode()).name());

        logger.info("Upsert board call...");
        Status upsertBoard = baseDataService.upsertBoard(BaseDataSet.createBoard());
        logger.info("Status: {}", Code.forNumber(upsertBoard.getCode()).name());

        logger.info("Upsert room call...");
        Status upsertRoom = baseDataService.upsertRoom(BaseDataSet.createRoom());
        logger.info("Status: {}", Code.forNumber(upsertRoom.getCode()).name());
    }

    private static void sendOfferData(OfferDataService offerDataService) {
        logger.info("Upsert accommodation offer data call...");
        Status upsertAccommodationOfferData = offerDataService.upsertOfferData(OfferDataSet.createOfferData());
        logger.info("Status: {}", Code.forNumber(upsertAccommodationOfferData.getCode()).name());
    }

    private static String getArgument(String[] args, int pos, String name) {
        if (args.length < pos + 1) {
            throw new IllegalArgumentException(String.format("Missing argument '%s' at position %d", name, pos));
        } else {
            return args[pos];
        }
    }

}
