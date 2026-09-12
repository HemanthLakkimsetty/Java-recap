# Student Processing & Management System — Milestone Project

## 1. Project Overview

Build a **Student Processing & Management System** using Java 8 Functional Interfaces.

The goal of this project is to combine everything learned so far:

* Lambda Expressions
* Functional Interfaces
* Predicate
* Function
* Consumer
* Supplier
* Method References
* Generics
* Collections (`List`)
* User Input
* Object Creation
* Generic Processing
* Basic class separation

### Important Restriction

Do **not** use Java Streams.

This project is specifically designed to make you comfortable with Functional Interfaces **before moving into Streams**.

---

# 2. Student Model

Create a `Student` class.

Each student should contain:

```text
id
name
marks
```

Example:

```text
Student(1, "Ravi", 85)
Student(2, "Sita", 72)
Student(3, "Kiran", 91)
```

The class should provide:

* Constructor
* Getters
* `toString()`
* A method to calculate/return the student's grade

Example grading logic:

```text
90 - 100 → A
80 - 89  → B
70 - 79  → C
60 - 69  → D
Below 60 → F
```

---

# 3. Student List

Create:

```java
List<Student>
```

Initially add at least **10 students**.

Make the data varied.

Example:

```text
Ravi   - 85
Sita   - 72
Kiran  - 91
Arjun  - 65
Priya  - 88
Anil   - 55
Rahul  - 94
Sneha  - 76
Aman   - 82
Kumar  - 48
```

Do not simply use the same marks for every student.

---

# 4. Main Generic Processing Method

Create a generic method:

```java
static <T, R> void process(
        List<T> list,
        Predicate<T> condition,
        Function<T, R> transformer,
        Consumer<R> action
)
```

This method is the **heart of the project**.

Its job is:

```text
List
 ↓
Predicate
 ↓
Function
 ↓
Consumer
```

Conceptually:

```text
Student
   ↓
Should this student be selected?
   ↓
Transform the student
   ↓
Do something with the result
```

---

# 5. Important Rule for process()

The `process()` method must remain **generic**.

It must NOT contain:

```java
if (student.getMarks() >= 80)
```

It must NOT contain:

```java
if (student.getName().startsWith("A"))
```

It must NOT know anything specifically about `Student`.

The method should work with any type.

For example:

```text
Student
Integer
String
Employee
Product
```

---

# 6. Processing Requirement 1

Process students whose marks are **greater than or equal to 80**.

Flow:

```text
Student
 ↓
marks >= 80
 ↓
Student → name
 ↓
print name
```

Expected concept:

```java
Predicate<Student>
Function<Student, String>
Consumer<String>
```

Example output:

```text
Ravi
Kiran
Priya
Rahul
Aman
```

---

# 7. Processing Requirement 2

Process students whose marks are **less than 70**.

Flow:

```text
Student
 ↓
marks < 70
 ↓
Student → name
 ↓
print name
```

Expected output:

```text
Arjun
Anil
Kumar
```

The same generic `process()` method must be reused.

Do not create another processing method.

---

# 8. Processing Requirement 3

Process students whose marks are **greater than or equal to 90**.

Flow:

```text
Student
 ↓
marks >= 90
 ↓
Student → marks
 ↓
print marks
```

Example output:

```text
91
94
```

Notice that the Function now returns:

```text
Integer
```

instead of:

```text
String
```

This demonstrates why the generic type `R` exists.

---

# 9. Processing Requirement 4

Process students whose names start with `"A"`.

Flow:

```text
Student
 ↓
name starts with A
 ↓
Student → marks
 ↓
print marks
```

Example:

```text
Arjun → 65
Anil  → 55
Aman  → 82
```

Again, use the same generic `process()` method.

---

# 10. Processing Requirement 5 — Grade

Process students whose marks are **greater than or equal to 80**.

Flow:

```text
Student
 ↓
marks >= 80
 ↓
Student → Grade
 ↓
print Grade
```

Example:

```text
Ravi → B
Kiran → A
Priya → B
Rahul → A
Aman → B
```

The Function should transform:

```text
Student → String
```

---

# 11. Supplier Requirement

Create a `Supplier<Student>`.

The Supplier should generate a new Student object.

Example concept:

```text
Supplier
   ↓
new Student
```

Every time:

```java
supplier.get()
```

is called, a Student should be returned.

Important:

`Supplier` does **not** accept arguments.

Its main form is:

```java
Supplier<T>
```

with:

```java
get()
```

---

# 12. Add New Students Using User Input

The program should allow the user to enter new students.

Take:

```text
ID
Name
Marks
```

Example:

```text
Enter ID: 11
Enter Name: Vijay
Enter Marks: 87
```

Create the Student and add it to:

```java
List<Student>
```

The list should therefore grow dynamically.

---

# 13. Infinite Input / Menu System

Create a menu that keeps running until the user chooses Exit.

Example:

```text
========== STUDENT MANAGEMENT SYSTEM ==========

1. Add Student
2. Display Students
3. Students with Marks >= 80
4. Students with Marks < 70
5. Students with Marks >= 90
6. Students whose Name Starts with A
7. Display Grades of Students >= 80
8. Generate Student using Supplier
9. Process Numbers
10. Method Reference Demo
0. Exit
```

The menu should run continuously.

Concept:

```text
while program is running
        show menu
        take choice
        perform operation
```

---

# 14. Method References

Use method references wherever they are appropriate.

You should practice all important forms.

## Static Method Reference

Example:

```text
ClassName::staticMethod
```

Equivalent lambda:

```text
x -> ClassName.staticMethod(x)
```

---

## Instance Method Reference

Example:

```text
object::method
```

Equivalent lambda:

```text
x -> object.method(x)
```

---

## Existing Java Method Reference

Practice with methods such as:

```text
String::toUpperCase
String::length
Math::abs
System.out::println
```

Understand which functional interface each method reference can fit into.

---

# 15. Generic Integer Processing

Your `process()` method must not work only with Students.

Use it with:

```java
List<Integer>
```

Example:

```text
10
25
40
55
70
85
100
```

Create a rule:

```text
number > 50
```

Then transform:

```text
number → number * number
```

Then print the result.

Flow:

```text
Integer
   ↓
number > 50
   ↓
number²
   ↓
print
```

Expected concept:

```text
55 → 3025
70 → 4900
85 → 7225
100 → 10000
```

---

# 16. Class Separation

Do not put the entire project into one class.

Recommended structure:

```text
StudentProcessingSystem/
│
├── Student.java
├── Printer.java
├── StudentFactory.java
├── StudentProcessor.java
├── StudentRules.java
└── Main.java
```

---

# 17. Suggested Responsibilities

## Student.java

Responsible for:

```text
Student data
Constructor
Getters
Grade calculation
toString()
```

---

## Printer.java

Responsible for printing.

Example:

```text
print(String)
print(Integer)
```

Practice instance method references with this class.

---

## StudentFactory.java

Responsible for creating Students.

Example:

```text
createStudent()
getSupplier()
```

Practice:

```text
StudentFactory::createStudent
```

---

## StudentProcessor.java

Contains the generic:

```text
process()
```

method.

This class should not know Student-specific business rules.

---

## StudentRules.java

Contains reusable:

```text
Predicate<Student>
Function<Student, ?>
Consumer<?>
```

rules.

Examples:

```text
marksAbove80
marksBelow70
marksAbove90
nameStartsWithA
getName
getMarks
getGrade
```

---

## Main.java

Responsible for:

```text
Scanner
Student List
Menu
Calling processing operations
Adding students
Calling Supplier
```

---

# 18. Core Architecture

The important architecture is:

```text
                 STUDENT LIST
                      │
                      ▼
                ┌───────────┐
                │ Predicate │
                └─────┬─────┘
                      │
                 selected data
                      │
                      ▼
                ┌───────────┐
                │  Function │
                └─────┬─────┘
                      │
                 transformed data
                      │
                      ▼
                ┌───────────┐
                │  Consumer │
                └─────┬─────┘
                      │
                      ▼
                    OUTPUT
```

---

# 19. Final Challenge

After completing all requirements, add a **new processing rule**.

For example:

```text
marks >= 95
        ↓
Student → Name
        ↓
Print
```

You must add this rule **without modifying the generic `process()` method**.

This proves that your architecture is properly designed.

---

# 20. Restrictions

Do NOT use:

```text
Stream
filter()
map()
forEach() from Stream API
collect()
Collectors
```

Do not use Streams anywhere in this milestone.

Also:

* No Student-specific logic inside `process()`
* No separate processing method for every condition
* Do not duplicate processing logic
* Use Functional Interfaces
* Use Generics
* Use method references where appropriate

---

# 21. Success Criteria

You have completed the milestone when you can confidently explain:

```text
Predicate
    ↓
"Should I select this?"

Function
    ↓
"What should I transform it into?"

Consumer
    ↓
"What should I do with the result?"

Supplier
    ↓
"What should I create/provide?"
```

And you can explain the complete pipeline:

```text
List<Student>
      ↓
Predicate<Student>
      ↓
Function<Student, R>
      ↓
Consumer<R>
```

You should also be able to explain why:

```java
<T, R>
```

is required instead of simply using:

```java
List<?>
```

---

# 22. Final Mental Model

Think of the project as a reusable processing engine.

```text
DATA
 ↓
Predicate
 ↓
SELECT
 ↓
Function
 ↓
TRANSFORM
 ↓
Consumer
 ↓
ACTION
```

The processing engine should not care whether the data is:

```text
Student
Integer
String
Employee
Product
```

Only the rules change.

That is the main purpose of this milestone.
