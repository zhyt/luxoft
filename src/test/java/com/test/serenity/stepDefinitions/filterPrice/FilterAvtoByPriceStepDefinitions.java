package com.test.serenity.stepDefinitions.filterPrice;

import com.test.serenity.steps.CheckFilterAvtoByPriceSteps;
import com.test.serenity.steps.CheckMarkaAvtoSteps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class FilterAvtoByPriceStepDefinitions {

	@Steps
	CheckFilterAvtoByPriceSteps filterSteps;

	@Given("Open main page OLX.UA filter avto by prices and close geo location frame if it exists")
	public void openCarsSearchPage() throws Throwable {
		filterSteps.openOlxCarsSearchPage();
		filterSteps.closeGeoLocationFrame1();
	}

	@When("Enter price from '(.*)'")
	public void closeGeoLoactionIfItExists(String from) throws Throwable {
		filterSteps.enterPriceFrom(from);
	}

	@When("Enter price to '(.*)'")
	public void enterPriceTo(String to) throws Throwable{
		filterSteps.enterPriceTo(to);
	}
	
	@Then("^Verify that all found cars hace correct price between '(\\d+)' and '(\\d+)'$")
	public void chechMarkaAvtoIsNotEmpty(String from, String to) throws Throwable {
		filterSteps.checkFoundAvtoPrices(from, to);
	}

}
