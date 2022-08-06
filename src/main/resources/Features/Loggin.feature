

  Feature: Loggin feature

    Scenario: Loggin with valid username and password
      When user enter right username and password
      And click robot check box
      And click login button
      Then user logged in successfully