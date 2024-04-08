package com.example.architecture.Controller;

import com.example.architecture.dto.LoginRequest;
import com.example.architecture.dto.ProfessionalRegistrationRequest;
import com.example.architecture.model.Employer;
import com.example.architecture.model.Job;
import com.example.architecture.model.Professional;
import com.example.architecture.service.EmployerService;
import com.example.architecture.service.JobService;
import com.example.architecture.service.ProfessionalService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public class RestController {

    private  final EmployerService employerService;
    private  final JobService jobService;
    private  final ProfessionalService professionalService;

    public RestController(EmployerService employerService, JobService jobService, ProfessionalService professionalService) {
        this.employerService = employerService;
        this.jobService = jobService;
        this.professionalService = professionalService;
    }

    @PostMapping("/login/professional")
    public ResponseEntity<?> loginProfessional(@RequestBody LoginRequest loginRequest) {
        boolean isAuthenticated = professionalService.authenticate(
                loginRequest.email(), loginRequest.password());

        if (isAuthenticated) {
            return ResponseEntity.ok().body("Professional authenticated successfully");
        } else {
            return ResponseEntity.badRequest().body("Invalid username or password for professional");
        }
    }

    @PostMapping("/login/employer")
    public ResponseEntity<?> loginEmployer(@RequestBody LoginRequest loginRequest) {
        boolean isAuthenticated = employerService.authenticate(
                loginRequest.email(), loginRequest.password());

        if (isAuthenticated) {
            return ResponseEntity.ok().body("Employer authenticated successfully");
        } else {
            return ResponseEntity.badRequest().body("Invalid username or password for employer");
        }
    }

    @GetMapping("/api/jobs")
    public List<Job> getAllJobs() {
        return jobService.findAllJobs();
    }

    // POST a new job
    @PostMapping("/post/job")
    public ResponseEntity<Job> createJob(@RequestBody Job job) {
        Job savedJob = jobService.saveJob(job);
        return new ResponseEntity<>(savedJob, HttpStatus.CREATED);
    }

    // DELETE a job by ID
    @DeleteMapping("/{jobId}")
    public ResponseEntity<Void> deleteJob(@PathVariable Integer jobId) {
        jobService.deleteJob(jobId);
        return ResponseEntity.ok().build();
    }

    @PostMapping("/professional/register")
    public ResponseEntity<Professional> registerProfessional(@RequestBody ProfessionalRegistrationRequest request) {
        // Create a new Professional from the registration request
        Professional professional = new Professional();
        professional.setFirstName(request.firstName());
        professional.setLastName(request.lastName());
        professional.setQualifications(request.qualifications());
        professional.setEmail(request.email());


        Professional savedProfessional = professionalService.saveProfessional(professional);
        return new ResponseEntity<>(savedProfessional, HttpStatus.CREATED);
    }

    @PostMapping("/employer/register")
    public ResponseEntity<Employer> registerEmployer(@RequestBody Employer employer) {
        Employer savedEmployer = employerService.saveEmployer(employer);
        return new ResponseEntity<>(savedEmployer, HttpStatus.CREATED);
    }
}
