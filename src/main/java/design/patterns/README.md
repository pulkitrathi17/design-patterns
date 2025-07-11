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

| **Scenario (When to Use)**                                             | **Design Pattern**      | **Explanation**                                            | **Example Use Case**                                     |
| ---------------------------------------------------------------------- | ----------------------- | ---------------------------------------------------------- | -------------------------------------------------------- |
| Need to select algorithm at runtime                                    | Strategy                | Encapsulate interchangeable algorithms or behaviors        | Sorting with different strategies (quick, merge, heap)   |
| Object needs to change behavior based on internal state dynamically    | State                   | Encapsulate state-specific behavior, avoiding conditionals | TCP connection state (Open, Closed, Listening)           |
| Add functionalities to objects dynamically without subclassing         | Decorator               | Wrap objects to extend behavior flexibly                   | Adding compression/encryption to data streams            |
| Control, enhance, or protect access to another object transparently    | Proxy                   | Surrogate controlling access, caching, or remoting         | Virtual proxy for image loading, API rate-limiting proxy |
| Need to work with incompatible interfaces                              | Adapter                 | Convert one interface to another                           | Adapting legacy payment gateway to a new system          |
| Provide a unified, simplified interface to a complex subsystem         | Facade                  | Simplify usage of complex subsystems                       | Simplified API for a multimedia subsystem                |
| Ensure a single instance globally with controlled access               | Singleton               | Restrict class to a single instance with global access     | Logger, configuration manager                            |
| Represent part-whole hierarchies in tree structures                    | Composite               | Treat individual objects and compositions uniformly        | GUI frameworks, file directory structures                |
| Encapsulate a request, allowing undo/redo and parameterization         | Command                 | Encapsulate requests as objects                            | Text editor undo/redo stack                              |
| Allow a request to be passed along a chain until handled               | Chain of Responsibility | Decouple sender and receiver with multiple handlers        | Logging frameworks, HTTP request middleware              |
| Notify multiple dependents automatically when an object changes state  | Observer                | One-to-many dependency for event updates                   | Event listeners in GUIs, pub-sub systems                 |
| Centralize complex communication between multiple objects              | Mediator                | Avoid direct references, reduce complexity between objects | Chatroom handling user messages, UI widget coordination  |
| Construct complex objects step-by-step                                 | Builder                 | Incrementally build complex objects with flexibility       | Building complex documents or JSON objects               |
| Create object copies efficiently without depending on class hierarchy  | Prototype               | Clone existing objects for new instances                   | Copying objects in a drawing editor                      |
| Let subclasses decide which class to instantiate                       | Factory Method          | Defer instantiation to subclasses                          | Creating different types of documents in an app          |
| Create families of related objects without specifying concrete classes | Abstract Factory        | Provide interface for creating related families            | GUI toolkit supporting multiple themes                   |
| Parse and evaluate custom expressions or DSLs                          | Interpreter             | Represent grammar and interpret sentences                  | Evaluating arithmetic expressions, regex engines         |
| Perform operations on object structures without modifying them         | Visitor                 | Separate algorithm from object structure                   | Applying operations on file system structures            |
| Define skeleton of an algorithm with steps overridden by subclasses    | Template Method         | Base algorithm with overridable steps                      | Sorting frameworks with customizable comparison logic    |
| Traverse collections without exposing their underlying structure       | Iterator                | Sequentially access elements transparently                 | Iterating over collections or custom aggregates          |
| Capture and restore an object's state easily (undo functionality)      | Memento                 | Save and restore state without violating encapsulation     | Game save/load systems, undo functionality               |
| Optimize memory by sharing large numbers of similar objects            | Flyweight               | Share objects to reduce memory footprint                   | Sharing character glyph objects in a text editor         |


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