import React from 'react';
import { BrowserRouter as Router, Route, Switch } from 'react-router-dom';
import NavigationBar from './NavigationBar';
import LoginPage from './LoginPage';
import JobPostingPage from './JobPostingPage';
import JobListingsPage from './JobListingsPage';
import ProfessionalRegistrationPage from './ProfessionalRegistrationPage';
import EmployerRegistrationPage from './EmployerRegistrationPage';

function App() {
  return (
    <Router>
      <NavigationBar />
      <div className="container mt-3">
        <Switch>
          <Route path="/" exact component={() => <h1>Welcome to QuickHire!</h1>} />
          <Route path="/login" component={LoginPage} />
          <Route path="/post-job" component={JobPostingPage} />
          <Route path="/jobs" component={JobListingsPage} />
          <Route path="/register-professional" component={ProfessionalRegistrationPage} />
          <Route path="/register-employer" component={EmployerRegistrationPage} />
          {/* Add more routes here */}
        </Switch>
      </div>
    </Router>
  );
}

export default App;
