# UC11 - Sort Contacts Alphabetically by Name

## Overview

This Use Case enhances the Address Book Management System by allowing users to sort contacts alphabetically based on their **First Name**.

The application uses Java's `Collections.sort()` method along with a `Comparator` to arrange contacts in ascending alphabetical order.

---

## Objective

* Sort contacts alphabetically by first name.
* Display contacts in ascending order.
* Improve readability and organization of the address book.

---

## Features Implemented

* Sort contacts using `Collections.sort()`.
* Compare contacts using `Comparator`.
* Perform case-insensitive sorting using `compareToIgnoreCase()`.
* Display the sorted contact list.

---

## Implementation Details

### Method Added

```java
public void sortByName()
```

This method sorts the `ArrayList<Contact>` alphabetically by the contact's first name and updates the existing list.

---

## Technologies Used

* Java
* ArrayList
* Collections Framework
* Comparator
* Object-Oriented Programming (OOP)

---

## Learning Outcomes

* Using `Collections.sort()`
* Implementing a `Comparator`
* Sorting objects in an `ArrayList`
* Performing case-insensitive string comparison
* Organizing data efficiently

---

## Expected Output

### Before Sorting

```text
Rahul Patil
Aryan Pujari
Amit Sharma
```

### After Sorting

```text
Amit Sharma
Aryan Pujari
Rahul Patil
```

---

## Time Complexity

* **Time Complexity:** O(n log n)
* **Space Complexity:** O(n)

---

## Future Enhancements

* Sort contacts by last name.
* Sort contacts by city.
* Sort contacts by state.
* Sort contacts by ZIP code.

---

## Author

**Aryan Pujari**
