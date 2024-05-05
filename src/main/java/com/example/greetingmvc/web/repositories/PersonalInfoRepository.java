package com.example.greetingmvc.web.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.greetingmvc.web.models.PersonalInfo;

public interface PersonalInfoRepository extends JpaRepository<PersonalInfo, Long> {
    // You can define custom query methods here if needed
}
