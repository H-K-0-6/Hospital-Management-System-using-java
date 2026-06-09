# Hospital Management System

## Description
This is a Java-based console application designed to manage hospital operations efficiently. It allows administrators to handle patient records, manage hospital services, and track the medical history and services received by patients.

## Features
The system provides an interactive command-line interface with the following functionalities:
1. **Add patient:** Register a new patient with their details (ID, Name, Gender, Email).
2. **Delete patient:** Remove an existing patient from the system using their ID.
3. **Search for patient:** Look up a patient by their ID.
4. **Check the patient list size:** View the total number of registered patients.
5. **Add Service:** Create a new hospital service with its cost and duration.
6. **Add Service to patient:** Assign a specific service to a patient.
7. **Add Medical Record to patient:** Append text-based medical records to a patient's history.
8. **Print patient details:** View comprehensive details of a specific patient, including their medical history and received services.
9. **Print the patients list:** Display all registered patients.
10. **Print the services list:** Display all available hospital services.
11. **Exit:** Terminate the application.

## Project Structure
- `Main.java`: The main entry point of the application containing the interactive menu loop.
- `Patient.java`: Represents a patient entity, storing personal details, medical history, and services received.
- `Hospital.java`: Manages the collections of patients and services, providing methods to add, remove, search, and print.
- `Service.java`: Represents a medical service offered by the hospital, containing details like ID, name, cost, and duration.

## How to Run
1. Ensure you have Java JDK installed on your machine.
2. Open your terminal or command prompt.
3. Navigate to the `src` directory of the project:
   ```bash
   cd path/to/HMS_PROJECT/src
   ```
4. Compile all the Java files:
   ```bash
   javac *.java
   ```
5. Run the application:
   ```bash
   java Main
   ```
