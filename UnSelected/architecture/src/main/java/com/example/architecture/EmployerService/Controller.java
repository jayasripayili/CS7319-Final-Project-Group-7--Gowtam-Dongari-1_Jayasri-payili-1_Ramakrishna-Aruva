package com.example.architecture.EmployerService;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    private  final  Register register;

    public Controller(Register register) {
        this.register = register;
    }


    @PostMapping("/employer/register")
   public ResponseEntity<?> registerEmployer(@RequestBody Employer employer){
      Employer savedEmployer =register.saveEmployer(employer);
       return new ResponseEntity<>(savedEmployer, HttpStatus.CREATED);
   }
}
