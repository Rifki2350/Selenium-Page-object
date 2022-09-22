Feature: Checkout shop

	Scenario: User add item
	Given User go to web shop
	When User click search first item
	And User add first item to cart
	Then User click search second cart
	And User add second item to cart
	Then User click view cart
	And User click view checkout
	
	Scenario: User checkout
	When User input data
	And User click place order
	Then User Your order has been received
	