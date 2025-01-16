Feature: On Call Scheduling Module Functionality

  Scenario: Verify all the important key benefits of On Call Scheduling module are displayed.
    Given the user is logged into the application and in the home page
    When the user clicks on solution drop down menu
    Then the user is able to see solutions module button
    And the user is able to see capacity module button and all the sub module buttons
    And the user is able to see care coordination module button and all the sub module buttons
    When the user clicks on on-call scheduling button
    Then the user is navigated to on-call scheduling page with the change in the page url
    And the user is able to see talk to an expert button present
    When the  user scrolls down to key benefits section
    Then the user is able to see the first key benefit.
    And the user is able to see the second key benefit.
    And the user is able to see the third key benefit.
    And the user is able to see the fourth key benefit.