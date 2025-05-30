# Banking System Project 🏦

## Overview 📖
Banking System is a robust desktop application designed to streamline banking operations and provide users with an intuitive interface for managing their financial accounts. The application supports multiple user roles including customers, cashiers, and managers, each with tailored functionality to meet their specific needs.

## Features ✨
Based on the file structure, the application likely includes features such as:
* User Registration and Login 🔒
* Account Management (Checking & Savings) 💳
* Fund Transfers 💸
* Deposits and Withdrawals 💰
* Loan Management 📉
* Transaction History/Movement Management 📜
* Cashier and Manager Interfaces 🧑‍💼👩‍💼
* Account Association Management 🔗

## Technologies Used 💻
* **JavaFX:** For the graphical user interface.
* **Maven:** For project build and dependency management.
* **Java:** The core programming language.

## Getting Started 🚀

### Prerequisites
* **Java Development Kit (JDK):** Version 21 or higher. You can download it from [Oracle's website](https://www.oracle.com/java/technologies/javase-jdk21-downloads.html) or use an alternative like OpenJDK.
* **Apache Maven:** Ensure Maven is installed and configured on your system. You can download it from the [Maven official website](https://maven.apache.org/download.cgi).

### Building and Running the Project
1. **Clone the repository:**
   ```bash
   git clone https://github.com/diegnghtmr/banking-system-project.git
   ```
2. **Navigate to the project directory:**
   ```bash
   cd banking-system-project/co.edu.uniquindio.bankingSystem 
   ```
   (Or the appropriate path to the `pom.xml` file)
3. **Build the project and run the application:**
   ```bash
   mvn clean javafx:run
   ```
   This command will compile the code, download dependencies, and launch the application.

## Project Structure 📂
The project follows a standard Maven directory layout:
* `co.edu.uniquindio.bankingSystem/`
    * `src/main/java/`: Contains the Java source code for the application (controllers, models, application logic).
        * `co/edu/uniquindio/bankingsystem/bankingsystem/`: Main package for the application.
        * `co/edu/uniquindio/bankingsystem/controllers/`: JavaFX controllers for different views.
        * `co/edu/uniquindio/bankingsystem/exceptions/`: Custom exceptions.
        * `co/edu.uniquindio.bankingsystem/model/`: Data models (e.g., Account, User, Transaction).
        * `co/edu.uniquindio.bankingsystem/services/`: Business logic services.
    * `src/main/resources/`: Contains non-code resources.
        * `*.fxml`: JavaFX FXML files defining the user interface views.
        * `img/`: Image assets used in the application.
    * `pom.xml`: The Project Object Model file used by Maven to manage the project's build, dependencies, and other configurations.
* `LICENSE`: Contains the license information for the project.
* `README.md`: This file! Providing information about the project.
