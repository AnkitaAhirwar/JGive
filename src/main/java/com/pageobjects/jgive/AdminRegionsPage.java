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
 * This is Page Class for Admin Regions. It contains all the elements and
 * actions related to Admin Regions.
 * 
 */

public class AdminRegionsPage extends BaseClass {

	private WebDriver driver;
	private static Logger log = Logger.getLogger(AdminRegionsPage.class);
	Select s;

	public AdminRegionsPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	/*
	 * Left menu locators
	 */

	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Regions')]")
	public WebElement regions;

	@FindBy(how = How.XPATH, using = "//button[@class='btn btn-small button-new btn-success']")
	public WebElement newbutton;

	/*
	 * Locators for Regions
	 */

	@FindBy(how = How.XPATH, using = "//input[@id='jform_region']")
	public WebElement regionsname;

	@FindBy(how = How.XPATH, using = "//input[@id='jform_region_3_code']")
	public WebElement threedigitcode;

	@FindBy(how = How.XPATH, using = "//input[@id='jform_region_code']")
	public WebElement twodigitcode;

	@FindBy(how = How.XPATH, using = "//select[@id='jform_country_id']")
	public WebElement country;

	@FindBy(how = How.XPATH, using = "//input[@id='jform_region_jtext']")
	public WebElement languageconstant;

	@FindBy(how = How.XPATH, using = "//button[@class='btn btn-small button-apply btn-success']")
	public WebElement save;

	@FindBy(how = How.XPATH, using = "//button[@class='btn btn-small button-save']")
	public WebElement saveclose;

	@FindBy(how = How.XPATH, using = "//button[@class='btn btn-small button-cancel']")
	public WebElement cancel;

	/*
	 * 
	 * Method for Regions
	 * 
	 */

	public AdminRegionsPage region(String region, String threedigit, String twodigit, String countryname,
			String language) throws Exception {

		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click();", regions); // Regions
		logger.pass("User click on the Regions");
		click(newbutton); // New button
		logger.pass("User click on the new button");
		enterValue(regionsname, region); // Region name
		logger.pass("User fetching region name from excelsheet");
		enterValue(threedigitcode, threedigit); // 3-digit Region code
		logger.pass("User fetching 3-digit region code from excelsheet");
		enterValue(twodigitcode, twodigit); // 2-digit Region code
		logger.pass("User fetching 2-digit region code from excelsheet");
		selectDropdown(country, countryname); // Country
		logger.pass("User fetching country from excelsheet");
		enterValue(languageconstant, language); // Region Language constant
		logger.pass("User fetching region language constant from excelsheet");
		click(cancel); // Cancel
		logger.pass("User click on cancel button");
		logger.pass("User added new Region in the list");
		System.out.println(" New Region Added in the list");
		return this;

	}

	/*
	 * 
	 * Method for Regions
	 * 
	 */

	public AdminRegionsPage region() throws Exception {

		try {
			if (!Constant.TESTDATAEXCEL.isEmpty())
				driver.get(Constant.TESTDATAEXCEL);
		} catch (Exception e) {
			ExcelUtils.setExcelFile(Constant.TESTDATAPATH, "Regions");
		}
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click();", regions); // Regions
		logger.pass("User click on the Regions");
		newbutton.click(); // New button
		logger.pass("User click on the new button");
		regionsname.sendKeys(ExcelUtils.getCellData(1, 1)); // Region name
		logger.pass("User fetching region name from excelsheet");
		threedigitcode.sendKeys(ExcelUtils.getCellData(1, 2)); // 3-digit Region code
		logger.pass("User fetching 3-digit region code from excelsheet");
		twodigitcode.sendKeys(ExcelUtils.getCellData(1, 3)); // 2-digit Region code
		logger.pass("User fetching 2-digit region code from excelsheet");
		s = new Select(country);
		s.selectByVisibleText(ExcelUtils.getCellData(1, 4)); // Country
		logger.pass("User fetching country from excelsheet");
		languageconstant.sendKeys(ExcelUtils.getCellData(1, 5)); // Region Language constant
		logger.pass("User fetching region language constant from excelsheet");
		cancel.click(); // Cancel
		logger.pass("User click on cancel button");
		logger.pass("User added new Region in the list");
		return this;

	}

}
