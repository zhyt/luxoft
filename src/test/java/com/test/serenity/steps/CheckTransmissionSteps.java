package com.test.serenity.steps;

import java.util.List;

import org.junit.Assert;

import com.test.serenity.PassengerCarPage;

import net.thucydides.core.annotations.Step;

public class CheckTransmissionSteps {

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
	public void checkMarkaAvtoIsNotEmpty() {
		Assert.assertFalse(mainCarPage.getMarkaAvtoValues().isEmpty());
	}
	
	@Step
	public void checkMarkaAvtoContainsNames() {
		List<String> names = mainCarPage.getMarkaAvtoValues();
		Assert.assertTrue(names.contains("Audi"));
		Assert.assertTrue(names.contains("Great Wall"));
		Assert.assertFalse(names.contains("Audi123123123"));
	}

}
