package com.test.serenity.stepDefinitions.defaulFilterValues;

import com.test.serenity.steps.CheckDefaultFilterValuesSteps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class CheckDefaultFilterValuesStepDefinitions {

	@Steps
	CheckDefaultFilterValuesSteps defaultFilterSteps;

	@Given("Open main page OLX.UA")
	public void openSearchPage() throws Throwable {
		defaultFilterSteps.openOlxCarsSearchPage();
	}

	@When("Close geo location frame if it exists to ba able to work with filter")
	public void closeGeoLoactionIfExists() throws Throwable {
		defaultFilterSteps.closeGeoLocationFrame();
	}

	@Then("Check Boxes deselected by default")
	public void chechBoxesAreNotSelected() throws Throwable {
		defaultFilterSteps.verifyCheckBoxes();
	}

	@Then("Prices from and to are empty by default")
	public void pricesFieldsAreEmpty() {
		defaultFilterSteps.checkPricesAreEmpty();
	}

	@Then("Engine capacity from and to are empty by default")
	public void engineCapacityFieldsAreEmpty() {
		defaultFilterSteps.checkEngineCapacityAreEmpty();
	}

	@Then("Mileage from and to are empty by default")
	public void meliageFieldsAreEmptyByDefault() {
		defaultFilterSteps.checkMileageAreEmpty();
	}

	@Then("Body type is not selected")
	public void bodyTypeIsEmptyByDefault() {
		defaultFilterSteps.checkBodyTypeIsEmpty();
	}
	@Then("Fuel type is not selected")
	public void fuelTypeIsEmptyByDefault() {
		defaultFilterSteps.checkFuelTypeIsEmpty();
	}
	
	@Then("Years from and to are not selected")
	public void yearsAreEmptyByDefault() {
		defaultFilterSteps.checkYearsAreEmpty();
	}
	
	@Then("Transmission type is not selected")
	public void transmissionTypeEmptyByDefault() {
		defaultFilterSteps.checkTransmissionTypeIsEmpty();
	}
	
	@Then("Color is not selected")
	public void colorIsEmptyByDefault() {
		defaultFilterSteps.checkColorIsEmpty();
	}

	@Then("Marka is not selected")
	public void markaIsEmptyByDefault() {
		defaultFilterSteps.checkMarkaIsEmpty();
	}
}
