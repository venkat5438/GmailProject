Feature: gmail login test
  Scenario: login test using credentials
    Given user navigate to gmail homepage
    When user click signin button
    And user enters mailid click next
    And user enters password click next
    Then user should see logged in page

