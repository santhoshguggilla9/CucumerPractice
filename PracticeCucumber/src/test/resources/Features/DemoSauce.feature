@SmokeFeature
Feature: SauceDemo Website Testing

	@smoketest
  Scenario: check the Login functionality

    Given user should enter the loginpage
    When user enters "standard_user" and "secret_sauce"
    And user should click on login button
    Then user should see the homepage

    @sanitytest
  Scenario: checking the google search page

    Given user should enter google url
    When user enters the search key
    Then user should see the results