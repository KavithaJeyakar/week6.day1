Feature: Leaftaps Merge lead functionality

Background: 
Given Open Chrome Browser
And Load Leaftaps URL

Scenario Outline: Merge Lead functionality
Given Enter the username as <username>
And Enter the password as <password> 
When Click on login button
Then Home page should be launched
When Click on CRMSFA link
Then My Home page should be launched
When Click on Leads tab
Then My Leads page should be launched
When Click on Merge Leads
Then Merge leads page should be launched
When Clickon From Lead icon
Then Find leads page should get launched
And Enter the firstname as <firstname>
And Clickon Find Leads
When Clickon LeadID
Then Find leads window should get closed
Then From LeadID should get displayed
When Clickon To Lead icon
Then Find leads page should get launched
And Enter the firstname as 'Babu'
And Clickon Find Leads
When Clickon LeadID
Then Find leads window should get closed
Then To LeadID should get display
When Click on Merge button
Then Are you sure Alert window will appear to confirm
And View Lead page should be launched

Examples:
|username|password|phno|firstname|
|'Demosalesmanager'|'crmsfa'|'123456789'|'Hari'|

