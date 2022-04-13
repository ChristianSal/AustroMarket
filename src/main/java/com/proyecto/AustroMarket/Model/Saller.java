package com.proyecto.AustroMarket.Model;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Entity
@Table
public class Saller {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long sallerId;
    @Column(length = 200)
    @NotBlank
    private String address;
    @Column(length = 50)
    @NotBlank
    private String businessName;
    @Column
    @NotBlank
    private double transport;




}
