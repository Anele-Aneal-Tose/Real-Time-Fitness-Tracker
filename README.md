# README
___
This file should contain:

## Project Title:
___
Real-Time Fitness Tracker
## Description:
___
<p>The Real-Time Fitness Tracker is a web and mobile-based application designed to help users monitor, analyze, and 
improve their fitness activities through real-time tracking and intelligent insights. The system integrates with 
wearable fitness devices to provide users with instant access to their fitness metrics, including heart rate, calories 
burned, step count, and workout performance.</p>

## Links:
___

- [System Specification](SPECIFICATION.md)
- [Architecture Overview](ARCHITECTURE.md)
- [Stakeholder Analysis Table](Stakeholder_Analysis_Table.md)
- [System Requirements Document](System_Requirements_Document.md)
- [Reflection](Reflection.md)
- [Test case development](Test-Case-Development.md)
- [Use case diagram](Use_Case_Diagram.md)
- [Use case specifications](Use_Case_Specifications.md)
- [Comparison Table](Comparison-Table.md)
- [State Transition Diagrams](State-Transition-Diagrams.md)
- [Activity Diagram](Activity-Diagrams.md)
- [Domain Model Documentation](Domain_Model_Documentation.md)
- [Change log file](CHANGELOG.md)
- [Coverage Report](Coverage_Report.md)
- [Branch Protection Rules](PROTECTION.md)

___

## Assignment 7
___
### Explanation of Customization
* Added ‘Testing’ column: To align with QA requirements and validate completed tasks.
* Added ‘Blocked’ column: To highlight any blockers impeding development progress.
* Used Labels: "tasks", "user story" for better issue tracking.
* Assigned team members: Ensured ownership and accountability for tasks.

### Kanban Board Explanation
<p>A Kanban board is a visual tool used to manage work by displaying tasks in different stages of progress. 
It enhances workflow transparency and efficiency by enabling teams to track task statuses in real-time.</p>

#### How Our Board Supports Agile
* Visualizing Workflow: Columns represent different stages (To Do, In Progress, Testing, Done) to provide clear
* visibility.
* Limiting Work-in-Progress (WIP): The board ensures no more than three tasks per developer at a time, reducing overload.
* Supporting Agile Principles: Encourages continuous delivery by tracking real-time progress and adaptability through
* easy task re-prioritization.

## Assignment 10
___
### Language Choice: Java
___
### Why Java?
Java was chosen for this project because:
* Strong Object-Oriented Support: The system models real-world entities (User, Goal, Device, etc.), and Java's class-based OOP principles (encapsulation, inheritance, polymorphism) align perfectly with domain modeling. 
* Wide Tooling and Library Ecosystem: Java supports powerful testing frameworks (like JUnit), build tools (Maven/Gradle), and coverage tools (JaCoCo), which are ideal for scalable software engineering projects.
* Platform Independence: Java applications are compiled into bytecode and run on the JVM, making the application portable and easy to deploy across environments.
* Industry Adoption & Readability: Java is widely used in enterprise, Android, and backend development, and has a large community for support. Its syntax is also readable and maintainable, which is important for team-based academic or professional projects.

### Creational Pattern Implementation

|Pattern|Use Case| Example Implementation Task                                    |
|---|---|----------------------------------------------------------------|
|Simple Factory|Create FitnessData of various types (Steps, Calories)| FitnessDataFactory, FitnessDataType                            |
|Factory Method|ReportGenerator with different report types (Weekly, Monthly)| ReportGenerator, WeeklyReportGenerator, monthlyReportGenerator |
|Abstract Factory|UI component families: e.g., LightThemeFactory, DarkThemeFactory| Button, LightUIFactory, Theme, UIFactory                       |
|Builder|Construct complex Goal object with optional deadline/progress| GoalBuilder                                                    |
|Prototype|Clone WorkoutRecommendation templates| WorkoutRecommendation                                          |
|Singleton|DatabaseConnection or OAuthManager| Database connection                                            |

## Assignment 11
___

This project is a Real-Time Fitness Tracker application, aimed at helping users monitor their fitness data, devices, goals, reports, and workout recommendations.  
It is designed with clean separation of concerns, scalability, and testability in mind.

This repository covers the implementation of:
- Domain classes
- All six creational design patterns
- A persistence repository layer
- In-memory storage
- Factory-based repository creation
- Future-proofing for database integration
- Unit tests for repositories

---

## Repository Layer

### 1. Generic Repository Interface
 I created a **generic Repository<T, ID> interface** defining standard CRUD operations:
- save(T entity)
- findById(ID id)
- findAll()
- delete(ID id)

 **Why use Generics?**  
Using generics avoids duplication across entity repositories and keeps the system scalable and DRY (Don't Repeat Yourself).


---

### 2. Entity-specific Repositories

Each main domain entity has its own repository interface extending Repository<T, ID>:

- UserRepository
- DeviceRepository
- FitnessDataRepository
- GoalRepository
- ReportRepository
- WorkoutRecommendationRepository


---

### 3. In-Memory Repository Implementations

Each entity has an **in-memory HashMap-based repository** implementing its respective interface.

Example:
- InMemoryUserRepository
- InMemoryDeviceRepository
- etc.

Each repository uses HashMap<ID, Entity> for storage.


**Why start with In-Memory?**
- Fast unit testing
- No external dependencies
- Easy to later replace with database or file system

---

### 4. Repository Factory (Abstraction Mechanism)

I implemented a **Factory Pattern** using RepositoryFactory to abstract storage backend selection.

- Default storage backend is **MEMORY**.
- Can switch to **DATABASE** (future) easily.

Usage Example:

## java

UserRepository userRepo = RepositoryFactory.getUserRepository();

## Assignment 12

### Added

- UserService, DeviceService, FitnessDataService
- REST API for /users, /devices, /fitness-data
- Swagger UI documentation

## Assignment 13

### Workflows tests

![Workflow Tests Screenshots](Workflow_tests1.png)
![Workflow Tests Screenshots](Workflow_tests2.png)
![Workflow Tests Screenshots](Workflow_tests3.png)
![Workflow Tests Screenshots](Workflow_tests4.png)
![Workflow Tests Screenshots](Workflow_tests5.png)
 
