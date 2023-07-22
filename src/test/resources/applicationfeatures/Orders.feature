Feature: Order information
Background:
Given user should be logged in
When user clicks on orders link

Scenario: Previously placed order information
When user clicks on past order order button
Then user should be able to see past order

Scenario: current order information
When user clicks on current order button
Then user should be able to see current order 
