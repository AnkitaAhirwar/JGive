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
 * This is Page Class for Organisational Donors. It contains all the elements
 * and actions related to Organisational Donors view.
 * 
 */

public class AdminOrganizationDonorPage extends BaseClass {

	private WebDriver driver;
	Select s;
	private static Logger log = Logger.getLogger(AdminOrganizationDonorPage.class);

	public AdminOrganizationDonorPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	/*
	 * Left menu locators
	 */

	@FindBy(how = How.XPATH, using = "//ul[@id=\"submenu\"]//a[contains(text(),'Organization Donors')]")
	public WebElement orgclick;

	@FindBy(how = How.XPATH, using = "//button[@class='btn btn-small button-new btn-success']")
	public WebElement newbutton;

	/*
	 * Locators for Organisational donors
	 */

	@FindBy(how = How.ID, using = "jform_name")
	public WebElement orgname;

	@FindBy(how = How.ID, using = "jform_website")
	public WebElement website;

	@FindBy(how = How.ID, using = "jform_email")
	public WebElement email;

	@FindBy(how = How.ID, using = "jform_phone")
	public WebElement orgphone;

	@FindBy(how = How.ID, using = "jform_contact_name")
	public WebElement contactperson;

	@FindBy(how = How.LINK_TEXT, using = "Address")
	public WebElement addresstab;

	@FindBy(how = How.ID, using = "jform_addr_line_1")
	public WebElement add1;

	@FindBy(how = How.ID, using = "jform_addr_line_2")
	public WebElement add2;

	@FindBy(how = How.XPATH, using = "//select[@id='jform_country']")
	public WebElement country;

	@FindBy(how = How.XPATH, using = "//select[@id='jform_state']")
	public WebElement state;

	@FindBy(how = How.XPATH, using = "//select[@id='jform_city']")
	public WebElement city;

	@FindBy(how = How.XPATH, using = "//input[@id='jform_other_city_check']")
	public WebElement othercity;

	@FindBy(how = How.XPATH, using = "//input[@id='jform_other_city_value']")
	public WebElement entercity;

	@FindBy(how = How.ID, using = "jform_zip")
	public WebElement zip;

	@FindBy(how = How.ID, using = "jform_taxnumber")
	public WebElement taxno;

	@FindBy(how = How.XPATH, using = "//button[@class='btn btn-small button-apply btn-success']")
	public WebElement save;

	@FindBy(how = How.XPATH, using = "//button[@class='btn btn-small button-save']")
	public WebElement saveclose;

	@FindBy(how = How.XPATH, using = "//button[@class='btn btn-small button-save-new']")
	public WebElement savenew;

	@FindBy(how = How.XPATH, using = "//button[@class='btn btn-small button-cancel']")
	public WebElement cancel;

	/*
	 * Locators for List View
	 */

	@FindBy(how = How.XPATH, using = "//input[@id='filter_search']")
	public WebElement search;

	@FindBy(how = How.XPATH, using = "//span[@class='icon-search']")
	public WebElement searchbutton;

	@FindBy(how = How.XPATH, using = "//button[@class='btn hasTooltip js-stools-btn-clear']")
	public WebElement clear;

	@FindBy(how = How.XPATH, using = "//tr[1]//td[2]//a[1]")
	public WebElement donorname;
	
	@FindBy(how = How.XPATH, using = "//select[@id='jform_vendor_id']")
	public WebElement selectvendor;

	/*
	 * 
	 * Method for Organizational Donors
	 * 
	 */

	public AdminOrganizationDonorPage organisationaldonor(String vendorname, String orgtitle, String websiteaddress,
			String emailaddress, String orgphonenum, String contactpeople, String address1, String address2,
			String countryname, String statename, String cityname, String newcity, String zipaddress, String taxnum)
			throws Exception {

		click(orgclick); // Organizational donors tab
		logger.pass("User click on the organisational donor");
		click(newbutton); // New Button
		logger.pass("User click on the new button of organisational donor");
		selectDropdown(selectvendor, vendorname);
		enterValue(orgname, orgtitle); // Organisation Name
		logger.pass("User fetching organisation name from excel sheet");
		enterValue(website, websiteaddress); // Website
		logger.pass("User fetching website from excel sheet");
		enterValue(email, emailaddress);
		logger.pass("User fetching email from excel sheet");
		enterValue(orgphone, orgphonenum); // Organisation Phone
		logger.pass("User fetching organisation phone from excel sheet");
		enterValue(contactperson, contactpeople); // Contact Person
		logger.pass("User fetching contact person from excel sheet");
		click(addresstab); // Address tab
		logger.pass("User click on address tab");
		enterValue(add1, address1); // Address1
		logger.pass("User fetching address1 from excel sheet");
		enterValue(add2, address2); // Address2
		logger.pass("User fetching address2 from excel sheet");
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,2500)", "");
		selectDropdown(country, countryname); // Country
		logger.pass("User selecting country");
		selectDropdown(state, statename); // State
		logger.pass("User selecting state");
		selectDropdown(city, cityname); // City
		logger.pass("User selecting city");
		click(othercity); // Othercity checkbox
		logger.pass("User clicking on othercity checkbox");
		enterValue(entercity, newcity); // Other city
		logger.pass("User fetching othercity from excel sheet");
		enterValue(zip, zipaddress); // Zip
		logger.pass("User fetching zip from excel sheet");
		enterValue(taxno, taxnum); // TaxNo.
		logger.pass("User fetching taxno. from excel sheet");
		click(saveclose);
		logger.pass("User click on save&close button");
		System.out.println(" Organizational Donor created successfully");
		logger.pass("Organizational Donor created successfully");
		return this;

	}

	/*
	 * 
	 * Method for Organizational Donors creation failed
	 * 
	 */

	public AdminOrganizationDonorPage organisationaldonorExpectingFailure(String vendorname, String orgtitle,
			String websiteaddress, String emailaddress, String orgphonenum, String contactpeople, String address1,
			String address2, String countryname, String statename, String cityname, String newcity, String zipaddress,
			String taxnum) throws Exception {

		click(orgclick); // Organizational donors tab
		logger.pass("User click on the organisational donor");
		click(newbutton); // New Button
		logger.pass("User click on the new button of organisational donor");
		selectDropdown(selectvendor, vendorname);
		enterValue(orgname, orgtitle); // Organisation Name
		logger.pass("User fetching organisation name from excel sheet");
		enterValue(website, websiteaddress); // Website
		logger.pass("User fetching website from excel sheet");
		enterValue(email, emailaddress);
		logger.pass("User fetching email from excel sheet");
		enterValue(orgphone, orgphonenum); // Organisation Phone
		logger.pass("User fetching organisation phone from excel sheet");
		enterValue(contactperson, contactpeople); // Contact Person
		logger.pass("User fetching contact person from excel sheet");
		click(addresstab); // Address tab
		logger.pass("User click on address tab");
		enterValue(add1, address1); // Address1
		logger.pass("User fetching address1 from excel sheet");
		enterValue(add2, address2); // Address2
		logger.pass("User fetching address2 from excel sheet");
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,2500)", "");
		selectDropdown(country, countryname); // Country
		logger.pass("User selecting country");
		selectDropdown(state, statename); // State
		logger.pass("User selecting state");
		selectDropdown(city, cityname); // City
		logger.pass("User selecting city");
		click(othercity); // Othercity checkbox
		logger.pass("User clicking on othercity checkbox");
		enterValue(entercity, newcity); // Other city
		logger.pass("User fetching othercity from excel sheet");
		enterValue(zip, zipaddress); // Zip
		logger.pass("User fetching zip from excel sheet");
		enterValue(taxno, taxnum); // TaxNo.
		logger.pass("User fetching taxno. from excel sheet");
		click(cancel);
		logger.pass("User click on save&close button");
		System.out.println(" Organizational Donor creation Failed");
		logger.pass("Organizational Donor creation Failed");
		return this;

	}

	/*
	 * 
	 * Method for Organisational Donors List View
	 * 
	 */

	public AdminOrganizationDonorPage listView(String orgtitle) throws Exception {

		click(orgclick); // Organisational Donors
		logger.pass("User click on the organisational donor");
		enterValue(search, orgtitle); // Search
		logger.pass("User fetching organisation name from excel sheet for searching in the list view");
		click(searchbutton); // Search button
		logger.pass("User click on search button");
		click(clear); // Clear
		logger.pass("User click on clear button");
		logger.pass("This is Organisational Donor List View ");
		System.out.println(" This is the list view for Organizational Donor");
		return this;

	}

	/*
	 * 
	 * Method for Organizational Donors
	 * 
	 */

	public AdminOrganizationDonorPage organisationaldonor() throws Exception {

		try {
			if (!Constant.TESTDATAEXCEL.isEmpty())
				driver.get(Constant.TESTDATAEXCEL);
		} catch (Exception e) {
			ExcelUtils.setExcelFile(Constant.TESTDATAPATH, "OrgDonors");
		}
		orgclick.click(); // Organisational donors tab
		logger.pass("User click on the organisational donor");
		newbutton.click(); // New Button
		logger.pass("User click on the new button of organisational donor");
		s = new Select(selectvendor);
		s.selectByVisibleText(ExcelUtils.getCellData(1, 13));
		orgname.sendKeys(ExcelUtils.getCellData(1, 0)); // Organisation Name
		logger.pass("User fetching organisation name from excel sheet");
		website.sendKeys(ExcelUtils.getCellData(1, 1)); // Website
		logger.pass("User fetching website from excel sheet");
		orgphone.sendKeys(ExcelUtils.getCellData(1, 3)); // Organisation Phone
		logger.pass("User fetching organisation phone from excel sheet");
		contactperson.sendKeys(ExcelUtils.getCellData(1, 4)); // Contact Person
		logger.pass("User fetching contact person from excel sheet");
		addresstab.click(); // Address tab
		logger.pass("User click on address tab");
		add1.sendKeys(ExcelUtils.getCellData(1, 5)); // Address1
		logger.pass("User fetching address1 from excel sheet");
		add2.sendKeys(ExcelUtils.getCellData(1, 6)); // Address2
		logger.pass("User fetching address2 from excel sheet");
		s = new Select(country);
		s.selectByVisibleText(ExcelUtils.getCellData(1, 10)); // Country
		logger.pass("User selecting country");
		s = new Select(state);
		s.selectByVisibleText(ExcelUtils.getCellData(1, 11)); // State
		logger.pass("User selecting state");
		s = new Select(city);
		s.selectByVisibleText(ExcelUtils.getCellData(1, 12)); // City
		logger.pass("User selecting city");
		othercity.click(); // Othercity checkbox
		logger.pass("User clicking on othercity checkbox");
		entercity.sendKeys(ExcelUtils.getCellData(1, 7)); // Other city
		logger.pass("User fetching othercity from excel sheet");
		zip.sendKeys(ExcelUtils.getCellData(1, 8)); // Zip
		logger.pass("User fetching zip from excel sheet");
		taxno.sendKeys(ExcelUtils.getCellData(1, 9)); // TaxNo.
		logger.pass("User fetching taxno. from excel sheet");
		saveclose.click();
		logger.pass("User click on save&close button");
		logger.pass("Organizational Donor created successfully");
		return this;

	}

	/*
	 * 
	 * Method for Organizational Donors creation failed
	 * 
	 */

	public AdminOrganizationDonorPage organisationaldonorExpectingFailure() throws Exception {

		try {
			if (!Constant.TESTDATAEXCEL.isEmpty())
				driver.get(Constant.TESTDATAEXCEL);
		} catch (Exception e) {
			ExcelUtils.setExcelFile(Constant.TESTDATAPATH, "OrgDonors");
		}
		orgclick.click(); // Organisational donors tab
		logger.pass("User click on the organisational donor");
		newbutton.click(); // New Button
		logger.pass("User click on the new button of organisational donor");
		s = new Select(selectvendor);
		s.selectByVisibleText(ExcelUtils.getCellData(1, 13));
		orgname.sendKeys(ExcelUtils.getCellData(1, 0)); // Organisation Name
		logger.pass("User fetching organisation name from excel sheet");
		website.sendKeys(ExcelUtils.getCellData(1, 1)); // Website
		logger.pass("User fetching website from excel sheet");
		orgphone.sendKeys(ExcelUtils.getCellData(1, 3)); // Organisation Phone
		logger.pass("User fetching organisation phone from excel sheet");
		contactperson.sendKeys(ExcelUtils.getCellData(1, 4)); // Contact Person
		logger.pass("User fetching contact person from excel sheet");
		addresstab.click(); // Address tab
		logger.pass("User click on address tab");
		add1.sendKeys(ExcelUtils.getCellData(1, 5)); // Address1
		logger.pass("User fetching address1 from excel sheet");
		add2.sendKeys(ExcelUtils.getCellData(1, 6)); // Address2
		logger.pass("User fetching address2 from excel sheet");
		s = new Select(country);
		s.selectByVisibleText(ExcelUtils.getCellData(1, 10)); // Country
		logger.pass("User selecting country");
		s = new Select(state);
		s.selectByVisibleText(ExcelUtils.getCellData(1, 11)); // State
		logger.pass("User selecting state");
		s = new Select(city);
		s.selectByVisibleText(ExcelUtils.getCellData(1, 12)); // City
		logger.pass("User selecting city");
		othercity.click(); // Other city checkbox
		logger.pass("User clicking on othercity checkbox");
		entercity.sendKeys(ExcelUtils.getCellData(1, 7)); // other city
		logger.pass("User fetching othercity from excel sheet");
		zip.sendKeys(ExcelUtils.getCellData(1, 8)); // Zip
		logger.pass("User fetching zip from excel sheet");
		taxno.sendKeys(ExcelUtils.getCellData(1, 9)); // TaxNo.
		logger.pass("User fetching taxno. from excel sheet");
		cancel.click();
		logger.pass("User click on save&close button");
		logger.pass("Organizational Donor creation Failed");
		return this;

	}

	/*
	 * 
	 * Method for Organisational Donors List View
	 * 
	 */

	public AdminOrganizationDonorPage listView() throws Exception {

		try {
			if (!Constant.TESTDATAEXCEL.isEmpty())
				driver.get(Constant.TESTDATAEXCEL);
		} catch (Exception e) {
			ExcelUtils.setExcelFile(Constant.TESTDATAPATH, "OrgDonors");
		}
		orgclick.click(); // Organisational Donors
		logger.pass("User click on the organisational donor");
		search.sendKeys(ExcelUtils.getCellData(1, 0)); // Search
		logger.pass("User fetching organisation name from excel sheet for searching in the list view");
		searchbutton.click(); // Search button
		logger.pass("User click on search button");
		clear.click(); // Clear
		logger.pass("User click on clear button");
		logger.pass("This is Organisational Donor List View ");
		return this;

	}

	public AdminOrganizationDonorPage edit() throws Exception {

		try {
			if (!Constant.TESTDATAEXCEL.isEmpty())
				driver.get(Constant.TESTDATAEXCEL);
		} catch (Exception e) {
			ExcelUtils.setExcelFile(Constant.TESTDATAPATH, "OrgDonors");
		}
		orgclick.click(); // Organisational Donors
		logger.pass("User click on the organisational donor");
		donorname.click(); // Donor name in list view
		logger.pass("User click on the organisational donor");
		orgname.clear(); // Organization name
		logger.pass("User clear the organisational name");
		orgname.sendKeys(ExcelUtils.getCellData(2, 0));
		logger.pass("User fetching organisation name from excelsheet");
		website.clear(); // Website
		logger.pass("User clear website name");
		website.sendKeys(ExcelUtils.getCellData(2, 1));
		logger.pass("User fetching website from excelsheet");
		addresstab.click();// Address Tab
		logger.pass("User click on the address tab");
		add1.clear(); // Address line 1
		logger.pass("User clear address line 1");
		add1.sendKeys(ExcelUtils.getCellData(2, 5));
		logger.pass("User fetching address line 1 from excelsheet ");
		saveclose.click();// Save&Close button
		logger.pass("User click on the save&close button");
		logger.pass("Edited form of selected Organisational Donor saved successfully");
		return new AdminOrganizationDonorPage(driver);

	}

}
