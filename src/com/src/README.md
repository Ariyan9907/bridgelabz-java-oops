# UC8 - Search Person by City or State

## Overview

This Use Case extends the Address Book Management System by allowing users to search for contacts based on their **City** or **State**.

The application traverses the contact list and displays all matching contacts. If no matching records are found, an appropriate message is displayed.

---

## Objective

* Search contacts by city.
* Search contacts by state.
* Display all matching contacts.
* Handle cases where no matching contacts exist.

---

## Features Implemented

* Search contacts using city name.
* Search contacts using state name.
* Case-insensitive search using `equalsIgnoreCase()`.
* Display all matching contacts.
* Display a message when no contacts are found.

---

## Implementation Details

### Method Added

```java
public void searchByCity(String city)
```

Searches the contact list and displays every contact whose city matches the given city name.

### Method Added

```java
public void searchByState(String state)
```

Searches the contact list and displays every contact whose state matches the given state name.

---

## Technologies Used

* Java
* ArrayList
* Object-Oriented Programming (OOP)
* Collections Framework

---

## Learning Outcomes

* Traversing collections using enhanced for-loops.
* Filtering objects based on conditions.
* Performing case-insensitive string comparisons.
* Building reusable search methods.

---

## Expected Output

### Search by City

```text
Search By City

Aryan Pujari
Rahul Patil
```

### Search by State

```text
Search By State

Amit Sharma
```

### No Matching Contact

```text
No contact found in city: Delhi
```

---

## Time Complexity

* **Search by City:** O(n)
* **Search by State:** O(n)

---

## Future Enhancements

* Search using partial names.
* Search using phone number or email.
* Maintain separate city and state dictionaries using `HashMap` for faster lookups.
* Implement search using Java Streams.

---

## Author

**Aryan Pujari**
