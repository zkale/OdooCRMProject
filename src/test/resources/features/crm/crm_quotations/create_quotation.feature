@CT21-172 @create_quotation
Feature: User should be able to create a quotation under CRM module

	#User Story:
	#
	#As a user, I should be able to create a quotation under CRM module.
	#
	#AC: 
	#User should verify that quotation is created with the following fields:

	Background: Login as crm manager with valid credentials
		Given user is on the login page
		And user enters
			| username | eventscrmmanager64@info.com |
			| password | eventscrmmanager            |

	Scenario: Create a quotation under CRM module
		Given user is logged in
		Then user navigates to "CRM"
		And user navigates to "Quotations"
		Then user clicks on "Create" button
#		And user enters following information
#			| Customer 			| Happy Customer		|
#			| Invoice Address 	| Address 123           |
#			| Delivery Address 	| Address 123           |
#			| Expiration Date	| Address 123           |
#			| Pricelist			| Address 123           |
#			| Payment Terms 	| Address 123           |
##		And user clicks on "Add an item" link
##		Then user selects the first product from the "Product" dropdown
##		And user clicks on "Save  & Close" button on the menu
#		Then user clicks on "Save" button under Quotations
#		And user verifies that quotation is created