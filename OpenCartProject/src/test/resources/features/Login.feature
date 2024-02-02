Feature: Login Functionality

  Scenario: Login with valid credentials
    Given User has navigated to login page
    When User enters valid email address "picek83628@cubene.com" into email field
    And User enters valid password "password@123" into password field
    And User clicks on Login button
    Then User should get successfully logged in

  Scenario: Login with invalid credentials
    Given User has navigated to login page
    When User enters invalid email address into email field
    And User has entered valid password "password123" into password field
    And User clicks on Login button
    Then User should get a proper warning message about credentials mismatch

  Scenario: Login with valid email and invalid password
    Given User has navigated to login page
    When User enters valid email address "picek83628@cubene.com" into email field
    And User has entered valid password "password123" into password field
    And User clicks on Login button
    Then User should get a proper warning message about credentials mismatch

  Scenario: Login with invalid email and invalid password
    Given User has navigated to login page
    When User enters valid email address "picek@cubene.com" into email field
    And User has entered valid password "12345678900" into password field
    And User clicks on Login button
    Then User should get a proper warning message about credentials mismatch

  Scenario: Login without providing any credentials
    Given User has navigated to login page
    When User dont enter any email address into email field
    And User dont enter password into password field
    And User clicks on Login button
    Then User should get a proper warning message about credentials mismatch
