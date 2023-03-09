Feature: Test Feature

  @api
  Scenario: Test Scenario
    Given the test app
    When client request /accounts details
    Then status code should be 200
    And response body should not be empty