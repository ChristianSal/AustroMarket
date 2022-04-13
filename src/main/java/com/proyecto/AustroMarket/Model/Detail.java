package com.proyecto.AustroMarket.Model;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Entity
@Table
public class Detail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long detailId;
    @NotBlank
    private int amount;
    @NotBlank
    private double subtotal;
}
