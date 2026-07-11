# UC10 - Count Contacts by City and State

## Overview

This Use Case extends the Address Book Management System by counting the number of contacts available in a specific **City** or **State**.

Instead of displaying all contacts, the application displays the total number of contacts associated with the given city or state.

---

## Objective

* Count contacts by city.
* Count contacts by state.
* Display the total number of contacts.
* Handle cases where no contacts exist for the given city or state.

---

## Features Implemented

* Count contacts stored in the City Dictionary.
* Count contacts stored in the State Dictionary.
* Display the total number of contacts using `ArrayList.size()`.
* Display an appropriate message when no contacts are found.

---

## Implementation Details

### Methods Added

```java
public void countByCity(String city)
```

Counts the number of contacts available in the specified city.

```java
public void countByState(String state)
```

Counts the number of contacts available in the specified state.

---

## Technologies Used

* Java
* HashMap
* ArrayList
* Collections Framework
* Object-Oriented Programming (OOP)

---

## Learning Outcomes

* Using `HashMap` to organize data.
* Retrieving values using `get()`.
* Checking keys using `containsKey()`.
* Counting elements using `ArrayList.size()`.
* Understanding constant-time lookup operations.

---

## Expected Output

### Count by City

```text
Number of contacts in Belagavi : 2

Number of contacts in Pune : 1
```

### Count by State

```text
Number of contacts in Karnataka : 2

Number of contacts in Maharashtra : 1
```

### Invalid Input

```text
No contacts found in city: Goa
```

---

## Time Complexity

| Operation     | Time Complexity |
| ------------- | --------------- |
| containsKey() | O(1)            |
| get()         | O(1)            |
| size()        | O(1)            |

Overall Time Complexity: **O(1)**

---

## Future Enhancements

* Display counts for all cities.
* Display counts for all states.
* Sort cities and states alphabetically.
* Generate summary reports for the address book.

---

## Author

**Aryan Pujari**
