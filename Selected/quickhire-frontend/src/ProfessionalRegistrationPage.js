import React from 'react';
import { useFormik } from 'formik';
import axios from 'axios';

const ProfessionalRegistrationPage = () => {
  const formik = useFormik({
    initialValues: {
      firstName: '',
      lastName:'',
      email: '',
      password: ''
    },
    onSubmit: values => {
      axios.post('http://localhost:8080/professional/register', values)
        .then(response => {
          alert('Registration successful!');
          // Additional actions on success, e.g., redirecting to a confirmation page or login page
        })
        .catch(error => {
          console.error('Registration failed:', error);
          // Handle errors, e.g., show an error message
        });
    },
  });

  return (
    <div>
      <h2>Professional Registration</h2>
      <form onSubmit={formik.handleSubmit}>
        <div>
          <label htmlFor="firstName">firstName</label>
          <input
            id="firstName"
            name="firstName"
            type="text"
            onChange={formik.handleChange}
            value={formik.values.name}
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
          <label htmlFor="lastName">lastName</label>
          <input
            id="lastName"
            name="lastName"
            type="text"
            onChange={formik.handleChange}
            value={formik.values.profession}
          />
        </div>
        <button type="submit">Register</button>
      </form>
    </div>
  );
};

export default ProfessionalRegistrationPage;
