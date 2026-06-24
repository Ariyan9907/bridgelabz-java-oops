# Account Management System

## Overview

The Account Management System is a Core Java OOPs project developed to demonstrate basic banking operations using Object-Oriented Programming principles.

The application allows users to:

* Create an account with an initial balance
* View the current account balance
* Deposit money into the account
* Withdraw money from the account
* Validate withdrawal requests against the available balance

---

## Problem Statement

Modify the Account class to provide a method called `debit()` that withdraws money from an account.

Requirements:

* The withdrawal amount must not exceed the available balance.
* If the withdrawal amount is greater than the current balance, the balance should remain unchanged.
* Display the message:

```text
Debit amount exceeded account balance.
```

Modify the AccountTest class to test the debit functionality.

---

## Project Structure

```text
src
└── com.accountmanagement
    ├── Account.java
    └── AccountTest.java
```

---

## File Responsibilities

### 1. Account.java

Represents a bank account.

#### Responsibilities

* Stores account balance
* Validates initial balance
* Deposits money into the account
* Withdraws money using the debit method
* Returns the current balance

#### Attributes

```text
balance
```

#### Methods

```text
credit()
debit()
getBalance()
```

---

### 2. AccountTest.java

Main driver class of the application.

#### Responsibilities

* Creates Account objects
* Accepts user input
* Invokes account operations
* Displays account information
* Tests debit functionality

---

## Application Flow

```text
Start
   |
   v
Create Account
   |
   v
Set Initial Balance
   |
   v
Display Current Balance
   |
   v
Enter Debit Amount
   |
   v
Check Available Balance
   |
   +---- Yes ----> Withdraw Amount
   |                   |
   |                   v
   |             Update Balance
   |
   +---- No -----> Display Error Message
                       |
                       v
              Balance Remains Unchanged
   |
   v
Display Final Balance
   |
   v
End
```

---

## Example 1: Successful Withdrawal

### Input

```text
Initial Balance : 1000
Debit Amount    : 300
```

### Output

```text
Current Balance : 1000
Balance After Debit : 700
```

---

## Example 2: Insufficient Balance

### Input

```text
Initial Balance : 1000
Debit Amount    : 1500
```

### Output

```text
Debit amount exceeded account balance.
Balance : 1000
```

---

## OOP Concepts Used

### Class

```text
Account
```

### Object

```text
Account account1
```

### Encapsulation

The balance is stored within the Account class and accessed through methods.

### Data Validation

The debit method ensures that users cannot withdraw more money than is available.

### Method-Based Operations

```text
credit()
debit()
getBalance()
```

---

## Learning Outcomes

Through this project, the following concepts are practiced:

* Classes and Objects
* Constructors
* Encapsulation
* Method Creation
* Validation Logic
* User Input Handling
* Banking Transaction Simulation
* Object-Oriented Design

---

## Author

Developed as part of the BridgeLabz Java OOPs Learning Program.
