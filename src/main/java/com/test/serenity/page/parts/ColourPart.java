package com.test.serenity.page.parts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ColourPart {
	private WebDriver driver;
	private WebElement colourComboBox;

	public ColourPart(WebDriver driver) {
		this.driver = driver;
		initFields();
	}

	private void initFields() {
		colourComboBox = driver.findElement(By.cssSelector("#param_color > div > a > span.header.block"));
	}

	public String getColourComboBoxValue() {
		return colourComboBox.getText();
	}

	public WebElement getColourComboBox() {
		return colourComboBox;
	}

}
