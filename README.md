# PROG5121 POE 

A comprehensive Java console application built as a Portfolio of Evidence (POE) for the PROG5121 module. The application handles secure user registration and login verification, followed by a fully functional Kanban task management loop utilizing object-oriented programming (OOP) principles and parallel arrays.

## Features

### Part 1: Registration and Login
* **Username Validation:** Ensures usernames contain an underscore (`_`) and do not exceed 5 characters.
* **Password Complexity:** Validates that passwords contain at least 8 characters, one capital letter, one number, and one special character.
* **Cell Phone Checker:** Verifies international format prefixes along with length constraints.
* **Authentication:** Cross-checks user credentials during login and returns customized status messages.

### Part 2: Kanban Task Logic
* **Description Limit:** Restricts task descriptions to a maximum of 50 characters.
* **Automated Task ID Generation:** Programmatically builds unique IDs using the task name, task number, and developer details (e.g., `LO:0:SON`).
* **Duration Tracking:** Captures and accumulates total project hours across all inputted tasks.

### Part 3: Advanced Reports & Search
* **Status Filtering:** Instantly view all tasks flagged with a status of "Done".
* **Longest Task Finder:** Scans the system to pinpoint the developer and task with the maximum hour duration.
* **Targeted Search:** Search for specific task details using either the Task Name or the Developer's name.
* **Task Deletion:** Allows removing a task completely from the underlying array structure.

---

## Getting Started

### Prerequisites
* Java Development Kit (JDK 17 or higher recommended)
* An IDE or Editor (Visual Studio Code, IntelliJ IDEA, or NetBeans)
* JUnit 5 library (for running unit tests)

### Project Structure
```text
├── src/
│   ├── App.java          # Main entry point and application menu loop
│   ├── Login.java        # Registration and authentication business logic
│   └── Task.java         # Task creation, validation, and array structures
└── test/
    └── LoginTest.java    # JUnit test cases verifying logic requirements
