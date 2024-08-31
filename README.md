# Library Management System - TDD

Explore my approach to solving the Library Management Kata, where I’ve utilized Test-Driven Development (TDD) to build a robust and well-structured system.ty and simplicity in the code.This repository shows a step-by-step approach to solving the problem using Test-Driven Development (TDD), focusing on clear and simple code.
## Table of Contents

- [Problem Statement](#problem-statement)
- [Requirements](#requirements)
- [Solution](#solution)
- [Features](#features)
- [Setup Instructions](#setup-instructions)
  - [Prerequisites](#prerequisites)
  - [Clone the Repository](#clone-the-repository)
  - [Import Project into IntelliJ IDEA](#import-project-into-intellij-idea)
  - [Build the Project](#build-the-project)
  - [Running Tests](#running-tests)
- [Test Coverage](#test-coverage)

## Problem Statement

Create a simple library management system that allows users to perform basic operations such as adding books, borrowing books, returning books, and viewing available books.

### Requirements

- **Add Books**:
  - Users should be able to add new books to the library.
  - Each book should have a unique identifier (e.g., ISBN), title, author, and publication year.

- **Borrow Books**:
  - Users should be able to borrow a book from the library.
  - The system should ensure that the book is available before allowing it to be borrowed.
  - If the book is not available, the system should raise an appropriate error.

- **Return Books**:
  - Users should be able to return a borrowed book.
  - The system should update the availability of the book accordingly.

- **View Available Books**:
  - Users should be able to view a list of all available books in the library.
    


## Solution

This project follows TDD principles to solve the kata problem. The solution is built with small, incremental commits, ensuring that each feature is developed and tested in isolation, demonstrating effective TDD practices.

## Features

### Book Management

- **addBook**:
  - Ensures the book is not null.
  - Throws an exception if the user adding a book with duplicate ISBN

- **borrowBook**:
  - Allows a user to borrow a book from the library.
  - Validates that the book is not already borrowed.
  - Ensures the book exists in the inventory.
  - Throws an exception if the book is already borrowed.

- **returnBook**:
  - Allows a user to return a borrowed book to the library.
  - Ensures the book is returned to the inventory.
  - Ensures book not added back that is not borrowed
    
- **viewAvailableBooks**:
  - Returns a list of all books currently available in the library.

## Setup Instructions

### Prerequisites

- **Java Development Kit (JDK)**: Ensure JDK 11 or later is installed on your machine.
- **Maven**: Ensure Maven is installed for managing dependencies and building the project.

### Clone the Repository

1. Open your terminal or command prompt.
2. Run the following command to clone the repository:

    ```bash
    git clone https://github.com/Tushar7685/LibraryManagementSystem-TDD.git
    ```

3. Navigate into the project directory:

    ```bash
    cd library-management-system/library
    ```

### Import Project into IntelliJ IDEA

1. Open IntelliJ IDEA.
2. Click on `File` > `Open...`.
3. Select the root directory of the project (where the `pom.xml` file is located).
4. Click `OK` to import the project.

### Build the Project

1. In IntelliJ IDEA, go to the Maven tool window (usually on the right side of the IDE).
2. Click on the `Reload All Maven Projects` button to ensure all dependencies are downloaded and the project is set up correctly.

### Running Tests

- To run the tests, navigate to the `LibraryTest` class and click on the run button.

## Test Coverage

The current test coverage of this project is **100%**.



![test coverage](https://github.com/user-attachments/assets/98cc8070-3d89-4f20-82ad-25aacf778cc3)
