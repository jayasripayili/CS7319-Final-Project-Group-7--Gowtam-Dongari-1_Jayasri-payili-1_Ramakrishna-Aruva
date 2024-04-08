package com.example.architecture.dto;

public record LoginRequest(String email, String password) {
    // No need for explicit getters
}
