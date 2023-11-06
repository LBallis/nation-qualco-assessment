package com.ballis.nationqualcoassessment.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@NoArgsConstructor
public class DashboardDTO {
    private String continentName;
    private String regionName;
    private String countryName;
    private Integer year;
    private BigDecimal population;
    private BigDecimal gdp;

    public DashboardDTO(String continentName, String regionName, String countryName, Integer year, BigDecimal population, BigDecimal gdp) {
        this.continentName = continentName;
        this.regionName = regionName;
        this.countryName = countryName;
        this.year = year;
        this.population = population;
        this.gdp = gdp;
    }
}
