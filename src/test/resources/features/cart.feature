Feature: Cart functionality

  Scenario: Add product to cart
    Given user is on login page
    When user enters username "standard_user"
    And user enters password "secret_sauce"
    And user clicks login
    And user adds product to cart
    And user opens cart
    Then product should appear in cart