#to verify login screen
Feature: Feature to test google search functionality

  @googlesearchwithoutparamter
  Scenario: Validate google search is working
    Given browser is open
    And user is on google search page
    When user enters a text in search box
    And hits enter
    Then user is navigated to search results

  @googlesearchwithparamter
  Scenario Outline: Validate google search is working
    Given browser is open
    And user is on google search page
    When user enters a text in search box <SearchValue>
    And hits enter
    Then user is navigated to search results <Output>

    Examples: 
      | SearchValue | Output        |
      | Apple Inc   | Tim Cook      |
      | Google Inc  | Sundar Pichai |
