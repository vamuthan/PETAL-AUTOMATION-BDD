Feature: Artificial Intelligence Module Functionality

  Scenario: Verify all the important key points are displayed on the Artificial Intelligence page as intended
    Given the user is logged into the application and in the home page
    When the user clicks on Technology module dropdown
    Then the user should see Technology module button
    And the user should see four sub module buttons of Technology module
    When the user clicks on Artificial intelligence module
    Then the user should be navigated to Artificial intelligence page with the change in page url
    When the user scrolls down to first key point
    Then the user should see all the important information of first key point
    When the user scrolls down to second key point
    Then the user should see all the important information of second key point
    When the user scrolls down to third key point
    Then the user should see all the important information of third key point
    When the user scrolls down to fourth point
    Then the user should see all the important information of fourth key point