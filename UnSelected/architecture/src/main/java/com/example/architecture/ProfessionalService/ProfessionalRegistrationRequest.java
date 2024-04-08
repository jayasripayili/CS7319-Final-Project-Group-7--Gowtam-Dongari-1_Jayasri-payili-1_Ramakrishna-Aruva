package com.example.architecture.ProfessionalService;

public record ProfessionalRegistrationRequest(
        String firstName,
        String lastName,
        String qualifications,
        String email,
        String password) {

}