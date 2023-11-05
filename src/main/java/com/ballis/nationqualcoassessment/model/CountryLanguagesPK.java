package com.ballis.nationqualcoassessment.model;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

import java.io.Serializable;

@Data
public class CountryLanguagesPK implements Serializable {
    @Column(name = "country_id")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer countryId;
    @Column(name = "language_id")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer languageId;

}
