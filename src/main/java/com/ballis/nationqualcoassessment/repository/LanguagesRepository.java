package com.ballis.nationqualcoassessment.repository;

import com.ballis.nationqualcoassessment.model.Languages;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LanguagesRepository extends JpaRepository<Languages, Integer> {
    @Query(value = "select l from Languages l " +
            "where l.languageId in (select cl.languageId from CountryLanguages cl where cl.countryId = :countryId)")
    List<Languages> findAllLanguagesByCountry(@Param("countryId") Integer countryId);

}
