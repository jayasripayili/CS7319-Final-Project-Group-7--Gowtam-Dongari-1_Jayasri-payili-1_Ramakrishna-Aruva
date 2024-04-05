import React from 'react';
import { useFormik } from 'formik';
import axios from 'axios';

const LoginPage = () => {
  const formik = useFormik({
    initialValues: {
      username: '',
      password: '',
    },
    onSubmit: values => {
      axios.post('http://localhost:8080/login', values)
        .then(response => {
          console.log(response.data);
          // Handle login success, store the token, navigate to the dashboard, etc.
        })
        .catch(error => {
          console.error('Login failed:', error);
          // Handle login failure, show an error message, etc.
        });
    },
  });

  return (
    <div>
      <h2>Login</h2>
      <form onSubmit={formik.handleSubmit}>
        <div>
          <label htmlFor="username">Username</label>
          <input
            id="username"
            name="username"
            type="text"
            onChange={formik.handleChange}
            value={formik.values.username}
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
        <button type="submit">Submit</button>
      </form>
    </div>
  );
};

export default LoginPage;
