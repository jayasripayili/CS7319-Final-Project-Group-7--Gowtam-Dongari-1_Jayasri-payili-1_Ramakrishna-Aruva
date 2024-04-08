package com.example.architecture.dto;

public record ProfessionalRegistrationRequest(
        String firstName,
        String lastName,
        String qualifications,
        String email,
        String password) {

}