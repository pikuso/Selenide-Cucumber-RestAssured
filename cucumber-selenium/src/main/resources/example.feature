Feature: Example Feature
  Scenario: Open Google and search for "Selenium"
    Given I open the browser
    When I navigate to "https://www.google.com"
    Then I search for "Selenium"
    And the page title contains "Selenium"
