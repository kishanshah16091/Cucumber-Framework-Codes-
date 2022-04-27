Feature: Validation of login scenarios
  Scenario: Admin login
    Given user is navigated to HRMS Application
    When user enter valid admin credentials
    And user clicks on login button
    Then admin user is successfully logged in

    Scenario ESS login
      Given user is navigated to HRMS Application
      When user enters valid ess username and password
      And user clicks on login button
      Then ess user is successfully logged in

      Scenario Invalid login
      Given user is navigated to HRMS Application
        When user enters invalid username and password
        And user clicks on login button
        Then use see error message on the screeen