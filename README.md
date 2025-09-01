# DemoQA Selenium Test Automation

This project contains Selenium test automation scripts for the DemoQA website (https://demoqa.com/) using the Page Object Model design pattern and Cucumber for BDD.

## Project Structure

- `src/main/resources/features`: Contains Cucumber feature files
- `src/test/java/org/example/pages`: Contains Page Object Model classes
- `src/test/java/org/example/stepdefs`: Contains Cucumber step definitions
- `src/test/java/org/example/runners`: Contains Cucumber test runners
- `src/test/java/org/example/utils`: Contains utility classes

## Prerequisites

- Java 17 or higher
- Maven

## Dependencies

- Selenium WebDriver
- Cucumber
- JUnit
- WebDriverManager
- AssertJ

## Running the Tests

To run the tests, use the following command:

```bash
mvn clean test
```

This will execute the Cucumber tests and generate reports in the `target/cucumber-reports` directory.

## Test Scenarios

The project currently includes the following test scenarios:

1. **Demo QA Elements**
   - Navigate to DemoQA homepage
   - Click on Elements tab
   - Click on Text Box link
   - Fill in the form fields
   - Submit the form
   - Verify the output

## Configuration

- Tests run in headless mode by default
- Chrome browser is used by default
- Browser can be changed in the WebDriverFactory class
