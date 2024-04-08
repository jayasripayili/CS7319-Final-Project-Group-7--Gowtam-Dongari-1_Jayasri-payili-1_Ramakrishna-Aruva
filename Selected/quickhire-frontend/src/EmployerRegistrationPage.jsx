import React from 'react';
import { useFormik } from 'formik';
import axios from 'axios';

const EmployerRegistrationPage = () => {
  const formik = useFormik({
    initialValues: {
      companyName: '',
      email: '',
      password: '',
      firstName: '',
      lastName:'',
    },
    onSubmit: values => {
      axios.post('http://localhost:8080/employer/register', values)
        .then(response => {
          alert('Registration successful!');
          // Additional actions on success, e.g., redirect to login or dashboard
        })
        .catch(error => {
          console.error('Registration failed:', error);
          // Handle errors, e.g., display a user-friendly error message
        });
    },
  });

  return (
    <div>
      <h2>Employer Registration</h2>
      <form onSubmit={formik.handleSubmit}>
        <div>
          <label htmlFor="companyName">Company Name</label>
          <input
            id="companyName"
            name="companyName"
            type="text"
            onChange={formik.handleChange}
            value={formik.values.companyName}
          />
        </div>
        <div>
          <label htmlFor="email">Email</label>
          <input
            id="email"
            name="email"
            type="email"
            onChange={formik.handleChange}
            value={formik.values.email}
          />
        </div>
        <div>
          <label htmlFor="password">Password</label>
          <input
            id="password"
            name="password"
            type="password"
            onChange={formik.handleChange}
            value={formik.values.password}
          />
        </div>
        <div>
          <label htmlFor="firstName">firstName</label>
          <input
            id="firstName"
            name="firstName"
            type="text"
            onChange={formik.handleChange}
            value={formik.values.industry}
          />
        </div>
        <div>
          <label htmlFor="lastName">lastName</label>
          <input
            id="lastName"
            name="lastName"
            type="text"
            onChange={formik.handleChange}
            value={formik.values.industry}
          />
        </div>
        <button type="submit">Register</button>
      </form>
    </div>
  );
};

export default EmployerRegistrationPage;
