Feature: OLX Find avto by price 
	In order to buy a car
  As a generic user
  I want to be able to filter cars by price

Scenario Outline: Check Avto prices 
	Given Open main page OLX.UA filter avto by prices and close geo location frame if it exists 
	When Enter price from '<price_from>'
	And Enter price to '<price_to>'
	Then Verify that all found cars hace correct price between '<price_from>' and '<price_to>'
    Examples:
      | price_from | price_to   |
      | 100000   | 200000 |
