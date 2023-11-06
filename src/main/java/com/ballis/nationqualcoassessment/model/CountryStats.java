package com.ballis.nationqualcoassessment.model;

import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;

@Entity
@Table(name = "country_stats")
@Data
@IdClass(CountryStatsPK.class)
public class CountryStats {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "country_id")
    private Integer countryId;
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "year")
    private Integer year;

    @Column(name = "population")
    private BigDecimal population;

    @Column(name = "gdp")
    private BigDecimal gdp;

}
