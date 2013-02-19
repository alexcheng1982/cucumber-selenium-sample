Feature: Google Test

Scenario: Google Search
    Given I want to search some information using Google
    When I input keyword 'New Zealand'
    Then Title of the first search result page should contain the search key word