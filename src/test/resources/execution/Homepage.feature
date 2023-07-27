Feature: Home page functionality
Scenario: verification of title
Given user is at the landing page
Then title of page should contains "Homepage"

Scenario: verify signin icon
Given user is at the landing page
Then signin icon should get display

Scenario: Search flight
Given user is at the landing page
When user enters the to city as "Ottawa"
And Enter the departure with Return date
And click on search flight button

