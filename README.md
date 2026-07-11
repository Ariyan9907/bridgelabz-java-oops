# Address Book Management System

## Overview

The **Address Book Management System** is a Core Java project developed as part of the **BridgeLabz Java OOPs Learning Program**. The application demonstrates Object-Oriented Programming concepts and the Java Collections Framework by implementing an address book capable of managing multiple contacts efficiently.

The application allows users to:

* Add a new Contact
* Edit an existing Contact
* Delete a Contact
* Prevent Duplicate Contacts
* Create Multiple Address Books
* Search Contacts by City or State
* View Persons by City or State
* Count Contacts by City or State
* Sort Contacts Alphabetically by Name

The project follows Object-Oriented Programming principles using separate classes for data modeling, business logic, and application execution.

---

# Project Structure

```text
src
│
└── com.src
    │
    ├── AddressBookMain.java
    ├── AddressBook.java
    ├── Contact.java
    └── AddressBookManager.java
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
* Overridden `toString()` method

---

## AddressBook.java

Manages all contact-related operations.

### Data Structures Used

```java
private ArrayList<Contact> contacts = new ArrayList<>();

private HashMap<String, ArrayList<Contact>> cityMap = new HashMap<>();

private HashMap<String, ArrayList<Contact>> stateMap = new HashMap<>();
```

### Responsibilities

* Add Contact
* Edit Contact
* Delete Contact
* Prevent Duplicate Contacts
* Search Contacts by City
* Search Contacts by State
* View Persons by City
* View Persons by State
* Count Contacts by City
* Count Contacts by State
* Sort Contacts Alphabetically

---

## AddressBookManager.java

Manages multiple Address Books.

### Data Structure Used

```java
private HashMap<String, AddressBook> addressBooks = new HashMap<>();
```

### Responsibilities

* Create a new Address Book
* Store multiple Address Books
* Retrieve an Address Book using its name

---

## AddressBookMain.java

Acts as the entry point of the application.

### Responsibilities

* Display user menu
* Accept user input using Scanner
* Create Contact objects
* Invoke AddressBook operations
* Manage multiple Address Books

---

# Use Cases Implemented

## UC1 - Create Contact Class

### Objective

Create a Contact class containing all required contact details.

### Concepts Used

* Class
* Object
* Constructor
* Encapsulation

---

## UC2 - Add Contact

### Objective

Add a new contact to the Address Book.

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

Edit an existing contact using the First Name.

### Method Added

```java
public void editContact(String firstName)
```

### Concepts Used

* Searching
* Enhanced For Loop
* Getters and Setters

---

## UC4 - Delete Contact

### Objective

Delete a contact using the First Name.

### Method Added

```java
public void deleteContact(String firstName)
```

### Concepts Used

* ArrayList
* Index-Based Loop
* Remove Operation

---

## UC5 - Add Multiple Contacts

### Objective

Store multiple contacts inside an Address Book using `ArrayList`.

### Concepts Used

* Dynamic Collections
* CRUD Operations
* Enhanced For Loop

---

## UC6 - Create Multiple Address Books

### Objective

Allow users to create and manage multiple Address Books.

### Data Structure Used

```java
HashMap<String, AddressBook> addressBooks = new HashMap<>();
```

### Concepts Used

* HashMap
* Key-Value Mapping
* Multiple Object Management

---

## UC7 - Prevent Duplicate Contacts

### Objective

Prevent adding duplicate contacts based on First Name and Last Name.

### Method Added

```java
public boolean isDuplicate(String firstName, String lastName)
```

### Concepts Used

* Searching
* Validation
* Case-Insensitive Comparison

---

## UC8 - Search Person by City or State

### Objective

Search contacts based on City or State.

### Methods Added

```java
public void searchByCity(String city)

public void searchByState(String state)
```

### Concepts Used

* Filtering
* Enhanced For Loop
* String Comparison

---

## UC9 - View Persons by City or State

### Objective

Maintain City and State dictionaries using HashMap and display all persons belonging to a particular City or State.

### Data Structures Used

```java
HashMap<String, ArrayList<Contact>> cityMap

HashMap<String, ArrayList<Contact>> stateMap
```

### Methods Added

```java
public void viewPersonsByCity(String city)

public void viewPersonsByState(String state)
```

### Concepts Used

* HashMap
* containsKey()
* put()
* get()
* One-to-Many Mapping

---

## UC10 - Count Contacts by City or State

### Objective

Display the total number of contacts available in a specific City or State.

### Methods Added

```java
public void countByCity(String city)

public void countByState(String state)
```

### Concepts Used

* HashMap Lookup
* ArrayList.size()
* Constant-Time Operations

---

## UC11 - Sort Contacts Alphabetically by Name

### Objective

Sort contacts alphabetically based on their First Name.

### Method Added

```java
public void sortByName()
```

### Concepts Used

* Collections.sort()
* Comparator
* compareToIgnoreCase()

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

# Collections Framework Used

## ArrayList

```java
ArrayList<Contact> contacts = new ArrayList<>();
```

Used to store multiple contacts dynamically.

---

## HashMap

```java
HashMap<String, AddressBook> addressBooks = new HashMap<>();
```

Used to manage multiple Address Books.

```java
HashMap<String, ArrayList<Contact>> cityMap = new HashMap<>();

HashMap<String, ArrayList<Contact>> stateMap = new HashMap<>();
```

Used to organize contacts based on City and State.

---

# Git Workflow Followed

## Repository

```text
bridgelabz-java-oops
```

## Base Branch

```text
address-book-management
```

## Feature Branches

```text
feature/uc1-create-contact
feature/uc2-add-contact
feature/uc3-edit-contact
feature/uc4-delete-contact
feature/uc5-add-multiple-contacts
feature/uc6-create-address-book
feature/uc7-prevent-duplicate-contacts
feature/uc8-search-person-by-city-or-state
feature/uc9-view-persons-by-city-or-state
feature/uc10-count-contacts-by-city-and-state
feature/uc11-sort-contacts-by-name
```

## Merge Flow

```text
main
│
└── address-book-management
      │
      ├── feature/uc1-create-contact
      ├── feature/uc2-add-contact
      ├── feature/uc3-edit-contact
      ├── feature/uc4-delete-contact
      ├── feature/uc5-add-multiple-contacts
      ├── feature/uc6-create-address-book
      ├── feature/uc7-prevent-duplicate-contacts
      ├── feature/uc8-search-person-by-city-or-state
      ├── feature/uc9-view-persons-by-city-or-state
      ├── feature/uc10-count-contacts-by-city-and-state
      └── feature/uc11-sort-contacts-by-name
```

Each Use Case was implemented in a separate feature branch, manually tested, and merged into the `address-book-management` branch after successful verification.

---

# Technologies Used

* Java 21
* IntelliJ IDEA
* Git
* GitHub
* Java Collections Framework
* Object-Oriented Programming (OOP)

---

# Learning Outcomes

* Object-Oriented Programming
* Classes and Objects
* Encapsulation
* Constructors
* CRUD Operations
* ArrayList Operations
* HashMap Operations
* Searching and Filtering
* Sorting Collections
* Duplicate Validation
* Managing Multiple Address Books
* Feature-Based Git Workflow

---

# Author

**Aryan Pujari**

BridgeLabz Java OOPs Learning Program
