package com.pageobjects.jgive;

import org.apache.log4j.Logger;
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
 * This is Page Class for User All Campaigns Page. It contains all the elements
 * and actions related to User All Campaigns Page.
 * 
 */

public class UserAllCampaignsPage extends BaseClass {

	private WebDriver driver;
	private static Logger log = Logger.getLogger(UserAllCampaignsPage.class);
	Select s;

	public UserAllCampaignsPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	/*
	 * Locators for User All Campaigns Page
	 */

	@FindBy(how = How.XPATH, using = "//a[contains(text(),'All Campaigns')]")
	public WebElement allcampaigns;

	@FindBy(how = How.CSS, using = "[onclick='jgive.jgShowSortFilter();'] [aria-hidden]")
	public WebElement sortcampaigns;

	@FindBy(how = How.CSS, using = "a#displayFilter > .fa.fa-filter")
	public WebElement filtercampaigns;

	@FindBy(how = How.CSS, using = "select#filter_order")
	public WebElement sortbyfilter;

	@FindBy(how = How.CSS, using = "input#filter_search")
	public WebElement searchcampaign;

	@FindBy(how = How.CSS, using = ".fa-search")
	public WebElement searchbtn;

	@FindBy(how = How.CSS, using = "[class='fa fa-search btn btn-primary p-10']")
	public WebElement searchicon;

	@FindBy(how = How.CSS, using = "input#filter_campaign_cat")
	public WebElement allcategory;

	@FindBy(how = How.CSS, using = "button#searchCampClear > .fa.fa-close")
	public WebElement clearsearch;

	@FindBy(how = How.CSS, using = "[href='javascript:void(0);']")
	public WebElement resetfilters;

	@FindBy(how = How.CSS, using = "[value='featured']")
	public WebElement featured;

	@FindBy(how = How.CSS, using = "#jgCoreFilters [value='1']")
	public WebElement successful;

	@FindBy(how = How.CSS, using = "#jgCoreFilters [value='0']")
	public WebElement active;

	@FindBy(how = How.CSS, using = "[value='donation']")
	public WebElement donation;

	@FindBy(how = How.CSS, using = "[value='investment']")
	public WebElement investment;

	/*
	 * 
	 * Method for All Campaigns Page
	 * 
	 */

	public UserAllCampaignsPage allcampaigns(String sortbycampaigns, String searchcamp) throws Exception {

		click(allcampaigns);
		logger.pass("User click on All Campaigns");
		click(sortcampaigns);
		logger.pass("User click on sort campaigns");
		selectDropdown(sortbyfilter, sortbycampaigns);
		logger.pass("User fetching campaign type from the list");
		click(searchbtn);
		logger.pass("User click on search button");
		enterValue(searchcampaign, searchcamp);
		logger.pass("User fetching campaign name from the list");
		click(clearsearch);
		logger.pass("User click on clear campaigns");
		click(filtercampaigns);
		logger.pass("User click on filter campaigns");
		click(featured);
		logger.pass("User click on featured campaigns");
		click(successful);
		logger.pass("User click on successful campaigns");
		click(active);
		logger.pass("User click on active campaigns");
		click(donation);
		logger.pass("User click on donation received campaigns");
		click(investment);
		logger.pass("User click on investment received campaigns");
		click(resetfilters);
		logger.pass("User click on reset filters");
		return new UserAllCampaignsPage(driver);

	}

	/*
	 * 
	 * Method for All Campaigns Page
	 * 
	 */

	public UserAllCampaignsPage allcampaigns() throws Exception {

		try {
			if (!Constant.TESTDATAEXCEL.isEmpty())
				driver.get(Constant.TESTDATAEXCEL);
		} catch (Exception e) {
			ExcelUtils.setExcelFile(Constant.TESTDATAPATH, "UserAllCampaigns");
		}
		allcampaigns.click(); // All Campaigns
		logger.pass("User click on All Campaigns");
		sortcampaigns.click(); // Sort Campaigns
		logger.pass("User click on sort campaigns");
		s = new Select(sortbyfilter); // Sort by filter
		s.selectByVisibleText(ExcelUtils.getCellData(1, 0));
		logger.pass("User fetching campaign type from the list");
		searchbtn.click(); // Search button
		logger.pass("User click on search button");
		searchcampaign.sendKeys(ExcelUtils.getCellData(1, 0)); // Search Campaign
		logger.pass("User fetching campaign name from the list");
		clearsearch.click(); // Clear
		logger.pass("User click on clear campaigns");
		filtercampaigns.click(); // Filter Campaigns
		logger.pass("User click on filter campaigns");
		featured.click(); // Featured
		logger.pass("User click on featured campaigns");
		successful.click(); // Successful
		logger.pass("User click on successful campaigns");
		active.click(); // Active
		logger.pass("User click on active campaigns");
		donation.click(); // Donation
		logger.pass("User click on donation received campaigns");
		investment.click(); // Investment
		logger.pass("User click on investment received campaigns");
		resetfilters.click(); // Reset filters
		logger.pass("User click on reset filters");
		return new UserAllCampaignsPage(driver);

	}

}
