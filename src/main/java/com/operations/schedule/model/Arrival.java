package com.operations.schedule.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

@Entity
public class Arrival {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    //Automated generation through database
    private Long id;
    private String airport;
    private String flightStatus;
    private String aircraftType;
    private String flightNumber;
    private String origin;
    private LocalDateTime estimatedTimeOfArrival;
    private int totalPassengers;
    private int totalLuggage;

    // Empty constructor for JPA
    public Arrival() {
    }

    // Constructor with parameters
    public Arrival(String airport, String flightStatus, String aircraftType,
                   String flightNumber, String origin, LocalDateTime estimatedTimeOfArrival,
                   int totalPassengers, int totalLuggage) {
        this.airport = airport;
        this.flightStatus = flightStatus;
        this.aircraftType = aircraftType;
        this.flightNumber = flightNumber;
        this.origin = origin;
        this.estimatedTimeOfArrival = estimatedTimeOfArrival;
        this.totalPassengers = totalPassengers;
        this.totalLuggage = totalLuggage;
    }


    //Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAirport() {
        return airport;
    }

    public void setAirport(String airport) {
        this.airport = airport;
    }

    public String getFlightStatus() {
        return flightStatus;
    }

    public void setFlightStatus(String flightStatus) {
        this.flightStatus = flightStatus;
    }

    public String getAircraftType() {
        return aircraftType;
    }

    public void setAircraftType(String aircraftType) {
        this.aircraftType = aircraftType;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public LocalDateTime getEstimatedTimeOfArrival() {
        return estimatedTimeOfArrival;
    }

    public void setEstimatedTimeOfArrival(LocalDateTime estimatedTimeOfArrival) {
        this.estimatedTimeOfArrival = estimatedTimeOfArrival;
    }

    public int getTotalPassengers() {
        return totalPassengers;
    }

    public void setTotalPassengers(int totalPassengers) {
        this.totalPassengers = totalPassengers;
    }

    public int getTotalLuggage() {
        return totalLuggage;
    }

    public void setTotalLuggage(int totalLuggage) {
        this.totalLuggage = totalLuggage;
    }

}
