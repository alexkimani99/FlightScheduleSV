package com.operations.schedule.service;

import com.operations.schedule.model.Arrival;
import com.operations.schedule.repository.ArrivalRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.BeanUtils;
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

    public Arrival updateArrival(Long id, Arrival updatedArrival) {
        Arrival existingArrival = arrivalRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Arrival not found with id: " + id));

        // Lombok to copy properties into existing object
        BeanUtils.copyProperties(updatedArrival, existingArrival, "id");

        // Saves updated arrival
        Arrival savedArrival = arrivalRepository.save(existingArrival);


        return savedArrival;
    }
}
