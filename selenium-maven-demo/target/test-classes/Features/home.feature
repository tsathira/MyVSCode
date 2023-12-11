Feature: Feature to test add to cart functionality

Background: User is logged in
Given User is on login page
When user enters correct <username> and <password>
And clicks on Login button
Then User successfully navigated to home page

Examples:
    |username         |password |
    |standard_user    |secret_sauce |


Scenario: Verify add to cart functionality

Given User is on home page
When user clicks on add to cart button
Then Item is added to cart