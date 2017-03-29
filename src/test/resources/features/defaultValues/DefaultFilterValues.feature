Feature: OLX search 
	In order to buy a car
  As a generic user
  I want to be able to search for them with OLX.UA

Scenario: Check default filter values 
	Given Open main page OLX.UA 
	When Close geo location frame if it exists to ba able to work with filter 
	Then Check Boxes deselected by default 
	And Prices from and to are empty by default
	And Engine capacity from and to are empty by default
	And Mileage from and to are empty by default
	And Body type is not selected
	And Fuel type is not selected
	And Years from and to are not selected
	And Transmission type is not selected
	And Color is not selected
	And Marka is not selected
	