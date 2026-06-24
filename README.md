# Address Book System

## Overview

The Address Book System is a Core Java OOPs project developed as part of the BridgeLabz Java OOPs Learning Program.

The application allows users to:

- Add a new Contact
- Edit an existing Contact
- Delete a Contact

The project follows Object-Oriented Programming principles using separate classes for:

- Contact (Model Class)
- AddressBook (Business Logic Class)
- AddressBookMain (Application Entry Point)

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

Represents a single Contact in the Address Book.

### Attributes

- First Name
- Last Name
- Address
- City
- State
- Zip
- Phone Number
- Email

### Features

- Parameterized Constructor
- Getters
- Setters
- Encapsulation using private variables

---

## AddressBook.java

Manages all contact-related operations.

### Data Structure Used

```java
ArrayList<Contact> contacts = new ArrayList<>();
```

### Responsibilities

- Add Contact
- Edit Contact
- Delete Contact

---

## AddressBookMain.java

Acts as the entry point of the application.

### Responsibilities

- Display user prompts
- Accept user input using Scanner
- Create Contact objects
- Invoke AddressBook operations

---

# Use Cases Implemented

## UC1 - Create Contact Class

### Objective

Create a Contact class containing all required contact details.

### Classes Created

```text
Contact
AddressBook
AddressBookMain
```

### Concepts Used

- Class
- Object
- Encapsulation
- Constructor

---

## UC2 - Add Contact

### Objective

Add a new Contact to the Address Book using console input.

### Implementation Steps

1. Accept user input from the console.
2. Create a Contact object.
3. Create an AddressBook object.
4. Add the Contact to the AddressBook.

### Method Added

```java
public void addContact(Contact contact){}
```

### Concepts Used

- Scanner
- Object Creation
- ArrayList
- Method Invocation

---

## UC3 - Edit Contact

### Objective

Edit an existing Contact using First Name.

### Implementation Steps

1. Search Contact using First Name.
2. Display existing Contact details.
3. Accept updated Contact details.
4. Update the Contact object using setter methods.

### Method Added

```java
public void editContact(String firstName){}
```

### Search Logic

```java
for(Contact contact : contacts){}
```

### Concepts Used

- Enhanced For Loop
- Searching
- Getter Methods
- Setter Methods
- Object Modification

---

## UC4 - Delete Contact

### Objective

Delete a Contact using First Name.

### Implementation Steps

1. Search Contact using First Name.
2. Remove Contact from ArrayList.
3. Display success message.

### Method Added

```java
public void deleteContact(String firstName)
```

### Delete Logic

```java
for(int i = 0; i < contacts.size(); i++) {
    if(contacts.get(i).getFirstName().equalsIgnoreCase(firstName)) {
        contacts.remove(i);
    }
}
```

### Concepts Used

- Index Based Loop
- ArrayList Removal
- Conditional Search

---

# OOP Concepts Applied

## Encapsulation

```java
private String firstName;
private String lastName;
private String address;
private String city;
private String state;
private String zip;
private String phone;
private String email;
```

Accessed using getters and setters.

---

## Object Creation

```java
Contact contact = new Contact(
    firstName,
    lastName,
    address,
    city,
    state,
    zip,
    phone,
    email
);
```

---

## Composition

```text
AddressBook
     │
     └── Contact
```

An AddressBook contains multiple Contact objects.

---

## Data Storage

```java
ArrayList<Contact> contacts = new ArrayList<>();
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

Each Use Case was implemented in a separate feature branch and merged into the Address Book project branch after successful testing.

---

# Technologies Used

- Java 21
- IntelliJ IDEA
- Git
- GitHub
- Java Collections Framework
- Object-Oriented Programming

---

# Learning Outcomes

- Understanding OOP Design
- Working with Classes and Objects
- Encapsulation
- Constructor Usage
- ArrayList Operations
- CRUD Operations
- Git Branching Strategy
- Feature-Based Development Workflow
- Console-Based Application Development

---

# Author

**Aryan Pujari**

BridgeLabz Java OOPs Learning Program