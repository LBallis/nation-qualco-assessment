package com.ballis.nationqualcoassessment.repository;

import com.ballis.nationqualcoassessment.dto.DashboardDTO;
import com.ballis.nationqualcoassessment.dto.GrossDomesticProductDTO;
import com.ballis.nationqualcoassessment.model.Countries;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CountriesRepository extends JpaRepository<Countries,Integer> {

    @Query(value = "select new com.ballis.nationqualcoassessment.dto.GrossDomesticProductDTO(c.name, c.countryCode3, cs.year, cs.population, max(cs.gdp)) from Countries c " +
            " " +
            "join CountryStats cs on cs.countryId = c.countryId " +
            "group by cs.countryId")
    List<GrossDomesticProductDTO> findAllCountryStatsForMaximumGdpYear();

    @Query(value = "select new com.ballis.nationqualcoassessment.dto.DashboardDTO(cnt.name, r.name, c.name, cs.year, cs.population, cs.gdp) from Countries c " +
            "join Continents cnt on cnt.continentId = c.countryId " +
            "join Regions r on r.regionId = c.regionId " +
            "join CountryStats cs on cs.countryId = c.countryId")
    List<DashboardDTO> findAllContinentRegionCountryCountryStats();
}
