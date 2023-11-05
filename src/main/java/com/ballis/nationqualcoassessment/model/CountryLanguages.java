package com.ballis.nationqualcoassessment.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "country_languages")
@IdClass(CountryLanguagesPK.class)
@Data
public class CountryLanguages {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "country_id")
    private Integer countryId;
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "language_id")
    private Integer languageId;

    @Column(name = "official")
    private Boolean official;

}
