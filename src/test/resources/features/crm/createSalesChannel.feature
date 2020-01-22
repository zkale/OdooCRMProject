@createSalesChannel
  Feature: User should be able to create a sales channel under CRM module

    Background: Login as crm manager with valid credentials
      Given user is on the login page
      And user enters
        | username | eventscrmmanager64@info.com |
        | password | eventscrmmanager            |

      Scenario: Create a sales channel under CRM module
        Given user is logged in
        Then user navigates to CRM
        And user navigates to Sales Channels
        Then user clicks on "Create" button
        And user enters following information about sales channel
        Then user clicks on "Save" button

