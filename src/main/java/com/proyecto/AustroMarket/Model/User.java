package com.proyecto.AustroMarket.Model;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

@Entity
@Table
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long userId;
    @NotBlank
    @Column(length = 50)
    private String name;
    @NotBlank
    @Column(length = 50)
    private String lastName;
    @NotBlank
    @Column(length = 15)
    private String phone;
    @Email
    @Column(length = 50)
    private String mail;
    @NotBlank
    private boolean state;


}
