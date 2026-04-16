Feature: Navigate to BBC and validate News section

  Scenario: Open BBC and click News
    Given I open the BBC homepage
    When I click on the News link
    Then I should see "News" in the page title