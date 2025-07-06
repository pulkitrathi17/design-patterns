## Design Patterns Quick Reference Guide with Confusing Pattern Differentiation

**Youtube playlist:** https://www.youtube.com/watch?v=mE3qTp1TEbg&list=PLlsmxlJgn1HJpa28yHzkBmUY-Ty71ZUGc&index=1

**ChatGPT chat:** https://chatgpt.com/share/686ac084-cbc4-8003-9e4f-e785d1886284

---

# 📚 What Are Design Patterns?

Design patterns are reusable solutions to common problems in software design. They improve **readability, scalability, and maintainability**.

Many patterns overlap in purpose, leading to confusion. This guide clarifies **when to use which pattern systematically**.

---

# 📊 23 GoF Design Patterns At a Glance

**Creational:** Singleton, Factory Method, Abstract Factory, Builder, Prototype
**Structural:** Adapter, Bridge, Composite, Decorator, Facade, Flyweight, Proxy
**Behavioral:** Chain of Responsibility, Command, Interpreter, Iterator, Mediator, Memento, Observer, State, Strategy, Template Method, Visitor

---

# 💡 When to Use Which Pattern

| **Scenario**                                    | **Design Pattern**      |
| ----------------------------------------------- | ----------------------- |
| Runtime algorithm selection                     | Strategy                |
| Behavior changes by state                       | State                   |
| Add responsibilities dynamically                | Decorator               |
| Control access transparently                    | Proxy                   |
| Interface incompatibility                       | Adapter                 |
| Simplify subsystem                              | Facade                  |
| Single instance globally                        | Singleton               |
| Tree structures                                 | Composite               |
| Encapsulate request and undo/redo               | Command                 |
| Pass request across handlers                    | Chain of Responsibility |
| Notify dependents on state change               | Observer                |
| Centralize complex communication                | Mediator                |
| Step-by-step complex object creation            | Builder                 |
| Clone objects efficiently                       | Prototype               |
| Subclass decides instantiation                  | Factory Method          |
| Families of related objects                     | Abstract Factory        |
| Parsing DSL/expressions                         | Interpreter             |
| Operate on structure without modifying          | Visitor                 |
| Skeleton with variable steps                    | Template Method         |
| Sequential traversal without exposing structure | Iterator                |
| Capture and restore object state                | Memento                 |
| Optimize memory using shared data               | Flyweight               |

---

# 📅 Cheat Tables for Similar Patterns

## Strategy vs State vs Template Method vs Visitor

| Aspect  | Strategy                    | State                      | Template Method                         | Visitor                                  |
| ------- | --------------------------- | -------------------------- | --------------------------------------- | ---------------------------------------- |
| Purpose | Select algorithm at runtime | Change behavior with state | Define skeleton with customizable steps | Separate algorithm from object structure |
| Varies  | Algorithm                   | Behavior by state          | Steps of algorithm                      | Operations on structure                  |
| Example | Sorting strategies          | TCP connection states      | File parsing                            | AST traversal                            |

**Summary:**

* **Strategy:** Choose algorithm dynamically.
* **State:** Object behavior changes due to internal state.
* **Template:** Fixed algorithm, variable steps.
* **Visitor:** Add operations without modifying structure.

---

## Decorator vs Proxy vs Adapter vs Facade

| Aspect    | Decorator                        | Proxy                         | Adapter                 | Facade                           |
| --------- | -------------------------------- | ----------------------------- | ----------------------- | -------------------------------- |
| Purpose   | Add responsibilities dynamically | Control access                | Convert interface       | Simplify complex subsystem       |
| Structure | Wraps object                     | Controls access, lazy loading | Converts interface      | Unified interface over subsystem |
| Example   | BufferedInputStream              | Virtual Proxy                 | Enumeration to Iterator | Kafka Client APIs                |

**Summary:**

* **Decorator:** Add behavior dynamically.
* **Proxy:** Control or delay object access.
* **Adapter:** Interface compatibility.
* **Facade:** Simplify subsystem usage.

---

## Factory Method vs Abstract Factory vs Builder vs Prototype vs Singleton

| Aspect  | Factory Method                  | Abstract Factory            | Builder                   | Prototype              | Singleton           |
| ------- | ------------------------------- | --------------------------- | ------------------------- | ---------------------- | ------------------- |
| Purpose | Subclasses decide instantiation | Families of related objects | Step-by-step construction | Clone existing objects | One global instance |
| Example | ShapeFactory                    | WidgetFactory               | DocumentBuilder           | Cloning shapes         | DB Connection Pool  |

---

## Command vs Chain of Responsibility

| Aspect  | Command                            | Chain of Responsibility       |
| ------- | ---------------------------------- | ----------------------------- |
| Purpose | Encapsulate requests, support undo | Pass request through handlers |
| Example | UI button actions                  | Event bubbling, middleware    |

---

## Observer vs Mediator

| Aspect  | Observer                    | Mediator                 |
| ------- | --------------------------- | ------------------------ |
| Purpose | Notify dependents on change | Centralize communication |
| Example | Event listeners             | Chatroom mediator        |

---

## Composite vs Interpreter

| Aspect  | Composite                          | Interpreter              |
| ------- | ---------------------------------- | ------------------------ |
| Purpose | Tree structures, uniform treatment | Parsing expressions, DSL |
| Example | Folder-file hierarchy              | Expression evaluation    |

---

# 🌐 Real-World Triggers

* Kafka/Zookeeper clients: **Facade, Proxy**
* Microservice orchestration: **Mediator, Chain of Responsibility**
* Pricing engines: **Strategy**
* Undo in editors: **Memento, Command**
* DSL parsing: **Interpreter**
* Runtime feature toggles: **Decorator**
* Spring AOP: **Proxy, Decorator**
* Java Collections: **Iterator, Composite**
* DB Connection Pool: **Singleton**

---

# 🎯 Interview Recommendations

* Clearly state **intent** before picking a pattern.
* Prioritize **simplicity and readability**.
* Use UML diagrams for clarity.
* Practice mapping patterns to real-world Java and system design examples.

---