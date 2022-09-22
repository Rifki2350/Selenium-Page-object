Feature: Select Item shop

	Scenario: User Add item
	When User go to web shop
	And User click search first item
	And User add first item to cart
	Then User click search second cart
	And User add second item to cart
	Then user click view cart
	And User click view checkout 
	