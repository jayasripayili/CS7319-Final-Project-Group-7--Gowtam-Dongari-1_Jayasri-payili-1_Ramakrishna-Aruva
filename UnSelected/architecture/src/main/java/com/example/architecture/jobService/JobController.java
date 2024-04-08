package com.example.architecture.jobService;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class JobController {

    private  final RegisterService register;

    public JobController(RegisterService register) {
        this.register = register;
    }


    @GetMapping("/api/jobs")
    public List<Job> getAllJobs() {
        return register.findAllJobs();
    }

    // POST a new job
    @PostMapping("/post/job")
    public ResponseEntity<Job> createJob(@RequestBody Job job) {
        Job savedJob = register.saveJob(job);
        return new ResponseEntity<>(savedJob, HttpStatus.CREATED);
    }

    // DELETE a job by ID
    @DeleteMapping("/{jobId}")
    public ResponseEntity<Void> deleteJob(@PathVariable Integer jobId) {
        register.deleteJob(jobId);
        return ResponseEntity.ok().build();
    }

}
