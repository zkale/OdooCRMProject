@login
Feature: Login
  As a user, I want to be able to login into Odoo app
  with valid username and password under different roles

  @login_crm_manager
  Scenario: Login as crm manager with valid credentials
    Given user is on the login page
    Then user enters "eventscrmmanager64@info.com" username and "eventscrmmanager" password
    And user verifies that "#Inbox" page subtitle is displayed

  @login_with_credentials_all_roles
  Scenario Outline: Login with valid credentials, Login as <username>
    Given user is on the login page
    And user logs in as "<role>"
    When user enters "<username>" username and "<password>" password
    Then user verifies that "#Inbox" page subtitle is displayed

    Examples:
      |role                 | username                      | password          |
      |events crm manager   | eventscrmmanager64@info.com   | eventscrmmanager  |
      |events crm manager   | eventscrmmanager65@info.com   | eventscrmmanager  |
      |sales manager        | salesmanager70@info.com       | salesmanager      |
      |sales manager        | salesmanager71@info.com       | salesmanager      |
      |sales manager        | salesmanager72@info.com       | salesmanager      |
      |sales manager        | salesmanager73@info.com       | salesmanager      |
      |sales manager        | salesmanager74@info.com       | salesmanager      |
      |expenses manager     | expensesmanager90@info.com    | expensesmanager   |
      |expenses manager     | expensesmanager91@info.com    | expensesmanager   |
      |expenses manager     | expensesmanager92@info.com    | expensesmanager   |
      |expenses manager     | expensesmanager93@info.com    | expensesmanager   |
      |expenses manager     | expensesmanager94@info.com    | expensesmanager   |

  @login_navigate_modules_ddt
  Scenario Outline: Login as <role> and verify <title> page title is correct
    Given user is on the login page
    And user logs in as "<role>"
    When user enters "<username>" username and "<password>" password
    Then user navigates to "<module>"
    And user verifies that "<title>" page subtitle is displayed

    Examples: events crm manager
      | role                | username                      | password            |module     | title             |
      | events crm manager  | eventscrmmanager64@info.com   | eventscrmmanager    |Discuss    | #Inbox            |
      | events crm manager  | eventscrmmanager64@info.com   | eventscrmmanager    |Calendar   | Meetings (Week 3) |
      | events crm manager  | eventscrmmanager64@info.com   | eventscrmmanager    |Notes      | Notes             |
      | events crm manager  | eventscrmmanager64@info.com   | eventscrmmanager    |Contacts   | Contacts          |
      | events crm manager  | eventscrmmanager64@info.com   | eventscrmmanager    |CRM        | Pipeline          |
      | events crm manager  | eventscrmmanager64@info.com   | eventscrmmanager    |Sales      | Quotations        |
      | events crm manager  | eventscrmmanager64@info.com   | eventscrmmanager    |Website    | Dashboard         |
      | events crm manager  | eventscrmmanager64@info.com   | eventscrmmanager    |Inventory  | Inventory         |
      | events crm manager  | eventscrmmanager64@info.com   | eventscrmmanager    |Repairs    | Repair Orders     |
      | events crm manager  | eventscrmmanager64@info.com   | eventscrmmanager    |Events     | Events            |
      | events crm manager  | eventscrmmanager64@info.com   | eventscrmmanager    |Employees  | Employees         |
      | events crm manager  | eventscrmmanager64@info.com   | eventscrmmanager    |Leaves     | Leaves Summary    |
      | events crm manager  | eventscrmmanager64@info.com   | eventscrmmanager    |Expenses   | Expenses to Submit|

  @login_negative_test
  Scenario: Verify that warning message is displayed when password is not correct
    Given user is on the login page
    Then user enters "eventscrmmanager64@info.com" username and "wrong" password
    And user verifies that "Wrong login/password" message is displayed

  @login_negative_test
  Scenario: Verify that warning message is displayed when password is not correct
    Given user is on the login page
    Then user enters "wrong" username and "eventscrmmanager" password
    And user verifies that "Wrong login/password" message is displayed

  @login_negative_test
  Scenario: Verify that warning message is displayed when username is blank
    Given user is on the login page
    Then user enters "" username and "eventscrmmanager" password
    And user verifies that "Please fill out this field." warning message is displayed for "username"

  @login_negative_test
  Scenario: Verify that warning message is displayed when password is blank
    Given user is on the login page
    Then user enters "eventscrmmanager64@info.com" username and "" password
    And user verifies that "Please fill out this field." warning message is displayed for "password"



