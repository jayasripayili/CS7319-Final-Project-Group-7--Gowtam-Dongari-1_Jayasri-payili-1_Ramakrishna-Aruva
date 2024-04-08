import React from 'react';
import { useFormik } from 'formik';
import axios from 'axios';

const JobPostingPage = () => {
  const formik = useFormik({
    initialValues: {
      jobTitle: '',
      pay: '',
      startDate:'',
      endDate:'',
      qualifications:''
    },
    onSubmit: values => {
      axios.post('http://localhost:8080/api/jobs', values)
        .then(response => {
          alert('Job posted successfully!');
          // Additional actions on success, e.g., redirecting to a confirmation page
        })
        .catch(error => {
          console.error('Job posting failed:', error);
          // Handle errors, e.g., show an error message
        });
    },
  });

  return (
    <div>
      <h2>Post a Job</h2>
      <form onSubmit={formik.handleSubmit}>
        <div>
          <label htmlFor="jobTitle">Job Title</label>
          <input
            id="jobTitle"
            name="jobTitle"
            type="text"
            onChange={formik.handleChange}
            value={formik.values.title}
          />
        </div>
        <div>
          <label htmlFor="startDate">startDate</label>
          <input
          type='date'
            id="startDate"
            name="startDate"
            onChange={formik.handleChange}
            value={formik.values.description}
          />
        </div>
        <div>
          <label htmlFor="endDate">endDate</label>
          <input
            id="endDate"
            type='date'
            name="endDate"
             
            onChange={formik.handleChange}
            value={formik.values.location}
          />
        </div>
        <div>
          <label htmlFor="pay">pay</label>
          <input
            id="pay"
            name="pay"
            type="text"
            onChange={formik.handleChange}
            value={formik.values.location}
          />
        </div>
        <div>
          <label htmlFor="qualifications">qualifications</label>
          <input
            id="qualifications"
            name="qualifications"
            type="text"
            onChange={formik.handleChange}
            value={formik.values.location}
          />
        </div>
        <button type="submit">Post Job</button>
      </form>
    </div>
  );
};

export default JobPostingPage;
