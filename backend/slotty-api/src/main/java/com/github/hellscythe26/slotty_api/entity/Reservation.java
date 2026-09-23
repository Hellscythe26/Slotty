package com.github.hellscythe26.slotty_api.entity;

import java.time.LocalDateTime;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity 
@Getter 
@Setter 
@AllArgsConstructor 
@NoArgsConstructor 
public class Reservation {

    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private LocalDateTime startTime;

    @Column(nullable = false)
    private LocalDateTime endTime;

    @ManyToOne 
    @JoinColumn(name = "service_id", nullable = false)
    private Service service;

    @ManyToOne 
    @JoinColumn(name = "state_id", nullable = false)
    private ReservationState reservationState;
    
    @ManyToOne 
    @JoinColumn(name = "customer_id", nullable = false)
    private User customer;
}