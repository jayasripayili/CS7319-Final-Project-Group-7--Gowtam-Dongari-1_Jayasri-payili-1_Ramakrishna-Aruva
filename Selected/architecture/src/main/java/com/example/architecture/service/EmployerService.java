package com.example.architecture.service;

import com.example.architecture.dao.EmployerRepository;
import com.example.architecture.model.Employer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;
import java.util.Optional;

@Service
public class EmployerService {

    private final EmployerRepository employerRepository;

    @Autowired
    public EmployerService(EmployerRepository employerRepository) {
        this.employerRepository = employerRepository;
    }

    @Transactional(readOnly = true)
    public List<Employer> findAllEmployers() {
        return employerRepository.findAll();
    }

    @Transactional(readOnly = true)
    public Optional<Employer> findEmployerById(Long id) {
        return employerRepository.findById(id);
    }

    @Transactional
    public Employer saveEmployer(Employer employer) {
        // Additional logic before saving if necessary
        return employerRepository.save(employer);
    }

    @Transactional
    public void deleteEmployer(Long id) {
        employerRepository.deleteById(id);
    }

    public boolean authenticate(String email, String password) {
        Employer emp = employerRepository.findByEmailAndPassword(email,password).stream().findFirst().orElse(null);
        return emp!=null;
    }



    // Additional business logic and transactional methods as required
}

