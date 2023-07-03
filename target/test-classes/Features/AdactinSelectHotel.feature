Feature: To validate Select Page Feature
@valid
Scenario: To validate Whether user able to continue booking

Given User enters Select Page
When User selects the radio button
And User clicks continue Button
Then Verify user enters confirmation page