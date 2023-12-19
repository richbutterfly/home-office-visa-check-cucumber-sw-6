Feature: Country drop down Test
  As a user
  I want to verify some options available in country drop down

  @regression
  Scenario: Verify the following country available in country dropdown list
    Given I am on homepage
    When  I accept all cookies
    And   I click on Hide this message
    And   I click on start now button
    Then  I can see following country into dropdown
      | albania                  |
      | bhutan                   |
      | british-protected-person |
      | haiti                    |
      | kazakhstan               |
      | mozambique               |
      | norway                   |
      | portugal                 |
      | russia                   |
      | zambia                   |
