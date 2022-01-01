package com.pageobjects.jgive;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.config.jgive.BaseClass;
import com.utils.jgive.Constant;
import com.utils.jgive.ExcelUtils;

/**
 * This is Page Class for Admin Donors. It contains all the elements and actions
 * related to Admin Donors.
 * 
 */

public class AdminDonorsPage extends BaseClass {

	private WebDriver driver;
	private static Logger log = Logger.getLogger(AdminDonorsPage.class);
	Select s;

	public AdminDonorsPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	/*
	 * Locators for Donors
	 */

	@FindBy(how = How.XPATH, using = "//*[@id=\"submenu\"]/li[10]/a")
	public WebElement donors;

	@FindBy(how = How.XPATH, using = "//input[@id='filter_search']")
	public WebElement searchbox;

	@FindBy(how = How.XPATH, using = "//button[@class='btn hasTooltip']")
	public WebElement searchbutton;

	@FindBy(how = How.XPATH, using = "//button[@class='btn hasTooltip js-stools-btn-clear']")
	public WebElement clear;

	@FindBy(how = How.XPATH, using = "//button[@class='btn hasTooltip js-stools-btn-filter']")
	public WebElement searchtools;

	@FindBy(how = How.XPATH, using = "//*[@id=\"filter_campaign_id_chzn\"]/a/span")
	public WebElement searchbycampaign;

	@FindBy(how = How.XPATH, using = "//li[contains(text(),'Save Earth')]")
	public WebElement selectcampaign;

	@FindBy(how = How.XPATH, using = "//*[@id=\"filter_donor_type_chzn\"]/a/span")
	public WebElement searchbydonor;

	@FindBy(how = How.XPATH, using = "//li[contains(text(),'Individual')]")
	public WebElement selectdonor;

	/*
	 * 
	 * Method for Donors
	 * 
	 */

	public AdminDonorsPage donorslistview(String donorname) throws Exception {

		click(donors); // Donors
		logger.pass("User click on Donors");
		enterValue(searchbox, donorname); // Searchbox
		logger.pass("User fetching donor name from excelsheet");
		click(searchbutton); // Search Button
		logger.pass("User click on the search button");
		logger.pass("This is the list view of donors search by donor name");
		click(clear); // Clear Button
		logger.pass("User click on the clear button");
		logger.pass("This is the Donors list view");
		return new AdminDonorsPage(driver);

	}

	/*
	 * 
	 * Method for Search By Campaign
	 * 
	 */

	public AdminDonorsPage searchByCampaign() {

		click(donors); // Donors
		logger.pass("User click on the Donors");
		click(searchtools); // Search tools
		logger.pass("User click on the search tools");
		WebDriverWait w = new WebDriverWait(driver, 30);
		w.until(ExpectedConditions.visibilityOf(searchbycampaign));
		click(searchbycampaign); // Please select campaign dropdown
		logger.pass("User click on the select campaign dropdown");
		click(selectcampaign); // Select campaign from dropdown list
		logger.pass("User select the campaign");
		logger.pass("This is the list view of donors search by selected campaign name");
		click(clear); // Clear Button
		logger.pass("User click on the clear button");
		logger.pass("This is the list view of donors search by campaign name");
		return new AdminDonorsPage(driver);

	}

	/*
	 * 
	 * Method for Search By DonorType
	 * 
	 */

	public AdminDonorsPage searchByDonortype() {

		click(donors); // Donors
		logger.pass("User click on Donors");
		click(searchtools); // Search tools
		logger.pass("User click on search tools");
		WebDriverWait w = new WebDriverWait(driver, 30);
		w.until(ExpectedConditions.visibilityOf(searchbydonor));
		click(searchbydonor); // Donor type dropdown
		logger.pass("User click on the donor type dropdown");
		click(selectdonor); // Select donor type from dropdown list
		logger.pass("User select the donor type");
		logger.pass("This is the list view of donors search by selected donor type");
		click(clear); // Clear Button
		logger.pass("User click on the clear button");
		logger.pass("This is the list view of donors search by donor type");
		return new AdminDonorsPage(driver);

	}

	/*
	 * 
	 * Method for Donors
	 * 
	 */

	public AdminDonorsPage donorslistview() throws Exception {

		try {
			if (!Constant.TESTDATAEXCEL.isEmpty())
				driver.get(Constant.TESTDATAEXCEL);
		} catch (Exception e) {
			ExcelUtils.setExcelFile(Constant.TESTDATAPATH, "Donations");
		}
		donors.click(); // Donors
		logger.pass("User click on Donors");
		searchbox.sendKeys(ExcelUtils.getCellData(2, 1)); // Searchbox
		logger.pass("User fetching donor name from excelsheet");
		searchbutton.click(); // Search Button
		logger.pass("User click on the search button");
		logger.pass("This is the list view of donors search by donor name");
		clear.click(); // Clear Button
		logger.pass("User click on the clear button");
		logger.pass("This is the Donors list view");
		return new AdminDonorsPage(driver);

	}

	/*
	 * 
	 * Method for Search By Campaign
	 * 
	 */

	public AdminDonorsPage searchbycampaign() {

		donors.click(); // Donors
		logger.pass("User click on the Donors");
		searchtools.click(); // Search tools
		logger.pass("User click on the search tools");
		WebDriverWait w = new WebDriverWait(driver, 30);
		w.until(ExpectedConditions.visibilityOf(searchbycampaign));
		searchbycampaign.click(); // Please select campaign dropdown
		logger.pass("User click on the select campaign dropdown");
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOf(selectcampaign)); 
		wait.until(ExpectedConditions.elementToBeClickable(selectcampaign));
		selectcampaign.click(); // Select campaign from dropdown list
		logger.pass("User select the campaign");
		logger.pass("This is the list view of donors search by selected campaign name");
		clear.click(); // Clear Button
		logger.pass("User click on the clear button");
		logger.pass("This is the list view of donors search by campaign name");
		return new AdminDonorsPage(driver);

	}

	/*
	 * 
	 * Method for Search By DonorType
	 * 
	 */

	public AdminDonorsPage searchbydonortype() {

		donors.click(); // Donors
		logger.pass("User click on Donors");
		searchtools.click(); // Search tools
		logger.pass("User click on search tools");
		WebDriverWait w = new WebDriverWait(driver, 30);
		w.until(ExpectedConditions.visibilityOf(searchbydonor));
		searchbydonor.click(); // Donor type dropdown
		logger.pass("User click on the donor type dropdown");
		selectdonor.click(); // Select donor type from dropdown list
		logger.pass("User select the donor type");
		logger.pass("This is the list view of donors search by selected donor type");
		clear.click(); // Clear Button
		logger.pass("User click on the clear button");
		logger.pass("This is the list view of donors search by donor type");
		return new AdminDonorsPage(driver);

	}

}
