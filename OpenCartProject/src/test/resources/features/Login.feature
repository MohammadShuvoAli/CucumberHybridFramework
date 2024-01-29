Feature: Login Functionality

  Scenario: Login with valid credentials
    Given User has navigated to login page
    When User enters valid email address "picek83628@cubene.com" into email field
    And User has entered valid password "password@123" into password field
    And User clicks on Login button
    Then User should get successfully logged in

  Scenario: Login with valid credentials
    Given User has navigated to login page
    When User enters valid email address "picek83628@cubene.com" into email field
    And User has entered valid password "password123" into password field
    And User clicks on Login button
    Then User should get a proper warning message about credentials mismatch
