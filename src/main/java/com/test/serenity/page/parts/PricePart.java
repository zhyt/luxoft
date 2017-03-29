package com.test.serenity.page.parts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PricePart {
	private WebElement priceFromTextBox;
	private WebElement priceToTextBox;
	private WebDriver driver;
	WebDriverWait wait;
	
	private String inputFrom = "#param_price > div > div.filter-item.filter-item-from.rel.numeric-item.price.filterActive > label > input";
	private String inputTo = "#param_price > div > div.filter-item.filter-item-to.rel.numeric-item.price.filterActive > label > input";

	private String labelFrom = "#param_price > div > div.filter-item.filter-item-from.rel.numeric-item.price > a > span.header.block";
	private String labelTo = "#param_price > div > div.filter-item.filter-item-to.rel.numeric-item.price > a > span.header.block";

	public PricePart(WebDriver driver) {
		this.driver = driver;
		this.wait = new WebDriverWait(driver, 10);
		initFields();
	}

	private void initFields() {
		priceFromTextBox = driver.findElement(By.cssSelector(labelFrom));
		priceToTextBox = driver.findElement(By.cssSelector(labelTo));
	}

	public String getPriceFromTextBoxValue() {
		return priceFromTextBox.getText();
	}

	public String getPriceToTextBoxValue() {
		return priceToTextBox.getText();
	}

	public WebElement getPriceFromTextBox() {
		return priceFromTextBox;
	}

	public WebElement getPriceToTextBox() {
		return priceToTextBox;
	}

	
	public void setPriceFromValue(String value) {
		priceFromTextBox.click();

		// wait untill it becomes active (and drop-down list appears)
		WebElement hiddenInput = wait.until(ExpectedConditions
				.presenceOfElementLocated(By.cssSelector(inputFrom)));
		// set value
		hiddenInput.sendKeys(value);

		//wait untill it becomes IN active (and drop-down list hides)
		wait.until(ExpectedConditions
				.invisibilityOfElementLocated(By.cssSelector(inputFrom)));

	}
	
	public void setPriceToValue(String value) {
		priceToTextBox.click();
		WebElement hiddenInput = wait.until(ExpectedConditions
				.presenceOfElementLocated(By.cssSelector(inputTo)));
		hiddenInput.sendKeys(value);

		wait.until(ExpectedConditions
				.invisibilityOfElementLocated(By.cssSelector(inputTo)));

	}
	
	public void clearPriceFrom(){
		priceFromTextBox.click();
		WebElement hiddenInput = wait.until(ExpectedConditions
				.presenceOfElementLocated(By.cssSelector(inputFrom)));
		hiddenInput.clear();
	}
	
	public void clearPriceTo(){
		priceToTextBox.click();
		WebElement hiddenInput = wait.until(ExpectedConditions
				.presenceOfElementLocated(By.cssSelector(inputTo)));
		hiddenInput.clear();
	}
}
