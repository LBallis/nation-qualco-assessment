package com.ballis.nationqualcoassessment.controller;

import com.ballis.nationqualcoassessment.dto.DashboardDTO;
import com.ballis.nationqualcoassessment.dto.GrossDomesticProductDTO;
import com.ballis.nationqualcoassessment.model.Countries;
import com.ballis.nationqualcoassessment.model.Languages;
import com.ballis.nationqualcoassessment.service.CountriesService;
import com.ballis.nationqualcoassessment.service.LanguagesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping(path = "/countries")
public class CountriesController {
    @Autowired
    private CountriesService countriesService;
    @Autowired
    private LanguagesService languagesService;

    @GetMapping
    public List<Countries> getCountries(){
        return countriesService.getCountries();
    }

    @GetMapping(path = "/gross-domestic-product")
    public List<GrossDomesticProductDTO> getGrossDomesticProduct(){
        return countriesService.getAllCountriesMaxGdpYearStats();
    }

    @GetMapping(path = "/dashboard")
    public List<DashboardDTO> getDashboardData(){
        return countriesService.getAllContinentRegionCountryStats();
    }

    @GetMapping(path = "/languages")
    public List<Languages> getLanguages(@RequestParam Integer countryId){
        return languagesService.getLanguagesByCountry(countryId);
    }


}
