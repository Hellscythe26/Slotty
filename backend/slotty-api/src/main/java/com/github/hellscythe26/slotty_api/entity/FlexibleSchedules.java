package com.github.hellscythe26.slotty_api.entity;

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
public class FlexibleSchedules {

    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne 
    @JoinColumn(name = "supplier_id", nullable = false)
    private User supplier;

    @Column(nullable = false)
    private Integer days;

    @ManyToOne 
    @JoinColumn(name = "workday_id", nullable = false)
    private Workday workday;

    @Column(nullable = false)
    private boolean asset;
}