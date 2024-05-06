package com.example.greetingmvc.repositories;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.greetingmvc.models.User;
import org.springframework.stereotype.Repository;
import java.util.Optional;


@Repository
public interface UserRepository extends JpaRepository <User, Long> {
    User findByEmail(String email);
}