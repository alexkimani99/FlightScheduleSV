package com.operations.schedule.model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

import java.time.LocalDateTime;
import java.util.Date;

@Entity
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
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

}
