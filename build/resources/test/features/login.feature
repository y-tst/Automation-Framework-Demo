Feature: Login User
  User need to be logged in

  Scenario: Login User
    When User clicks "Log In" button
    Then Input login
    Then Input password
    Then Clicks Log In button on Log In page
    Then content "Frequently asked questions" is visible