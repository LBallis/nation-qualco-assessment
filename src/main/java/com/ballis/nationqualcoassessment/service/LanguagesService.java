package com.ballis.nationqualcoassessment.service;

import com.ballis.nationqualcoassessment.model.Languages;

import java.util.List;

public interface LanguagesService {

    List<Languages> getLanguagesByCountry(Integer countryId);
}
