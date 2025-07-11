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

# 💡 Cheat Sheet

| **Design Pattern**          | **When to Use**                                      | **How to Implement**                                                                                               | **Example Use Case**                     |
| --------------------------- | ---------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------ | ---------------------------------------- |
| **Strategy**                | Need to select algorithm at runtime                  | - Create an interface for the algorithm<br>- Implement concrete strategies<br>- Inject strategy at runtime         | Sorting with different strategies        |
| **State**                   | Object behavior changes with state dynamically       | - Encapsulate states in classes<br>- Context holds current state<br>- Delegate behavior to current state           | TCP connection states                    |
| **Decorator**               | Dynamically add responsibilities without subclassing | - Create a wrapper implementing the same interface<br>- Add behavior before/after delegating to the wrapped object | Adding compression/encryption to streams |
| **Proxy**                   | Control, enhance, or protect access transparently    | - Create a proxy implementing the same interface<br>- Delegate calls with additional control logic                 | Virtual proxy for image loading          |
| **Adapter**                 | Work with incompatible interfaces                    | - Create a wrapper converting Interface A to Interface B<br>- Translate requests in the wrapper                    | Adapting legacy payment gateway          |
| **Facade**                  | Simplify complex subsystem usage                     | - Create a class exposing a simplified interface<br>- Internally call methods on multiple subsystems               | Simplified API for multimedia            |
| **Singleton**               | Single global instance with controlled access        | - Private constructor<br>- Static instance field<br>- Public static getInstance()                                  | Logger, configuration manager            |
| **Composite**               | Represent part-whole hierarchies uniformly           | - Create a component interface<br>- Leaves and composites implement it<br>- Composite holds and manages children   | File directory structure                 |
| **Command**                 | Encapsulate request, enable undo/redo                | - Create Command interface with execute/undo<br>- Encapsulate actions in command objects                           | Text editor undo stack                   |
| **Chain of Responsibility** | Pass request across multiple handlers                | - Handlers implement a handler interface<br>- Each handler has a setNext()<br>- Handle or pass to the next         | Logging, middleware pipelines            |
| **Observer**                | Notify dependents when state changes                 | - Subject maintains observer list<br>- Notifies observers on state change                                          | GUI event listeners, pub-sub             |
| **Mediator**                | Centralize complex object communication              | - Create mediator to manage communication<br>- Colleagues communicate via mediator                                 | Chatroom message routing                 |
| **Builder**                 | Build complex objects step-by-step                   | - Builder class with step methods<br>- Return final object with build()                                            | Building complex documents               |
| **Prototype**               | Clone objects efficiently                            | - Implement clone() method<br>- Add copy constructor to copy fields                                                | Cloning objects in a drawing app         |
| **Factory Method**          | Let subclasses decide instantiation                  | - Create interface with factory method<br>- Subclasses implement instantiation logic                               | Document creation in editors             |
| **Abstract Factory**        | Create families of related objects                   | - Define an interface for creating related objects<br>- Implement factories for each family                        | GUI toolkit with themes                  |
| **Interpreter**             | Parse and evaluate custom expressions                | - Define grammar classes for expressions<br>- Implement interpret() recursively                                    | Evaluating arithmetic expressions        |
| **Visitor**                 | Operate on object structure without modifying        | - Create visitor interface with visit() methods<br>- Elements implement accept(visitor)                            | File system operations                   |
| **Template Method**         | Define algorithm skeleton with variable steps        | - Abstract class defines algorithm skeleton<br>- Subclasses override specific steps                                | Sorting frameworks with hooks            |
| **Iterator**                | Traverse collections transparently                   | - Create iterator with hasNext() and next()<br>- Return iterator from collection                                   | Traversing collections                   |
| **Memento**                 | Capture and restore object state                     | - Memento holds internal state<br>- Originator saves/restores state using memento                                  | Game save/load, undo functionality       |
| **Flyweight**               | Optimize memory using shared data                    | - Separate intrinsic (shared) and extrinsic state<br>- Reuse shared instances                                      | Text editor glyph sharing                |

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

## Mediator vs Observer

|                   | **Mediator Pattern**                                                                                        | **Observer Pattern**                                                                                        |
| ----------------- |-------------------------------------------------------------------------------------------------------------| ----------------------------------------------------------------------------------------------------------- |
| **Intent**        | Centralizes complex communication and control logic between multiple objects **(many-to-many centralized)** | Defines a **one-to-many dependency** so that when one object changes state, all its dependents are notified |
| **Communication** | Objects communicate **via a mediator** rather than directly                                                 | Observers register with a **subject** and get **notified** on changes                                       |
| **Decoupling**    | Decouples objects by having them communicate through the mediator                                           | Decouples subject and observers, but observers are still dependent on the subject's notifications           |
| **Flow**          | Typically **two-way communication** via mediator                                                            | Typically **one-way push notifications** from subject to observers                                          |


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