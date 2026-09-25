package com.github.hellscythe26.slotty_api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.github.hellscythe26.slotty_api.entity.Reservation;

public interface ReservationRepository extends JpaRepository<Reservation, Long> {

}