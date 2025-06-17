package com.project.ems.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.ems.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByEmail(String email);
    boolean existsByUsername(String username);
    boolean existsByEmail(String email);
}
