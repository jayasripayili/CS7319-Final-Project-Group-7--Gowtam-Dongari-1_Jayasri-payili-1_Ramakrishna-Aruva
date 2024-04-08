package com.example.architecture.dto;

public record EmployerRegistrationRequest(
        String firstName,
        String lastName,
        String companyName,
        String email,
        String password) {

}