package com.example.greetingmvc.web.models;
import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Data;
@Data
@AllArgsConstructor
@Entity
@Table(name = "personal_info") // Specify the name of the table in the database
public class PersonalInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "personal_info_id")
    private Long personalInfoId;

    @Column(name = "addiction_type")
    private String addictionType;
}
