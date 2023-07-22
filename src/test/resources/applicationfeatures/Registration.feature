Feature: Registration of bank account
Scenario: user information addition
Given user should be at registration page
When user enters the following details
| Erin | Smith | erin.smith@gmail.com | 9988776655 |
| Robert | Jackson | rob.j@gmail.com | 8899776655 |
Then user gets registration confirmation