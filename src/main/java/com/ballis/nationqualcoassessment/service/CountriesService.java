package com.ballis.nationqualcoassessment.service;

import com.ballis.nationqualcoassessment.dto.DashboardDTO;
import com.ballis.nationqualcoassessment.dto.GrossDomesticProductDTO;
import com.ballis.nationqualcoassessment.model.Countries;

import java.util.List;
public interface CountriesService {

    List<Countries> getCountries();

    List<GrossDomesticProductDTO> getAllCountriesMaxGdpYearStats();

    List<DashboardDTO> getAllContinentRegionCountryStats();
}
