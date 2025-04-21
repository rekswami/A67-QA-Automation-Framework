Feature: Login Feature

  Scenario: Login Positive Scenario
    Given  I open browser
    And I open Login page
    When I enter email "rekha.swaminathan@testpro.io"
    And I enter password "PHL0a6FA"
    And I click submit
    Then I am logged in