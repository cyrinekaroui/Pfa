package com.example.greetingmvc.repositories;

import com.example.greetingmvc.models.PersonalInfo;
import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

@Repository
public interface PersonalInfoRepository extends JpaRepository<PersonalInfo, Long> {
    // You can define custom query methods here if needed
}
