package com.proyecto.AustroMarket.Model;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Entity
@Table
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long productId;
    @NotBlank
    private boolean availability;
    @NotBlank
    private boolean state;
    @Column(length = 100)
    @NotBlank
    private String name;
    @NotBlank
    private double price;
    @Column(length = 500)
    @NotBlank
    private String imageUrl;


}
