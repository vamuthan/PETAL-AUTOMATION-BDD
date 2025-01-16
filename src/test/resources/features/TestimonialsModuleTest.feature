Feature: Testimonials module functionality

  Scenario: Verify that all the partners are displayed as intended.
    Given the user is logged into the application and in the home page
    When the user clicks on customer success module dropdown
    Then the user see customer success success button from the dropdown.
    And the user see three sub module buttons from the dropdown.
    When the user clicks on our customers module button
    Then the user is navigated to a new page with change in page url.
    When the user clicks on see who we helped button
    Then the user see that the page scrolls down to the list of customer testimonials
