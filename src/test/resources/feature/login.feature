@Login
Feature: Testing the login functionality

  Scenario Outline: To check user login with Invalid credentials
    Given The App Is Installed Successfully
    And User is on Main activity i.e login page and clicks SignIn button
    When User enter invalid <email> and <password>
    And User press login button
    Then User see error msg of invalid credentials
    Examples:
      | email                 | password   |
      | sarosj@test.com       | test1      |
      | testingvd26@gmail.com | tesngqa123 |


  Scenario Outline: To check user login with valid credentials
    Given The App Is Installed Successfully
    And User is on Main activity i.e login page and clicks SignIn button
    When User enter invalid <email> and <password>
    And User press login button
    Then User navigates to home page
    Examples:
      | email                 | password     |
      | testingvd26@gmail.com | testingqa123 |
