Feature: OLX Price validation 
	In order to buy a car
  As a generic user
  I want to validate Price to check that only digits are allowed to enter

Scenario Outline: Check Price From validator 
	Given Open main page OLX.UA to check Price From and Close geo location frame if it exists 
	When I enter '<price>' 
	Then I should see new price '<price_value>' 
	Examples: 
		| price		   | price_value    |
		| 123456	   | от 123456 грн. |
		| 999999       | от 999999 грн. |