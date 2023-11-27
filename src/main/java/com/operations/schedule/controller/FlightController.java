package com.operations.schedule.controller;

import com.operations.schedule.model.Arrival;
import com.operations.schedule.model.Departure;
import com.operations.schedule.service.ArrivalService;
import com.operations.schedule.service.DepartureService;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1/api/flights")
public class FlightController {
    @Autowired
    private ArrivalService arrivalService;

    @Autowired
    private DepartureService departureService;

    // Get Arrivals
    @GetMapping("/arrivals")
    public List<Arrival> getAllArrivals(){
        return arrivalService.getAllArrivals();
    }

    // Get Departures
    @GetMapping("/departures")
    public List<Departure> getAllDepartures(){
        return departureService.getAllDepartures();
    }

    //Post arrivals and departures
    @PostMapping("/arrivals")
    public Arrival createArrival(@RequestBody Arrival arrival) {
        return arrivalService.saveArrival(arrival);
    }

    @PostMapping("/departures")
    public Departure createDeparture(@RequestBody Departure departure) {
        return departureService.saveDeparture(departure);
    }

    // Edit Arrivals
    @PutMapping("/arrivals/{id}")
    public ResponseEntity<String> updateArrival(@PathVariable Long id, @RequestBody Arrival updatedArrival) {
        try {
            arrivalService.updateArrival(id, updatedArrival);
            return ResponseEntity.ok("Arrival updated successfully");
        } catch (EntityNotFoundException e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
                    .body("Arrival not found with id: " + id);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body("Error updating arrival: " + e.getMessage());
        }
    }

    // Edit Departures
    @PutMapping("/departures/{id}")
    public ResponseEntity<String> updateDeparture(@PathVariable Long id, @RequestBody Departure updatedDeparture) {
        try {
            departureService.updateDeparture(id, updatedDeparture);
            return ResponseEntity.ok("Departure updated successfully");
        } catch (EntityNotFoundException e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
                    .body("Departure not found with id: " + id);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body("Error updating departure: " + e.getMessage());
        }
    }

    // Delete Arrivals
    @DeleteMapping("/arrivals/{id}")
    public ResponseEntity<String> deleteArrival(@PathVariable Long id) {
        try {
            arrivalService.deleteArrival(id);
            return ResponseEntity.ok("Arrival deleted successfully");
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body("Error deleting arrival: " + e.getMessage());
        }
    }

    // Delete Departures
    @DeleteMapping("/departures/{id}")
    public ResponseEntity<String> deleteDeparture(@PathVariable Long id) {
        try {
            departureService.deleteDeparture(id);
            return ResponseEntity.ok("Departure deleted successfully");
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body("Error deleting departure: " + e.getMessage());
        }
    }


}
