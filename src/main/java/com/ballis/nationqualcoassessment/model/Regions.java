package com.ballis.nationqualcoassessment.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "regions")
@Data
public class Regions {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "region_id")
    private Integer regionId;

    @Column(name = "name")
    private String name;

    @Column(name = "continent_id")
    private Integer continentId;

}
