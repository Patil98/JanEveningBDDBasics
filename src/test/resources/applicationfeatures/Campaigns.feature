Feature: Campaign functionality

@sanity @functional
Scenario: create campaign
Given User should be logged in
When User click on create campaign button
And user provide the name of campaign
Then Campaign gets created

@functional
Scenario: Schedule a campaign
Given User should be logged in
When User clicks on campaign
And Enter the details to schedule
Then Campaign will get schedule

@regression
Scenario: validate status of campaign
Given User should be logged in
When user select draft status
Then User should see all drafted campaign