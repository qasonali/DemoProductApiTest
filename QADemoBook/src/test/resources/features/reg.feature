Feature: register new user


Scenario: successful registration
     Given user is on registration page
     When user enters valid details
     And click on new user button
     Then user account should be created successfully     
Scenario: Registration with existing username
     Given user is on registration page
     When user enters already registered username
     Then error message should be displayed   
