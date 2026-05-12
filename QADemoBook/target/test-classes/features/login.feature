Feature: Login user to the application

@Login
Scenario: Successful login
Given user is on login page
When enters valid username and password
And clicks on login
Then User login successfully 

Scenario: Login failed
Given user is on login page
When user enters invalid username and passwrod
Then error message should display