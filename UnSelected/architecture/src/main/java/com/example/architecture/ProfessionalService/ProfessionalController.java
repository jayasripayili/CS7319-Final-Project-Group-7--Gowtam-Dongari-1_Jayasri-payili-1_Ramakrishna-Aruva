package com.example.architecture.ProfessionalService;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProfessionalController {

    private  final ProfessionalRegister register;

    public ProfessionalController(ProfessionalRegister register) {
        this.register = register;
    }


    @PostMapping("/professional/register")
    public ResponseEntity<Professional> registerProfessional(@RequestBody ProfessionalRegistrationRequest request) {
        // Create a new Professional from the registration request
        Professional professional = new Professional();
        professional.setFirstName(request.firstName());
        professional.setLastName(request.lastName());
        professional.setQualifications(request.qualifications());
        professional.setEmail(request.email());


        Professional savedProfessional = register.saveProfessional(professional);
        return new ResponseEntity<>(savedProfessional, HttpStatus.CREATED);
    }
}
