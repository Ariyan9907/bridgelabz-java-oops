# UC7 - Prevent Duplicate Contacts

## Overview

This Use Case enhances the Address Book Management System by preventing duplicate contacts from being added to an address book.

A contact is considered a duplicate if another contact already exists with the same **First Name** and **Last Name** (case-insensitive).

---

## Objective

* Prevent duplicate entries in the address book.
* Improve data consistency.
* Demonstrate searching within an `ArrayList` before inserting data.

---

## Features Implemented

* Add a new contact.
* Check for duplicate contacts before insertion.
* Compare first name and last name using `equalsIgnoreCase()`.
* Display an appropriate message when a duplicate contact is detected.
* Add the contact only if it is unique.

---

## Implementation Details

### Method Added

```java
public boolean isDuplicate(String firstName, String lastName)
```

This method iterates through the contact list and checks whether a contact with the same first and last name already exists.

### Updated Method

```java
public void addContact(Contact contact)
```

Before adding the contact, the method calls `isDuplicate()`.

* If a duplicate is found:

    * Displays **"Contact already exists."**
    * Does not add the contact.
* Otherwise:

    * Adds the contact successfully.

---

## Technologies Used

* Java
* ArrayList
* Object-Oriented Programming (OOP)
* Collections Framework

---

## Learning Outcomes

* Searching elements in an `ArrayList`
* Encapsulation
* Object comparison
* Preventing duplicate records
* Using helper methods to improve code readability

---

## Expected Output

### Valid Contact

```
Contact added successfully.
```

### Duplicate Contact

```
Contact already exists.
```

---

## Future Enhancements

* Prevent duplicate phone numbers.
* Prevent duplicate email addresses.
* Store contacts using a `HashMap` for faster lookups.
* Search contacts by multiple fields.

---

## Author

**Aryan Pujari**
