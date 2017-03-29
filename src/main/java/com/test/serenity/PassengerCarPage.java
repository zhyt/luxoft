package com.test.serenity;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.test.serenity.constants.DefaultValuesConstants;
import com.test.serenity.page.parts.BodyTypePart;
import com.test.serenity.page.parts.ColourPart;
import com.test.serenity.page.parts.EngineCapacityPart;
import com.test.serenity.page.parts.FuelTypePart;
import com.test.serenity.page.parts.MarkaAvtoPart;
import com.test.serenity.page.parts.MileagePart;
import com.test.serenity.page.parts.PricePart;
import com.test.serenity.page.parts.SearchInTitleAndDescrCHBoxPart;
import com.test.serenity.page.parts.SearchOnlyWithPhotosCHBoxPart;
import com.test.serenity.page.parts.TransmissionTypePart;
import com.test.serenity.page.parts.YearsPart;

import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;

@DefaultUrl("https://www.olx.ua/transport/legkovye-avtomobili/")
public class PassengerCarPage extends PageObject {

	private PricePart pricePart;
	private BodyTypePart bodyTypePart;
	private ColourPart colourPart;
	private EngineCapacityPart engineCapacityPart;
	private FuelTypePart fuelTypePart;
	private MarkaAvtoPart markaAvtoPart;
	private MileagePart mileagePart;
	private SearchInTitleAndDescrCHBoxPart searchInTitleAndDescrPart;
	private SearchOnlyWithPhotosCHBoxPart searchOnlyWithPhotoPart;
	private TransmissionTypePart transmissionTypePart;
	private YearsPart yearsPart;

	private WebDriver driver;

	WebDriverWait wait;

	public PassengerCarPage(WebDriver driver) {
		super(driver);
		this.wait = new WebDriverWait(driver, 5);
		this.driver = driver;
	}

	public boolean issearchWithPhotoSelected() {
		searchOnlyWithPhotoPart = new SearchOnlyWithPhotosCHBoxPart(driver);
		return searchOnlyWithPhotoPart.isSearchOnlyWithPhotoSelected();

	}

	public boolean isSearchInTitleSelected() {
		searchInTitleAndDescrPart = new SearchInTitleAndDescrCHBoxPart(driver);
		return searchInTitleAndDescrPart.issearchInTitleAndDescrSelected();
	}

	public void closeGeoFrame() {
		List<WebElement> elems = driver.findElements(By.cssSelector("#geo-suggestions-close"));
		if (elems.size() != 0) {
			elems.get(0).click();
		}
	}

	public boolean isPriceFieldsEmpty() {
		pricePart = new PricePart(driver);
		boolean priceFromDefaultValue = DefaultValuesConstants.PRICE_FROM_DEFAULT_VALUE.equals(pricePart.getPriceFromTextBoxValue());
		boolean priceToDefaultValue = DefaultValuesConstants.PRICE_TO_DEFAULT_VALUE.equals(pricePart.getPriceToTextBoxValue());
		return priceFromDefaultValue && priceToDefaultValue;
	}

	public boolean isEngineCapacityFieldsEmpty() {
		engineCapacityPart = new EngineCapacityPart(driver);
		boolean capacityFromDefaultValue = DefaultValuesConstants.ENGINE_CAPACITY_FROM_DEFAULT_VALUE.equals(engineCapacityPart.getEngineCapacityFromTextBoxValue());
		boolean capacityToDefaultValue = DefaultValuesConstants.ENGINE_CAPACITY_TO_DEFAULT_VALUE.equals(engineCapacityPart.getEngineCapacityToTextBoxValue());
		return capacityFromDefaultValue && capacityToDefaultValue;
	}

	public boolean isMileageFieldsEmpty() {
		mileagePart = new MileagePart(driver);
		boolean mileageFromDefaultValue = DefaultValuesConstants.MILEAGE_FROM_DEFAULT_VALUE.equals(mileagePart.getMileageFromTextValue());
		boolean mileageToDefaultValue = DefaultValuesConstants.MILEAGE_TO_DEFAULT_VALUE.equals(mileagePart.getMileageToTextBoxValue());
		return mileageFromDefaultValue && mileageToDefaultValue;
	}

	public boolean isBodyTypeEmpty() {
		bodyTypePart = new BodyTypePart(driver);
		boolean bodyTypeDefaultValue = DefaultValuesConstants.BODY_TYPE_DEFAULT_VALUE.equals(bodyTypePart.getBodyTypeComboBoxValue());
		return bodyTypeDefaultValue;
	}

	public boolean isFuelTypeEmpty() {
		fuelTypePart = new FuelTypePart(driver);
		boolean fuelTypeDefaultValue = DefaultValuesConstants.FUEL_TYPE_DEFAULT_VALUE.equals(fuelTypePart.getFuelTypeComboBoxValue());
		return fuelTypeDefaultValue;
	}

	public boolean isYearsFieldsEmpty() {
		yearsPart = new YearsPart(driver);
		boolean yearFromDefaultValue = DefaultValuesConstants.YEAR_FROM_DEFAULT_VALUE.equals(yearsPart.getYearFromTextBoxValue());
		boolean yearToDefaultValue = DefaultValuesConstants.YEAR_TO_DEFAULT_VALUE.equals(yearsPart.getYearToTextBoxValue());
		return yearFromDefaultValue && yearToDefaultValue;
	}

	public boolean isTransmissionTypeEmpty() {
		transmissionTypePart = new TransmissionTypePart(driver);
		boolean trTypeTypeDefaultValue = DefaultValuesConstants.TRANSMISSION_TYPE_DEFAULT_VALUE.equals(transmissionTypePart.getTransmissionTypeComboBoxValue());
		return trTypeTypeDefaultValue;
	}

	public boolean isColorEmpty() {
		colourPart = new ColourPart(driver);
		boolean colorDefaultValue = DefaultValuesConstants.COLOUR_DEFAULT_VALUE.equals(colourPart.getColourComboBoxValue());
		return colorDefaultValue;
	}

	public boolean isMarkaEmpty() {
		markaAvtoPart = new MarkaAvtoPart(driver);
		boolean markaDefaultValue = DefaultValuesConstants.MARKA_AVTO_DEFAULT_VALUE.equals(markaAvtoPart.getMarkaComboBoxValue());
		return markaDefaultValue;
	}

	public List<String> getMarkaAvtoValues() {
		markaAvtoPart = new MarkaAvtoPart(driver);
		List<String> allCars = markaAvtoPart.getMarksValues();
		return allCars;
	}

	public void setPriceFrom(String price) {
		pricePart = new PricePart(driver);
		pricePart.setPriceFromValue(price);
	}

	public String getPriceFrom() {
		pricePart = new PricePart(driver);
		return pricePart.getPriceFromTextBoxValue();
	}
	
	public void setPriceTo(String price) {
		pricePart = new PricePart(driver);
		pricePart.setPriceToValue(price);
	}

	public String getPriceTo() {
		pricePart = new PricePart(driver);
		return pricePart.getPriceToTextBoxValue();
	}
	
	// set or select values
		public List<String> getPricesValues() {
			List<String> resultList = new ArrayList<>();
			List<WebElement> currencies = driver.findElements(By.cssSelector("#offers_table > tbody > tr:nth-child(1n+0) > td > table > tbody > tr:nth-child(1) > td.wwnormal.tright.td-price > div > p > strong"));
			for (WebElement option : currencies) {
				String allText = option.getText();
				int i = allText.lastIndexOf(" ");
				String resultValue = allText.substring(0, i);
				resultValue = resultValue.replaceAll("\\s+","");
				resultList.add(resultValue);
			}
			return resultList;
		}
	

}
