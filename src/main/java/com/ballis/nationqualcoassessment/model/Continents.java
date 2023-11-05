package com.ballis.nationqualcoassessment.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "continents")
@Data
public class Continents {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "continent_id")
    private Integer continentId;
    @Basic
    @Column(name = "name")
    private String name;

}
