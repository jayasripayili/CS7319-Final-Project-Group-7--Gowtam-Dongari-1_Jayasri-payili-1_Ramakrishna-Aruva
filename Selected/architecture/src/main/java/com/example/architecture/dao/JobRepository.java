package com.example.architecture.dao;

import com.example.architecture.model.Job;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JobRepository extends JpaRepository<Job, Integer> {
    // Here you can define custom query methods, if needed
}
