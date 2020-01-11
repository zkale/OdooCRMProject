@sales

  Feature: sales module
    As a user, sales manager I should be able to use sales module

  @Background:
  Scenario: Login as a sales manager with valid credentials
    Given user is on the login page
    Then user enters "salesmanager70@info.com" username and "salesmanager" password
    And user verifies that "#Inbox" page subtitle is displayed

  @Sales_Module
  Scenario: Switch to the sales module
    Then user clicks on the Sales module on the panel
    And user verifies that Quotations subtitle is displayed


