Feature: Checking the search functionality
  Scenario Outline: User wants to check the functionality of the search in the application
    Given User Opens the Browser
    Then User enters the "https://www.smartbazaar.co.uk/"
    And User enters the '<search>' data
    Then user click on the search icon
    Then User verifies the '<search>' results
    When User selects the '<desired>' product
    And User verifies the '<desired>' product result
    Then User close the Browser.
    Examples:
    | search | desired |
    | rice   |  Asali Mappillai Samba Rice (1kg)  |
    | flower |  Marigold Flowers – Yellow (100g)  |