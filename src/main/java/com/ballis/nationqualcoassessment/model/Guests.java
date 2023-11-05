package com.ballis.nationqualcoassessment.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "guests")
@Data
public class Guests {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "guest_id")
    private Integer guestId;

    @Column(name = "name")
    private String name;


}
