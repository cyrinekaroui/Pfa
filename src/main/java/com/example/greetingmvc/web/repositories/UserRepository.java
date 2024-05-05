package com.example.greetingmvc.web.repositories;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.greetingmvc.web.models.User;


public interface UserRepository extends JpaRepository <User, Long> {
    static Optional<User> findByEmail(String email) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findByEmail'");
    }
}