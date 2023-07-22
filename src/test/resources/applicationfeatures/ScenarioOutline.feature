Feature: signup to the application
Scenario Outline: signup to application with different data
Given user is at the signup page
When user enters the "<name>" on form
And user enters the <age>
And user select the "<gender>"
Then userid get generate

Examples:
| name | age | gender |
| Eder | 25 | Male |
| Ron | 24 | Male |
| Diana | 43 | Female |
