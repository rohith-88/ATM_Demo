# ATM Demo Project

## Project Structure

ATM_Demo/
├── database/
│ ├── Account.java
│ └── AccountInfo/
│ └── qwefty.txt
├── services/
│ ├── Authentication.java
│ ├── CreatingAccount.java
│ ├── Cryptography.class
│ ├── Cryptography.java
│ ├── Enquiry.java
│ ├── Transfer.java
│ └── Updation.java
└── userInterface/
├── MainClass.java
└── UserFunctions.java

## Description

This project simulates an ATM system with functionalities to create accounts, authenticate users, perform transactions, and update account details.

### Directory and File Descriptions

- **database/**

  - `Account.java`: Defines the account structure and related operations.
  - `AccountInfo`: Stores the files containing the account data in encrypted form.

- **services/**

  - `Authentication.java`: Handles user authentication.
  - `CreatingAccount.java`: Manages the creation of new accounts.
  - `Cryptography.java`: Source file for cryptography-related functions.
  - `Enquiry.java`: Provides account enquiry services.
  - `Transfer.java`: Manages fund transfers between accounts.
  - `Updation.java`: Handles updating account information.

- **userInterface/**
  - `MainClass.java`: The main entry point of the application.
  - `UserFunctions.java`: Defines the user interface and available user functions.

## Setup and Usage

- Make sure JDK is installed on your local system.
- After cloning the repository, copy the complete path of the AccountInfo, for example 'C:/Users/.../AccountInfo/'.
- Paste the copied path in the 'path' variable of the the 'MainClass.java' file.
- Execute the program by running the 'MainClass.java' file.

## Features

- User Authentication: Verify user credentials.
- Account Management: Create and update account details.
- Transactions: Perform fund transfers and account enquiries.
- Security: Cryptography services to secure sensitive data.
- Local Storage: Uses file system to store the data locally.

## Conclusion

This is an java project mimicking an ATM using concepts like inheritance, data abstraction, exception handling, file handling etc.It helped me better understand some of these important OOPS concepts of Java programming.
