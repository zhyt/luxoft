package com.test.serenity.page.parts;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TransmissionTypePart {
	private WebDriver driver;
	private WebElement transmissionTypeComboBox;

	WebDriverWait wait;

	public TransmissionTypePart(WebDriver driver) {
		this.driver = driver;
		this.wait = new WebDriverWait(driver, 2);
		initFields();
	}

	private void initFields() {
		transmissionTypeComboBox = driver.findElement(By.cssSelector("#param_transmission_type > div > a > span.header.block"));
	}

	public String getTransmissionTypeComboBoxValue() {
		return transmissionTypeComboBox.getText();
	}

	public WebElement getTransmissionTypeComboBox() {
		return transmissionTypeComboBox;
	}

	// set or select values
	public List<String> getTransmissionTypeValues() {
		List<String> resultList = new ArrayList<>();

		transmissionTypeComboBox.click();

		Actions actions = new Actions(driver);
		actions.moveByOffset(0, 0);
		WebElement allTypes = driver.findElement(By.cssSelector("#param_transmission_type > div > ul > li.clr.brbottdash-2 > label"));
		resultList.add(allTypes.getText());
		List<WebElement> currencies = driver
				.findElements(By.cssSelector("#param_transmission_type > div > ul > li > label.select-only-this-opiton.inlblk.value.c27.lheight18.active-filter > span"));
		for (WebElement option : currencies) {
			String allText = option.getText();
			resultList.add(allText);
		}
		return resultList;
	}

	public boolean getDeafaultSelection() {
		transmissionTypeComboBox.click();
		return isSelected("#f-all-filter_enum_transmission_type_33");
	}

	public boolean getMachanicSelection() {
		transmissionTypeComboBox.click();
		return isSelected("#f-545_transmission_type");
	}

	public boolean getAutomaticSelection() {
		transmissionTypeComboBox.click();
		return isSelected("#f-546_transmission_type");
	}

	public boolean getOtherSelection() {
		transmissionTypeComboBox.click();
		return isSelected("#f-547_transmission_type");
	}

	public void selectAllCheckBox() {
		transmissionTypeComboBox.click();
		WebElement hiddenInput = wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#f-all-filter_enum_transmission_type_33")));
		((JavascriptExecutor) driver).executeScript("arguments[0].checked = true;", hiddenInput);

	}

	public void selectMechanicalCheckBox() {
		transmissionTypeComboBox.click();
		WebElement label = wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#param_transmission_type > div > ul > li:nth-child(2) > label.chbox.inlblk.value.c27.lheight18.active-filter")));
		WebElement hiddenInput = wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#f-545_transmission_type")));
		label.click();
		((JavascriptExecutor) driver).executeScript("arguments[0].checked = true;", hiddenInput);
	

	}

	public void selectAutomaticalCheckBox() {

	}

	public void selectOtherCheckBox() {

	}

	private boolean isSelected(String id) {
		
		boolean result = false;
		try {
			WebElement hidden = wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(id)));
			result = hidden.isSelected();
		} catch (TimeoutException e) {
			result = false;
		}
		return result;
	}
}
