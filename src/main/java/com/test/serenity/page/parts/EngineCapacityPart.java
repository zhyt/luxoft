package com.test.serenity.page.parts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class EngineCapacityPart {
	private WebDriver driver;
	private WebElement engineCapacityFromTextBox;
	private WebElement engineCapacityToTextBox;

	public EngineCapacityPart(WebDriver driver) {
		this.driver = driver;
		initFields();
	}

	private void initFields() {
		engineCapacityFromTextBox = driver
				.findElement(By.cssSelector("#param_motor_engine_size > div > div.filter-item.filter-item-from.rel.numeric-item > a > span.header.block"));
		engineCapacityToTextBox = driver.findElement(By.cssSelector("#param_motor_engine_size > div > div.filter-item.filter-item-to.rel.numeric-item > a > span.header.block"));
	}

	public WebElement getEngineCapacityFromTextBox() {
		return engineCapacityFromTextBox;
	}

	public WebElement getEngineCapacityToTextBox() {
		return engineCapacityToTextBox;
	}
	
	public String getEngineCapacityFromTextBoxValue() {
		return engineCapacityFromTextBox.getText();
	}

	public String getEngineCapacityToTextBoxValue() {
		return engineCapacityToTextBox.getText();
	}

}
