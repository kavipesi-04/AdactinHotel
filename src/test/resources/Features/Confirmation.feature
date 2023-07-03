Feature: To check the confirmation page

@valid
Scenario: To check whether user able enter details and confirm

Given User enters confirmation page
When User enters firstname 
When User enters lastname
When User enters address
When User enters credit card number
When User enters credit card type
When User enters expiry month
When User enters expiry year
When User enters cvv
And User should click book now button
Then User successfully booked 
