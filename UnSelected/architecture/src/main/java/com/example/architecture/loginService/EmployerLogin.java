package com.example.architecture.loginService;

import org.springframework.stereotype.Service;

@Service
public class EmployerLogin {

    private final EmployerLoginRepository employerLoginRepository;

    public EmployerLogin(EmployerLoginRepository employerLoginRepository) {
        this.employerLoginRepository = employerLoginRepository;
    }

    public boolean authenticate(String email, String password) {
        EmployerModel emp = employerLoginRepository.findByEmailAndPassword(email,password).stream().findFirst().orElse(null);
        return emp!=null;
    }

}

