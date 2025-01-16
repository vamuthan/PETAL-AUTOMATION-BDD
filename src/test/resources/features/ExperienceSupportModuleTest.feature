Feature: Testimonials module functionality

  Scenario: Verify that all the partners are displayed as intended.
    Given the user is logged into the application and in the home page
    When the user clicks on customer success module dropdown
    Then the user see customer success success button from the dropdown.
    And the user see three sub module buttons from the dropdown.
    When the user clicks on experience and support button.
    Then the user is navigated to a experience support page with change in page url.
    When the user scrolls down to procedure section.
    Then the user reads all the procedures listed.