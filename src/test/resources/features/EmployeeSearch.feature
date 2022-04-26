Feature: US-12345 Search an employee in HRMS

  Scenario: Search an employee by id

    Given user is navigated to HRMS Application
    When user enter valid admin credentials
    And user clicks on login button
    And user navigates to employee list page
    When user enters valid employee id
    And clicks on search button
    Then user is able to see employee information

