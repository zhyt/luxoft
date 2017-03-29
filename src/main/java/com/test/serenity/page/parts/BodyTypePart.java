package com.test.serenity.page.parts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BodyTypePart {
	private WebDriver driver;
	private WebElement bodyTypeComboBox;

	public BodyTypePart(WebDriver driver) {
		this.driver = driver;
		initFields();
	}

	private void initFields() {
		bodyTypeComboBox = driver.findElement(By.cssSelector("#param_car_body > div > a > span.header.block"));
	}

	public String getBodyTypeComboBoxValue() {
		return bodyTypeComboBox.getText();
	}

	public WebElement getBodyTypeComboBox() {
		return bodyTypeComboBox;
	}

}
