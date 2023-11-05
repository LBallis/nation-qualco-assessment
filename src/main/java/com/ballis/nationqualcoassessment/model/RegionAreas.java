package com.ballis.nationqualcoassessment.model;

import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;

@Entity
@Table(name = "region_areas")
@Data
public class RegionAreas {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "region_name")
    private String regionName;

    @Column(name = "region_area")
    private BigDecimal regionArea;

}
