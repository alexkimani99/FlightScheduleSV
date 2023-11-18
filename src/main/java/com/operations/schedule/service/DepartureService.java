package com.operations.schedule.service;

import com.operations.schedule.repository.DepartureRepository;
import com.operations.schedule.model.Departure;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DepartureService {

    @Autowired
    private DepartureRepository departureRepository;

    public List<Departure> getAllDepartures() {
        return departureRepository.findAll();
    }

    public Optional<Departure> getDepartureById(Long id) {
        return departureRepository.findById(id);
    }

    public Departure saveDeparture(Departure departure) {
        return departureRepository.save(departure);
    }

    public void deleteDeparture(Long id) {
        departureRepository.deleteById(id);
    }

    public Departure updateDeparture(Long id, Departure updatedDeparture) {
        Departure existingDeparture = departureRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Departure not found with id: " + id));

        // Lombok to copy properties into existing object
        BeanUtils.copyProperties(updatedDeparture, existingDeparture, "id");

        // Saves updated departure
        return departureRepository.save(existingDeparture);
    }
}
