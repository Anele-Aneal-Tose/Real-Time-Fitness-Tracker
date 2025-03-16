# Test case table for functional requirements

| Test Case ID | Requirement ID | Description | Steps                                                                                                 | Expected Result | Actual Result | Status   |
|--------------|----------------|---|-------------------------------------------------------------------------------------------------------|---|---|---|
| TC-001       | FR-001         |Validate user registration and login| <ul><li>Navigate to registration page</li><li>Enter valid credentials</li><li>Submit the form</li></ul> |User account is created or authenticated; dashboard loads|User registered successfully; redirected to dashboard|Pass|
| TC-002	      |FR-002|Verify real-time fitness data tracking| <ul><li>Connect wearable device</li><li>Initiate data transmission</li><li>Check data update</li></ul>|Fitness data is captured and updated on the dashboard|Data synchronized successfully and displayed in real-time|Pass|
|TC-003|FR-003|Test dashboard metrics display|<ul><li>Login as a user</li><li>Navigate to dashboard</li><li>Verify displayed metrics</li></ul>|Metrics are accurate and updated in real time|Metrics displayed correctly with no delay|Pass|
|TC-004|FR-005|Check goal setting and monitoring functionality|<ul><li>Login</li><li>Set a fitness goal</li><li>Monitor progress as data updates</li></ul>|Goals are saved and progress is reflected in the system|Goals were successfully set and tracked|Pass|
|TC-005|FR-004|Evaluate personalized workout recommendations|<ul><li>Login</li><li>Ensure sufficient historical data</li><li>Request workout recommendations</li></ul>|A list of tailored workout suggestions is displayed|Workout recommendations matched user’s fitness data|Pass|
|TC-006|FR-006|Validate report generation functionality|<ul><li>Login</li><li>Select “Generate Report”</li><li>Review the generated analytics report</li></ul>|Graphical report is generated with accurate data|Report generated successfully with all expected data points|Pass|
|TC-007|FR-007|Test integration with third-party APIs|<ul><li>Ensure API credentials are set</li><li>Trigger data synchronization</li><li>Verify data import</li></ul>|External data is successfully retrieved and integrated|Data retrieved and integrated from external API|Pass|
|TC-008|FR-008|Verify trainer access to client data|<ul><li>Login as trainer</li><li>Select a client with consent</li><li>View client fitness data</li></ul>|Client data is securely displayed for the trainer|Trainer accessed client data securely|Pass|
# Non-Functional Test Scenarios:
## Performance Test: 
* Simulate 10,000 concurrent users accessing the system. Verify that the system response time does not exceed 200ms.

## Security Test: 
* Verify that all sensitive user data is encrypted using AES-256 and that multi-factor authentication is enforced.

___
