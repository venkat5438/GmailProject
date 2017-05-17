Feature: Gap Features validation
  @GAP
  Scenario Outline: Verifying Gap Feature
    Given Invoke the driver Browser and  Navigate to Gap Website
    When User Click Men Option and Click the New Arrivals
    And  User Click GAP|Star Wars Hyper Speed tee
    And User Select the size "List"

  Examples:
  |Link     |
  |32W      |

    #Then User Add to the Bag
    #And User Click Checkout and Verify the Same added


@Function
Scenario: Category verification
  Given user navigate to main page
  When user click Men tab and Verify Categories text present
  And capture all the categories names
  Then close the driver