package com.test.serenity.steps;

import org.junit.Assert;

import com.test.serenity.PassengerCarPage;

import net.thucydides.core.annotations.Step;

public class CheckPriceSteps {

	PassengerCarPage mainCarPage;

	@Step
	public void openOlxSearchPage() {
		mainCarPage.open();
	}

	@Step
	public void closeGeoLocationFrame() {
		mainCarPage.closeGeoFrame();
	}

	@Step
	public void enterValueIntoPriceField(String price) {
		mainCarPage.setPriceFrom(price);
	}

	@Step
	public void verifyResultValueInPriceField(String priceValue) {
		String priceFrom = mainCarPage.getPriceFrom();
		Assert.assertTrue(priceFrom.equals(priceValue));
	}

}
