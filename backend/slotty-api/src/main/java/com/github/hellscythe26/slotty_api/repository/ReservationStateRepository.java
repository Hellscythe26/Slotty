package com.github.hellscythe26.slotty_api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.github.hellscythe26.slotty_api.entity.ReservationState;

public interface ReservationStateRepository extends JpaRepository<ReservationState, Long> {

}