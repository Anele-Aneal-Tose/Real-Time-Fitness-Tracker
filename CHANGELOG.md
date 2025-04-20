# CHANGELOG

**Project:** Real-Time Fitness Tracker   
**Start Date:** February 2025  
**Last Updated:** April 20, 2025

---

## Assignment 10 – April 20, 2025

### Final Implementation and Testing
- Transformed the Class Diagram (from Assignment 9) into full Java source code.
- Implemented all **six creational design patterns**:
    - Simple Factory → `FitnessDataFactory`
    - Factory Method → `ReportGenerator` & `WeeklyReportGenerator`
    - Abstract Factory → `UIFactory`, `Button`, `Theme` families
    - Builder → `GoalBuilder`
    - Prototype → `WorkoutRecommendation` with `clone()`
    - Singleton → `DatabaseConnection`
- Developed `Main.java` to demonstrate runtime behavior.
- Wrote full **unit test suite using JUnit 5**.
- Generated **test coverage report** using JaCoCo (95%+ coverage).
- Documented usage in `README.md` and created `TEST_REPORT.md`.

---

## Assignment 9 – April 13, 2025

### Domain Modeling & Class Diagram
- Designed a comprehensive **Domain Model Table** with:
    - Entities, Attributes, Methods, Relationships, and Business Rules.
- Created **Mermaid.js Class Diagram** showing:
    - Associations, multiplicity, inheritance, composition.
- Embedded class diagram in Markdown file for system documentation.
- Identified and modeled constraints like:
    - "Max 3 devices per user"
    - "Up to 5 goals per user"
    - "Reports generated weekly"
- Started mapping design to code structure.

---

## Assignment 6–8 – March 2025

### Agile & Behavioral Modeling
- Developed Agile plan using GitHub Project Board.
- Created User Stories and organized tasks.
- Produced behavior models (state diagrams, activity diagrams).
- Documented workflow for fitness tracking and goal progress updates.
- Incorporated OAuth-based user login and trainer consent logic into use cases.

---

## Assignment 5 – February 2025

### Use Case & Scenario Design
- Defined use cases: set goals, track fitness data, sync device, generate report.
- Modeled actors (`User`, `Trainer`) and interactions with the system.
- Aligned use cases with project scope and system features.

---

## Assignment 4 – February 2025

### Requirements Documentation
- Converted initial ideas into functional and non-functional requirements.
- Listed constraints and validation rules for each entity and process.
- Defined security rules: OAuth 2.0 login, 2FA, data visibility permissions.

---

## Assignment 3 – February 23, 2025

### Project Initialization
- Created GitHub Repository: `Real-Time Fitness Tracker`.
- Added initial documentation:
    - `SPECIFICATION.md`: Domain, problem statement, scope.
    - `ARCHITECTURE.md`: C4 diagrams (Context, Container, Component).
- Defined system components: Wearables, Users, Goals, Reports.
- Outlined API-level and dashboard interactions.
- Prepared for modeling in Assignments 4–10.

---

## Future Improvements

- Add support for Trainer-Client consent workflows.
- Implement strategy pattern for workout type customization.
- Integrate data persistence (e.g., JDBC or JPA) for real database storage.
- Develop frontend (React/Flutter) or Android native app.

---

