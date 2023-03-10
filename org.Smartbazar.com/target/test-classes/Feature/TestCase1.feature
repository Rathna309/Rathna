#Author: Rathna
  Feature: Test case for checking the title of the application.
    Scenario: User wants to check the whether the application is opening or not.
      Given User Opens the Browser
      Then User enters the "https://www.smartbazaar.co.uk/"
      And User verifies the title of the application
      Then User close the Browser.

