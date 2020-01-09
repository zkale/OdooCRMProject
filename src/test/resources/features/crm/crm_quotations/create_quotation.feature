Feature: 

	#User Story:
	#
	#As a user, I should be able to create a quotation under CRM module.
	#
	#AC: 
	#User should verify that quotation is created with the following fields:
	@CT21-172
	Scenario: Create a quotation under CRM module
		    Given user is logged in
		    Then user clicks on 'Quotations' link
		    And user clicks on Create button
		    Then user enters the following information
		    