package com.proyecto.AustroMarket.Model;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.Date;

@Entity
@Table
public class Bill {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long billId;
    @GeneratedValue(strategy = GenerationType.AUTO)
    @NotBlank
    private long numBill;
    @NotBlank
    private Date date;
    @NotBlank
    private double total;
}
