# Java Cheat Sheet – COMPLETE LEARNING VERSION 📘 (Java 17+)

This cheat sheet covers **core Java concepts**, syntax, OOP, collections, streams, and modern Java features.  
Suitable for beginners and refreshers (Backend / General Purpose).

---

## Table of Contents

- [Java Cheat Sheet – COMPLETE LEARNING VERSION 📘 (Java 17+)](#java-cheat-sheet--complete-learning-version--java-17)
  - [Table of Contents](#table-of-contents)
  - [1. Basics](#1-basics)
  - [2. Variables \& Data Types](#2-variables--data-types)
  - [3. Operators](#3-operators)
  - [4. Control Structures](#4-control-structures)
  - [5. Methods](#5-methods)
  - [6. Arrays](#6-arrays)
  - [7. Strings](#7-strings)
  - [8. Classes \& Objects](#8-classes--objects)
  - [9. Inheritance \& Polymorphism](#9-inheritance--polymorphism)
  - [10. Interfaces \& Abstract Classes](#10-interfaces--abstract-classes)
  - [11. Enums](#11-enums)
  - [12. Collections Framework](#12-collections-framework)
  - [13. Generics](#13-generics)
  - [14. Exceptions](#14-exceptions)
  - [15. File Handling (NIO)](#15-file-handling-nio)
  - [16. Streams \& Lambdas](#16-streams--lambdas)
  - [17. Date \& Time API](#17-date--time-api)
  - [18. Concurrency Basics](#18-concurrency-basics)
  - [19. Modern Java Features](#19-modern-java-features)
  - [20. Best Practices](#20-best-practices)
  - [End](#end)

---

## 1. Basics

~~~java
// Entry point of every Java program
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World");
    }
}

// Java is compiled, strongly typed and object-oriented
~~~

---

## 2. Variables & Data Types

~~~java
// Primitive types
int age = 30;
double price = 9.99;
boolean active = true;
char grade = 'A';

// Reference types
String name = "Max";

// Type inference (Java 10+)
var count = 5; // inferred as int
~~~

---

## 3. Operators

~~~java
// Arithmetic
5 + 3;
5 - 3;
5 * 3;
5 / 2; // integer division
5 % 2;

// Comparison
1 == 1;
1 != 2;
1 > 0;

// Logical
true && false;
true || false;
!true;

// Ternary
String status = age >= 18 ? "adult" : "minor";
~~~

---

## 4. Control Structures

~~~java
int score = 85;

if (score > 90) {
    System.out.println("A");
} else if (score > 80) {
    System.out.println("B");
} else {
    System.out.println("C");
}

// Switch
String role = "admin";
switch (role) {
    case "admin":
        System.out.println("Admin");
        break;
    default:
        System.out.println("User");
}
~~~

---

## 5. Methods

~~~java
// Method definition
static int add(int a, int b) {
    return a + b;
}

// Default return type: void
static void greet(String name) {
    System.out.println("Hello " + name);
}
~~~

---

## 6. Arrays

~~~java
int[] numbers = {1, 2, 3};

// Access
numbers[0];

// Loop
for (int n : numbers) {
    System.out.println(n);
}

// Copy
int[] copy = numbers.clone();
~~~

---

## 7. Strings

~~~java
String text = "Hello";

// Immutable
String upper = text.toUpperCase();

// Length
text.length();

// Replace
text.replace("H", "J");

// String concatenation
String full = text + " World";
~~~

---

## 8. Classes & Objects

~~~java
class Person {
    String name;

    Person(String name) {
        this.name = name;
    }

    void greet() {
        System.out.println("Hello " + name);
    }
}

Person p = new Person("Max");
p.greet();
~~~

---

## 9. Inheritance & Polymorphism

~~~java
class Student extends Person {
    Student(String name) {
        super(name);
    }

    void study() {
        System.out.println("Studying");
    }
}

Person s = new Student("Anna"); // polymorphism
~~~

---

## 10. Interfaces & Abstract Classes

~~~java
interface Flyable {
    void fly();
}

abstract class Animal {
    abstract void sound();
}

class Bird extends Animal implements Flyable {
    void sound() {
        System.out.println("Chirp");
    }

    public void fly() {
        System.out.println("Flying");
    }
}
~~~

---

## 11. Enums

~~~java
enum Role {
    ADMIN,
    USER,
    GUEST
}

Role role = Role.ADMIN;
~~~

---

## 12. Collections Framework

~~~java
import java.util.*;

List<String> list = new ArrayList<>();
list.add("A");

Set<Integer> set = new HashSet<>();
set.add(1);

Map<String, Integer> map = new HashMap<>();
map.put("age", 30);
~~~

---

## 13. Generics

~~~java
class Box<T> {
    T value;
    Box(T value) {
        this.value = value;
    }
}

Box<String> box = new Box<>("Hello");
~~~

---

## 14. Exceptions

~~~java
try {
    int x = 10 / 0;
} catch (ArithmeticException e) {
    System.out.println(e.getMessage());
} finally {
    System.out.println("Done");
}
~~~

---

## 15. File Handling (NIO)

~~~java
import java.nio.file.*;

Path path = Paths.get("file.txt");
Files.writeString(path, "Hello");
String content = Files.readString(path);
~~~

---

## 16. Streams & Lambdas

~~~java
import java.util.List;

List<Integer> nums = List.of(1, 2, 3, 4);

nums.stream()
    .filter(n -> n > 2)
    .map(n -> n * 2)
    .forEach(System.out::println);
~~~

---

## 17. Date & Time API

~~~java
import java.time.*;

LocalDate today = LocalDate.now();
LocalTime now = LocalTime.now();
LocalDateTime dateTime = LocalDateTime.now();
~~~

---

## 18. Concurrency Basics

~~~java
Thread t = new Thread(() -> {
    System.out.println("Running in thread");
});
t.start();
~~~

---

## 19. Modern Java Features

~~~java
// Switch expression
String result = switch (role) {
    case ADMIN -> "Admin";
    default -> "User";
};

// Records (Java 16+)
record User(String name, int age) {}

User u = new User("Max", 30);
~~~

---

## 20. Best Practices

- Prefer composition over inheritance
- Use interfaces for contracts
- Avoid null (use Optional)
- Keep methods small
- Favor immutability
- Use streams for data processing
- Write readable code

---

## End
