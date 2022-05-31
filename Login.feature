Feature: Leaftaps login functionality1

Background: 
Given Open Chrome Browser
And Load Leaftaps URL

Scenario Outline: Login with positive credentials
Given Enter the username as <username>
And Enter the password as <pwd>
When Click on login button
Then Home page should be launched

 Examples: 
 |username|pwd|
 |'Demosalesmanager'|'crmsfa'|
 |'Democsr'|'crmsfa'|
 
Scenario: Login with negative credentials
Given Enter the username as 'Demo'
And Enter the password as 'CRMSFA'
When Click on login button
But Error message should be displayed