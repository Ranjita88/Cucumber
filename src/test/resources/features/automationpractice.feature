Feature: Validate Login functionality

  Scenario: Successful Login with Valid Credentials
    Given User is on Home Page
    When User Navigate to LogIn Page
    And User enters Credentials to LogIn
      | jainamit.wit@gmail.com | Test@123 |
    Then Message displayed Login Successfully
