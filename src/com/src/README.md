# UC9 - View Persons by City or State

## Overview

This Use Case enhances the Address Book Management System by organizing contacts based on their **City** and **State** using `HashMap`.

Each city and state maintains a list of contacts, making it easy to view all persons belonging to a particular location.

---

## Objective

* Store contacts according to their city.
* Store contacts according to their state.
* View all persons belonging to a specific city.
* View all persons belonging to a specific state.

---

## Features Implemented

* Created a City Dictionary using `HashMap<String, ArrayList<Contact>>`.
* Created a State Dictionary using `HashMap<String, ArrayList<Contact>>`.
* Automatically stores every new contact in both maps.
* View all contacts by city.
* View all contacts by state.

---

## Implementation Details

### Data Structures Used

```java
HashMap<String, ArrayList<Contact>> cityMap;

HashMap<String, ArrayList<Contact>> stateMap;
```

### Logic

* When a new contact is added:

    * Add the contact to the `contacts` list.
    * Check whether the city already exists in `cityMap`.
    * If not, create a new `ArrayList`.
    * Add the contact to that city's list.
    * Repeat the same process for `stateMap`.

---

## Technologies Used

* Java
* HashMap
* ArrayList
* Collections Framework
* Object-Oriented Programming (OOP)

---

## Learning Outcomes

* Working with `HashMap`
* Mapping one key to multiple values
* Using `containsKey()`, `put()`, and `get()`
* Organizing data efficiently
* Improving data retrieval

---

## Expected Output

### View Persons by City

```text
Persons in Belagavi

Aryan Pujari
Rahul Patil
```

### View Persons by State

```text
Persons in Karnataka

Aryan Pujari
Rahul Patil
```

### No Contacts Found

```text
No contacts found in city: Goa
```

---

## Time Complexity

* Adding a contact to City Map: **O(1)** (Average)
* Adding a contact to State Map: **O(1)** (Average)
* Viewing persons by city: **O(n)** (where *n* is the number of contacts in that city)
* Viewing persons by state: **O(n)** (where *n* is the number of contacts in that state)

---

## Future Enhancements

* Count persons by city and state.
* Sort contacts alphabetically.
* Store contacts in multiple address books.
* Implement searching using Java Streams.

---

## Author

**Aryan Pujari**
