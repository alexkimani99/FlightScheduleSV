package com.operations.schedule.repository;

import com.operations.schedule.model.Arrival;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArrivalRepository extends JpaRepository<Arrival, Long> {
}
