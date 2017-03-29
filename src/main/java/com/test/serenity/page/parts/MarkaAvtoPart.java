package com.test.serenity.page.parts;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MarkaAvtoPart {
	private WebDriver driver;
	private WebElement markaComboBox;

	public MarkaAvtoPart(WebDriver driver) {
		this.driver = driver;
		initFields();
	}

	private void initFields() {
		markaComboBox = driver.findElement(By.cssSelector("#param_subcat > div:nth-child(1) > a:nth-child(2) > span:nth-child(1)"));
	}

	public String getMarkaComboBoxValue() {
		return markaComboBox.getText();
	}

	// set or select values
	public List<String> getMarksValues() {
		List<String> resultList = new ArrayList<>();

		markaComboBox.click();

		List<WebElement> currencies = driver.findElements(By.cssSelector("#param_subcat > div > ul > li > a"));
		for (WebElement option : currencies) {
			String allText = option.getText();
			// Remove unnecessary span value (to avoid smth like: "Audi 31"
			// TODO: Find better way to exclude child in loop
			int i = allText.lastIndexOf("\n");
			String resultValue = allText;
			if (i != -1) {
				resultValue = resultValue.substring(0, i);
			}
			resultList.add(resultValue);
		}
		return resultList;
	}

	public WebElement getMarkaComboBox() {
		return markaComboBox;
	}
}
