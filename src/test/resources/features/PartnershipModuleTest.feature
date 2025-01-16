Feature: Partnership module functionality

  Scenario: Verify that all the partners are displayed as intended.
    Given the user is logged into the application and in the home page
    When the user clicks on company module button
    Then the user sees a dropdown containing company module button
    And the user see a dropdown containing further four module options
    When the user clicks on partnership module button
    Then the user is navigated to partnership module page with a change in url
    When the user scrolls down to Join our Partners section
    Then the user see four displayed partners
