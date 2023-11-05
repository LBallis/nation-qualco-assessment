package com.ballis.nationqualcoassessment.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "vips")
@Data
public class Vips {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "vip_id")
    private Integer vipId;

    @Column(name = "name")
    private String name;


}
