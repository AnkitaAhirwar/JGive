package com.pageobjects.jgive;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.config.jgive.BaseClass;

/**
 * This is Page Class for User Dashboard Page . It contains all the elements
 * and actions related to User Dashboard Page.
 * 
 */

public class UserDashboardPage extends BaseClass {

	private WebDriver driver;
	private static Logger log = Logger.getLogger(UserDashboardPage.class);

	public UserDashboardPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	/*
	 * Locators for User Dashboard Page
	 */

	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Dashboard')]")
	public WebElement dashboard;

	@FindBy(how = How.CSS, using = ".fa-filter")
	public WebElement filtercampaign;

	@FindBy(how = How.CSS, using = "div:nth-of-type(2) > label > input[name='campStatus']")
	public WebElement published;

	@FindBy(how = How.CSS, using = "div:nth-of-type(3) > label > input[name='campStatus']")
	public WebElement unpublished;

	@FindBy(how = How.CSS, using = "div:nth-of-type(2) > label > input[name='campType']")
	public WebElement donation;

	@FindBy(how = How.CSS, using = "div:nth-of-type(3) > label > input[name='campType']")
	public WebElement investment;

	@FindBy(how = How.CSS, using = "div:nth-of-type(2) > label > input[name='orgType']")
	public WebElement nonprofits;

	@FindBy(how = How.CSS, using = "div:nth-of-type(3) > label > input[name='orgType']")
	public WebElement selfhelpgroups;

	@FindBy(how = How.CSS, using = "div:nth-of-type(4) > label > input[name='orgType']")
	public WebElement individuals;

	@FindBy(how = How.CSS, using = "[href='javascript:void(0);']")
	public WebElement resetfilters;

	@FindBy(how = How.CSS, using = ".btn-donate")
	public WebElement applybutton;

	/*
	 * 
	 * Method for User Dashboard Page
	 * 
	 */

	public UserDashboardPage mycampaigns() {

		dashboard.click(); // Dashboard
		logger.pass("User click on the Dashboard");
		filtercampaign.click(); // Filter Campaign
		logger.pass("User click on the filtercampaign");
		published.click(); // Published
		logger.pass("User click on the Published");
		donation.click(); // Donation
		logger.pass("User click on the Donation");
		nonprofits.click(); // Non-Profits
		logger.pass("User click on the Non-Profits");
		applybutton.click(); // Apply button
		logger.pass("User click on the apply button");
		return new UserDashboardPage(driver);

	}

}
