package com.example.architecture.loginService;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ProfessionalLoginRepository extends JpaRepository<ProfessionalModel, Long> {
    // You can define custom query methods here if needed
    @Query("SELECT p FROM Professional p WHERE p.email = :email AND p.password = :password")
    Optional<ProfessionalModel> findByEmailAndPassword(String email, String password);
}

