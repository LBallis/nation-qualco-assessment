package com.ballis.nationqualcoassessment.model;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

import java.io.Serializable;
@Data
public class CountryStatsPK implements Serializable {
    @Column(name = "country_id")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer countryId;
    @Column(name = "year")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer year;

}
