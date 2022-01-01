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
 * This is Page Class for User All Donations Page . It contains all the elements
 * and actions related to User All Donations Page.
 * 
 */

public class UserAllDonationsPage extends BaseClass {

	private WebDriver driver;
	private static Logger log = Logger.getLogger(UserAllDonationsPage.class);

	public UserAllDonationsPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	/*
	 * Locators for User All Donations Page
	 */

	@FindBy(how = How.XPATH, using = "//a[contains(text(),'All Donations')]")
	public WebElement alldonations;

	@FindBy(how = How.XPATH, using = "//*[@id=\"filter_search\"]")
	public WebElement filtersearchtextbox;

	@FindBy(how = How.CSS, using = "button > .icon-search")
	public WebElement searchicon;

	@FindBy(how = How.CSS, using = "[data-original-title='Clear']")
	public WebElement clearbtn;

	@FindBy(how = How.CSS, using = "[data-original-title='Filter the list items\\.']")
	public WebElement searchtools;

	@FindBy(how = How.XPATH, using = "//span[contains(text(),'- Approval status -')]")
	public WebElement approvalstatus;

	@FindBy(how = How.XPATH, using = "//li[contains(text(),'Confirmed')]")
	public WebElement confirmed;

	@FindBy(how = How.XPATH, using = "//span[contains(text(),'Donor Type')]")
	public WebElement donortype;

	@FindBy(how = How.XPATH, using = "//li[contains(text(),'Individual')]")
	public WebElement individual;

	@FindBy(how = How.XPATH, using = "//span[contains(text(),'Select Campaign')]")
	public WebElement selectcampaign;

	@FindBy(how = How.XPATH, using = "//li[contains(text(),'Camp1')]")
	public WebElement campaignselect;

	/*
	 * 
	 * Method for User All Donations Page
	 * 
	 */

	public UserAllDonationsPage filtervalidations() throws Exception {

		try {
			if (!Constant.TESTDATAEXCEL.isEmpty())
				driver.get(Constant.TESTDATAEXCEL);
		} catch (Exception e) {
			ExcelUtils.setExcelFile(Constant.TESTDATAPATH, "UserDonations");
		}
		alldonations.click(); // All Donations
		logger.pass("User click on the All Donations");
		filtersearchtextbox.sendKeys(ExcelUtils.getCellData(1, 14)); // Filter search
		logger.pass("User click on the filter search textbox");
		searchicon.click(); // Search icon
		logger.pass("User click on the search icon");
		clearbtn.click(); // Clear
		logger.pass("User click on the clear button");
		searchtools.click(); // Search tools
		logger.pass("User click on the search tools");
		Thread.sleep(1000);
		approvalstatus.click(); // Approval status
		logger.pass("User click on the approval status");
		confirmed.click(); // Confirmed
		logger.pass("User click on the confirmed status");
		donortype.click(); // Donor type
		logger.pass("User click on the donor type");
		individual.click(); // Individual
		logger.pass("User click on the individual");
		selectcampaign.click(); // Select Campaign
		logger.pass("User click on the select campaign");
		campaignselect.click(); // Campaign Selection
		logger.pass("User select campaign");
		return new UserAllDonationsPage(driver);

	}

}
