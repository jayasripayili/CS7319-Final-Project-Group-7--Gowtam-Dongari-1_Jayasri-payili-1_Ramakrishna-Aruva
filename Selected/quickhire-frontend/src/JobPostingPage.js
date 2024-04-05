import React from 'react';
import { useFormik } from 'formik';
import axios from 'axios';

const JobPostingPage = () => {
  const formik = useFormik({
    initialValues: {
      title: '',
      description: '',
      location: '',
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
          <label htmlFor="title">Job Title</label>
          <input
            id="title"
            name="title"
            type="text"
            onChange={formik.handleChange}
            value={formik.values.title}
          />
        </div>
        <div>
          <label htmlFor="description">Job Description</label>
          <textarea
            id="description"
            name="description"
            onChange={formik.handleChange}
            value={formik.values.description}
          />
        </div>
        <div>
          <label htmlFor="location">Location</label>
          <input
            id="location"
            name="location"
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
