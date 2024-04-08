package com.example.architecture.jobService;



import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "job_table") // Replace with your actual table name
public class Job {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "job_id")
    private Integer jobId;

    @Column(name = "job_title")
    private String jobTitle;

    @Column(name = "pay")
    private String pay;

    @Column(name = "start_date")
    private String startDate; // Consider changing to LocalDate if applicable

    @Column(name = "end_date")
    private String endDate; // Consider changing to LocalDate if applicable

    @Column(name = "qualifications")
    private String qualifications;

    // Getters and setters

    public Integer getJobId() {
        return jobId;
    }

    public void setJobId(Integer jobId) {
        this.jobId = jobId;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getPay() {
        return pay;
    }

    public void setPay(String pay) {
        this.pay = pay;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public String getQualifications() {
        return qualifications;
    }

    public void setQualifications(String qualifications) {
        this.qualifications = qualifications;
    }

    // Override toString, equals, and hashCode methods as needed
}
