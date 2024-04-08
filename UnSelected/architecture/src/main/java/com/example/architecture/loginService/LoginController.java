package com.example.architecture.loginService;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {

 private final ProfessionalLogin professionalLogin;
 private  final  EmployerLogin employerLogin;

    public LoginController(ProfessionalLogin professionalLogin, EmployerLogin employerLogin) {
        this.professionalLogin = professionalLogin;
        this.employerLogin = employerLogin;
    }


    @PostMapping("/login/professional")
    public ResponseEntity<?> loginProfessional(@RequestBody LoginRequest loginRequest){
        boolean isAuthenticated = professionalLogin.authenticate(loginRequest.email(),loginRequest.password());
        if(isAuthenticated){
            return ResponseEntity.ok().body("Professional authenticated successfully");
        }else {
            return ResponseEntity.badRequest().body("Invalid username or password for professional!");
        }
    }
    @PostMapping("/login/employer")
    public ResponseEntity<?> loginEmployer(@RequestBody LoginRequest loginRequest){
        boolean isAuthenticated = employerLogin.authenticate(loginRequest.email(),loginRequest.password());

        if (isAuthenticated) {
            return ResponseEntity.ok().body("Employer authenticated successfully");
        } else {
            return ResponseEntity.badRequest().body("Invalid username or password for employer");
        }
    }

}
