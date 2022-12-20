  Feature: Login

  Scenario: Ensure user can login
    Given user in Home page
    When user click login
    And user input field email
    And user input field password
    And user click login button
    Then user click OK