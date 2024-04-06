package com.example.architecture.service;

import com.example.architecture.dao.JobRepository;
import com.example.architecture.model.Job;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class JobService {

    private final JobRepository jobRepository;

    @Autowired
    public JobService(JobRepository jobRepository) {
        this.jobRepository = jobRepository;
    }

    @Transactional(readOnly = true)
    public List<Job> findAllJobs() {
        return jobRepository.findAll();
    }

    @Transactional(readOnly = true)
    public Optional<Job> findJobById(Integer id) {
        return jobRepository.findById(id);
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

    // Add any other service methods as per your business logic
}
