package com.pageobjects.jgive;

import org.apache.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.config.jgive.BaseClass;
import com.utils.jgive.Constant;
import com.utils.jgive.ExcelUtils;

/**
 * This is Page Class for Admin Cities. It contains all the elements and actions
 * related to Admin Cities.
 * 
 */

public class AdminCitiesPage extends BaseClass {

	private WebDriver driver;
	private static Logger log = Logger.getLogger(AdminCitiesPage.class);
	Select s;

	public AdminCitiesPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	/*
	 * Left menu locators
	 */

	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Cities')]")
	public WebElement cities;

	@FindBy(how = How.XPATH, using = "//button[@class='btn btn-small button-new btn-success']")
	public WebElement newbutton;

	/*
	 * Locators for Cities
	 */

	@FindBy(how = How.XPATH, using = "//input[@id='jform_city']")
	public WebElement cityName;

	@FindBy(how = How.XPATH, using = "//select[@id='jform_country_id']")
	public WebElement country;

	@FindBy(how = How.XPATH, using = "//select[@id='jform_region_id']")
	public WebElement region;

	@FindBy(how = How.XPATH, using = "//input[@id='jform_city_jtext']")
	public WebElement languageconstant;

	@FindBy(how = How.XPATH, using = "//button[@class='btn btn-small button-apply btn-success']")
	public WebElement save;

	@FindBy(how = How.XPATH, using = "//button[@class='btn btn-small button-save']")
	public WebElement saveclose;

	@FindBy(how = How.XPATH, using = "//button[@class='btn btn-small button-cancel']")
	public WebElement cancel;

	/*
	 * 
	 * Method for Cities
	 * 
	 */

	public AdminCitiesPage cities(String city, String countryname, String regionname, String language)
			throws Exception {

		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click();", cities);
		logger.pass("User click on the Cities");
		click(newbutton);
		logger.pass("User click on the new button");
		enterValue(cityName, city);
		logger.pass("User fetching city name from excelsheet");
		selectDropdown(country, countryname);
		logger.pass("User fetching country from excelsheet");
		selectDropdown(region, regionname);
		logger.pass("User fetching region from excelsheet");
		enterValue(languageconstant, language);
		logger.pass("User fetching language constant from excelsheet");
		click(cancel);
		logger.pass("User click on the cancel button");
		logger.pass("User added new city in the list");
		System.out.println(" New city added in the list");
		return this;

	}

	/*
	 * 
	 * Method for Cities
	 * 
	 */

	public AdminCitiesPage cities() throws Exception {

		try {
			if (!Constant.TESTDATAEXCEL.isEmpty())
				driver.get(Constant.TESTDATAEXCEL);
		} catch (Exception e) {
			ExcelUtils.setExcelFile(Constant.TESTDATAPATH, "Cities");
		}
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click();", cities);
		logger.pass("User click on the Cities");
		newbutton.click();
		logger.pass("User click on the new button");
		cityName.sendKeys(ExcelUtils.getCellData(1, 1));
		logger.pass("User fetching city name from excelsheet");
		s = new Select(country);
		s.selectByVisibleText(ExcelUtils.getCellData(1, 2));
		logger.pass("User fetching country from excelsheet");
		s = new Select(region);
		s.selectByVisibleText(ExcelUtils.getCellData(1, 3));
		logger.pass("User fetching region from excelsheet");
		languageconstant.sendKeys(ExcelUtils.getCellData(1, 4));
		logger.pass("User fetching language constant from excelsheet");
		cancel.click();
		logger.pass("User click on the cancel button");
		logger.pass("User added new city in the list");
		System.out.println(" New city added in the list");
		return this;
		
	}

}
