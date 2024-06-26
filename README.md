# CS7319-Final-Project-Group-7--Gowtam-Dongari-1_Jayasri-payili-1_Ramakrishna-Aruva

## Development Environment Setup

Setting up the development environment is a crucial step to ensure that the project runs smoothly on your machine. This section covers the setup process for both backend and frontend components of the project.

### Prerequisites

Before proceeding with the setup, ensure you have the following prerequisites installed on your system:

- **Java JDK 11 or newer**: Necessary to compile and run the Java-based backend services.
- **Node.js**: Required for running the React-based frontend application in the `Selected` component.
- **Maven**: Used for managing the project's backend dependencies and build lifecycle. The project utilizes Maven Wrapper, so a separate Maven installation isn't necessary.
- **IDEs**: For Java development, IntelliJ IDEA is recommended due to its comprehensive support for Java and Maven. For JavaScript development, Visual Studio Code is suggested for its extensive ecosystem of plugins and ease of use.

### Java Backend Setup (Both `Selected` and `UnSelected` Components)

For the Java backend (applicable to both `Selected` and `UnSelected` components), we use Maven for dependency management:

- **Maven Dependencies**: Specified in the `pom.xml` file located in the root directory of each component. This XML file includes all necessary library dependencies needed by the project.
- **Adding a Dependency**: To add a new library, include its `groupId`, `artifactId`, and `version` within the `<dependencies>` section of the `pom.xml`. Maven Central Repository is a comprehensive source for finding the necessary information about dependencies.
- **Updating Dependencies**: It's advisable to periodically update dependencies to their latest stable versions to incorporate bug fixes and performance improvements. This can be done manually by changing the version numbers in `pom.xml` or using Maven commands/plugins that check for updates.

1. **Java JDK Installation**: 
   - Download Java JDK from [Oracle's JDK Download Page](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html) or choose a version from OpenJDK.
   - Follow the installation instructions for your operating system.
   - Set the `JAVA_HOME` environment variable to the JDK installation directory.
   
2. **Using Maven Wrapper**:
   - The project includes Maven Wrapper scripts (`mvnw` for Unix/Linux and `mvnw.cmd` for Windows) in the root directory of both `Selected` and `UnSelected` components.
   - These scripts automatically handle Maven's setup and use the project-specific Maven version, ensuring consistency across development environments.

### QuickHire Frontend Setup (`Selected` Component)

- **Package Management**: We use `npm` (Node Package Manager), which manages JavaScript dependencies as specified in `package.json`.
- **Installing Dependencies**: Running `npm install` within the `quickhire-frontend` directory will install all dependencies listed in `package.json` into the `node_modules` directory.
- **Adding a New Dependency**: Use `npm install <package-name> --save` to install a new package and add it to `package.json`. For development-only dependencies, use `--save-dev`.
- **Updating Dependencies**: Dependencies can be updated to their latest versions using `npm update`. For major updates that require manual intervention, consult the package documentation for migration guides.

1. **Node.js Installation**:
   - Download and install Node.js from [Node.js Official Website](https://nodejs.org/).
   - Installation will also include `npm`, Node.js package manager, used for managing frontend dependencies.

2. **Installing Dependencies**:
   - Navigate to the `quickhire-frontend` directory within the `Selected` component.
   - Run `npm install` to install the project's dependencies as listed in `package.json`. This step ensures all necessary libraries and tools for the frontend are installed.

### IDE Setup

1. **IntelliJ IDEA for Java**:
   - Download and install IntelliJ IDEA from [JetBrains](https://www.jetbrains.com/idea/download/).
   - Open the project by selecting the `pom.xml` file in the `Selected` or `UnSelected` component and choose "Open as Project".
   - IntelliJ IDEA will automatically set up the project according to the Maven configuration.

2. **Visual Studio Code for JavaScript**:
   - Download and install Visual Studio Code from [Visual Studio Code](https://code.visualstudio.com/).
   - Open the `quickhire-frontend` directory as a project in Visual Studio Code.
   - Extensions such as ESLint for code quality and Prettier for code formatting can enhance the development experience.
## Localhost Setup

To run and test the application locally, you will use the localhost environment—a local server on your own computer.

### Backend Localhost

- **Running the Application**: After compiling the project with Maven, start the backend application using `./mvnw spring-boot:run` (or `mvnw.cmd spring-boot:run` on Windows). This command starts the Spring Boot application.
- **Accessing the API**: Once the backend server is running, you can access the API endpoints through `http://localhost:8080/` (assuming the default port 8080 is used). If your application uses different ports or context paths, adjust the URL accordingly.

### Frontend Localhost

- **Starting the Frontend**: In the `quickhire-frontend` directory, run `npm start` to launch the React application. This command starts a development server and opens the application in your default web browser.
- **Interacting with the Backend**: Ensure the frontend is configured to communicate with the backend API on its running port (e.g., 8080). This configuration is typically defined in the `.env` file or directly within the code where API requests are made.

## Environment Variables

- **Backend**: Java applications may require setting environment variables for database connections, API keys, or other configuration details. Define these variables in your IDE or as part of the application's run configuration.
- **Frontend**: React applications utilize `.env` files for environment variables. Create a `.env` file in the `quickhire-frontend` directory to store configuration such as the backend API URL.

## Specific Considerations

- **Cross-Origin Resource Sharing (CORS)**: If your frontend and backend are served on different ports during development, ensure your backend is configured to allow CORS requests from the frontend's port.
- **Database Connections**: For applications connecting to a database, ensure the database is running and accessible. Include setup instructions for the database in the README if necessary.


After completing these steps, your development environment should be ready for both backend and frontend development work.
