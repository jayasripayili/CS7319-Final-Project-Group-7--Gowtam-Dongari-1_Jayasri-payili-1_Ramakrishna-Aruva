package com.example.architecture.ProfessionalService;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
@Service
public class ProfessionalRegister {

    private  final ProfessionalRepository professionalRepository;

    public ProfessionalRegister(ProfessionalRepository professionalRepository) {
        this.professionalRepository = professionalRepository;
    }

    @Transactional
    public Professional saveProfessional(Professional professional) {
        // You might want to add additional logic here before saving
        return professionalRepository.save(professional);
    }
}
