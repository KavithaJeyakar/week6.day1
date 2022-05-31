Feature: Leaftaps create lead functionality

Background: 
Given Open Chrome Browser
And Load Leaftaps URL

Scenario Outline: Create Lead functionality
Given Enter the username as <username>
And Enter the password as <password>
When Click on login button
Then Home page should be launched
When Click on CRMSFA link
Then My Home page should be launched
When Click on Create Lead link 
Then Create Lead page should be launched
Given Enter the companyname as <CompanyName>
And Enter the Firstname as <FirstName>
And Enter the LastName as <LastName>
And Enter the phoneno as <phno>
When Click on Create Lead Button
Then View Lead page should be launched

Examples:
|username|password|CompanyName|FirstName|LastName|phno|
|'Demosalesmanager'|'crmsfa'|'TestLeaf'|'Kavitha'|'Jeyakar'|'123456789'|
|'Demosalesmanager'|'crmsfa'|'TCS'|'Kavitha'|'Jeyakar'|'123456789'|
|'Demosalesmanager'|'crmsfa'|'TCS'|'Kavitha'|'Jeyakar'|'99'|


