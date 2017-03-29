package com.test.serenity.page.parts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class YearsPart {
	private WebDriver driver;
	private WebElement yearFromTextBox;
	private WebElement yearToTextBox;

	public YearsPart(WebDriver driver) {
		this.driver = driver;
		initFields();
	}

	private void initFields() {
		yearFromTextBox = driver.findElement(By.cssSelector("#param_motor_year > div > div.filter-item.filter-item-from.rel.numeric-item > a > span.header.block"));
		yearToTextBox = driver.findElement(By.cssSelector("#param_motor_year > div > div.filter-item.filter-item-to.rel.numeric-item > a > span.header.block"));
	}

	public String getYearFromTextBoxValue() {
		return yearFromTextBox.getText();
	}

	public String getYearToTextBoxValue() {
		return yearToTextBox.getText();
	}

	public WebElement getYearFromTextBox() {
		return yearFromTextBox;
	}

	public WebElement getYearToTextBox() {
		return yearToTextBox;
	}

}
