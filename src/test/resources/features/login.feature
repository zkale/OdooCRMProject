@login
Feature: Login
  As a user, I want to be able to login into Odoo app
  with valid username and password

  Scenario: Login as crm manager with valid credentials
    Given user is on the login page
    Then user enters "eventscrmmanager64@info.com" username and "eventscrmmanager" password
    And user verifies that "#Inbox - Odoo" page subtitle is displayed