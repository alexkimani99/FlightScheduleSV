package com.operations.schedule.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

@Entity
public class Departure {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;
    private String flightNumber;
    private String destination;
    private LocalDateTime estimatedTimeOfDeparture;
    private int totalPassengers;
    private int totalLuggage;

    //Constructor
    public Departure(Long id, String flightNumber, String destination, LocalDateTime estimatedTimeOfDeparture,
                     int totalPassengers, int totalLuggage) {
        this.id = id;
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.estimatedTimeOfDeparture = estimatedTimeOfDeparture;
        this.totalPassengers = totalPassengers;
        this.totalLuggage = totalLuggage;
    }

    // Empty constructor
    public Departure() {
    }

    //Getters and Setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public LocalDateTime getEstimatedTimeOfDeparture() {
        return estimatedTimeOfDeparture;
    }

    public void setEstimatedTimeOfDeparture(LocalDateTime estimatedTimeOfDeparture) {
        this.estimatedTimeOfDeparture = estimatedTimeOfDeparture;
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
