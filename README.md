# Stock Account Management

## Overview

The Stock Account Management application is a Core Java OOPs project that manages stock information and generates a stock portfolio report.

The application allows users to:

* Add multiple stocks
* Store stock details (Name, Number of Shares, Share Price)
* Calculate the value of each stock
* Calculate the total portfolio value
* Generate a stock report

---

## Problem Statement

Create a program to read stock details such as:

* Stock Name
* Number of Shares
* Share Price

Calculate:

* Value of each stock
* Total value of all stocks in the portfolio

Display a complete stock report.

---

## Project Structure

```text
src
└── com.stockmanagement
    ├── Stock.java
    ├── StockPortfolio.java
    └── StockAccountManagement.java
```

---

## File Responsibilities

### 1. Stock.java

Represents a single stock.

#### Responsibilities

* Stores stock information
* Holds stock name
* Holds number of shares
* Holds share price
* Calculates the value of a stock

#### Example

```text
Stock Name      : TCS
Shares          : 100
Share Price     : 3500
Stock Value     : 350000
```

---

### 2. StockPortfolio.java

Represents a collection of stocks.

#### Responsibilities

* Stores multiple Stock objects
* Adds stocks to the portfolio
* Calculates total portfolio value
* Generates the stock report

#### Example

```text
Portfolio
 ├── TCS
 ├── Infosys
 └── Wipro
```

---

### 3. StockAccountManagement.java

Main driver class of the application.

#### Responsibilities

* Accepts user input
* Creates Stock objects
* Adds stocks to the portfolio
* Invokes report generation
* Displays output to the user

---

## OOP Concepts Used

### Class

* Stock
* StockPortfolio

### Object

Each stock entered by the user is created as an object.

Example:

```text
Stock stock1 = TCS
Stock stock2 = Infosys
Stock stock3 = Wipro
```

### Encapsulation

Stock data is stored inside the Stock class and accessed through methods.

### Aggregation

A StockPortfolio contains multiple Stock objects.

```text
StockPortfolio
    |
    ├── Stock
    ├── Stock
    └── Stock
```

### Collection Framework

ArrayList is used to store multiple stocks dynamically.

---

## Application Flow

```text
Start
   |
   v
Enter Number Of Stocks
   |
   v
Read Stock Details
   |
   v
Create Stock Object
   |
   v
Add Stock To Portfolio
   |
   v
Repeat For All Stocks
   |
   v
Calculate Individual Stock Values
   |
   v
Calculate Total Portfolio Value
   |
   v
Display Stock Report
   |
   v
End
```

---

## Sample Input

```text
Enter Number Of Stocks : 3

Stock Name : TCS
Shares : 100
Share Price : 3500

Stock Name : Infosys
Shares : 50
Share Price : 1500

Stock Name : Wipro
Shares : 80
Share Price : 500
```

---

## Sample Output

```text
========== STOCK REPORT ==========

Stock Name      : TCS
Shares          : 100
Share Price     : 3500
Stock Value     : 350000

Stock Name      : Infosys
Shares          : 50
Share Price     : 1500
Stock Value     : 75000

Stock Name      : Wipro
Shares          : 80
Share Price     : 500
Stock Value     : 40000

Total Portfolio Value : 465000
```

---

## Learning Outcomes

Through this project, the following concepts are practiced:

* Java Classes and Objects
* Constructors
* Encapsulation
* Aggregation
* ArrayList Collection
* Method Creation
* Object-Oriented Design
* Real-world Data Modeling
* Portfolio Value Calculation

---

## Author

Developed as part of the BridgeLabz Java OOPs Learning Program.
