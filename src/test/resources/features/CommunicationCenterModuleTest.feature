Feature: Communication center Module Functionality

  Scenario: Verify all the important key benefits of On communication center module are displayed.
    Given the user is logged into the application and in the home page
    When the user clicks on solution drop down menu
    Then the user is able to see solutions module button
    And the user is able to see capacity module button and all the sub module buttons
    And the user is able to see care coordination module button and all the sub module buttons
    When the user clicks on communication center module button
    Then the user is navigated to communication center module page
    And the user is able to see talk to an expert button present in communication center page
    When the user scrolls down to key benefits section in communication center page
    Then the user is able to see the first key benefit in communication center page
    And the user is able to see the second key benefit in communication center page
    And the user is able to see the third key benefit in communication center page
    And the user is able to see the fourth key benefit in communication center page
    And the user is able to see the fifth key benefit in communication center page