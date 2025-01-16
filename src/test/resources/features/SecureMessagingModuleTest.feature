Feature: Secure Messaging Module Functionality

  Scenario: Verify all the important key benefits of On Call Scheduling module are displayed.
    Given the user is logged into the application and in the home page
    When the user clicks on solution drop down menu
    Then the user is able to see solutions module button
    And the user is able to see capacity module button and all the sub module buttons
    And the user is able to see care coordination module button and all the sub module buttons
    When the user clicks on secure messaging module button
    Then the user is navigated to secure messaging module with change in url.
    And the user is a able to see the talk to an expert button
    When the user navigates to key benefits section in secure messaging module
    Then the user is able to see the first key benefit in secure messaging module
    And the user is able to see the second key benefit in secure messaging module
    And the user is able to see the third key benefit in secure messaging module
    And the user is able to see the fourth key benefit in secure messaging module