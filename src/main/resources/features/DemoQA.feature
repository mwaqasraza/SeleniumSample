Feature: Sample Cucumber Feature
  
  @TC_ABS_Commerce_02
  Scenario: Demo QA elements
    Given I am on the Demo QA page "https://demoqa.com/"
    When I click on Elements tab
    Then I am navigated to page "https://demoqa.com/elements"
    When I click on Text Box link
    Then I can see Text Box fields
    When I enter "John Doe" in the Full Name field
    And I enter "john.doe@example.com" in the Email field
    And I enter "123 Main Street, City" in the Current Address field
    And I enter "456 Second Avenue, Town" in the Permanent Address field
    And I click the Submit button
    Then I can see my information in the output section
