package com.pageobjects.jgive;

import org.apache.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.config.jgive.BaseClass;
import com.utils.jgive.Constant;
import com.utils.jgive.ExcelUtils;
import com.pageobjects.jgive.UserMyDonationsPage;

/**
 * This is Page Class for User Guest Donation. It contains the elements and
 * actions related to User Guest Donation.
 * 
 */

public class UserGuestDonationPage extends BaseClass {

	private WebDriver driver;
	private static Logger log = Logger.getLogger(UserGuestDonationPage.class);

	public UserGuestDonationPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	/*
	 * Locators for User Guest Donation
	 */

	@FindBy(how = How.XPATH, using = "//a[contains(text(),'All Campaigns')]")
	public WebElement allcampaigns;

	@FindBy(how = How.XPATH, using = "//*[@id=\"allcampdonate\"]")
	public WebElement donatebutton;

	@FindBy(how = How.XPATH, using = "//input[@id='guest']")
	public WebElement checkoutbtn;

	@FindBy(how = How.XPATH, using = "//input[@id='button-user-info']")
	public WebElement continuebtn;

	@FindBy(how = How.CSS, using = "input#first_name")
	public WebElement firstname;

	@FindBy(how = How.CSS, using = "input#last_name")
	public WebElement lastname;

	@FindBy(how = How.CSS, using = "input#address")
	public WebElement address1;

	@FindBy(how = How.CSS, using = "input#address2")
	public WebElement address2;

	@FindBy(how = How.CSS, using = "input#taxnumber")
	public WebElement taxnumber;

	@FindBy(how = How.CSS, using = "input#zip")
	public WebElement zip;

	@FindBy(how = How.CSS, using = "input#paypal_email")
	public WebElement paypalemail;

	@FindBy(how = How.CSS, using = "[value='Continue']")
	public WebElement continuebutton;

	@FindBy(how = How.CSS, using = "input#donation_amount")
	public WebElement donationamount;

	@FindBy(how = How.CSS, using = "#jform_country_chzn span")
	public WebElement countrydropdown;

	@FindBy(how = How.XPATH, using = "//div[@id='jform_country_chzn']//ul[@class='chzn-results']/li[.='India']")
	public WebElement country;

	@FindBy(how = How.CSS, using = "div#jform_state_chzn  span")
	public WebElement statedropdown;

	@FindBy(how = How.XPATH, using = "//li[contains(text(),'Maharashtra')]")
	public WebElement state;

	@FindBy(how = How.CSS, using = "div#jform_city_chzn  span")
	public WebElement citydropdown;

	@FindBy(how = How.XPATH, using = "//li[contains(text(),'Bhusawal')]")
	public WebElement city;

	@FindBy(how = How.XPATH, using = "//input[@id='other_city_check']")
	public WebElement othercitycheckbox;

	@FindBy(how = How.XPATH, using = "//input[@id='other_city']")
	public WebElement othercity;

	@FindBy(how = How.CSS, using = "input#phone")
	public WebElement phone;

	@FindBy(how = How.XPATH, using = "//input[@id='annonymousDonation2']")
	public WebElement annonymousdonation;

	@FindBy(how = How.XPATH, using = "//input[@id='button-billing-info']")
	public WebElement buttonbilling;

	@FindBy(how = How.XPATH, using = "//input[@id='bycheck']")
	public WebElement paybycheck;

	@FindBy(how = How.XPATH, using = "//*[@id=\"byorder\"]")
	public WebElement paybyorder;

	@FindBy(how = How.XPATH, using = "//*[@id=\"paypal\"]")
	public WebElement paybypaypal;

	@FindBy(how = How.XPATH, using = "//input[@id='save']")
	public WebElement placedonation;

	@FindBy(how = How.XPATH, using = "//textarea[@id='comment']")
	public WebElement comment;

	@FindBy(how = How.XPATH, using = "//input[@id='btn_check']")
	public WebElement confirmorder;

	/*
	 * 
	 * Method for Guest Donation
	 * 
	 */

	public UserMyDonationsPage guestDonation() throws Exception {

		try {
			if (!Constant.TESTDATAEXCEL.isEmpty())
				driver.get(Constant.TESTDATAEXCEL);
		} catch (Exception e) {
			ExcelUtils.setExcelFile(Constant.TESTDATAPATH, "Donations");
		}
		allcampaigns.click(); // All Campaigns
		logger.pass("User click on campaigns");
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0, 500)", "");
		donatebutton.click(); // Donate Button
		logger.pass("User click on donate button");
		checkoutbtn.click(); // Checkout button
		logger.pass("User click on checkbutton");
		continuebtn.click(); // Continue button
		logger.pass("User click on continue button");
		firstname.sendKeys(ExcelUtils.getCellData(2, 4)); // First name
		logger.pass("User fetching first name from excelsheet");
		lastname.sendKeys(ExcelUtils.getCellData(2, 5)); // Last name
		logger.pass("User fetching last name from excelsheet");
		address1.sendKeys(ExcelUtils.getCellData(2, 8)); // Address1
		logger.pass("User fetching address1 from excelsheet");
		address2.sendKeys(ExcelUtils.getCellData(2, 9)); // Address2
		logger.pass("User fetching address2 from excelsheet");
		countrydropdown.click(); // Countrydropdown
		logger.pass("User click on country dropdown");
		country.click(); // Country
		logger.pass("User click on country");
		statedropdown.click(); // Statedropdown
		logger.pass("User click on state dropdown");
		state.click(); // State
		logger.pass("User click on state");
		citydropdown.click(); // Citydropdown
		logger.pass("User click on city dropdown");
		city.click(); // City
		logger.pass("User click on city");
		othercitycheckbox.click(); // Othercity checkbox
		logger.pass("User click on other city checkbox");
		othercity.sendKeys(ExcelUtils.getCellData(2, 10)); // Othercity
		logger.pass("User fetching othercity from excelsheet");
		phone.sendKeys(ExcelUtils.getCellData(2, 7)); // Phone
		logger.pass("User fetching phone from excelsheet");
		paypalemail.sendKeys(ExcelUtils.getCellData(2, 6)); // Paypal email
		logger.pass("User fetching paypalemail from excelsheet");
		zip.sendKeys(ExcelUtils.getCellData(2, 11)); // Zip address
		logger.pass("User fetching zip address from excelsheet");
		taxnumber.sendKeys(ExcelUtils.getCellData(2, 12)); // Tax number
		logger.pass("User fetching tax number from excelsheet");
		donationamount.clear(); // Donation amount
		logger.pass("User clears donation amount");
		donationamount.sendKeys(ExcelUtils.getCellData(7, 3)); // Donation amount
		logger.pass("User fetching donation amount from excelsheet");
		annonymousdonation.click(); // Annonymous Donation
		logger.pass("User click on annonymous donation");
		buttonbilling.click(); // Billing info
		logger.pass("User click on billing button");
		paybycheck.click(); // Pay by check
		logger.pass("User click on pay by check");
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click();", placedonation); // Place donation
		logger.pass("User click on place donation");
		comment.sendKeys(ExcelUtils.getCellData(2, 2)); // Comment
		logger.pass("User fetching comment from excelsheet");
		confirmorder.click(); // Confirm order
		logger.pass("User click on confirm order");
		logger.pass("User done guest donation successfully");
		return new UserMyDonationsPage(driver);

	}

}
