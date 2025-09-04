
# 🔹 Java Inner Class Example

This Java project demonstrates the use of **inner classes** and **static inner classes**.  
It shows how inner classes can access outer class members and the special behavior of static inner classes.

---

## 📝 Classes Overview

### 1. `A` (Outer Class)
- Attributes: `x` (integer), `m` (array of 10 integers)
- Method: `method()` prints a message.

### 2. `A.B` (Non-static Inner Class)
- Can access **outer class attributes and methods**.
- Method: `method_1()` increments `x` and prints it.

### 3. `A.C` (Static Inner Class)
- Cannot access outer class instance variables directly.
- Method: `method_2()` prints a message.
- Can be instantiated **without an outer class instance** using `A.C c = new A.C();`.

### 4. `TestInner` (Driver Class)
- Demonstrates creating objects of outer, non-static inner, and static inner classes.

---

## 🚀 How to Run

1. Compile the program:
```bash
javac TestInner.java
````

2. Run the program:

```bash
java TestInner
```

3. Output will demonstrate the usage of inner and static inner classes.

---

## ⚡ Example Output

```
method of class A
1
method of inner class B
method of inner class C
```

---

## 🛠 Concepts Demonstrated

* **Non-static inner class**
* **Static inner class**
* **Accessing outer class members from inner class**
* **Object creation syntax for inner classes**

---

## 📜 License

This project is licensed under the **MIT License**.
You are free to use, modify, and distribute this code.

---

