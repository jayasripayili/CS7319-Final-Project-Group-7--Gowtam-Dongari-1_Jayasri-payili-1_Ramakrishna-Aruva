import React, { useState } from 'react';
import axios from 'axios';

const LoginPage = () => {
  const [email, setEmail] = useState('');
  const [password, setPassword] = useState('');
  const [userType, setUserType] = useState('professional'); // 'professional' or 'employer'

  const handleLogin = async (e) => {
    e.preventDefault();
    const endpoint = userType === 'professional' ? '/api/login/professional' : '/api/login/employer';

    try {
      const response = await axios.post(endpoint, { email, password });
      alert(response.data);
      // Handle successful login here (e.g., store token, redirect, etc.)
    } catch (error) {
      alert(error.response.data);
      // Handle errors here (e.g., show error message to the user)
    }
  };

  return (
    <div>
      <h2>Login as a {userType}</h2>
      <form onSubmit={handleLogin}>
        <label>
          Email:
          <input
            type="email"
            value={email}
            onChange={(e) => setEmail(e.target.value)}
            required
          />
        </label>
        <br />
        <label>
          Password:
          <input
            type="password"
            value={password}
            onChange={(e) => setPassword(e.target.value)}
            required
          />
        </label>
        <br />
        <label>
          User Type:
          <select value={userType} onChange={(e) => setUserType(e.target.value)}>
            <option value="professional">Professional</option>
            <option value="employer">Employer</option>
          </select>
        </label>
        <br />
        <button type="submit">Login</button>
      </form>
    </div>
  );
};

export default LoginPage;
