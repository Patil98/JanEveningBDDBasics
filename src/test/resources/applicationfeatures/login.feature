Feature: Login functionality
Scenario: login with correct credentials
Given user is at the login screen
When user enters username
And user enters password
And user clicks on login button
Then user should see the home page

Scenario: Validate title 
Given user is at the login screen
Then page title should get display