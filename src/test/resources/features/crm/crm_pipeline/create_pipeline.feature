 @create_pipeline
Feature: User should be able to create a pipeline under CRM module

	Background: Login as crm manager with valid credentials
		Given user is on the login page
		And user enters
			| username | eventscrmmanager64@info.com |
			| password | eventscrmmanager            |

	Scenario: Create a pipeline under CRM module
		Given user is logged in
		Then user navigates to "CRM"
		And user navigates to "Pipeline"
		Then user clicks on "Create" button
		And user enters following information
#			| Opportunity Title 			| Great Opportunity		|
##			| Customer	| Happy Customer         |
##			| Expected Revenue 	| 100000.00          |
##			| Priority	| High          |
		Then user clicks on "Create" button on the menu
#		And user verifies that quotation is created