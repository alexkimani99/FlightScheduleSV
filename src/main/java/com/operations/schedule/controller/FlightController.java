package com.operations.schedule.controller;

import com.operations.schedule.model.Arrival;
import com.operations.schedule.model.Departure;
import com.operations.schedule.service.ArrivalService;
import com.operations.schedule.service.DepartureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/flights")
public class FlightController {
    @Autowired
    private ArrivalService arrivalService;

    @Autowired
    private DepartureService departureService;

    @GetMapping("/arrivals")
    public List<Arrival> getAllArrivals(){
        return arrivalService.getAllArrivals();
    }

    @GetMapping("/departures")
    public List<Departure> getAllDepartures(){
        return departureService.getAllDepartures();
    }

    //POSTMAN Tests
    @PostMapping("/arrivals")
    public Arrival createArrival(@RequestBody Arrival arrival) {
        return arrivalService.saveArrival(arrival);
    }

    @PostMapping("/departures")
    public Departure createDeparture(@RequestBody Departure departure) {
        return departureService.saveDeparture(departure);
    }
}
