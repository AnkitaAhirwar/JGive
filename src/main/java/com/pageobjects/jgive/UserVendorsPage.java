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
 * This is Page Class for User Vendor Page. It contains all the elements and
 * actions related to User Vendor Page.
 * 
 */

public class UserVendorsPage extends BaseClass {

	private WebDriver driver;
	static Logger log = Logger.getLogger(UserVendorsPage.class);

	public UserVendorsPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	/*
	 * Locators for User Create Vendor
	 */

	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Create Vendor')]")
	public WebElement createvendor;

	@FindBy(how = How.CSS, using = "[href='/index.php/create-vendor/vendor?layout=edit&vendor_id=306&client=com_jgive']")
	public WebElement updatevendor;

	@FindBy(how = How.XPATH, using = "//input[@id='jform_vendor_title']")
	public WebElement vendortitle;

	@FindBy(how = How.XPATH, using = "//textarea[@id='jform_vendor_description']")
	public WebElement vendordesc;

	@FindBy(how = How.XPATH, using = "//input[@id='jform_phone_number']")
	public WebElement phonenum;

	@FindBy(how = How.XPATH, using = "//textarea[@id='jform_address']")
	public WebElement address;

	@FindBy(how = How.XPATH, using = "//*[@id=\"jform_country_chzn\"]/a/span")
	public WebElement countrydropdown;

	@FindBy(how = How.XPATH, using = "//div[@id='jform_country_chzn']//ul[@class='chzn-results']/li[.='India']")
	public WebElement country;

	@FindBy(how = How.XPATH, using = "//*[@id=\"jform_region_chzn\"]/a/span")
	public WebElement regiondropdown;

	@FindBy(how = How.XPATH, using = "//li[contains(text(),'Maharashtra')]")
	public WebElement region;

	@FindBy(how = How.XPATH, using = "//li[contains(text(),'Nagpur')]")
	public WebElement city;

	@FindBy(how = How.XPATH, using = "//*[@id=\"jform_city_chzn\"]/a/span")
	public WebElement citydropdown;

	@FindBy(how = How.XPATH, using = "//input[@id='jform_zip']")
	public WebElement zipcode;

	@FindBy(how = How.XPATH, using = "//input[@id='jform_website_address']")
	public WebElement websiteaddress;

	@FindBy(how = How.XPATH, using = "//input[@id='jform_vat_number']")
	public WebElement vatnumber;

	@FindBy(how = How.XPATH, using = "//input[@id='jform_vendor_logo']")
	public WebElement vendorlogo;

	@FindBy(how = How.XPATH, using = "//span[contains(text(),'Submit')]")
	public WebElement submit;

	@FindBy(how = How.XPATH, using = "//button[contains(text(),'Cancel')]")
	public WebElement cancel;

	/*
	 * 
	 * Method for Create Vendor
	 * 
	 */

	public UserVendorsPage createvendor() throws Exception {

		try {
			if (!Constant.TESTDATAEXCEL.isEmpty())
				driver.get(Constant.TESTDATAEXCEL);
		} catch (Exception e) {
			ExcelUtils.setExcelFile(Constant.TESTDATAPATH, "UVendor");
		}
		createvendor.click(); // Create Vendor
		logger.pass("User click on Create Vendor");
		updatevendor.click(); // Update Vendor
		logger.pass("User click on Update Vendor");
		vendortitle.clear();
		logger.pass("User clears vendor title");
		vendortitle.sendKeys(ExcelUtils.getCellData(1, 0)); // Vendor title
		logger.pass("User fetching vendor title from excelsheet");
		vendordesc.clear();
		logger.pass("User clears vendor description");
		vendordesc.sendKeys(ExcelUtils.getCellData(1, 2)); // Vendor description
		logger.pass("User fetching vendor description from excelsheet");
		phonenum.clear();
		logger.pass("User clears phone number");
		phonenum.sendKeys(ExcelUtils.getCellData(1, 3)); // Phone number
		logger.pass("User fetching phone number from excelsheet");
		address.clear();
		logger.pass("User clears address");
		address.sendKeys(ExcelUtils.getCellData(1, 4)); // Address
		logger.pass("User fetching address from excelsheet");
		countrydropdown.click(); // Country
		logger.pass("User click on country dropdown");
		country.click();
		logger.pass("User click on country");
		regiondropdown.click(); // Region
		logger.pass("User click on region dropdown");
		region.click();
		logger.pass("User click on region");
		citydropdown.click(); // City
		logger.pass("User click on city dropdown");
		city.click();
		logger.pass("User click on city");
		zipcode.clear();
		logger.pass("User clears zip code");
		zipcode.sendKeys(ExcelUtils.getCellData(1, 5)); // Zip code
		logger.pass("User fetching zip code address from excelsheet");
		websiteaddress.clear();
		logger.pass("User clears website address");
		websiteaddress.sendKeys(ExcelUtils.getCellData(1, 6)); // Website address
		logger.pass("User fetching website address from excelsheet");
		vatnumber.clear();
		logger.pass("User clears VAT number");
		vatnumber.sendKeys(ExcelUtils.getCellData(1, 7)); // VAT number
		logger.pass("User fetching VAT number from excelsheet");
		vendorlogo.sendKeys(Constant.DEFAULTSYSTEMPATH + ExcelUtils.getCellData(1, 1)); // Vendors image
		logger.pass("User fetching vendor logo from excelsheet");
		submit.click(); // Submit
		logger.pass("User click on submit button");
		return new UserVendorsPage(driver);

	}

}
