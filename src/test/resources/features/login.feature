@smoke
Feature: Login functionality
  Scenario: Successful login
    Given user is on login page
    When user enters username "standard_user"
    And user enters password "secret_sauce"
    And user clicks login
    Then user should see products page