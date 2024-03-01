Feature: Google Search

  Background: Valid URL
    Given user should give valid url

  Scenario Outline: Searching for keyValue
    When user enter search key is <searchKey>
    Then user should get the results page

    Examples:
    | searchKey |
    | Testing |
    | java |
    | selenium |