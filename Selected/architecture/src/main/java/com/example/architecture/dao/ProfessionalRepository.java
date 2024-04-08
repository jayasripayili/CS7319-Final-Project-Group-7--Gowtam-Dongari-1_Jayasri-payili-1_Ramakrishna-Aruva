package com.example.architecture.dao;

import com.example.architecture.model.Professional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ProfessionalRepository extends JpaRepository<Professional, Long> {
    // You can define custom query methods here if needed
    @Query("SELECT p FROM Professional p WHERE p.email = :email AND p.password = :password")
    Optional<Professional> findByEmailAndPassword(String email, String password);
}

