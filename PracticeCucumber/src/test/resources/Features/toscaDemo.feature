Feature: Testing the Tricenties Tosca Application

  Scenario: Login Functinality
    Given user should go to the valid url
    When user click on login button
    When user enters <email> and <Password>
    And user should click on login button
    Then user should navigate to the homepage
    Then user should click on logout
   
  Examples:
  | email | Password |
  | san.name@example1.test | Tosca123! |