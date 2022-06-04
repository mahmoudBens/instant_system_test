package com.instant_systems.technical_test.apps.repository.services;

import com.instant_systems.technical_test.apps.model.ParkingModel;
import com.instant_systems.technical_test.apps.model.ParkingRealTimeModel;

import java.util.ArrayList;

public interface ParkingRepository  {

    public ArrayList<ParkingRealTimeModel> getParkingRealTimeByName(String name);
    public ArrayList<ParkingModel> getListParkingInfo();
}
