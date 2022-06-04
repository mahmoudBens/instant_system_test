package com.instant_systems.technical_test.apps.controller;

import com.instant_systems.technical_test.apps.apputil.RequestConstants;
import com.instant_systems.technical_test.apps.model.ParkingRealTimeModel;
import com.instant_systems.technical_test.apps.repository.provider.ParkingProvider;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@CrossOrigin()
@RequestMapping(RequestConstants.PARKING)
public class ParkingController {

    ParkingProvider parkingProvider = new ParkingProvider();

    @GetMapping(value = "/getRealTimeParkingInfo", produces = {MediaType.APPLICATION_JSON_VALUE})
    public List<ParkingRealTimeModel> getRealTimeParkingInfo(@RequestParam(value = "nomVille") String nomVille) {
        ArrayList<ParkingRealTimeModel> realTimeParkingInfo = parkingProvider.getParkingRealTimeList();
        return realTimeParkingInfo.stream().filter(parkingRealTimeModel -> parkingRealTimeModel.getGeo_point_2d() != null).collect(Collectors.toList());
    }
    @GetMapping(value = "/getRealTimeParkingInfoByName", produces = {MediaType.APPLICATION_JSON_VALUE})
    public List<ParkingRealTimeModel> getRealTimeParkingInfoByName(@RequestParam(value = "nomParking") String nomParking) {
        ArrayList<ParkingRealTimeModel> realTimeParkingInfo = parkingProvider.getParkingRealTimeByName(nomParking);
        return realTimeParkingInfo.stream().filter(parkingRealTimeModel -> parkingRealTimeModel.getGeo_point_2d() != null).collect(Collectors.toList());
    }


}