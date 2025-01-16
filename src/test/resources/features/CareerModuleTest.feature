Feature: Career Module Functionality

  Scenario: Verify job posting displayed on the career page as intended
    Given the user is logged into the application and in the home page
    When the user clicks on company module button
    Then the user sees a dropdown containing company module button
    And the user see a dropdown containing further four module options
    When the user clicks on careers module button
    Then the user is taken to careers module with a change in url
    When the user scrolls down to job listings section
    Then the user sees the job filter tool
    And the user see the available job listing