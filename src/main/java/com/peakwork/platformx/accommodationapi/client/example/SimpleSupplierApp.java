package com.peakwork.platformx.accommodationapi.client.example;

import com.google.rpc.Code;
import com.google.rpc.Status;
import com.peakwork.platformx.accommodationapi.client.example.client.ApiChannel;
import com.peakwork.platformx.accommodationapi.client.example.client.ApiClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SimpleSupplierApp {

    private static final Logger logger = LoggerFactory.getLogger(SimpleSupplierApp.class);

    public static void main(String[] args) {

        ApiChannel channel = new ApiChannel("localhost:8000",
                "AIzaSyBsdVwI1NqKXcdGG56ah26imtMoIDoHpTg");

        ApiClient client = new ApiClient(channel);


        logger.info("Sending accommodation request...");
        Status upsertAccommodation = client.upsertAccommodation(TestDataSet.createAccommodation());
        logger.info("Status: {}", Code.forNumber( upsertAccommodation.getCode()).name());

        logger.info("Sending rate request...");
        Status upsertRate = client.upsertRate(TestDataSet.createRate());
        logger.info("Status: {}", Code.forNumber( upsertRate.getCode()).name());

        logger.info("Sending board request...");
        Status upsertBoard = client.upsertBoard(TestDataSet.createBoard());
        logger.info("Status: {}", Code.forNumber( upsertBoard.getCode()).name());

        logger.info("Sending room request...");
        Status upsertRoom = client.upsertRoom(TestDataSet.createRoom());
        logger.info("Status: {}", Code.forNumber( upsertRoom.getCode()).name());

        logger.info("Sending offer data request...");
        Status upsertAccommodationOfferData = client.upsertOfferData(TestDataSet.createOfferData());
        logger.info("Status: {}", Code.forNumber( upsertAccommodationOfferData.getCode()).name());

        channel.closeConnections();
    }

}
