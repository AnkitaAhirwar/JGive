package com.pageobjects.jgive;

import java.util.List;

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
 * This is Page Class for User Donations. It contains all the elements and
 * actions related to User Donations.
 * 
 */

public class UserDonationsPage extends BaseClass {

	private WebDriver driver;
	private static Logger log = Logger.getLogger(UserDonationsPage.class);

	public UserDonationsPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	/*
	 * Locators for User Donations
	 */

	@FindBy(how = How.XPATH, using = "//a[contains(text(),'All Campaigns')]")
	public WebElement allcampaigns;

	@FindBy(how = How.XPATH, using = "//*[@id=\"allcampdonate\"]")
	public WebElement donatebutton;

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

	@FindBy(how = How.CSS, using = "input#phone")
	public WebElement phone;

	@FindBy(how = How.CSS, using = "input#byorder")
	public WebElement purchaseorder;

	@FindBy(how = How.CSS, using = "[value='Place donation']")
	public WebElement placedonation;

	@FindBy(how = How.CSS, using = "textarea#comment")
	public WebElement comment;

	@FindBy(how = How.XPATH, using = "//a[@class='jgive_editTab']")
	public WebElement edittab;

	@FindBy(how = How.CSS, using = "input#btn_check")
	public WebElement confirmorder;

	@FindBy(how = How.XPATH, using = "//*[@id=\"system-message-container\"]")
	List<WebElement> errormessage;

	@FindBy(how = How.CSS, using = ".alert.alert-message")
	public WebElement systemmessage;

	@FindBy(how = How.XPATH, using = "//input[@id='donation_amount']")
	public WebElement donationamt;

	@FindBy(how = How.XPATH, using = "//input[@id='user_first_last_name']")
	public WebElement donorname;

	@FindBy(how = How.XPATH, using = "//*[@id=\"annonymousDonation2\"]")
	public WebElement annonymousdonate;

	@FindBy(how = How.XPATH, using = "//input[@id='paypal_email']")
	public WebElement donoremail;

	@FindBy(how = How.XPATH, using = "//*[@id=\"qtc_bycheck\"]")
	public WebElement paybycheck;

	@FindBy(how = How.XPATH, using = "//textarea[@id='comment']")
	public WebElement paymentcomment;

	@FindBy(how = How.XPATH, using = "//input[@id='qtc_byorder']")
	public WebElement paybyorder;

	@FindBy(how = How.XPATH, using = "//input[@id='qtc_paypal']")
	public WebElement paybypaypal;

	@FindBy(how = How.XPATH, using = "//*[@id=\"btn_check\"]")
	public WebElement confirmorderbtn;

	/*
	 * 
	 * Method for User Donations
	 * 
	 */

	public UserMyDonationsPage donation() throws Exception {

		try {
			if (!Constant.TESTDATAEXCEL.isEmpty())
				driver.get(Constant.TESTDATAEXCEL);
		} catch (Exception e) {
			ExcelUtils.setExcelFile(Constant.TESTDATAPATH, "UserDonations");
		}
		allcampaigns.click(); // All Campaigns
		logger.pass("Clicked on All campaign menu");
		donatebutton.click(); // Donate Button
		logger.pass("Clicked on donate button");
		firstname.clear(); // First Name
		logger.pass("First name successfully clear");
		lastname.clear(); // Last Name
		logger.pass("Last name successfully clear");
		address1.clear(); // Address line 1
		logger.pass("Address1 successfully clear");
		address2.clear(); // Address line 2
		logger.pass("Address2 successfully clear");
		taxnumber.clear(); // Tax number
		logger.pass("Tax number successfully clear");
		zip.clear(); // Zip address
		logger.pass("ZIP code successfully clear");
		paypalemail.clear(); // paypal email
		logger.pass("PayPal Email successfully clear");
		donationamount.clear(); // Donation amount
		logger.pass("Donation amount successfully clear");
		phone.clear(); // Phone
		logger.pass("Phone number successfully clear");
		continuebutton.click(); // Continue button
		logger.pass("User clicked on submit donation button with blank details");
		driver.switchTo().alert().accept();
		logger.pass("Alert popup accepted");
		logger.info("Donation form required fields as below");
		int length = errormessage.size();
		for (int i = 0; i <= length - 1; i++) {
			logger.info(errormessage.get(i).getText());
		}
		firstname.sendKeys(ExcelUtils.getCellData(1, 0)); // First Name
		logger.pass("User fetching first name from excelsheet");
		lastname.sendKeys(ExcelUtils.getCellData(1, 1)); // Last Name
		logger.pass("User fetching last name from excelsheet");
		address1.sendKeys(ExcelUtils.getCellData(1, 2)); // Address line 1
		logger.pass("User fetching address1 from excelsheet");
		address2.sendKeys(ExcelUtils.getCellData(1, 3)); // Address line 2
		logger.pass("User fetching address2 from excelsheet");
		taxnumber.sendKeys(ExcelUtils.getCellData(1, 10)); // Tax number
		logger.pass("User fetching taxnumber from excelsheet");
		zip.sendKeys(ExcelUtils.getCellData(1, 7)); // Zip address
		logger.pass("User fetching zip code from excelsheet");
		paypalemail.sendKeys(ExcelUtils.getCellData(1, 8)); // Paypal email
		logger.pass("User fetching paypal email from excelsheet");
		countrydropdown.click(); // Country
		logger.pass("User click on country dropdown");
		country.click(); // Select Country
		logger.pass("User selected country from dropdown list");
		statedropdown.click(); // State
		logger.pass("User click on state dropdown");
		state.click(); // Select state
		logger.pass("User selected state from dropdown list");
		citydropdown.click(); // City
		logger.pass("User click on city dropdown");
		city.click(); // Select city
		logger.pass("User selected city from dropdown list");
		phone.sendKeys(ExcelUtils.getCellData(1, 9)); // Phone
		logger.pass("User fetching phone number from excelsheet");
		donationamount.sendKeys(ExcelUtils.getCellData(1, 11)); // Donation amount
		logger.pass("User fetching donation amount from excelsheet");
		continuebutton.click(); // Continue button
		logger.pass("User click on submit button");
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click();", edittab); // Edit
		logger.pass("User click on edit details button");
		donationamount.clear(); // Clear donation amount
		logger.pass("User clears donation amount");
		donationamount.sendKeys(ExcelUtils.getCellData(2, 11)); // Donation amount
		logger.pass("User fetching donation amount from excelsheet");
		continuebutton.click(); // Continue button
		logger.pass("User click on submit button");
		purchaseorder.click(); // Purchase order
		logger.pass("User click on purchase order radio button");
		placedonation.click(); // Place order
		logger.pass("User click on place donation button");
		comment.sendKeys(ExcelUtils.getCellData(14, 0)); // Comment
		logger.pass("User fetching comment from excelsheet");
		confirmorder.click(); // Confirm order
		logger.pass("User click on confirm order button");
		logger.info("Donation successful message as below");
		logger.info(systemmessage.getText()); // Print success message
		logger.pass("User saved donation successfully");
		return new UserMyDonationsPage(driver);

	}

}
