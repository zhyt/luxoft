package com.test.serenity.steps;

import java.util.List;

import org.junit.Assert;

import com.test.serenity.PassengerCarPage;

import net.thucydides.core.annotations.Step;

public class CheckFilterAvtoByPriceSteps {

	PassengerCarPage mainCarPage;

	@Step
	public void openOlxCarsSearchPage() {
		mainCarPage.open();
	}

	@Step
	public void closeGeoLocationFrame1() {
		mainCarPage.closeGeoFrame();
	}

	@Step
	public void enterPriceFrom(String priceFrom) {
		mainCarPage.setPriceFrom(priceFrom);
	}

	@Step
	public void enterPriceTo(String priceTo) {
		mainCarPage.setPriceTo(priceTo);
	}

	@Step
	public void checkFoundAvtoPrices(String priceFrom, String priceTo) throws InterruptedException {
		Integer from = new Integer(priceFrom);
		Integer to = new Integer(priceTo);
		List<String> results = mainCarPage.getPricesValues();
		Assert.assertFalse(results.isEmpty());
		for (String s : results){
			Integer resultValue = new Integer(s);
			Assert.assertTrue(resultValue >= from && resultValue <= to);
			
		}
		
	}

}
