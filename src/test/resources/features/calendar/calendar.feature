@calendar
Feature: Calendar
  As a user, I should be able to login into Odoo app
  and switch into Calendar module

  Background: Login as crm manager with valid credentials
    Given user is on the login page
    Then user enters "eventscrmmanager64@info.com" username and "eventscrmmanager" password

  Scenario: Login and switch to Calendar module.
    Then user switches into Calendar module
    And user verifies that "Meetings (Week 1)" page subtitle is displayed