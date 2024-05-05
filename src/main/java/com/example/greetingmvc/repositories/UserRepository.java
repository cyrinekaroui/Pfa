package com.example.greetingmvc.repositories;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.greetingmvc.models.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository <User, Long> {
    User findByEmail(String email);
}