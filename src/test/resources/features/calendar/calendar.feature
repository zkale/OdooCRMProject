@calendar
Feature: Calendar
  As a user, I should be able to login into Odoo app
  and switch into Calendar module

  Background: Login as crm manager with valid credentials
    Given user is on the login page
    And user enters
      | username | eventscrmmanager64@info.com |
      | password | eventscrmmanager            |

  Scenario Outline: Login and switch to Calendar module.
    Then user switches into Calendar module
    And user verifies that "<role>" page subtitle is displayed

    Examples: title
      | role              |
      | Meetings (Week 1) |

  Scenario Outline: Login and verify calendar view is on <week> be default
    Then user switches into Calendar module
    And user verifies that calendar view by default is "<week>"

    Examples: default button
      |week|
      |Week|