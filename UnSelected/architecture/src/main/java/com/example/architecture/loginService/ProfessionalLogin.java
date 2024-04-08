package com.example.architecture.loginService;

import org.springframework.stereotype.Service;

@Service
public class ProfessionalLogin {
     private final ProfessionalLoginRepository professionalLoginRepository;

    public ProfessionalLogin(ProfessionalLoginRepository professionalLoginRepository) {
        this.professionalLoginRepository = professionalLoginRepository;
    }

    public boolean authenticate(String email, String password) {
        ProfessionalModel prof = professionalLoginRepository.findByEmailAndPassword(email,password).stream().findFirst().orElse(null);
        return prof != null;
    }
}
