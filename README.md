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

1. **Java JDK Installation**: 
   - Download Java JDK from [Oracle's JDK Download Page](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html) or choose a version from OpenJDK.
   - Follow the installation instructions for your operating system.
   - Set the `JAVA_HOME` environment variable to the JDK installation directory.
   
2. **Using Maven Wrapper**:
   - The project includes Maven Wrapper scripts (`mvnw` for Unix/Linux and `mvnw.cmd` for Windows) in the root directory of both `Selected` and `UnSelected` components.
   - These scripts automatically handle Maven's setup and use the project-specific Maven version, ensuring consistency across development environments.

### QuickHire Frontend Setup (`Selected` Component)

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

After completing these steps, your development environment should be ready for both backend and frontend development work.
