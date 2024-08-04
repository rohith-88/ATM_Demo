# ATM Demo Project

## Project Structure

ATM_Demo/<br>
├── database/<br>
│ ├── Account.java<br>
│ └── AccountInfo/<br>
│ └── qwefty.txt<br>
├── services/<br>
│ ├── Authentication.java<br>
│ ├── CreatingAccount.java<br>
│ ├── Cryptography.class<br>
│ ├── Cryptography.java<br>
│ ├── Enquiry.java<br>
│ ├── Transfer.java<br>
│ └── Updation.java<br>
└── userInterface/<br>
├── MainClass.java<br>
└── UserFunctions.java<br>

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
