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
 * This is Page Class for Individual Donors. It contains all the elements and
 * actions related to Individual Donors view.
 * 
 */

public class AdminIndividualDonorPage extends BaseClass {

	private WebDriver driver;
	Select s;
	private static Logger log = Logger.getLogger(AdminIndividualDonorPage.class);

	public AdminIndividualDonorPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	/*
	 * Left menu locators
	 */

	@FindBy(how = How.XPATH, using = "//ul[@id=\"submenu\"]//a[contains(text(),'Individual Donors')]")
	public WebElement indidonorclick;

	@FindBy(how = How.XPATH, using = "//*[@id=\"toolbar-new\"]/button")
	public WebElement newbutton;

	/*
	 * Locators for individual donors
	 */

	@FindBy(how = How.ID, using = "jform_first_name")
	public WebElement fn;

	@FindBy(how = How.ID, using = "jform_last_name")
	public WebElement ln;

	@FindBy(how = How.ID, using = "jform_email")
	public WebElement email;

	@FindBy(how = How.ID, using = "jform_phone")
	public WebElement phone;

	@FindBy(how = How.ID, using = "jform_create_user")
	public WebElement createuser;

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
	
	@FindBy(how = How.XPATH, using = "//select[@id='jform_vendor_id']")
	public WebElement selectvendor;

	@FindBy(how = How.CSS, using = "input[name='checkall-toggle']")
	public WebElement checkall;

	@FindBy(how = How.CSS, using = ".button-delete")
	public WebElement deletebutton;

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

	@FindBy(how = How.XPATH, using = "//button[@class='btn btn-small button-edit']")
	public WebElement editbutton;

	/*
	 * Locators for List View
	 */

	@FindBy(how = How.XPATH, using = "//input[@id='filter_search']")
	public WebElement search;

	@FindBy(how = How.XPATH, using = "//span[@class='icon-search']")
	public WebElement searchbutton;

	@FindBy(how = How.XPATH, using = "//button[@class='btn hasTooltip js-stools-btn-clear']")
	public WebElement clear;

	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Utkarsha')]")
	public WebElement donorname;

	/*
	 * 
	 * Method for individual donors
	 * 
	 */

	public AdminIndividualDonorPage individualDonor(String vendorname, String firstname, String lastname,
			String emailaddress, String phonenum, String address1, String address2, String countryname,
			String statename, String cityname, String newcity, String zipaddress, String taxnum, String searchname)
			throws Exception {

		click(indidonorclick); // Individual donors tab
		logger.pass("User click on the individual donor");
		click(newbutton); // New Button
		logger.pass("User click on the new button of individual donor");
		selectDropdown(selectvendor, vendorname);
		enterValue(fn, firstname); // First Name
		logger.pass("User fetching first name from excelsheet");
		enterValue(ln, lastname); // Last Name
		logger.pass("User fetching last name from excelsheet");
		enterValue(email, emailaddress); // Email Address
		logger.pass("User fetching email address from excelsheet");
		enterValue(phone, phonenum); // Phone
		logger.pass("User fetching phone from excelsheet");
		click(addresstab); // Address tab
		logger.pass("User click on address tab");
		enterValue(add1, address1); // Address1
		logger.pass("User fetching address1 from excelsheet");
		enterValue(add2, address2); // Address2
		logger.pass("User fetching address2 from excelsheet");
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,2500)", "");
		selectDropdown(country, countryname); // Country
		logger.pass("User selecting country");
		selectDropdown(state, statename); // State
		logger.pass("User selecting state");
		selectDropdown(city, cityname); // city
		logger.pass("User selecting city");
		click(othercity); // Other city checkbox
		logger.pass("User clicking on other city checkbox");
		enterValue(entercity, newcity); // Other city
		logger.pass("User fetching othercity from excelsheet");
		enterValue(zip, zipaddress); // Zip
		logger.pass("User fetching zip from excelsheet");
		enterValue(taxno, taxnum); // Taxno.
		logger.pass("User fetching taxno. from excelsheet");
		click(saveclose); // Save&close
		logger.pass("User click on the save&close button");
		logger.pass("Individual Donor created successfully");
		System.out.println(" Individual Donor created successfully");
		enterValue(search, searchname); // Search
		logger.pass("User fetching individual donor from excelsheet");
		click(searchbutton); // Search button
		logger.pass("User click on search button");
		click(checkall); // Checkall button
		logger.pass("User click on check all button");
		click(deletebutton); // Delete button
		logger.pass("User click on delete button");
		driver.switchTo().alert().accept();
		click(clear); // Clear
		logger.pass("User click on clear button");
		logger.pass("Individual Donor Deleted Successfully");
		return this;

	}

	/*
	 * 
	 * Method for individual donors creation failed
	 * 
	 */

	public AdminIndividualDonorPage individualDonorExpectingFailure(String vendorname, String firstname,
			String lastname, String emailaddress, String phonenum, String address1, String address2, String countryname,
			String statename, String cityname, String newcity, String zipaddress, String taxnum) throws Exception {

		click(indidonorclick); // Individual donors tab
		logger.pass("User click on the individual donor");
		click(newbutton); // New Button
		logger.pass("User click on the new button of individual donor");
		selectDropdown(selectvendor, vendorname);
		enterValue(fn, firstname); // First Name
		logger.pass("User fetching first name from excelsheet");
		enterValue(ln, lastname); // Last Name
		logger.pass("User fetching last name from excelsheet");
		enterValue(email, emailaddress); // Email Address
		logger.pass("User fetching email address from excelsheet");
		enterValue(phone, phonenum); // Phone
		logger.pass("User fetching phone from excelsheet");
		click(addresstab); // Address tab
		logger.pass("User click on address tab");
		enterValue(add1, address1); // Address1
		logger.pass("User fetching address1 from excelsheet");
		enterValue(add2, address2); // Address2
		logger.pass("User fetching address2 from excelsheet");
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,2500)", "");
		selectDropdown(country, countryname); // Country
		logger.pass("User selecting country");
		selectDropdown(state, statename); // State
		logger.pass("User selecting state");
		selectDropdown(city, cityname); // city
		logger.pass("User selecting city");
		click(othercity); // Other city checkbox
		logger.pass("User clicking on other city checkbox");
		enterValue(entercity, newcity); // Other city
		logger.pass("User fetching othercity from excelsheet");
		enterValue(zip, zipaddress); // Zip
		logger.pass("User fetching zip from excelsheet");
		enterValue(taxno, taxnum); // Taxno.
		logger.pass("User fetching taxno. from excelsheet");
		logger.pass("User fetching taxno. from excelsheet");
		click(cancel);
		logger.pass("User click on the save&close button");
		logger.pass("Individual Donor creation Failed");
		System.out.println(" Individual Donor creation Failed");
		return this;

	}

	public AdminIndividualDonorPage listView(String searchname) {

		click(indidonorclick); // Individual donors tab
		enterValue(search, searchname); // Search
		logger.pass("User fetching individual donor from excelsheet");
		click(searchbutton); // Search button
		logger.pass("User click on search button");
		click(clear); // Clear
		logger.pass("User click on clear button");
		logger.pass("This is Individual Donor List View");
		System.out.println(" This is Individual Donor List View");
		return this;

	}

	/*
	 * 
	 * Method for individual donors
	 * 
	 */

	public AdminIndividualDonorPage individualDonor() throws Exception {

		try {
			if (!Constant.TESTDATAEXCEL.isEmpty())
				driver.get(Constant.TESTDATAEXCEL);
		} catch (Exception e) {
			ExcelUtils.setExcelFile(Constant.TESTDATAPATH, "IndividualDonors");
		}
		indidonorclick.click(); // Individual donors tab
		logger.pass("User click on the individual donor");
		newbutton.click(); // New Button
		logger.pass("User click on the new button of individual donor");
		s = new Select(selectvendor);
		s.selectByVisibleText(ExcelUtils.getCellData(1, 12));
		fn.sendKeys(ExcelUtils.getCellData(1, 0)); // First Name
		logger.pass("User fetching first name from excelsheet");
		ln.sendKeys(ExcelUtils.getCellData(1, 1)); // Last Name
		logger.pass("User fetching last name from excelsheet");
		phone.sendKeys(ExcelUtils.getCellData(1, 2)); // Phone
		logger.pass("User fetching phone from excelsheet");
		addresstab.click(); // Address tab
		logger.pass("User click on address tab");
		add1.sendKeys(ExcelUtils.getCellData(1, 3)); // Address1
		logger.pass("User fetching address1 from excelsheet");
		add2.sendKeys(ExcelUtils.getCellData(1, 4)); // Address2
		logger.pass("User fetching address2 from excelsheet");
		s = new Select(country);
		s.selectByVisibleText(ExcelUtils.getCellData(1, 9)); // Country
		logger.pass("User selecting country");
		s = new Select(state);
		s.selectByVisibleText(ExcelUtils.getCellData(1, 10)); // State
		logger.pass("User selecting state");
		s = new Select(city);
		s.selectByVisibleText(ExcelUtils.getCellData(1, 11)); // city
		logger.pass("User selecting city");
		othercity.click(); // Other city checkbox
		logger.pass("User clicking on other city checkbox");
		entercity.sendKeys(ExcelUtils.getCellData(1, 5)); // Other city
		logger.pass("User fetching othercity from excelsheet");
		zip.sendKeys(ExcelUtils.getCellData(1, 6)); // Zip
		logger.pass("User fetching zip from excelsheet");
		taxno.sendKeys(ExcelUtils.getCellData(1, 7)); // Taxno.
		logger.pass("User fetching taxno. from excelsheet");
		save.click(); // Save
		logger.pass("User click on the savebutton");
		saveclose.click(); // Save&close
		logger.pass("User click on the save&close button");
		logger.pass("Individual Donor created successfully");
		return this;

	}

	/*
	 * 
	 * Method for Individual Donors Deletion
	 * 
	 */

	public AdminIndividualDonorPage deleteDonor() throws Exception {

		try {
			if (!Constant.TESTDATAEXCEL.isEmpty())
				driver.get(Constant.TESTDATAEXCEL);
		} catch (Exception e) {
			ExcelUtils.setExcelFile(Constant.TESTDATAPATH, "IndividualDonors");
		}
		indidonorclick.click(); // individual donors tab
		logger.pass("User click on the individual donor");
		search.sendKeys(ExcelUtils.getCellData(1, 0)); // Search
		logger.pass("User fetching individual donor from excelsheet");
		searchbutton.click(); // Search button
		logger.pass("User click on search button");
		checkall.click(); // Checkall button
		logger.pass("User click on check all button");
		deletebutton.click(); // Delete button
		logger.pass("User click on delete button");
		driver.switchTo().alert().accept();
		clear.click(); // Clear
		logger.pass("User click on clear button");
		logger.pass("Individual Donor Deleted Successfully");
		return this;

	}

	/*
	 * 
	 * Method for individual donors creation failed
	 * 
	 */

	public AdminIndividualDonorPage individualDonorExpectingFailure() throws Exception {

		try {
			if (!Constant.TESTDATAEXCEL.isEmpty())
				driver.get(Constant.TESTDATAEXCEL);
		} catch (Exception e) {
			ExcelUtils.setExcelFile(Constant.TESTDATAPATH, "IndividualDonors");
		}
		indidonorclick.click(); // individual donors tab
		logger.pass("User click on the individual donor");
		newbutton.click(); // New button
		logger.pass("User click on the new button of individual donor");
		s = new Select(selectvendor);
		s.selectByVisibleText(ExcelUtils.getCellData(1, 12));
		fn.sendKeys(ExcelUtils.getCellData(1, 0)); // First Name
		logger.pass("User fetching first name from excelsheet");
		ln.sendKeys(ExcelUtils.getCellData(1, 1)); // Last Name
		logger.pass("User fetching last name from excelsheet");
		email.sendKeys(ExcelUtils.getCellData(1, 8)); // Email
		logger.pass("User fetching email from excelsheet");
		phone.sendKeys(ExcelUtils.getCellData(1, 2)); // Phone
		logger.pass("User fetching phone from excelsheet");
		addresstab.click(); // Address tab
		logger.pass("User click on address tab");
		add1.sendKeys(ExcelUtils.getCellData(1, 3)); // Address1
		logger.pass("User fetching address1 from excelsheet");
		add2.sendKeys(ExcelUtils.getCellData(1, 4)); // Address2
		logger.pass("User fetching address2 from excelsheet");
		s = new Select(country);
		s.selectByVisibleText(ExcelUtils.getCellData(1, 9)); // Country
		logger.pass("User selecting country");
		s = new Select(state);
		s.selectByVisibleText(ExcelUtils.getCellData(1, 10)); // State
		logger.pass("User selecting state");
		s = new Select(city);
		s.selectByVisibleText(ExcelUtils.getCellData(1, 11)); // City
		logger.pass("User selecting city");
		othercity.click(); // Other city checkbox
		logger.pass("User clicking on other city checkbox");
		entercity.sendKeys(ExcelUtils.getCellData(1, 5)); // other city
		logger.pass("User fetching othercity from excelsheet");
		zip.sendKeys(ExcelUtils.getCellData(1, 6)); // Zip
		logger.pass("User fetching zip from excelsheet");
		taxno.sendKeys(ExcelUtils.getCellData(1, 7)); // Taxno.
		logger.pass("User fetching taxno. from excelsheet");
		cancel.click();
		logger.pass("User click on the save&close button");
		logger.pass("Individual Donor creation Failed");
		return this;

	}

	/*
	 * 
	 * Method for Individual Donors List View
	 * 
	 */

	public AdminIndividualDonorPage listView() throws Exception {

		try {
			if (!Constant.TESTDATAEXCEL.isEmpty())
				driver.get(Constant.TESTDATAEXCEL);
		} catch (Exception e) {
			ExcelUtils.setExcelFile(Constant.TESTDATAPATH, "IndividualDonors");
		}
		indidonorclick.click(); // Individual Donors
		logger.pass(" User click on Individual Donor");
		search.sendKeys(ExcelUtils.getCellData(3, 0)); // Search
		logger.pass("User fetching individual donor from excelsheet for searching in list view");
		searchbutton.click(); // Search button
		logger.pass("User click on search button");
		clear.click(); // Clear
		logger.pass("User click on clear button");
		logger.pass("This is Individual Donor List View");
		return this;

	}

	public AdminIndividualDonorPage edit() throws Exception {

		try {
			if (!Constant.TESTDATAEXCEL.isEmpty())
				driver.get(Constant.TESTDATAEXCEL);
		} catch (Exception e) {
			ExcelUtils.setExcelFile(Constant.TESTDATAPATH, "IndividualDonors");
		}
		indidonorclick.click(); // Individual donors tab
		logger.pass(" User click on Individual Donor");
		donorname.click(); // Donor name on list view
		logger.pass(" User click on Donor name");
		fn.clear(); // First Name
		logger.pass(" User clear first name");
		fn.sendKeys(ExcelUtils.getCellData(2, 0));
		logger.pass(" User fetching donor name from excelsheet");
		phone.clear(); // Phone
		logger.pass(" User clear phone number");
		phone.sendKeys(ExcelUtils.getCellData(2, 2));
		logger.pass(" User fetching phone number from excelsheet");
		addresstab.click(); // Address Tab
		logger.pass(" User click on Address Tab");
		add1.clear(); // Address line1
		logger.pass(" User clear Address line 1 ");
		add1.sendKeys(ExcelUtils.getCellData(2, 3));
		logger.pass(" User fetching Address line 1 from excelsheet");
		saveclose.click(); // Save&Close button
		logger.pass(" User click on Save&Close button");
		logger.pass(" Edited form of selected Individual Donor saved successfully");
		return new AdminIndividualDonorPage(driver);

	}

}
