Feature: Sending and Receiving email
Scenario: compose email functionality
Given User should be logged in
When User click on compose button
And user enters the email 
And Enter the subject with body
And Click on Send button
Then User should get message "Email sent"
