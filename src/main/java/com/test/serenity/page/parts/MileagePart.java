package com.test.serenity.page.parts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MileagePart {
	private WebDriver driver;
	private WebElement mileageFromTextBox;
	private WebElement mileageToTextBox;

	public MileagePart(WebDriver driver) {
		this.driver = driver;
		initFields();
	}

	private void initFields() {
		mileageFromTextBox = driver.findElement(By.cssSelector("#param_motor_mileage > div > div.filter-item.filter-item-from.rel.numeric-item > a > span.header.block"));
		mileageToTextBox = driver.findElement(By.cssSelector("#param_motor_mileage > div > div.filter-item.filter-item-to.rel.numeric-item > a > span.header.block"));
	}

	public WebElement getMileageFromTextBox() {
		return mileageFromTextBox;
	}

	public WebElement getMileageToTextBox() {
		return mileageToTextBox;
	}

	public String getMileageFromTextValue() {
		return mileageFromTextBox.getText();
	}

	public String getMileageToTextBoxValue() {
		return mileageToTextBox.getText();
	}

}
