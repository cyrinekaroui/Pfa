package com.example.greetingmvc.web.models;
import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Data;
@AllArgsConstructor
@Data
@Entity
@Table(name = "users") // Specify the name of the table in the database
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "email", nullable = false, unique = true)
    private String email;

    @Column(name = "tel_number")
    private String telNumber;

    @Column(name = "password", nullable = false)
    private String password;

    @ManyToOne
    @JoinColumn(name = "specialist_id")
    private Specialist specialist;

    // Constructors, getters, and setters
    // Constructors
    public User() {
    }

    public User(String email, String telNumber, String password) {
        this.email = email;
        this.telNumber = telNumber;
        this.password = password;
    }

    // Getters and Setters
    // Id
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    // Email
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    // TelNumber
    public String getTelNumber() {
        return telNumber;
    }}