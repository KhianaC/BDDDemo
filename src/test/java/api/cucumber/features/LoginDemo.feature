Feature: Test login functionality

  Scenario Outline: Check login is successful with valid credentials
    Given browser is open
    When  user is on login page
    And  user clicks on login
    Then User is navigated to the home page

    Examples:
    | username | password |
    | Kundan   | 12345    |
    | Varsha   | 12345    |
