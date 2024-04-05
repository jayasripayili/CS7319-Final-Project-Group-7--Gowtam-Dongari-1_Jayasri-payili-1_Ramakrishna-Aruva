import React from 'react';
import { Link, NavLink } from 'react-router-dom';
import { Navbar, Nav } from 'react-bootstrap';

const NavigationBar = () => {
  return (
    <Navbar bg="light" expand="lg">
      <Navbar.Brand as={Link} to="/">QuickHire</Navbar.Brand>
      <Navbar.Toggle aria-controls="basic-navbar-nav" />
      <Navbar.Collapse id="basic-navbar-nav">
        <Nav className="mr-auto">
          <Nav.Link as={NavLink} to="/login">Login</Nav.Link>
          <Nav.Link as={NavLink} to="/post-job">Post a Job</Nav.Link>
          <Nav.Link as={NavLink} to="/jobs">Job Listings</Nav.Link>
          <Nav.Link as={NavLink} to="/register-professional">Professional Registration</Nav.Link>
          <Nav.Link as={NavLink} to="/register-employer">Employer Registration</Nav.Link>
        </Nav>
      </Navbar.Collapse>
    </Navbar>
  );
};

export default NavigationBar;
