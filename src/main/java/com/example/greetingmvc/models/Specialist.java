package com.example.greetingmvc.models;

import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Data;
@AllArgsConstructor
@Data
@Entity
@Table(name = "specialists") // Specify the name of the table in the database
public class Specialist {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "email", nullable = false, unique = true)
    private String email;

    @Column(name = "password", nullable = false)
    private String password;

    @Column(name = "experience")
    private int experience;

    @Column(name = "speciality", nullable = false)
    private String speciality;

    // Constructors, getters, and setters
    // Constructors
    public Specialist() {
    }

    public Specialist(String email, String password, int experience, String speciality) {
        this.email = email;
        this.password = password;
        this.experience = experience;
        this.speciality = speciality;
    }
}