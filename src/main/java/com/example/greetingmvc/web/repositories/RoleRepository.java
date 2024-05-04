package com.example.greetingmvc.web.repositories;

import com.example.greetingmvc.web.models.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Long> {

    Role findByName(String name);
}