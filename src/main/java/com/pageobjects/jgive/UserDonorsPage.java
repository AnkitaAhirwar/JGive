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
 * This is Page Class for User Donors . It contains all the elements and actions
 * related to User Donors.
 * 
 */

public class UserDonorsPage extends BaseClass {

	private WebDriver driver;
	private static Logger log = Logger.getLogger(UserDonorsPage.class);

	public UserDonorsPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	/*
	 * Locators for User Donors Page
	 */

	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Donors')]")
	public WebElement donors;

	@FindBy(how = How.XPATH, using = "//*[@id=\"tjtoolbar-custom\"]/button")
	public WebElement exportcsvbtn;

	@FindBy(how = How.XPATH, using = "//*[@id=\"filter_search\"]")
	public WebElement filtersearch;

	@FindBy(how = How.XPATH, using = "//i[@class='fa fa-search']")
	public WebElement searchbtn;

	@FindBy(how = How.XPATH, using = "//i[@class='fa fa-close']")
	public WebElement clearbtn;

	@FindBy(how = How.XPATH, using = "//*[@id=\"filter_campaign_id_chzn\"]/a/span")
	public WebElement selectcampdropdown;

	@FindBy(how = How.XPATH, using = "//li[contains(text(),'rashmi camp1')]")
	public WebElement campaignselect;

	@FindBy(how = How.XPATH, using = "//*[@id=\"filter_donor_type_chzn\"]/a/span")
	public WebElement donortypedropdown;

	@FindBy(how = How.XPATH, using = "//li[contains(text(),'Individual')]")
	public WebElement donortype;

	/*
	 * 
	 * Method for User Donors ExportCSV
	 * 
	 */

	public UserDonorsPage exportcsv() {

		donors.click();
		logger.pass("User click on the Donors tab");
		exportcsvbtn.click();
		logger.pass("User click on the Export as CSV button");
		logger.pass("User downloaded CSV file");
		return this;
	}

	/*
	 * 
	 * Method for User Donors filters validation
	 * 
	 */

	public UserDonorsPage filters() throws Exception {

		try {
			if (!Constant.TESTDATAEXCEL.isEmpty())
				driver.get(Constant.TESTDATAEXCEL);
		} catch (Exception e) {
			ExcelUtils.setExcelFile(Constant.TESTDATAPATH, "UserDonations");
		}
		donors.click(); // Donors
		logger.pass("User click on the Donors tab");
		filtersearch.sendKeys(ExcelUtils.getCellData(1, 12)); // Filter Search
		logger.pass("User fetching donor name from excelsheet");
		searchbtn.click(); // Search
		logger.pass("User click on the search button");
		clearbtn.click(); // Clear
		logger.pass("User click on the clear button");
		filtersearch.sendKeys(ExcelUtils.getCellData(1, 13));// Filter Search
		logger.pass("User fetching donor email from excelsheet");
		searchbtn.click(); // Search
		logger.pass("User click on the search button");
		clearbtn.click(); // Clear
		logger.pass("User click on the clear button");
		selectcampdropdown.click(); // Select Campaign Dropdown
		logger.pass("User click on the select campaign dropdown");
		campaignselect.click(); // Campaign Select
		logger.pass("User select campaign from dropdown list");
		donortypedropdown.click(); // Donor Type Dropdown
		logger.pass("User click on the donor type dropdown");
		donortype.click();// Donor Type
		logger.pass("User select donor type from dropdown list");
		return this;
	}

}
