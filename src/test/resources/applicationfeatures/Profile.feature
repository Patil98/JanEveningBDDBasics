Feature: Profile functionality
Scenario: Add profile
Given User should be at home page
When User clicks on add profile button
And User enters the information
Then Profile should get created

Scenario: Update profile
Given User should be at home page
When User clicks on edit profile button
And User updates the information
Then Profile should get updated

Scenario: delete profile
Given User should be at home page
When User clicks on delete profile button
Then Profile should get deleted
