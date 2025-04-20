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