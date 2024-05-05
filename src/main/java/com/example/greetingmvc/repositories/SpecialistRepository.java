package com.example.greetingmvc.repositories;

import com.example.greetingmvc.models.Specialist;
import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

@Repository
public interface SpecialistRepository extends JpaRepository<Specialist, Long> {
    // You can define custom query methods here if needed
}
