package com.test.serenity.page.parts;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SearchInTitleAndDescrCHBoxPart {
	private WebDriver driver;
	private WebElement searchInTitleAndDescrCheckBox;
	WebDriverWait wait;

	public SearchInTitleAndDescrCHBoxPart(WebDriver driver) {
		this.driver = driver;
		this.wait = new WebDriverWait(driver, 2);
		initFields();
	}

	private void initFields() {
		searchInTitleAndDescrCheckBox = driver.findElement(By.cssSelector("#paramsListOpt > div > div:nth-child(1) > label.icon.f_checkbox.fleft.marginright5"));
	}

	public void selectSearchInTitleAndDescrCheckBox() {
		searchInTitleAndDescrCheckBox.click();
		WebElement hiddenInput = wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#title-desc")));
		((JavascriptExecutor) driver).executeScript("arguments[0].checked = true;", hiddenInput);
	}

	public void deselectSearchInTitleAndDescrCheckBox() {
		searchInTitleAndDescrCheckBox.click();
		WebElement hiddenInput = wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#title-desc")));
		((JavascriptExecutor) driver).executeScript("arguments[0].checked = false;", hiddenInput);
	}

	public boolean issearchInTitleAndDescrSelected() {
		boolean isSelected = false;
		try {
			WebElement hidden = wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#title-desc")));
			isSelected = hidden.isSelected();
		} catch (TimeoutException e) {
			isSelected = false;
		}
		return isSelected;
	}

	public WebElement getSearchInTitleAndDescrCheckBox() {
		return searchInTitleAndDescrCheckBox;
	}

}
