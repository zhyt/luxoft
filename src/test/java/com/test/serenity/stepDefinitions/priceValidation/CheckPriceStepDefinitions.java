package com.test.serenity.stepDefinitions.priceValidation;

import com.test.serenity.steps.CheckPriceSteps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class CheckPriceStepDefinitions {

  @Steps
  CheckPriceSteps priceSteps;

  @Given("Open main page OLX.UA to check Price From and Close geo location frame if it exists")
  public void openOLXToCheckPrice() throws Throwable {
	  priceSteps.openOlxSearchPage();
	  priceSteps.closeGeoLocationFrame();
  }

  @When("I enter '(.*)'")
  public void enterVaule(String price) throws Throwable {
	  priceSteps.enterValueIntoPriceField(price);
  }

  @Then("I should see new price '(.*)'")
  public void iShouldSee(String price_value) throws Throwable {
	  priceSteps.verifyResultValueInPriceField(price_value);
  }
}
