Feature: Feature to test login functionality

Scenario Outline: Check login is successful with valid credentials

Given User is on login page
When user enters correct <username> and <password>
And clicks on Login button
Then User successfully navigated to home page

Examples:
    |username         |password |
    |standard_user    |secret_sauce |
    |locked_out_user  |secret_sauce |

Scenario: Verify page title
Given User is on login page
When user gets the title of the page
Then title should be "Swag Labs"
