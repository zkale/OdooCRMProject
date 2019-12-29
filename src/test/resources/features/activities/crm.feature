@crm
  Feature: Create new pipeline
    As a user, I should be able to create pipeline

    Background: Login as crm manager with valid credentials
      Given user is on the login page
      Then user enters "eventscrmmanager64@info.com" username and "eventscrmmanager" password


      Scenario:Verify user can create pipeline
        Given user navigates to CRM page
        And user is on the crm page
        Then create new Pipeline
        And user verifies that new pipeline is created