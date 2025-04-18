# Reflection
___

## Assignment 4
___ 

<p>Balancing stakeholder needs posed challenges, especially in prioritizing feature requests. 

Fitness enthusiasts demanded real-time feedback, whereas health professionals required data accuracy and consistency. 
Ensuring both needs were met required designing a robust data processing mechanism. 
Similarly, business owners focused on monetization while system administrators emphasized security. 
Trade-offs were necessary to ensure performance without compromising security. 
The iterative Agile approach helped refine requirements through stakeholder feedback.</p>
___

## Assignment 5
___

<p>For assignment 5, the process of translating high-level system and stakeholder requirements into detailed use 
cases and corresponding test cases posed several challenges. One major challenge was ensuring that the use cases derived 
from the system requirements document were both comprehensive and detailed enough to capture the complete interactions 
within the system. For instance, the functional requirements outlined in Assignment 4 provided a broad overview of 
capabilities such as real-time fitness tracking, personalized workout recommendations, and report generation. 
However, it was necessary to decompose these high-level requirements into specific, actionable use cases that could 
be validated through testing.</p>

<p>A significant difficulty was balancing stakeholder needs while maintaining technical feasibility. The Fitness 
Enthusiast and Trainer roles, for example, had overlapping needs—both required access to fitness data, 
yet each with different priorities. To address this, the use case “Access Client Data” was defined specifically for the 
Trainer while ensuring that general data tracking and display were covered under separate use cases. This separation 
allowed for more granular test case development, ensuring that each functionality could be independently validated.</p>

<p>Another challenge was incorporating non-functional requirements such as performance and security into the test cases. 
These aspects are not typically as straightforward to test as functional requirements. For example, verifying that the 
dashboard loads within two seconds under peak load required simulating concurrent user sessions, which in turn 
necessitated a careful design of test scenarios that mimic real-world usage. </p>

<p>Moreover, ensuring consistency across documents—ranging from the use case diagram to the detailed specifications and 
finally to the test cases—required iterative reviews and refinements. Each artifact needed to be traceable to the 
original stakeholder requirements. The iterative approach recommended in the module guidelines helped in refining the 
use cases and test scenarios. Agile principles played a crucial role here; regular feedback from peers and stakeholders 
was instrumental in aligning the deliverables with both business needs and technical constraints.
</p>

<p>Lastly, the clarity and documentation of these artifacts are vital for future development stages. In our reflection, 
it became evident that detailed specifications and clear test cases not only facilitate better communication between 
developers and testers but also ensure that any modifications or enhancements to the system can be seamlessly integrated. 
This documentation will serve as a reference throughout the project lifecycle, ensuring that the system evolves without 
deviating from stakeholder expectations.</p>

## Assignment 6
___

<p>In completing this assignment, I faced several challenges in balancing stakeholder needs, prioritizing user stories, 
and estimating effort for tasks. One of the main challenges was ensuring that the user stories aligned with the 
functional and non-functional requirements from Assignment 4 while also addressing the use cases from Assignment 5. 
For example, the requirement for real-time fitness tracking (FR-2) had to be broken down into smaller, actionable tasks 
like integrating the wearable device API and developing the data processing logic.</p>

<p>Another challenge was prioritization using the MoSCoW method. Deciding which features were "Must-have" versus 
"Should-have" required careful consideration of stakeholder needs and technical feasibility. For instance, the login and 
authentication functionality (US-001) was prioritized as a "Must-have" because it is a foundational feature that enables 
all other functionalities. However, integrating third-party APIs (US-007) was marked as a "Could-have" because it is not 
essential for the initial release but adds significant value in the long term.</p>

<p>Effort estimation was also a challenge, especially when dealing with dependencies. For example, the task of 
integrating the wearable device API (T-003) had a high effort estimate due to the complexity of handling real-time data 
and ensuring compatibility with multiple devices. Additionally, breaking down user stories into smaller tasks required a 
deep understanding of the system architecture, which was facilitated by the C4 diagrams from Assignment 3.</p>

<p>Overall, this assignment helped me understand the importance of Agile methodologies in managing complex software 
projects. By breaking down requirements into user stories, prioritizing them, and planning sprints, I was able to create 
a clear roadmap for developing the Real-Time Fitness Tracker system.</p>

___
## Assignment 7
___
### Challenges in Template Selection and Customization
* Choosing the right template: Basic Kanban lacked automation, while Team Planning was too complex for our needs.
* Customizing workflows: Ensuring the board structure aligned with Agile principles while keeping it flexible.
* Task breakdown: Properly linking issues from the sprint backlog without cluttering the board.

### Comparison with Other Tools (Trello, Jira)
| Feature            |GitHub Projects|Trello|Jira|
|--------------------|---|---|---|
| __Automation__     |Yes (via templates)|Limited (manual or Power-Ups)|Advanced (rules, integrations)|
| __Issue Tracking__ |Strong (integrates with GitHub)|Weak (task-based, not issue-focused)|Strong (built for software teams)|
| __Ease of Use__    |Moderate|Easy|Complex (steep learning curve)|

## Assignment 8
___
## Reflection
___
### Challenges:
* Granularity: Simplified the "API Integration" state diagram by omitting transient states like "Retrying" to maintain readability.
* Agile Alignment: Ensuring activity diagrams matched sprint tasks (e.g., "Develop Data Aggregation API" mapped to the Generate Report workflow).
* Tool Limitations: Mermaid’s lack of native swimlane support required creative labeling.

### State vs. Activity Diagrams:
* State: Focused on object lifecycles (e.g., User Account’s lifecycle from registration to closure).
* Activity: Emphasized end-to-end processes (e.g., steps to generate a report).

___

## Assignment 9
___
<p> Designing the domain model and class diagram for the Real-Time Fitness Tracker system was both insightful and 
challenging. This task pushed me to abstract complex real-world interactions into modular components while ensuring 
alignment with the use cases, functional requirements, and behavioral models developed in Assignments 4 through 8.</p>

___

### Challenges:
___
* Abstraction: Deciding whether to model Trainer as a subclass or a separate entity. Chose inheritance to avoid redundancy.
* Relationships: Balancing multiplicity (e.g., limiting devices per user) while ensuring scalability.
* Alignment: Validating that class methods (e.g., track(), generate()) map to use cases like "Track Fitness Data" and "Generate Reports."

## Trade-offs:
___
* Inheritance vs. Composition: Used inheritance for Trainer to simplify permissions but avoided overcomplicating roles like "Admin."
* Granularity: Combined fitness metrics into FitnessData instead of creating separate classes for steps, calories, etc.

## Lessons Learned:
___
* Object-oriented design emphasizes reusability (e.g., inheritance) and encapsulation (e.g., separating data processing in FitnessData).
* Clear relationships and constraints are critical for enforcing business rules (e.g., device limits).

## Alignment with Prior Work:
___
* The WorkoutRecommendation class supports Use Case 5 from Assignment 5.
* State diagrams from Assignment 8 (e.g., FitnessData states like "tracking") are reflected in methods like track() and process().

___

