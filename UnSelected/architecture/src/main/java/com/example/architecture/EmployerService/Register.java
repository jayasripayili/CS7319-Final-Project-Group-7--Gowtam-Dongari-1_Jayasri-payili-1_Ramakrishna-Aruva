package com.example.architecture.EmployerService;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class Register {

    private  final  EmployerRepository employerRepository;

    public Register(EmployerRepository employerRepository) {
        this.employerRepository = employerRepository;
    }

    @Transactional
    public Employer saveEmployer(Employer employer) {
        // Additional logic before saving if necessary
        return employerRepository.save(employer);
    }
}
