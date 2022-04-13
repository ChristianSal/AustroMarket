package com.proyecto.AustroMarket.Model;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Entity
@Table
public class Qualification {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long qualificationId;
    @NotBlank
    private double qualification;
}
