Feature: User Registeration
	I want to check the ability of the user to register in our e-commerce website

	Scenario Outline: User Registeration
	Given the user in the home page
	When the user clicks on register link
	And I entered "<Firstname>", "<Lastname>", "<email>", "<password>"
	Then the registration should be a success
	
	Examples:
		| Firstname | Lastname | email | password |
		| sdfds | Mosdfsdhammed | Moeteg@test.com | 123456 |
		| wesdfswe | Mohasdfdsmmed | sdfds@test.com | 123456 |
	
	