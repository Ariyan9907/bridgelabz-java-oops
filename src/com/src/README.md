# UC12 - Sort Contacts by City, State, and ZIP

## Overview

This Use Case enhances the Address Book Management System by allowing users to sort contacts based on their **City**, **State**, or **ZIP Code**.

The application uses the **Java Stream API** along with the `sorted()` intermediate operation to display contacts in ascending order according to the selected field.

---

# Objective

* Sort contacts by City.
* Sort contacts by State.
* Sort contacts by ZIP Code.
* Display the sorted contacts.
* Learn sorting using Java Streams.

---

# Features Implemented

* Sort contacts alphabetically by City.
* Sort contacts alphabetically by State.
* Sort contacts by ZIP Code.
* Display sorted contacts using Java Streams.
* Perform case-insensitive sorting for City and State.

---

# Implementation Details

## Methods Added

### Sort by City

```java
public void sortByCity()
```

Sorts all contacts alphabetically based on the City.

---

### Sort by State

```java
public void sortByState()
```

Sorts all contacts alphabetically based on the State.

---

### Sort by ZIP

```java
public void sortByZip()
```

Sorts all contacts in ascending order based on the ZIP Code.

---

# Technologies Used

* Java
* Java Stream API
* Collections Framework
* Comparator
* Object-Oriented Programming (OOP)

---

# Learning Outcomes

* Understanding Java Streams.
* Using `stream()` to process collections.
* Using `sorted()` with custom comparators.
* Using lambda expressions for sorting.
* Performing case-insensitive comparisons using `compareToIgnoreCase()`.

---

# Expected Output

## Sort by City

```text
Belagavi
Hubli
Pune
```

---

## Sort by State

```text
Karnataka
Karnataka
Maharashtra
```

---

## Sort by ZIP

```text
411001
580020
590002
```

---

# Time Complexity

| Operation | Time Complexity |
| --------- | --------------- |
| stream()  | O(1)            |
| sorted()  | O(n log n)      |
| forEach() | O(n)            |

Overall Time Complexity: **O(n log n)**

---

# Future Enhancements

* Sort by Last Name.
* Sort by Email Address.
* Sort by Phone Number.
* Allow users to choose the sorting field dynamically.
* Store the sorted result in a new collection if required.

---

# Author

**Aryan Pujari**
