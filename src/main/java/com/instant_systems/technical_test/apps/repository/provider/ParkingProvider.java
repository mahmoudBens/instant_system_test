package com.instant_systems.technical_test.apps.repository.provider;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.instant_systems.technical_test.apps.apputil.ParkingAnswerSerializer;
import com.instant_systems.technical_test.apps.apputil.RequestConstants;
import com.instant_systems.technical_test.apps.model.ParkingModel;
import com.instant_systems.technical_test.apps.model.ParkingRealTimeModel;
import com.instant_systems.technical_test.apps.repository.services.ParkingRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;

public class ParkingProvider implements ParkingRepository {

    public  ArrayList<ParkingModel> getListParkingInfo(){
        ArrayList<ParkingModel> parkingModelList = new ArrayList<> ();
        try {
            URL url = new URL(RequestConstants.GET_PARKING_INFO);
            BufferedReader in = new BufferedReader(
                    new InputStreamReader(
                            url.openStream()));

            String inputLine;
            Gson gson = new Gson();
            while ((inputLine = in.readLine()) != null){
                JsonObject jsonObject = gson.fromJson(inputLine,JsonObject.class);
                JsonArray recordsList = jsonObject.getAsJsonArray("records");
                recordsList.forEach(jsonElement -> {
                    ParkingModel parkingModel = gson.fromJson(jsonElement.getAsJsonObject().get("fields"),ParkingModel.class);
                    parkingModelList.add(parkingModel);
                });
            }
            in.close();
        } catch (Exception e) {
            Logger logger = LoggerFactory.getLogger(ParkingAnswerSerializer.class);
            logger.error(e.getMessage());
            e.printStackTrace();
        }
        return  parkingModelList;
    }


    public  ArrayList<ParkingRealTimeModel> getParkingRealTimeByName(String nomParking){

        ArrayList<ParkingRealTimeModel> parkingRealTimeList = new ArrayList<> ();
        try {
            URL url = new URL(RequestConstants.GET_PARKING_REAL_TIME_INFO+"&refine.nom"+nomParking);
            parkingRealTimeList =  serializeParkingModel(url);
        } catch (Exception e) {
            Logger logger = LoggerFactory.getLogger(ParkingAnswerSerializer.class);
            logger.error(e.getMessage());
            e.printStackTrace();
        }
        return  parkingRealTimeList;
    }



    public  ArrayList<ParkingRealTimeModel> getParkingRealTimeList(){

        ArrayList<ParkingRealTimeModel> parkingRealTimeList = new ArrayList<> ();
        try {
            URL url = new URL(RequestConstants.GET_PARKING_REAL_TIME_INFO);
            parkingRealTimeList =  serializeParkingModel(url);
        } catch (Exception e) {
            Logger logger = LoggerFactory.getLogger(ParkingAnswerSerializer.class);
            logger.error(e.getMessage());
            e.printStackTrace();
        }
        return  parkingRealTimeList;
    }

    private ArrayList<ParkingRealTimeModel> serializeParkingModel(URL url)throws IOException {
        ArrayList<ParkingRealTimeModel> parkingRealTimeModels = new ArrayList<> ();
        String input;
        BufferedReader in = new BufferedReader(
                new InputStreamReader(
                        url.openStream()));

        Gson gson = new Gson();
        while ((input = in.readLine()) != null){
            JsonObject jsonObject = gson.fromJson(input,JsonObject.class);
            JsonArray recordsList = jsonObject.getAsJsonArray("records");
            recordsList.forEach(jsonElement -> {

                ParkingRealTimeModel parkingRealTimeModel= gson.fromJson(jsonElement.getAsJsonObject().get("fields"),ParkingRealTimeModel.class);
                parkingRealTimeModels.add(parkingRealTimeModel);
            });
        }
        return parkingRealTimeModels;
    }
}
