package com.pageobjects.jgive;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

/**
 * This is Page Class for User My Donations . It contains all the elements and actions
 * related to User My Donations.
 * 
 */

import com.config.jgive.BaseClass;

public class UserMyDonationsPage extends BaseClass {

	private WebDriver driver;
	private static Logger log = Logger.getLogger(UserMyDonationsPage.class);

	public UserMyDonationsPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	/*
	 * Locators for User MyDonations Page
	 */

	@FindBy(how = How.XPATH, using = "//a[contains(text(),'My Donations')]")
	public WebElement mydonations;

	@FindBy(how = How.XPATH, using = "//span[contains(text(),'- Approval status -')]")
	public WebElement approvalstatus;

	@FindBy(how = How.XPATH, using = "//li[contains(text(),'Confirmed')]")
	public WebElement confirmed;

	@FindBy(how = How.XPATH, using = "//li[contains(text(),'Pending')]")
	public WebElement pending;

	@FindBy(how = How.XPATH, using = "//li[contains(text(),'Refunded')]")
	public WebElement refunded;

	@FindBy(how = How.XPATH, using = "//li[contains(text(),'Canceled')]")
	public WebElement canceled;

	@FindBy(how = How.XPATH, using = "//li[contains(text(),'Denied')]")
	public WebElement denied;

	@FindBy(how = How.XPATH, using = "//a[contains(text(),'JGOID')]")
	public WebElement donationID;

	/*
	 * 
	 * Method for Confirmed Donations
	 * 
	 */

	public UserMyDonationsPage confirmeddonations() {

		mydonations.click();
		logger.pass("User click on My Donations tab");
		approvalstatus.click();
		logger.pass("User click on approval status");
		confirmed.click();
		logger.pass("User selects confirmed status");
		return new UserMyDonationsPage(driver);

	}

	/*
	 * 
	 * Method for Pending Donations
	 * 
	 */

	public UserMyDonationsPage pendingdonations() {

		mydonations.click();
		logger.pass("User click on My Donations tab");
		approvalstatus.click();
		logger.pass("User click on approval status");
		pending.click();
		logger.pass("User selects pending status");
		return new UserMyDonationsPage(driver);

	}

	/*
	 * 
	 * Method for Refunded Donations
	 * 
	 */

	public UserMyDonationsPage refundeddonations() {

		mydonations.click();
		logger.pass("User click on My Donations tab");
		approvalstatus.click();
		logger.pass("User click on approval status");
		refunded.click();
		logger.pass("User selects refunded status");
		return new UserMyDonationsPage(driver);

	}

	/*
	 * 
	 * Method for Canceled Donations
	 * 
	 */

	public UserMyDonationsPage canceleddonations() {

		mydonations.click();
		logger.pass("User click on My Donations tab");
		approvalstatus.click();
		logger.pass("User click on approval status");
		canceled.click();
		logger.pass("User selects canceled status");
		return new UserMyDonationsPage(driver);

	}

	/*
	 * 
	 * Method for Denied Donations
	 * 
	 */

	public UserMyDonationsPage denieddonations() {

		mydonations.click();
		logger.pass("User click on My Donations tab");
		approvalstatus.click();
		logger.pass("User click on approval status");
		denied.click();
		logger.pass("User selects denied status");
		return new UserMyDonationsPage(driver);

	}

	/*
	 * 
	 * Method for Donations Invoice
	 * 
	 */

	public UserMyDonationsPage donationinvoice() {

		mydonations.click();
		logger.pass("User click on My Donations tab");
		donationID.click();
		logger.pass("User click on donationID");
		return new UserMyDonationsPage(driver);

	}

}
