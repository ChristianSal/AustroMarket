package com.proyecto.AustroMarket.Model;

import javax.persistence.*;

@Entity
@Table
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long clientId;

}
