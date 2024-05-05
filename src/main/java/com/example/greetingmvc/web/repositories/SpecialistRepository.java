package com.example.greetingmvc.web.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.greetingmvc.web.models.Specialist;

public interface SpecialistRepository extends JpaRepository<Specialist, Long> {
    // You can define custom query methods here if needed
}
