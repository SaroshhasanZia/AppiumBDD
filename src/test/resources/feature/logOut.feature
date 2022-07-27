@LogOut
Feature: Testing logout functionality with invalid and valid credentials

  Scenario Outline: To Sign out with the logged in user
    Given The App Is Installed Successfully
    When User clicks on Profile section
    And User scroll to SignOut button and click
    And User enters <password>
    Then User is not signed out
    Examples:
      | password    |
      | testingqa22 |




  Scenario Outline: To Sign out with the logged in user
    Given The App Is Installed Successfully
    When User clicks on Profile section
    And User scroll to SignOut button and click
    And User enters <password>
    Then User is signed out
    Examples:
      | password     |
      | testingqa123 |