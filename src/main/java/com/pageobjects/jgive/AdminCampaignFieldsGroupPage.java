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
 * This is Page Class for Campaign Fields Group. It contains all the elements
 * and actions related to Campaign Field Group view.
 * 
 */

public class AdminCampaignFieldsGroupPage extends BaseClass {

	private WebDriver driver;
	private static Logger log = Logger.getLogger(AdminCampaignFieldsGroupPage.class);

	public AdminCampaignFieldsGroupPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	/*
	 * Left menu locators
	 */

	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Campaign fields group')]")
	public WebElement campaignfieldsgroup;

	@FindBy(how = How.XPATH, using = "//button[@class='btn btn-small button-new btn-success']")
	public WebElement newbutton;

	/*
	 * Locators for Campaign Fields Group
	 */

	@FindBy(how = How.XPATH, using = "//*[@id=\"jform_state_chzn\"]/a/span")
	public WebElement statusdropdown;

	@FindBy(how = How.XPATH, using = "//li[contains(text(),'Published')]")
	public WebElement status;

	@FindBy(how = How.XPATH, using = "//input[@id='jform_name']")
	public WebElement groupname;

	@FindBy(how = How.XPATH, using = "//button[@class='btn btn-small button-apply btn-success']")
	public WebElement save;

	@FindBy(how = How.XPATH, using = "//button[@class='btn btn-small button-save']")
	public WebElement saveclose;

	@FindBy(how = How.XPATH, using = "//button[@class='btn btn-small button-save-new']")
	public WebElement savenew;

	@FindBy(how = How.XPATH, using = "//button[@class='btn btn-small button-cancel']")
	public WebElement cancel;

	/*
	 * 
	 * Method for Campaign Fields Group
	 * 
	 */

	public AdminCampaignFieldsGroupPage campaignGroup(String name) throws Exception {

		click(campaignfieldsgroup); // Campaign Fields Group
		logger.pass("User click on the Campaign Fields Group");
		click(newbutton); // New button
		logger.pass("User click on the New button for Campaign Fields Group");
		click(statusdropdown);
		logger.pass("User click on the status dropdown list"); // Status dropdown list
		click(status); // Status
		logger.pass("User select the status");
		enterValue(groupname, name); // Name
		logger.pass("User fetching group name from excelsheet");
		click(saveclose); // Save&Close
		logger.pass("User click on the save&close button");
		logger.pass("Campaign Field Group created successfully");
		System.out.println(" Campaign Field Group Created");
		return this;

	}

	/*
	 * 
	 * Method for Campaign Field Group Creation Expecting Failure
	 * 
	 */

	public AdminCampaignFieldsGroupPage campaignGroupExpectingFailure(String name) throws Exception {

		click(campaignfieldsgroup); // Campaign Fields Group
		logger.pass("User click on the Campaign Fields Group");
		click(newbutton); // New button
		logger.pass("User click on the New button for Campaign Fields Group");
		click(statusdropdown);
		logger.pass("User click on the status dropdown list"); // Status dropdown list
		click(status); // Status
		logger.pass("User select the status");
		enterValue(groupname, name); // Name
		logger.pass("User fetching group name from excelsheet");
		click(cancel); // Save&Close
		logger.pass("User click on the save&close button");
		logger.pass("Campaign Field Group creation Failed");
		System.out.println(" Campaign Field Group creation Failed");
		return new AdminCampaignFieldsGroupPage(driver);

	}

	/*
	 * 
	 * Method for Campaign Fields Group
	 * 
	 */

	public AdminCampaignFieldsGroupPage campaignGroup() throws Exception {

		try {
			if (!Constant.TESTDATAEXCEL.isEmpty())
				driver.get(Constant.TESTDATAEXCEL);
		} catch (Exception e) {
			ExcelUtils.setExcelFile(Constant.TESTDATAPATH, "CampaignFields");
		}
		campaignfieldsgroup.click(); // Campaign Fields Group
		logger.pass("User click on the Campaign Fields Group");
		newbutton.click(); // New button
		logger.pass("User click on the New button for Campaign Fields Group");
		statusdropdown.click();
		logger.pass("User click on the status dropdown list"); // Status dropdown list
		status.click(); // Status
		logger.pass("User select the status");
		groupname.sendKeys(ExcelUtils.getCellData(3, 1)); // Name
		logger.pass("User fetching group name from excelsheet");
		saveclose.click(); // Save&Close
		logger.pass("User click on the save&close button");
		logger.pass("Campaign Field Group created successfully");
		return this;

	}

	/*
	 * 
	 * Method for Campaign Field Group Creation Expecting Failure
	 * 
	 */

	public AdminCampaignFieldsGroupPage campaignGroupExpectingFailure() throws Exception {

		try {
			if (!Constant.TESTDATAEXCEL.isEmpty())
				driver.get(Constant.TESTDATAEXCEL);
		} catch (Exception e) {
			ExcelUtils.setExcelFile(Constant.TESTDATAPATH, "CampaignFields");
		}
		campaignfieldsgroup.click(); // Campaign Fields Group
		logger.pass("User click on the Campaign Fields Group");
		newbutton.click(); // New button
		logger.pass("User click on the New button for Campaign Fields Group");
		statusdropdown.click();
		logger.pass("User click on the status dropdown list"); // Status dropdown list
		status.click(); // Status
		logger.pass("User select the status");
		groupname.sendKeys(ExcelUtils.getCellData(3, 2)); // Name
		logger.pass("User fetching group name from excelsheet");
		cancel.click(); // Save&Close
		logger.pass("User click on the save&close button");
		logger.pass("Campaign Field Group creation Failed");
		return new AdminCampaignFieldsGroupPage(driver);

	}

}
