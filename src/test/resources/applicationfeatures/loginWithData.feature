Feature: Login functionality with data
Scenario: Login with correct credentials
Given user is at login page
When user enters the username as "testusername"
And user enters the password as "testpassword"
And user click on login button
Then user should redirect to homepage