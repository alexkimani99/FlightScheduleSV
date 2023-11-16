package com.operations.schedule.service;

import com.operations.schedule.model.Arrival;
import com.operations.schedule.repository.ArrivalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ArrivalService {

    @Autowired
    private ArrivalRepository arrivalRepository;

    public List<Arrival> getAllArrivals() {
        return arrivalRepository.findAll();
    }

    public Optional<Arrival> getArrivalById(Long id) {
        return arrivalRepository.findById(id);
    }

    public Arrival saveArrival(Arrival arrival) {
        return arrivalRepository.save(arrival);
    }

    public void deleteArrival(Long id) {
        arrivalRepository.deleteById(id);
    }
}
