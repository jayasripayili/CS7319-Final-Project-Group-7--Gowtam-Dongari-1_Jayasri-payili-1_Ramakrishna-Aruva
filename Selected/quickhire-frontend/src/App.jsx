import React from 'react';
import { BrowserRouter as Router, Routes, Route } from 'react-router-dom';
import NavigationBar from './NavigationBar';
import LoginPage from './LoginPage';
import JobPostingPage from './JobPostingPage';
import JobListingsPage from './JobListingsPage';
import ProfessionalRegistrationPage from './ProfessionalRegistrationPage';
import EmployerRegistrationPage from './EmployerRegistrationPage';

function App() {
  return (
     <>
      <NavigationBar />
      <div className="container mt-3">
        <Routes>
          <Route path="/" element={<h1>Welcome to QuickHire!</h1>} />
          <Route path="/login" element={<LoginPage />} />
          <Route path="/post-job" element={<JobPostingPage />} />
          <Route path="/jobs" element={<JobListingsPage />} />
          <Route path="/register-professional" element={<ProfessionalRegistrationPage />} />
          <Route path="/register-employer" element={<EmployerRegistrationPage />} />
          {/* Add more routes here */}
        </Routes>
      </div>
      </>
    
  );
}

export default App;
