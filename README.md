## Design Patterns Quick Reference Guide with Confusing Pattern Differentiation

**Youtube playlist:** https://www.youtube.com/watch?v=mE3qTp1TEbg&list=PLlsmxlJgn1HJpa28yHzkBmUY-Ty71ZUGc&index=1

**ChatGPT chat:** https://chatgpt.com/share/686ac084-cbc4-8003-9e4f-e785d1886284

---

# 📚 What Are Design Patterns?

Design patterns are reusable solutions to common problems in software design. They improve **readability, scalability, and maintainability**.

Many patterns overlap in purpose, leading to confusion. This guide clarifies **when to use which pattern systematically**.

---

# 📊 23 GoF Design Patterns At a Glance

**Behavioral:**
- These patterns are concerned with object interaction and responsibility, specifically communication between objects and the delegation of responsibilities.
- Chain of Responsibility, Command, Interpreter, Iterator, Mediator, Memento, Observer, State, Strategy, Template Method, Visitor

**Creational:** 
- These patterns are concerned with object creation mechanisms, trying to create objects in a manner suitable to the situation while hiding the creation logic.
- Singleton, Factory Method, Abstract Factory, Builder, Prototype

**Structural:**
- These patterns deal with object composition, forming larger structures from classes and objects while keeping these structures flexible and efficient.
- Adapter, Bridge, Composite, Decorator, Facade, Flyweight, Proxy

---

# 💡 Cheat Sheet

| **Design Pattern**          | **Pattern Type & Why**                                   | **When to Use**                                          | **How to Implement**                                                                                    | **Example Use Case**              |
|-----------------------------| -------------------------------------------------------- | -------------------------------------------------------- | ------------------------------------------------------------------------------------------------------- | --------------------------------- |
| **Strategy**                | Behavioral (encapsulates interchangeable algorithms)     | Need to select algorithm at runtime                      | - Define algorithm interface<br>- Implement concrete strategies<br>- Inject strategy dynamically        | Sorting with different strategies |
| **State**                   | Behavioral (changes behavior based on state)             | Object changes behavior as internal state changes        | - Create state interface<br>- Concrete states implement it<br>- Context holds current state             | TCP connection states             |
| **Command**                 | Behavioral (encapsulates a request as an object)         | Encapsulate requests, support undo/redo                  | - Command interface with execute/undo<br>- Concrete commands encapsulate actions                        | Undo functionality                |
| **Chain of Responsibility** | Behavioral (passes request along handlers)               | Pass request along handlers until one handles it         | - Handler interface<br>- Handlers link via setNext()<br>- Pass requests down chain                      | Middleware, logging               |
| **Observer**                | Behavioral (defines dependency between objects)          | Notify multiple dependents when state changes            | - Subject maintains observer list<br>- Observers implement update()<br>- Notify on changes              | Event handling                    |
| **Mediator**                | Behavioral (centralizes communication)                   | Centralize communication between objects                 | - Mediator interface<br>- Concrete mediator manages colleagues                                          | Chatroom message routing          |
| **Interpreter**             | Behavioral (interprets grammar and expressions)          | Interpret custom grammar/expressions                     | - Grammar classes with interpret()<br>- Use recursion for evaluation                                    | Arithmetic evaluation             |
| **Visitor**                 | Behavioral (separates operations from object structure)  | Perform operations on objects without modifying classes  | - Visitor interface with visit() for each type<br>- Elements implement accept(visitor)                  | File system operations            |
| **Template Method**         | Behavioral (algorithm skeleton with variable steps)      | Define skeleton, let subclasses override steps           | - Abstract class defines template method<br>- Subclasses override specific steps                        | Sorting frameworks                |
| **Iterator**                | Behavioral (sequential access without exposing structure) | Traverse collections transparently                       | - Iterator interface with hasNext()/next()<br>- Concrete iterator manages state                         | Collection traversal              |
| **Memento**                 | Behavioral (captures and restores object state)          | Capture and restore object state safely                  | - Memento stores state<br>- Originator saves/restores<br>- Caretaker manages mementos                   | Undo, checkpoints                 |
| **Singleton**               | Creational (controls single instance creation)           | Ensure only one instance exists globally                 | - Private constructor<br>- Static instance field<br>- Public getInstance()                              | Logger, configuration manager     |
| **Builder**                 | Creational (step-by-step construction)                   | Build complex objects step by step                       | - Builder class with step methods<br>- Optional director to orchestrate<br>- build() returns object     | Constructing complex objects      |
| **Prototype**               | Creational (cloning instead of new creation)             | Clone objects efficiently without complex constructors   | - Implement clone() method<br>- Add copy constructor for deep copying                                   | Cloning shapes in editor          |
| **Factory Method**          | Creational (subclass decides instantiation)              | Defer instantiation to subclasses                        | - Interface for product<br>- Creator defines factory method<br>- Subclasses implement creation          | Creating documents                |
| **Abstract Factory**        | Creational (create related families together)            | Create families of related objects together              | - Interface for families<br>- Concrete factories create related objects                                 | Cross-platform UIs                |
| **Flyweight**               | Structural (sharing to support many objects efficiently) | Optimize memory for large numbers of similar objects     | - Separate intrinsic & extrinsic state<br>- Use factory to share instances                              | Text glyphs, particles            |
| **Decorator**               | Structural (adds responsibilities dynamically)           | Add new responsibilities dynamically without subclassing | - Same interface for component & decorator<br>- Decorator wraps component<br>- Adds behavior before/after | Adding compression/encryption     |
| **Proxy**                   | Structural (controls access to another object)           | Control, enhance, or defer access to a real object       | - Proxy implements same interface<br>- Holds real subject<br>- Adds access logic                        | Virtual proxy for images          |
| **Adapter**                 | Structural (converts one interface to another)           | Bridge incompatible interfaces                           | - Adapter implements target interface<br>- Internally calls adaptee                                     | Legacy system integration         |
| **Facade**                  | Structural (simplifies subsystem interface)              | Simplify usage of a complex subsystem                    | - Facade exposes unified methods<br>- Internally calls multiple subsystems                              | Simplified API for SDK            |
| **Composite**               | Structural (treats part-whole hierarchies uniformly)     | Treat part and whole objects uniformly                   | - Component interface<br>- Leafs & composites implement it<br>- Composite holds children                | File systems, UI components       |
| **Bridge**                  | Structural (decouple abstraction from implementation)    | Avoid binding abstraction to implementation, allowing both to vary independently | - Create abstraction interface and implementation interface<br>- Abstraction holds a reference to implementation<br>- Implementations and abstractions evolve separately | Different UI themes across platforms |


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

## Memento vs Command

| Aspect                               | **Memento Pattern**                                                                                                                | **Command Pattern**                                                                                                                                        |
| ------------------------------------ | ---------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------- |
| **Intent**                           | Capture and restore **internal state** of an object without violating encapsulation                                                | Encapsulate a **request as an object**, allowing parameterization, queuing, logging, undo/redo                                                             |
| **Primary Use Case**                 | Implement **undo/redo** by saving snapshots of state                                                                               | Implement **actions as objects**, allowing deferred execution, macro commands, undo/redo                                                                   |
| **Structure**                        | - **Originator**: the object whose state is saved<br>- **Memento**: stores the internal state<br>- **Caretaker**: manages mementos | - **Command** interface with execute/undo<br>- **ConcreteCommand** encapsulates action<br>- **Invoker** triggers command<br>- **Receiver** executes action |
| **Focus**                            | **State preservation and restoration**                                                                                             | **Action encapsulation and execution**                                                                                                                     |
| **Undo/Redo Handling**               | Stores **entire state** for rollback                                                                                               | Stores **actions**, undoes by executing inverse actions                                                                                                    |
| **Encapsulation**                    | Maintains encapsulation by hiding object state inside memento                                                                      | Maintains encapsulation of requests                                                                                                                        |
| **Example**                          | Text editor saves snapshots of document state for undo/redo                                                                        | Button click actions (copy, paste), macro recording                                                                                                        |
| **Complexity of Undo**               | Easy, by restoring previous memento                                                                                                | Harder, must define inverse actions explicitly                                                                                                             |
| **Behavioral/Structural/Creational** | Behavioral                                                                                                                         | Behavioral                                                                                                                                                 |

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