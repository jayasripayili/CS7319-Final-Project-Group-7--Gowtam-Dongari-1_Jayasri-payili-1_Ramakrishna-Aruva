package com.example.architecture.dao;

import com.example.architecture.model.Employer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface EmployerRepository extends JpaRepository<Employer, Long> {
    // Custom query methods can be defined here
    @Query("SELECT e FROM Employer e WHERE e.email = :email AND e.password = :password")
    Optional<Employer> findByEmailAndPassword(String email, String password);
}
