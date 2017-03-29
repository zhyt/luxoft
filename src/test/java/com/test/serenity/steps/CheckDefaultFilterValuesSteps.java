package com.test.serenity.steps;

import org.junit.Assert;

import com.test.serenity.PassengerCarPage;

import net.thucydides.core.annotations.Step;

public class CheckDefaultFilterValuesSteps {

	PassengerCarPage mainCarPage;

	@Step
	public void openOlxCarsSearchPage() {
		mainCarPage.open();
	}

	@Step
	public void closeGeoLocationFrame() {
		mainCarPage.closeGeoFrame();
	}

	@Step
	public void verifyCheckBoxes() {
		Assert.assertFalse(mainCarPage.isSearchInTitleSelected());
		Assert.assertFalse(mainCarPage.issearchWithPhotoSelected());
	}

	@Step
	public void checkPricesAreEmpty() {
		Assert.assertTrue(mainCarPage.isPriceFieldsEmpty());
	}
	

	@Step
	public void checkEngineCapacityAreEmpty() {
		Assert.assertTrue(mainCarPage.isEngineCapacityFieldsEmpty());
	}

	@Step
	public void checkMileageAreEmpty() {
		Assert.assertTrue(mainCarPage.isMileageFieldsEmpty());
	}
	
	@Step
	public void checkBodyTypeIsEmpty() {
		Assert.assertTrue(mainCarPage.isBodyTypeEmpty());
	}
	@Step
	public void checkFuelTypeIsEmpty() {
		Assert.assertTrue(mainCarPage.isFuelTypeEmpty());
	}
	@Step
	public void checkYearsAreEmpty() {
		Assert.assertTrue(mainCarPage.isYearsFieldsEmpty());
	}
	
	@Step
	public void checkTransmissionTypeIsEmpty() {
		Assert.assertTrue(mainCarPage.isTransmissionTypeEmpty());
	}
	
	@Step
	public void checkColorIsEmpty() {
		Assert.assertTrue(mainCarPage.isColorEmpty());
	}
	
	@Step
	public void checkMarkaIsEmpty() {
		Assert.assertTrue(mainCarPage.isColorEmpty());
	}
	
}
