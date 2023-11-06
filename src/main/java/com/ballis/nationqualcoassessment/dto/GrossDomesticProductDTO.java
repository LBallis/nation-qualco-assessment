package com.ballis.nationqualcoassessment.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@NoArgsConstructor
public class GrossDomesticProductDTO {
    private String name;
    private String countryCode3;
    private Integer year;
    private BigDecimal population;
    private BigDecimal gdp;

    public GrossDomesticProductDTO(String name, String countryCode3, Integer year, BigDecimal population, BigDecimal gdp){
        this.name = name;
        this.countryCode3 = countryCode3;
        this.year = year;
        this.population = population;
        this.gdp = gdp;
    }
}
