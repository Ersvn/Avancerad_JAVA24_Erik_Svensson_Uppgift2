
# Student Management System

The Student Management System is a console-based Java application for managing student records. It allows users to add, search, view, and save student data efficiently. This application demonstrates fundamental principles of Java such as object-oriented programming, file handling, and singleton design patterns.

---

## Table of Contents

- [Introduction](#introduction)
- [Features](#features)
- [Installation](#installation)
- [Usage](#usage)
- [File Structure](#file-structure)
- [Dependencies](#dependencies)
- [Configuration](#configuration)
- [Examples](#examples)
- [Troubleshooting](#troubleshooting)
- [Contributors](#contributors)
- [License](#license)

---

## Introduction

This project provides a simple way to manage student records. Data can be loaded from and saved to a file, ensuring persistence. The application employs a `StudentManager` singleton class to maintain a consistent state of student data.

---

## Features

1. **Add a Student**: Add a new student record by providing an ID, name, and grade.
2. **Search Student-ID**: Search for a student using their unique ID.
3. **Show All Students**: Display a list of all registered students.
4. **Save to File**: Persist student data to a text file.
5. **Load from File**: Automatically load existing data upon startup.
6. **Exit**: Gracefully exit the program.

---

## Installation

1. Clone the repository to your local machine:
   ```bash
   git clone <repository-url>
   ```
2. Open the project in an IDE such as IntelliJ IDEA or Eclipse.
3. Ensure that Java is installed on your system (JDK 8 or higher).

---

## Usage

1. Run the `Main.java` file to start the application.
2. Follow the on-screen prompts to interact with the system.

### Example Menu
```
Student Management System
1. Add a Student
2. Search Student-ID
3. Show All Students
4. Save Student to File
5. Exit
```

---

## File Structure

```plaintext
src/
│
├── org.example/
│   ├── FileHandler.java   # Handles file operations (load/save).
│   ├── Main.java          # Entry point of the application.
│   ├── Student.java       # Represents a student entity.
│   ├── StudentManager.java # Manages student records.
```

---

## Dependencies

- **Java Runtime**: JDK 8 or higher
- **File Handling**: Reads/writes from `datastudents.txt`

---

## Configuration

- Modify the file path in `FileHandler.java` to the location where `datastudents.txt` will be stored:
  ```java
  File file = new File("path/to/your/datastudents.txt");
  ```

---

## Examples

### Adding a Student
1. Select option `1`.
2. Provide the student details:
   ```
   Enter Student ID: 101
   Enter Name: John
   Enter Grade (A-F): A
   ```

### Searching for a Student
1. Select option `2`.
2. Enter the Student ID to search:
   ```
   Enter Student ID: 101
   ```

---

## Troubleshooting

1. **File Not Found Error**: Ensure the file path specified in `FileHandler.java` exists.
2. **Incorrect Input**: Follow the prompts strictly to avoid invalid input errors.

---

## Contributors

- **Author**: Erik Svensson

---

## License

This project is licensed under Erik Svensson Inc. Ltd.
