Feature: To validate Adactin Login Page

Background:
Given User enters the Adactin page

@valid
Scenario: To validate Login Page By entering correct username and correct password

When User enters username and password
And User clicks the login Button
Then verify whether enters the booking page

@invalid
Scenario Outline: To validate Login Page by entering wrong username and password
When User enters wrong "<username>" and "<password>"
And User clicks the login Button after incorrect credentials
Then verify whether enters the booking page

Examples: 
|username|password|
|Aishwarya|Aishwarya|
|kavi|kavi|
