package com.test.serenity.page.parts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FuelTypePart {
	private WebElement fuelTypeComboBox;

	private WebDriver driver;

	public FuelTypePart(WebDriver driver) {
		this.driver = driver;
		initFields();
	}

	private void initFields() {
		fuelTypeComboBox = driver.findElement(By.cssSelector("#param_fuel_type > div > a > span.header.block"));
	}

	public String getFuelTypeComboBoxValue() {
		return fuelTypeComboBox.getText();
	}

	public WebElement getFuelTypeComboBox() {
		return fuelTypeComboBox;
	}

}
