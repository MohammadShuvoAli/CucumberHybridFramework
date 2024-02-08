# OpenCart Selenium Cucumber Maven Project

## Project Overview

This Maven project serves as a comprehensive test automation suite for the OpenCart e-commerce website. Leveraging Selenium for web automation, Cucumber for behavior-driven development (BDD) using Gherkin syntax, and Maven for project management, the framework ensures robust and scalable test automation. The test scenarios are written in Gherkin, providing a human-readable format for collaboration between technical and non-technical team members.

## Project Structure

The project follows a well-organized structure for easy navigation and maintenance:

- **src/main/java/pages:** Contains page classes for different sections of the OpenCart website, including Account, Account Success, Home, Login, Register, and Search Results pages.

- **src/main/java/utils:** Houses utility classes for common functionalities, configuration reading, and element interaction.

- **src/test/java/factory:** Includes the DriverFactory class responsible for managing WebDriver instances.

- **src/test/java/hooks:** Defines ProjectHooks for setting up and tearing down scenarios.

- **src/test/java/runner:** Contains TestRunner class to execute Cucumber scenarios.

- **src/test/java/stepDefinitions:** Implements step definitions for Gherkin scenarios related to Login, Registration, and Search functionality.

- **src/test/resources/config:** Holds configuration properties, such as config.properties.

- **src/test/resources/features:** Encompasses Gherkin feature files for Login, Registration, and Search.

## Maven Structure

- **pom.xml:** Maven Project Object Model file specifying dependencies, plugins, and configurations.

## Target Directory

- **target/classes:** Compiled Java classes and resources.

- **target/CucumberReports:** Directory containing HTML reports generated by Cucumber.

- **target/generated-sources:** Auto-generated source files.

- **target/generated-test-sources:** Auto-generated test source files.

- **target/maven-status:** Maven compiler plugin status files.

- **target/surefire-reports:** Surefire reports for test execution.

- **target/test-classes:** Compiled test classes and resources.

## Additional Features

- **Screenshot Capture:** Screenshots are automatically captured for failed tests, providing visual evidence and aiding in quicker issue resolution.

- **HTML Reporting:** Cucumber generates detailed HTML reports with a breakdown of test scenarios, steps, and execution status for clear visualization of test results.

- **Jenkins Integration:** Jenkins integration is supported for continuous integration and automated builds. A sample Jenkins pipeline script can be provided for seamless integration.

## How to Run

To execute the test suite, use the TestRunner class in the `src/test/java/runner` package. The project can be integrated into Jenkins for automated test execution.

## Screenshots

**Cucumber HTML Report:**
![Cucumber HTML Report](https://github.com/MohammadShuvoAli/CucumberHybridFramework/blob/main/Screenshot/CucumberReport.png)

**Failed Test Screenshot:**
![Failed Test Screenshot](./screenshots/FailedTestScreenshot.png)

Feel free to explore and contribute to this robust automation framework!
