package com.ballis.nationqualcoassessment.service;

import com.ballis.nationqualcoassessment.dto.DashboardDTO;
import com.ballis.nationqualcoassessment.dto.GrossDomesticProductDTO;
import com.ballis.nationqualcoassessment.model.Countries;
import com.ballis.nationqualcoassessment.repository.CountriesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CountriesServiceImpl implements CountriesService {

    @Autowired
    private CountriesRepository countriesRepository;

    @Override
    public List<Countries> getCountries() {
        return countriesRepository.findAll();
    }
    @Override
    public List<GrossDomesticProductDTO> getAllCountriesMaxGdpYearStats() {
        return countriesRepository.findAllCountryStatsForMaximumGdpYear();
    }

    @Override
    public List<DashboardDTO> getAllContinentRegionCountryStats() {
        return countriesRepository.findAllContinentRegionCountryCountryStats();
    }
}
