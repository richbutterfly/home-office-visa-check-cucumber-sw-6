Feature: Visa confirmation test
  As a user
  I want to test visa confirmation

  @sanity
  Scenario: Verify visa for an Australian Coming To UK For Tourism
    Given I am on Homepage
    When  I accept all cookies
    And   I click on start now button
    And   I select a Nationality "Australia"
    And   I click on Continue button
    And   I select reason "Tourism"
    And   I click on Continue button
    Then  I verify the result "You will not need a visa to come to the UK"

  @smoke
  Scenario: Verify visa for a Children Coming To The UK For Work And Plans On Staying For Longer Than Six Months
    Given I am on Homepage
    When  I accept all cookies
    And   I click on Hide this message
    And   I click on start now button
    And   I select Nationality "Chile"
    And  I click on continue button for going to next page
    When   I select a reason "Work, academic visit or business"
    And   I click on Continue button1
    When   I select intended to stay for "longer than 6 months"
    And   I click on Continue button for next step
    When   I select have planning to work for "Health and care professional"
    And   I click on continue button2
    Then  I verify result "You need a visa to work in health and care"

  @regression
  Scenario: Verify a Columbian National Coming To The UK To Join A Partner For A Long Stay They Do Have An Article 10 Or 20 Card
    Given I am on Homepage
    When  I accept all cookies
    And   I click on Hide this message
    And   I click on start now button
    When  I select the Nationality 'Colombia'
    And   I click on continue button to go on next page
    When  I select reason "Join partner or family for a long stay" for longer stay
    And   I click on the Continue button
    Then  I verify the message "You may need a visa"


