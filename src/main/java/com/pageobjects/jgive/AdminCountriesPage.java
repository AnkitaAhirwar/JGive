package com.pageobjects.jgive;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import com.config.jgive.BaseClass;
import com.utils.jgive.Constant;
import com.utils.jgive.ExcelUtils;

/**
 * This is Page Class for Admin Countries. It contains all the elements and
 * actions related to Admin Countries.
 * 
 */

public class AdminCountriesPage extends BaseClass {

	private WebDriver driver;
	private static Logger log = Logger.getLogger(AdminCountriesPage.class);

	public AdminCountriesPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	/*
	 * Left menu locators
	 */

	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Countries')]")
	public WebElement countries;

	@FindBy(how = How.XPATH, using = "//button[@class='btn btn-small button-new btn-success']")
	public WebElement newbutton;

	/*
	 * Locators for Countries
	 */

	@FindBy(how = How.XPATH, using = "//input[@id='jform_country']")
	public WebElement countryName;

	@FindBy(how = How.XPATH, using = "//input[@id='jform_country_3_code']")
	public WebElement threedigitcode;

	@FindBy(how = How.XPATH, using = "//input[@id='jform_country_code']")
	public WebElement twodigitcode;

	@FindBy(how = How.XPATH, using = "//input[@id='jform_country_jtext']")
	public WebElement languageconstant;

	@FindBy(how = How.XPATH, using = "//button[@class='btn btn-small button-apply btn-success']")
	public WebElement save;

	@FindBy(how = How.XPATH, using = "//button[@class='btn btn-small button-save']")
	public WebElement saveclose;

	@FindBy(how = How.XPATH, using = "//button[@class='btn btn-small button-cancel']")
	public WebElement cancel;

	/*
	 * 
	 * Methods for Countries
	 * 
	 */

	public AdminCountriesPage country(String countryname, String threedigit, String twodigit, String language)
			throws Exception {

		click(countries); // Countries
		logger.pass("User click on the Countries");
		click(newbutton); // New Button
		logger.pass("User click on new button");
		enterValue(countryName, countryname); // Country Name
		logger.pass("User fetching country name from excelsheet");
		enterValue(threedigitcode, threedigit); // 3-digit country code
		logger.pass("User fetching 3-digit country code from excelsheet");
		enterValue(twodigitcode, twodigit); // 2-digit country code
		logger.pass("User fetching 2-digit country code from excelsheet");
		enterValue(languageconstant, language); // Language constant
		logger.pass("User fetching country language constant from excelsheet");
		click(cancel); // Cancel
		logger.pass("User click on cancel button");
		logger.pass("User added new Country in the list");
		System.out.println(" New Country Added in the list");
		return this;

	}

	/*
	 * 
	 * Methods for Countries
	 * 
	 */

	public AdminCountriesPage country() throws Exception {

		try {
			if (!Constant.TESTDATAEXCEL.isEmpty())
				driver.get(Constant.TESTDATAEXCEL);
		} catch (Exception e) {
			ExcelUtils.setExcelFile(Constant.TESTDATAPATH, "Countries");
		}
		countries.click(); // Countries
		logger.pass("User click on the Countries");
		newbutton.click(); // New Button
		logger.pass("User click on new button");
		countryName.sendKeys(ExcelUtils.getCellData(1, 1)); // Country Name
		logger.pass("User fetching country name from excelsheet");
		threedigitcode.sendKeys(ExcelUtils.getCellData(1, 2)); // 3-digit country code
		logger.pass("User fetching 3-digit country code from excelsheet");
		twodigitcode.sendKeys(ExcelUtils.getCellData(1, 3)); // 2-digit country code
		logger.pass("User fetching 2-digit country code from excelsheet");
		languageconstant.sendKeys(ExcelUtils.getCellData(1, 4)); // Language constant
		logger.pass("User fetching country language constant from excelsheet");
		cancel.click(); // Cancel
		logger.pass("User click on cancel button");
		logger.pass("User added new Country in the list");
		return this;

	}

}
