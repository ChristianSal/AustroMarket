package com.proyecto.AustroMarket.Model;

import javax.persistence.*;

@Entity
@Table
public class Admin {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long adminId;
}
