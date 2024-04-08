package com.example.architecture.loginService;

public record LoginRequest(String email, String password) {
    // No need for explicit getters
}
