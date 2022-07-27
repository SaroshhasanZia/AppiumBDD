@SignUp
  Feature: To test the Sign Up functionality
    Scenario Outline: Create an account using valid email and password
      Given The App Is Installed Successfully
      And User clicks on SignUp Button
      When User enter valid <email> and <password> and <nickname>
      And User clicks on registration button
      Then User is navigated to email verification page
      Examples:
        | email                 | password     | nickname |
        | testingvd26@gmail.com | Testingqa123 | TesterQA |


