import React, { useEffect, useState } from 'react';
import axios from 'axios';

const JobListingsPage = () => {
  const [jobs, setJobs] = useState([]);

  useEffect(() => {
    // Fetch the job postings on component mount
    axios.get('http://localhost:8080/api/jobs')
      .then(response => {
        setJobs(response.data); // Set the job postings in state
      })
      .catch(error => {
        console.error('There was an error fetching the job postings:', error);
      });
  }, []); // The empty array ensures this effect runs once on mount

  return (
    <div>
      <h2>Job Listings</h2>
      <ul>
        {jobs.map(job => (
          <li key={job.id}>
            <h3>{job.title}</h3>
            <p>{job.description}</p>
            <p>Location: {job.location}</p>
          </li>
        ))}
      </ul>
    </div>
  );
};

export default JobListingsPage;
