package com.ballis.nationqualcoassessment.service;

import com.ballis.nationqualcoassessment.model.Languages;
import com.ballis.nationqualcoassessment.repository.LanguagesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LanguagesSeviceImpl implements LanguagesService{
    @Autowired
    LanguagesRepository languagesRepository;
    @Override
    public List<Languages> getLanguagesByCountry(Integer countryId) {
        return languagesRepository.findAllLanguagesByCountry(countryId);
    }
}
