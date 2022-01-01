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
import com.pageobjects.jgive.UserAllCampaignsPage;

/**
 * This is Page Class for User MyCampaign Page. It contains all the elements and
 * actions related to User MyCampaign Page.
 * 
 */

public class UserMyCampaignsPage extends BaseClass {

	private WebDriver driver;
	Select s;
	private static Logger log = Logger.getLogger(UserMyCampaignsPage.class);

	public UserMyCampaignsPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	/*
	 * Locators for User My Campaigns
	 */

	@FindBy(how = How.XPATH, using = "//a[contains(text(),'My Campaigns')]")
	public WebElement mycampaign;

	@FindBy(how = How.XPATH, using = "//*[@id=\"filter_campaign_type_chzn\"]/a/span")
	public WebElement campaigntypedropdown;

	@FindBy(how = How.XPATH, using = "//li[contains(text(),'Donation')]")
	public WebElement campaigntypedonation;

	@FindBy(how = How.XPATH, using = "//*[@id=\"filter_campaign_cat_chzn\"]/a/span")
	public WebElement selectcategory;

	@FindBy(how = How.XPATH, using = "//li[contains(text(),'Uncategorised')]")
	public WebElement uncategorised;

	@FindBy(how = How.LINK_TEXT, using = "Save Environment")
	public WebElement campaignselect;

	@FindBy(how = How.XPATH, using = "//button[contains(text(),'ADD REPORT')]")
	public WebElement addreportbtn;

	@FindBy(how = How.XPATH, using = "//input[@id='jform_title']")
	public WebElement reporttitle;

	@FindBy(how = How.XPATH, using = "//*[@id=\"jform_description_ifr\"]")
	public WebElement description;

	@FindBy(how = How.XPATH, using = "//input[@id='jform_image']")
	public WebElement reportimage;

	@FindBy(how = How.XPATH, using = "//button[@class='validate btn btn-primary']")
	public WebElement save;

	@FindBy(how = How.XPATH, using = "//i[@class='fa fa-plus']")
	public WebElement addbtn;

	@FindBy(how = How.XPATH, using = "//input[@id='jform_attachments1']")
	public WebElement attachment;

	/*
	 * 
	 * Method for MyCampaigns
	 * 
	 */

	public UserMyCampaignsPage myCampaign() {

		click(mycampaign); // My Campaigns
		logger.pass("User click on My Campaign");
		click(campaigntypedropdown); // Camapign Type
		logger.pass("User click on CampaignType Dropdown");
		click(campaigntypedonation); // Donation
		logger.pass("User click on Donation");
		click(selectcategory); // Select Category
		logger.pass("User click on Select Category");
		click(uncategorised); // Uncategorised
		logger.pass("User click on uncategorised");
		return new UserMyCampaignsPage(driver);

	}

	/*
	 * 
	 * Method for Add Reports
	 * 
	 */

	public UserAllCampaignsPage reports(String title, String desc, String image) throws Exception {

		click(mycampaign); // My Campaigns
		logger.pass("User click on My Campaign");
		click(campaignselect); // Select campaign
		logger.pass("User select any campaign");
		click(addreportbtn); // add Report Button
		logger.pass("User click on Add Reort button");
		enterValue(reporttitle, title); // Report Title
		logger.pass("User fetching report title from excelsheet");
		enterValue(description, desc); // Description
		logger.pass("User fetching report description from excelsheet");
		enterValue(reportimage, Constant.DEFAULTSYSTEMPATH + image); // Report Image
		logger.pass("User fetching report image from excelsheet");
		click(addbtn); // Add Button
		logger.pass("User click on add more button for attachments");
		click(save); // Save
		logger.pass("User click on save button");
		return new UserAllCampaignsPage(driver);

	}

	/*
	 * 
	 * Method for MyCampaigns
	 * 
	 */

	public UserMyCampaignsPage mycampaign() {

		mycampaign.click(); // My Campaigns
		logger.pass("User click on My Campaign");
		campaigntypedropdown.click(); // Camapign Type
		logger.pass("User click on CampaignType Dropdown");
		campaigntypedonation.click(); // Donation
		logger.pass("User click on Donation");
		selectcategory.click(); // Select Category
		logger.pass("User click on Select Category");
		uncategorised.click(); // Uncategorised
		logger.pass("User click on uncategorised");
		return new UserMyCampaignsPage(driver);

	}

	/*
	 * 
	 * Method for Add Reports
	 * 
	 */

	public UserAllCampaignsPage reports() throws Exception {

		try {
			if (!Constant.TESTDATAEXCEL.isEmpty())
				driver.get(Constant.TESTDATAEXCEL);
		} catch (Exception e) {
			ExcelUtils.setExcelFile(Constant.TESTDATAPATH, "UserCampaign");
		}
		mycampaign.click(); // My Campaigns
		logger.pass("User click on My Campaign");
		campaignselect.click(); // Select campaign
		logger.pass("User select any campaign");
		addreportbtn.click(); // add Report Button
		logger.pass("User click on Add Reort button");
		reporttitle.sendKeys(ExcelUtils.getCellData(21, 2)); // Report Title
		logger.pass("User fetching report title from excelsheet");
		description.sendKeys(ExcelUtils.getCellData(21, 3)); // Description
		logger.pass("User fetching report description from excelsheet");
		reportimage.sendKeys(Constant.DEFAULTSYSTEMPATH + ExcelUtils.getCellData(2, 6)); // Report Image
		logger.pass("User fetching report image from excelsheet");
		addbtn.click(); // Add Button
		logger.pass("User click on add more button for attachments");
		save.click(); // Save
		logger.pass("User click on save button");
		return new UserAllCampaignsPage(driver);

	}

}
