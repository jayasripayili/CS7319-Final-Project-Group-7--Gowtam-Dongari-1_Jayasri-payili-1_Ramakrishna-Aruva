package com.example.architecture.jobService;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class RegisterService {

    private final JobRepository jobRepository;

    public RegisterService(JobRepository jobRepository) {
        this.jobRepository = jobRepository;
    }
    @Transactional(readOnly = true)
    public List<Job> findAllJobs() {
        return jobRepository.findAll();
    }

    @Transactional
    public Job saveJob(Job job) {
        // Add any business logic here if needed before saving the job
        return jobRepository.save(job);
    }

    @Transactional
    public void deleteJob(Integer id) {
        // Add any additional business logic here if needed before deleting the job
        jobRepository.deleteById(id);
    }
}
