package com.pageobjects.jgive;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.config.jgive.BaseClass;

/**
 * This is Page Class for Dashboard. It contains all the elements and actions
 * related to Dashboard view.
 * 
 */

public class AdminDashboardPage extends BaseClass {

	private WebDriver driver;
	static Logger log = Logger.getLogger(AdminDashboardPage.class);

	public AdminDashboardPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	/*
	 * Locators for Admin Dashboard
	 */

	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Components')]")
	public WebElement components;

	@FindBy(how = How.XPATH, using = "//a[@class='dropdown-toggle menu-icon-16-jgive']")
	public WebElement dropdown;
	
	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Control panel')]")
	public WebElement controlpanel;
	
	@FindBy(how = How.XPATH, using = "//li[@class='active']//a[contains(text(),'Categories')]")
	public WebElement categories;
	
	@FindBy(how = How.XPATH, using = "//ul[@id='submenu']//a[contains(text(),'Campaigns')]")
	public WebElement campaigns;
	
	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Campaign-wise report')]")
	public WebElement campaignwisereport;
	
	@FindBy(how = How.XPATH, using = "//ul[@id='submenu']//a[contains(text(),'Vendors')]")
	public WebElement vendors;
	
	@FindBy(how = How.XPATH, using = "//ul[@id='submenu']//a[contains(text(),'Donations')]")
	public WebElement donations;
	
	@FindBy(how = How.XPATH, using = "//ul[@id='submenu']//a[contains(text(),'Individual Donors')]")
	public WebElement individualdonors;
	
	@FindBy(how = How.XPATH, using = "//ul[@id='submenu']//a[contains(text(),'Organization Donors')]")
	public WebElement organizationaldonors;
	
	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Receipt template')]")
	public WebElement receipttemplate;
	
	@FindBy(how = How.XPATH, using = "//div[@class='container-fluid container-main']//li[10]//a[1]")
	public WebElement donors;
	
	@FindBy(how = How.XPATH, using = "//ul[@id='submenu']//a[contains(text(),'Notifications')]")
	public WebElement notifications;
	
	@FindBy(how = How.XPATH, using = "//ul[@id='submenu']//a[contains(text(),'Reports')]")
	public WebElement reports;
	
	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Campaign form fields')]")
	public WebElement campaignformfields;
	
	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Campaign fields group')]")
	public WebElement campaignfieldsgroup;
	
	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Countries')]")
	public WebElement countries;
	
	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Regions')]")
	public WebElement regions;
	
	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Cities')]")
	public WebElement cities;
	
	@FindBy(how = How.XPATH, using = "//ul[@id='submenu']//a[contains(text(),'Fields')]")
	public WebElement fields;
	
	@FindBy(how = How.XPATH, using = "//ul[@id='submenu']//a[contains(text(),'Field Groups')]")
	public WebElement fieldsgroups;

	/*
	 * 
	 * Method for DashboardPage
	 * 
	 */

	public AdminDashboardPage dashboard() {

		components.click(); // Components tab
		logger.pass("User click on components");
		dropdown.click(); // Dropdown list of components
		logger.pass("User select component as JGive");
		logger.pass("Welcome to dashboard page");
		return new AdminDashboardPage(driver);

	}

}
