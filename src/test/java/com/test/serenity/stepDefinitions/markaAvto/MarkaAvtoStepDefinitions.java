package com.test.serenity.stepDefinitions.markaAvto;

import com.test.serenity.steps.CheckMarkaAvtoSteps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class MarkaAvtoStepDefinitions {

	@Steps
	CheckMarkaAvtoSteps markaAvtoSteps;

	@Given("Open main page OLX.UA to check Marka Avto")
	public void openCarsSearchPage() throws Throwable {
		markaAvtoSteps.openOlxCarsSearchPage();
	}

	@When("Close geo location frame if it exists to ba able to work with filter to check Marka Avto")
	public void closeGeoLoactionIfItExists() throws Throwable {
		markaAvtoSteps.closeGeoLocationFrame1();
	}

	@Then("Click on Marka Avto combobox to see that it is not emty")
	public void chechMarkaAvtoIsNotEmpty() throws Throwable {
		markaAvtoSteps.checkMarkaAvtoIsNotEmpty();
	}

	@Then("Click on Marka Avto combobox to see it contains necessary avto names")
	public void pricesFieldsAreEmpty() {
		markaAvtoSteps.checkMarkaAvtoContainsNames();
	}

}
