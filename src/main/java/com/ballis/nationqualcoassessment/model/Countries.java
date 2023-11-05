package com.ballis.nationqualcoassessment.model;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.sql.Date;

@Entity
@Table(name = "countries")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Countries {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "country_id")
    private Integer countryId;

    @Column(name = "name")
    private String name;

    @Column(name = "area")
    private BigDecimal area;

    @Column(name = "national_day")
    private Date nationalDay;

    @Column(name = "country_code2")
    private String countryCode2;

    @Column(name = "country_code3")
    private String countryCode3;

    @Column(name = "region_id")
    private int regionId;

}
