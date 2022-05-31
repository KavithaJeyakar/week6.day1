Feature: Leaftaps Duplicate lead functionality

Background: 
Given Open Chrome Browser
And Load Leaftaps URL

Scenario Outline: Duplicate Lead functionality
Given Enter the username as <username>
And Enter the password as <password> 
When Click on login button
Then Home page should be launched
When Click on CRMSFA link
Then My Home page should be launched
When Click on Leads tab
Then My Leads page should be launched
When Click on Find Leads
Then Find leads page should be launched
When Clickon phone tab
And Enter the phone number as<phno>
And Clickon Find Leads
And Clickon LeadID
Then View Lead page should be launched
When Click on Duplicate button
Then Duplicate Lead page should be launched 
When Click on Create Lead Button
Then View Lead page should be launched

Examples:
|username|password|phno|
|'Demosalesmanager'|'crmsfa'|'123456789'|
|'Demosalesmanager'|'crmsfa'|'99'|

