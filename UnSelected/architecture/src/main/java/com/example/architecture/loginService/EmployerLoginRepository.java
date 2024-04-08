package com.example.architecture.loginService;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface EmployerLoginRepository extends JpaRepository<EmployerModel, Long> {
    // Custom query methods can be defined here
    @Query("SELECT e FROM Employer e WHERE e.email = :email AND e.password = :password")
    Optional<EmployerModel> findByEmailAndPassword(String email, String password);
}
