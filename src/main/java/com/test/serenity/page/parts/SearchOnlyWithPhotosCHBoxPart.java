package com.test.serenity.page.parts;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SearchOnlyWithPhotosCHBoxPart {
	private WebElement searchOnlyWithPhotoCheckBox;
	private WebDriver driver;
	WebDriverWait wait;

	public SearchOnlyWithPhotosCHBoxPart(WebDriver driver) {
		this.driver = driver;
		this.wait = new WebDriverWait(driver, 10);
		initFields();
	}

	private void initFields() {
		searchOnlyWithPhotoCheckBox = driver.findElement(By.cssSelector("#paramsListOpt > div > div:nth-child(2) > label.icon.f_checkbox.fleft.marginright5"));
	}

	// These checkboxes are hidden
	public void selectSearchOnlyWithPhotoCheckBox() {
		searchOnlyWithPhotoCheckBox.click();
		WebElement hiddenInput = wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#photo-only")));
		((JavascriptExecutor) driver).executeScript("arguments[0].checked = true;", hiddenInput);

	}

	public void deselectSearchOnlyWithPhotoCheckBox() {
		searchOnlyWithPhotoCheckBox.click();
		WebElement hiddenInput = wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#photo-only")));
		((JavascriptExecutor) driver).executeScript("arguments[0].checked = false;", hiddenInput);

	}

	// Methods to get values
	public boolean isSearchOnlyWithPhotoSelected() {
		boolean isSelected = false;
		try {
			WebElement hidden = wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#photo-only")));
			isSelected = hidden.isSelected();
		} catch (TimeoutException e) {
			isSelected = false;
		}
		return isSelected;
	}

	public WebElement getSearchOnlyWithPhotoCheckBox() {
		return searchOnlyWithPhotoCheckBox;
	}
}
