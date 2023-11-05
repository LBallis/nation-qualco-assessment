package com.ballis.nationqualcoassessment.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "languages")
@Data
public class Languages {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "language_id")
    private Integer languageId;

    @Column(name = "language")
    private String language;


}
