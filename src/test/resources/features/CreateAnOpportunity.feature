@create_quotation
Feature: As a CRM manager, I should be able to create a quotation under CRM module

  Scenario: Create a quotation
    Given user is on the login page
    Then user enters "eventscrmmanager64@info.com" username and "eventscrmmanager" password
    And user navigates to "CRM"
    Then user enters opportunity information
      | Opportunity Title   | Customer Deal |
      | Customer            | Test Customer |
      | Expected Revenue    | 100000        |
      | Priority            | High          |

    And user clicks on "Create" button
