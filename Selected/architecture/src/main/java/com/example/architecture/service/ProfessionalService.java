package com.example.architecture.service;

import com.example.architecture.dao.ProfessionalRepository;
import com.example.architecture.model.Professional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;
import java.util.Optional;

@Service
public class ProfessionalService {

    private final ProfessionalRepository professionalRepository;

    @Autowired
    public ProfessionalService(ProfessionalRepository professionalRepository) {
        this.professionalRepository = professionalRepository;
    }

    @Transactional(readOnly = true)
    public List<Professional> findAllProfessionals() {
        return professionalRepository.findAll();
    }

    @Transactional(readOnly = true)
    public Optional<Professional> findProfessionalById(Long id) {
        return professionalRepository.findById(id);
    }

    @Transactional
    public Professional saveProfessional(Professional professional) {
        // You might want to add additional logic here before saving
        return professionalRepository.save(professional);
    }

    @Transactional
    public void deleteProfessional(Long id) {
        professionalRepository.deleteById(id);
    }

    public boolean authenticate(String email, String password) {
        Professional prof = professionalRepository.findByEmailAndPassword(email,password).stream().findFirst().orElse(null);
        return prof != null;
    }

    // You can add more complex business logic and transactional operations as needed
}
