Feature: OLX Marka Avto contains avto names 
	In order to buy a car
  As a generic user
  I want to be able to search for car by its name

Scenario: Check Marka Avto values 
	Given Open main page OLX.UA to check Marka Avto 
	When Close geo location frame if it exists to ba able to work with filter to check Marka Avto
	Then Click on Marka Avto combobox to see that it is not emty
	And Click on Marka Avto combobox to see it contains necessary avto names 	