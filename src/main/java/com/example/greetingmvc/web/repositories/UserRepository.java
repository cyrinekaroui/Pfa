package com.example.greetingmvc.web.repositories;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.greetingmvc.web.models.User;


public interface UserRepository extends JpaRepository <User, Long> {
    // Additional custom query methods can be defined here if needed
}