package com.pageobjects.jgive;

import org.apache.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.config.jgive.BaseClass;
import com.utils.jgive.Constant;
import com.utils.jgive.ExcelUtils;

/**
 * This is Page Class for Vendors. It contains all the elements and actions
 * related to Vendors view.
 * 
 */

public class AdminVendorsPage extends BaseClass {

	private WebDriver driver;
	private static Logger log = Logger.getLogger(AdminVendorsPage.class);

	public AdminVendorsPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	/*
	 * Left menu locators
	 */

	@FindBy(how = How.XPATH, using = "//ul[@id=\"submenu\"]//a[contains(text(),'Vendors')]")
	public WebElement vendor;

	@FindBy(how = How.XPATH, using = "//button[@class='btn btn-small button-new btn-success']")
	public WebElement vendornewbutton;

	/*
	 * Locators for Vendors
	 */

	@FindBy(how = How.XPATH, using = "//button[@class='btn btn-primary button-select']")
	public WebElement unbutton;

	@FindBy(how = How.XPATH, using = "//div[@id='userModal_jform_user_id']//iframe[@name='field-user-modal']")
	public WebElement iframe;

	@FindBy(how = How.XPATH, using = "//a[contains(text(),'rashmi')]")
	public WebElement seluser;

	@FindBy(how = How.XPATH, using = "//input[@id='jform_vendor_title']")
	public WebElement vendtitle;

	@FindBy(how = How.XPATH, using = "//*[@id=\"jform_state_chzn\"]/a/span")
	public WebElement statusdropdown;

	@FindBy(how = How.XPATH, using = "//li[contains(text(),'Published')]")
	public WebElement status;

	@FindBy(how = How.XPATH, using = "//input[@id='jform_vendor_logo']")
	public WebElement vendorimage;

	@FindBy(how = How.XPATH, using = "//button[@class='btn btn-small button-save']")
	public WebElement saveclose;

	@FindBy(how = How.XPATH, using = "//button[@class='btn btn-small button-cancel']")
	public WebElement cancelbtn;

	@FindBy(how = How.CSS, using = "[href='/administrator/index.php?option=com_tjvendors&view=vendorfees&vendor_id=306&client=com_jgive']")
	public WebElement fees;

	@FindBy(how = How.XPATH, using = "//button[@class='btn btn-small button-new btn-success']")
	public WebElement feesnewbutton;

	@FindBy(how = How.XPATH, using = "//input[@id='jform_currency']")
	public WebElement currency;

	@FindBy(how = How.XPATH, using = "//input[@id='jform_percent_commission']")
	public WebElement percentcomm;

	@FindBy(how = How.XPATH, using = "//button[@class='btn btn-small button-save']")
	public WebElement feessaveclose;

	@FindBy(how = How.LINK_TEXT, using = "Payouts")
	public WebElement payouts;

	@FindBy(how = How.XPATH, using = "//a[@class='validate btn btn-primary']")
	public WebElement payclick;

	@FindBy(how = How.XPATH, using = "//input[@id='jform_reference_order_id']")
	public WebElement refid;

	@FindBy(how = How.XPATH, using = "//*[@id=\"jform_status\"]/label[1]")
	public WebElement paystatus;

	@FindBy(how = How.XPATH, using = "//button[@id='pay-confirmation']")
	public WebElement finalpay;

	@FindBy(how = How.XPATH, using = "//input[@name='checkall-toggle']")
	public WebElement checkbox;

	@FindBy(how = How.XPATH, using = "//button[@class='btn btn-small button-delete']")
	public WebElement deletebutton;

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

	@FindBy(how = How.XPATH, using = "//*[@id=\"jform_city_chzn\"]/a/span")
	public WebElement citydropdown;

	@FindBy(how = How.XPATH, using = "//li[contains(text(),'Nagpur')]")
	public WebElement city;

	@FindBy(how = How.XPATH, using = "//input[@id='jform_other_city']")
	public WebElement citycheckbox;

	@FindBy(how = How.XPATH, using = "//input[@id='jform_option_city']")
	public WebElement othercity;

	@FindBy(how = How.XPATH, using = "//input[@id='jform_phone_number']")
	public WebElement phone;

	@FindBy(how = How.XPATH, using = "//input[@id='jform_website_address']")
	public WebElement website;

	@FindBy(how = How.XPATH, using = "//input[@id='jform_zip']")
	public WebElement zip;

	@FindBy(how = How.XPATH, using = "//input[@id='jform_vat_number']")
	public WebElement vatnumber;

	@FindBy(how = How.XPATH, using = "//textarea[@id='jform_vendor_description']")
	public WebElement description;

	@FindBy(how = How.XPATH, using = "//*[@id=\"filter_search\"]")
	public WebElement filtersearch;

	@FindBy(how = How.XPATH, using = "//i[@class='icon-search']")
	public WebElement searchicon;

	@FindBy(how = How.XPATH, using = "//i[@class='icon-remove']")
	public WebElement clear;

	@FindBy(how = How.XPATH, using = "//button[@class='btn btn-small button-edit']")
	public WebElement edit;

	@FindBy(how = How.XPATH, using = "//button[@class='btn btn-small button-delete']")
	public WebElement delete;

	@FindBy(how = How.XPATH, using = "//button[@class='btn btn-small button-publish']")
	public WebElement publish;

	@FindBy(how = How.XPATH, using = "//button[@class='btn btn-small button-unpublish']")
	public WebElement unpublish;

	/*
	 * 
	 * Method for Vendor Creation
	 * 
	 */

	public AdminVendorsPage vendorcreation(String vendortitle, String vendordesc, String image, String phonenum,
			String add, String zipaddress, String websiteaddress, String vatno, String vendorcurrency,
			String commissioninpercent) throws Exception {

		click(vendor); // Click on the Vendors
		logger.pass("User click on Vendors");
		click(vendornewbutton); // Click on New Button
		logger.pass("User click on the new button");
		click(unbutton); // UserName Button
		logger.pass("User click on the username button");
		driver.switchTo().frame(iframe);
		click(seluser); // Select User
		logger.pass("User select username");
		driver.navigate().refresh();
		clearAndEnterValue(vendtitle, vendortitle);
		driver.navigate().refresh();
		click(statusdropdown); // Dropdown list
		logger.pass("User click on the dropdown button");
		click(status); // Status
		logger.pass("User click on the status for vendor");
		clearAndEnterValue(description, vendordesc); // Description
		logger.pass("User fetching Description from excelsheet");
		enterValue(vendorimage, Constant.DEFAULTSYSTEMPATH + image); // Vendors image
		logger.pass("User fetching vendor image from excelsheet");
		clearAndEnterValue(phone, phonenum); // Phone Number
		logger.pass("User fetching phone from excelsheet");
		clearAndEnterValue(address, add); // Address
		logger.pass("User fetching address from excelsheet");
		click(countrydropdown); // Country
		logger.pass("User click on country dropdown");
		click(country);
		logger.pass("User selects country from dropdown");
		click(regiondropdown); // Region
		logger.pass("User click on region dropdown");
		click(region);
		logger.pass("User selects region from dropdown");
		click(citydropdown); // City
		logger.pass("User click on city dropdown");
		click(city);
		logger.pass("User selects city from dropdown");
		clearAndEnterValue(zip, zipaddress); // Zip
		logger.pass("User fetching zip from excelsheet");
		clearAndEnterValue(website, websiteaddress); // Website
		logger.pass("User fetching website from excelsheet");
		clearAndEnterValue(vatnumber, vatno); // VAT Number
		logger.pass("User fetching VAT Number from excelsheet");
		click(saveclose); // Save and close Vendor Creation
		logger.pass("User click on the save&close button");
		logger.pass("Vendor created Successfully");
		return this;

	}

	/*
	 * 
	 * Method for Vendor Creation Failed
	 * 
	 */

	public AdminVendorsPage vendorcreationExpectingFailure(String vendortitle, String vendordesc, String image,
			String phonenum, String add, String zipaddress, String websiteaddress, String vatno, String vendorcurrency,
			String commissioninpercent) throws Exception {

		click(vendor); // Click on the Vendors
		logger.pass("User click on Vendors");
		click(vendornewbutton); // Click on New Button
		logger.pass("User click on the new button");
		click(unbutton); // UserName Button
		logger.pass("User click on the username button");
		driver.switchTo().frame(iframe);
		click(seluser); // Select User
		logger.pass("User select username");
		driver.navigate().refresh();
		clearAndEnterValue(vendtitle, vendortitle);
		driver.navigate().refresh();
		click(statusdropdown); // Dropdown list
		logger.pass("User click on the dropdown button");
		click(status); // Status
		logger.pass("User click on the status for vendor");
		clearAndEnterValue(description, vendordesc); // Description
		logger.pass("User fetching Description from excelsheet");
		enterValue(vendorimage, Constant.DEFAULTSYSTEMPATH + image); // Vendors image
		logger.pass("User fetching vendor image from excelsheet");
		clearAndEnterValue(phone, phonenum); // Phone Number
		logger.pass("User fetching phone from excelsheet");
		clearAndEnterValue(address, add); // Address
		logger.pass("User fetching address from excelsheet");
		click(countrydropdown); // Country
		logger.pass("User click on country dropdown");
		click(country);
		logger.pass("User selects country from dropdown");
		click(regiondropdown); // Region
		logger.pass("User click on region dropdown");
		click(region);
		logger.pass("User selects region from dropdown");
		click(citydropdown); // City
		logger.pass("User click on city dropdown");
		click(city);
		logger.pass("User selects city from dropdown");
		clearAndEnterValue(zip, zipaddress); // Zip
		logger.pass("User fetching zip from excelsheet");
		clearAndEnterValue(website, websiteaddress); // Website
		logger.pass("User fetching website from excelsheet");
		clearAndEnterValue(vatnumber, vatno); // VAT Number
		logger.pass("User fetching VAT Number from excelsheet");
		click(cancelbtn); // Save and close Vendor Creation
		logger.pass("User click on the save&close button");
		logger.pass("Vendor creation Failed");
		return this;

	}

	/*
	 * 
	 * Method for Vendor Creation
	 * 
	 */

	public AdminVendorsPage vendorcreation() throws Exception {

		try {
			if (!Constant.TESTDATAEXCEL.isEmpty())
				driver.get(Constant.TESTDATAEXCEL);
		} catch (Exception e) {
			ExcelUtils.setExcelFile(Constant.TESTDATAPATH, "Vendors");
		}
		vendor.click(); // Click on the Vendors
		logger.pass("User click on Vendors");
		vendornewbutton.click(); // Click on New Button
		logger.pass("User click on the new button");
		unbutton.click(); // UserName Button
		logger.pass("User click on the username button");
		driver.switchTo().frame(iframe);
		seluser.click(); // Select User
		logger.pass("User select username");
		driver.navigate().refresh();
		statusdropdown.click(); // Dropdown list
		logger.pass("User click on the dropdown button");
		status.click(); // Status
		logger.pass("User click on the status for vendor");
		description.clear();
		description.sendKeys(ExcelUtils.getCellData(1, 12)); // Description
		logger.pass("User fetching Description from excelsheet");
		vendorimage.sendKeys(Constant.DEFAULTSYSTEMPATH + ExcelUtils.getCellData(1, 3)); // Vendors image
		logger.pass("User fetching vendor image from excelsheet");
		phone.clear();
		phone.sendKeys(ExcelUtils.getCellData(1, 4)); // Phone Number
		logger.pass("User fetching phone from excelsheet");
		address.clear();
		address.sendKeys(ExcelUtils.getCellData(1, 5));// Address
		logger.pass("User fetching address from excelsheet");
		countrydropdown.click(); // Country
		logger.pass("User click on country dropdown");
		country.click();
		logger.pass("User selects country from dropdown");
		regiondropdown.click(); // Region
		logger.pass("User click on region dropdown");
		region.click();
		logger.pass("User selects region from dropdown");
		citydropdown.click(); // City
		logger.pass("User click on city dropdown");
		city.click();
		logger.pass("User selects city from dropdown");
		zip.clear();
		zip.sendKeys(ExcelUtils.getCellData(1, 9)); // Zip
		logger.pass("User fetching zip from excelsheet");
		website.clear();
		website.sendKeys(ExcelUtils.getCellData(1, 10)); // Website
		logger.pass("User fetching website from excelsheet");
		vatnumber.clear();
		vatnumber.sendKeys(ExcelUtils.getCellData(1, 11)); // VAT Number
		logger.pass("User fetching VAT Number from excelsheet");
		saveclose.click(); // Save and close Vendor Creation
		logger.pass("User click on the save&close button");
		logger.pass("Vendor created Successfully");
		return this;

	}

	/*
	 * 
	 * Method for Vendor Fees
	 * 
	 */

	public AdminVendorsPage fees() throws Exception {

		try {
			if (!Constant.TESTDATAEXCEL.isEmpty())
				driver.get(Constant.TESTDATAEXCEL);
		} catch (Exception e) {
			ExcelUtils.setExcelFile(Constant.TESTDATAPATH, "Vendors");
		}
		vendor.click(); // Click on the Vendors
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click();", fees); // Fees
		logger.pass("User click on the fees button");
		feesnewbutton.click(); // Fees New Button
		logger.pass("User click on the fees new button");
		currency.sendKeys(ExcelUtils.getCellData(1, 1)); // Currency
		logger.pass("User fetching currency from excelsheet");
		percentcomm.sendKeys(ExcelUtils.getCellData(1, 2)); // Percent Commission
		logger.pass("User fetching percent commission from excelsheet");
		cancelbtn.click(); // Fees Save&Close
		logger.pass("User click on save&close button");
		logger.pass("Fees Saved Successfully");
		return this;

	}

	/*
	 * 
	 * Method for Vendor Creation Failed
	 * 
	 */

	public AdminVendorsPage vendorcreationExpectingFailure() throws Exception {

		try {
			if (!Constant.TESTDATAEXCEL.isEmpty())
				driver.get(Constant.TESTDATAEXCEL);
		} catch (Exception e) {
			ExcelUtils.setExcelFile(Constant.TESTDATAPATH, "Vendors");
		}
		vendor.click(); // Click on the Vendors
		logger.pass("User click on Vendors");
		vendornewbutton.click(); // Click on New Button
		logger.pass("User click on the new button");
		unbutton.click(); // UserName Button
		logger.pass("User click on the username button");
		driver.switchTo().frame(iframe);
		seluser.click(); // Select User
		logger.pass("User select username");
		driver.navigate().refresh();
		statusdropdown.click(); // Dropdown list
		logger.pass("User click on the dropdown button");
		status.click(); // Status
		logger.pass("User click on the status for vendor");
		description.clear();
		description.sendKeys(ExcelUtils.getCellData(1, 12)); // Description
		logger.pass("User fetching Description from excelsheet");
		vendorimage.sendKeys(Constant.DEFAULTSYSTEMPATH + ExcelUtils.getCellData(1, 3)); // Vendors image
		logger.pass("User fetching vendor image from excelsheet");
		phone.clear();
		phone.sendKeys(ExcelUtils.getCellData(1, 4)); // Phone Number
		logger.pass("User fetching phone from excelsheet");
		address.clear();
		address.sendKeys(ExcelUtils.getCellData(1, 5));// Address
		countrydropdown.click(); // Country
		logger.pass("User click on country dropdown");
		country.click();
		logger.pass("User selects country from dropdown");
		regiondropdown.click(); // Region
		logger.pass("User click on region dropdown");
		region.click();
		logger.pass("User selects region from dropdown");
		citydropdown.click(); // City
		logger.pass("User click on city dropdown");
		city.click();
		logger.pass("User fetching address from excelsheet");
		zip.clear();
		zip.sendKeys(ExcelUtils.getCellData(1, 9)); // Zip
		logger.pass("User fetching zip from excelsheet");
		website.clear();
		website.sendKeys(ExcelUtils.getCellData(1, 10)); // Website
		logger.pass("User fetching website from excelsheet");
		vatnumber.clear();
		vatnumber.sendKeys(ExcelUtils.getCellData(1, 11)); // VAT Number
		logger.pass("User fetching VAT Number from excelsheet");
		logger.pass("User click on the status for vendor");
		cancelbtn.click(); // Save and close Vendor Creation
		logger.pass("User click on the save&close button");
		logger.pass("Vendor creation Failed");
		return this;

	}

}
