# Address Book System

## Overview

The Address Book System is a Core Java OOPs project developed as part of the BridgeLabz Java OOPs learning program.

The application allows users to:

* Add a new contact
* Edit an existing contact
* Delete a contact

The project follows Object-Oriented Programming principles using separate classes for:

* `Contact` (Model Class)
* `AddressBook` (Business Logic Class)
* `AddressBookMain` (Application Entry Point)

---

# Project Structure

```text
src
│
└── com.src
    │
    ├── AddressBookMain.java
    ├── AddressBook.java
    └── Contact.java
```

---

# Class Responsibilities

## Contact.java

Represents a single contact in the Address Book.

### Attributes

* First Name
* Last Name
* Address
* City
* State
* Zip
* Phone Number
* Email

### Features

* Parameterized Constructor
* Getters
* Setters
* Encapsulation using private variables

---

## AddressBook.java

Manages all contact-related operations.

### Data Structure Used

```java
ArrayList<Contact> contacts = new ArrayList<>();
```

### Responsibilities

* Add Contact
* Edit Contact
* Delete Contact

---

## AddressBookMain.java

Acts as the entry point of the application.

### Responsibilities

* Display user prompts
* Accept input using Scanner
* Create Contact objects
* Invoke AddressBook operations

---

# Use Cases Implemented

## UC1 - Create Contact Class

### Objective

Create a Contact class containing all required contact details.

### Implementation

Created the following classes:

```text
Contact
AddressBook
AddressBookMain
```

### Concepts Used

* Class
* Object
* Encapsulation
* Constructor

---

## UC2 - Add Contact

### Objective

Add a new contact to the Address Book using console input.

### Implementation Steps

1. Accept user input from console.
2. Create a Contact object.
3. Create an AddressBook object.
4. Add Contact to AddressBook.

### Method Added

```java
public void addContact(Contact contact)
```

### Concepts Used

* Scanner
* Object Creation
* ArrayList
* Method Invocation

---

## UC3 - Edit Contact

### Objective

Edit an existing contact using First Name.

### Implementation Steps

1. Search contact using first name.
2. Display existing contact details.
3. Accept updated details.
4. Update object using setter methods.

### Method Added

```java
public void editContact(String firstName)
```

### Search Logic

```java
for(Contact contact : contacts)
```

### Concepts Used

* Enhanced For Loop
* Searching
* Getter Methods
* Setter Methods
* Object Modification

---

## UC4 - Delete Contact

### Objective

Delete a contact using First Name.

### Implementation Steps

1. Search contact using first name.
2. Remove contact from ArrayList.
3. Display success message.

### Method Added

```java
public void deleteContact(String firstName)
```

### Delete Logic

```java
for(int i = 0; i < contacts.size(); i++)
```

```java
contacts.remove(i);
```

### Concepts Used

* Index Based Loop
* ArrayList Removal
* Conditional Search

---

# OOP Concepts Applied

## Encapsulation

```java
private String firstName;
private String lastName;
```

Accessed using getters and setters.

---

## Object Creation

```java
Contact contact = new Contact(...);
```

---

## Composition

```text
AddressBook
    |
    ---> Contact
```

An AddressBook contains multiple Contact objects.

---

## Data Storage

```java
ArrayList<Contact> contacts
```

Used to store multiple contacts dynamically.

---

# Git Workflow Followed

## Repository

```text
bridgelabz-java-oops
```

## Project Branch

```text
address-book-system
```

## Feature Branches

```text
feature/uc1-create-contact
feature/uc2-add-contact
feature/uc3-edit-contact
feature/uc4-delete-contact
```

## Merge Flow

```text
main
│
└── address-book-system
     │
     ├── feature/uc1-create-contact
     ├── feature/uc2-add-contact
     ├── feature/uc3-edit-contact
     └── feature/uc4-delete-contact
```

Each use case was developed in a separate feature branch and merged into the Address Book project branch after successful implementation and testing.

---

# Technologies Used

* Java 21
* IntelliJ IDEA
* Git
* GitHub
* Collections Framework
* Object Oriented Programming

---

# Learning Outcomes

* Understanding OOP Design
* Working with Objects and Classes
* Encapsulation
* Constructor Usage
* ArrayList Operations
* CRUD Operations
* Git Branching Strategy
* Feature-Based Development Workflow
* Console Based Application Development

```
```
