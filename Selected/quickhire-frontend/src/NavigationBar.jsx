import React from 'react';
import { NavLink } from 'react-router-dom';

const NavigationBar = () => {
  return (
    <nav className="navbar">
      <NavLink className="navbar-brand" to="/">QuickHire</NavLink>
      <div className="navbar-nav">
        <NavLink className="nav-item" to="/login">Login</NavLink>
        <NavLink className="nav-item" to="/post-job">Post a Job</NavLink>
        <NavLink className="nav-item" to="/jobs">Job Listings</NavLink>
        <NavLink className="nav-item" to="/register-professional">Professional Registration</NavLink>
        <NavLink className="nav-item" to="/register-employer">Employer Registration</NavLink>
      </div>
    </nav>
  );
};

export default NavigationBar;
