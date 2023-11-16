package com.operations.schedule.repository;
import com.operations.schedule.model.Departure;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartureRepository extends JpaRepository<Departure, Long> {
}
