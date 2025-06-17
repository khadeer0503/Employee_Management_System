package com.project.ems.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.ems.entity.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(String name);
}
