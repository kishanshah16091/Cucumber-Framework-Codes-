Feature: Dashboard tabs verification functionality

  @dashboard
  Scenario: verify dashboard tabs
    When user enters valid admin credentials
    And user clicks on login button
    Then admin user is successfully logged in
    Then User verifies all the dashboard tabs
    |Admin|PIM|Leave|Time|Recruitment|Performance|Dashboard|Directory|
