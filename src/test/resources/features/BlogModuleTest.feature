Feature: Blog module functionality

  Scenario: Verify that user is able to read the intended blog post.
    Given the user is logged into the application and in the home page
    When the user clicks on Blog button at the top right corner
    Then the user can see list of blog post
    And the user can see the pagination option located below the blog post container
    When the user clicks on next page arrow symbol
    Then the user is navigated to new page
    When the user scrolls to the intended post.
    Then the user should be able to see the post availability
    When the user click on the intended post
    Then the user reads the title of the blogs post and makes sure it is the intended post
