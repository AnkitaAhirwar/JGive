package com.pageobjects.jgive;

import java.util.List;

import org.apache.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.config.jgive.BaseClass;
import com.utils.jgive.Constant;
import com.utils.jgive.ExcelUtils;

/**
 * 
 * This is Page Class for Donations. It contains all the elements and actions
 * related to Donations view.
 * 
 */

public class AdminDonationsPage extends BaseClass {

	private WebDriver driver;
	private static Logger log = Logger.getLogger(AdminDonationsPage.class);
	Select s;

	public AdminDonationsPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	/*
	 * Left menu locators
	 */

	@FindBy(how = How.XPATH, using = "//ul[@id='submenu']//a[contains(text(),'Donations')]")
	public WebElement donationclick;

	@FindBy(how = How.XPATH, using = "//button[@class='btn btn-small button-new btn-success']")
	public WebElement newbutton;

	/*
	 * Locators for Donations
	 */

	@FindBy(how = How.XPATH, using = "//input[@id='contact_name']")
	public WebElement donor;

	@FindBy(how = How.XPATH, using = "//div[@class='tt-suggestion tt-selectable']")
	public WebElement autosuggname;

	@FindBy(how = How.XPATH, using = "//*[@id=\"sbox-content\"]/iframe")
	public WebElement frameElement;

	@FindBy(how = How.XPATH, using = "//input[@id='annonymousDonation2']")
	public WebElement donateannoymously;

	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Select campaign')]")
	public WebElement selcamp;

	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Save Environment')]")
	public WebElement campclick;

	@FindBy(how = How.ID, using = "donation_amount")
	public WebElement donamt;

	@FindBy(how = How.XPATH, using = "//input[@id='donation_amount']")
	public WebElement donationamount;

	@FindBy(how = How.XPATH, using = "//button[@id='payment_received_date_btn']")
	public WebElement paymentrecdate;

	@FindBy(how = How.XPATH, using = "//button[@class='js-btn btn btn-today']")
	public WebElement todaybutton;

	@FindBy(how = How.XPATH, using = "//input[(@id='bycheck')]")
	List<WebElement> allElementsPaymentMethods;

	@FindBy(how = How.XPATH, using = "//input[(@id='bycheck')]")
	public WebElement paymentmethods;

	@FindBy(how = How.XPATH, using = "//*[@id=\"paypal\"]")
	List<WebElement> allElementsPaypal;

	@FindBy(how = How.XPATH, using = "//*[@id=\"paypal\"]")
	public WebElement paypal;

	@FindBy(how = How.XPATH, using = "//input[@id='no_giveback']")
	public WebElement nogiveback;

	@FindBy(how = How.XPATH, using = "//*[@id=\"donation_status\"]")
	public WebElement donationdropdown;

	@FindBy(how = How.XPATH, using = "//*[@id=\"donation_status\"]/option[2]")
	public WebElement donationstatus;

	@FindBy(how = How.XPATH, using = "//input[@id='transaction_id']")
	public WebElement transid;

	@FindBy(how = How.XPATH, using = "//button[@class='btn btn-small button-save']")
	public WebElement savedonation;

	@FindBy(how = How.XPATH, using = "//button[@class='btn btn-small button-cancel']")
	public WebElement canceldonation;

	@FindBy(how = How.XPATH, using = "//button[@class='btn btn-small button-mail']")
	public WebElement emailtodonorsbtn;

	@FindBy(how = How.CSS, using = "input#jgive_subject")
	public WebElement emailsubject;

	@FindBy(how = How.XPATH, using = "//*[@id=\"jgive_message_ifr\"]")
	public WebElement emaildesc;

	@FindBy(how = How.XPATH, using = "//button[@class='btn btn-small button-save']")
	public WebElement sendemail;

	/*
	 * Locators for individual donors
	 */

	@FindBy(how = How.XPATH, using = "//a[contains(text(),'New Individual Donor')]")
	public WebElement newindidonor;

	@FindBy(how = How.ID, using = "jform_first_name")
	public WebElement fn;

	@FindBy(how = How.XPATH, using = "//input[@id='jform_last_name']")
	public WebElement ln;

	@FindBy(how = How.XPATH, using = "//input[@id='jform_email']")
	public WebElement email;

	@FindBy(how = How.XPATH, using = "//input[@id='jform_phone']")
	public WebElement phone;

	@FindBy(how = How.XPATH, using = "//input[@id='jform_create_user']")
	public WebElement checkbox;

	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Address')]")
	public WebElement addresstab;

	@FindBy(how = How.XPATH, using = "//textarea[@id='jform_addr_line_1']")
	public WebElement add1;

	@FindBy(how = How.XPATH, using = "//textarea[@id='jform_addr_line_2']")
	public WebElement add2;

	@FindBy(how = How.XPATH, using = "//select[@id='jform_country']")
	public WebElement country;

	@FindBy(how = How.XPATH, using = "//select[@id='jform_state']")
	public WebElement state;

	@FindBy(how = How.XPATH, using = "//select[@id='jform_city']")
	public WebElement city;

	@FindBy(how = How.XPATH, using = "//input[@id='jform_other_city_check']")
	public WebElement othercity;

	@FindBy(how = How.XPATH, using = "//input[@id='jform_other_city_value']")
	public WebElement entercity;

	@FindBy(how = How.ID, using = "jform_zip")
	public WebElement zip;

	@FindBy(how = How.ID, using = "jform_taxnumber")
	public WebElement taxno;

	@FindBy(how = How.XPATH, using = "//button[@class='btn btn-success com_tmt_button']")
	public WebElement savebutton;

	@FindBy(how = How.XPATH, using = "//button[@class='btn com_tmt_button']")
	public WebElement cancel;

	/*
	 * Locators for Organizational donors
	 */

	@FindBy(how = How.XPATH, using = "//a[contains(text(),'New Organization Donor')]")
	public WebElement orgdonor;

	@FindBy(how = How.ID, using = "jform_name")
	public WebElement orgname;

	@FindBy(how = How.ID, using = "jform_website")
	public WebElement website;

	@FindBy(how = How.ID, using = "jform_email")
	public WebElement orgemail;

	@FindBy(how = How.ID, using = "jform_phone")
	public WebElement orgphone;

	@FindBy(how = How.ID, using = "jform_contact_name")
	public WebElement contactperson;

	@FindBy(how = How.XPATH, using = "//button[@class='btn btn-small button-apply btn-success']")
	public WebElement save;

	@FindBy(how = How.XPATH, using = "//button[@class='btn btn-small button-save']")
	public WebElement saveclose;

	@FindBy(how = How.XPATH, using = "//button[@class='btn btn-small button-save-new']")
	public WebElement savenew;

	@FindBy(how = How.XPATH, using = "//select[@id='donation_status']")
	public WebElement selectdonationstatus;

	/*
	 * Locators for listview
	 */

	@FindBy(how = How.XPATH, using = "//button[@class='btn hasTooltip js-stools-btn-filter']")
	public WebElement searchtools;

	@FindBy(how = How.XPATH, using = "//button[@class='btn hasTooltip js-stools-btn-clear']")
	public WebElement clear;

	@FindBy(how = How.XPATH, using = "//span[contains(text(),'- Campaign type -')]")
	public WebElement campaigntype;

	@FindBy(how = How.XPATH, using = "//li[contains(text(),'Donation')]")
	public WebElement donation;

	@FindBy(how = How.XPATH, using = "//li[contains(text(),'Investment')]")
	public WebElement investment;

	@FindBy(how = How.XPATH, using = "//span[contains(text(),'- Select Category -')]")
	public WebElement selectcategorydropdown;

	@FindBy(how = How.XPATH, using = "//li[contains(text(),'Uncategorised')]")
	public WebElement uncategorised;

	@FindBy(how = How.XPATH, using = "//span[contains(text(),'- Select Campaign -')]")
	public WebElement selectcampaigndropdown;

	@FindBy(how = How.XPATH, using = "//li[contains(text(),'Save Earth')]")
	public WebElement selectcampaign;

	@FindBy(how = How.XPATH, using = "//span[contains(text(),'- Approval status -')]")
	public WebElement approvalstatusdropdown;

	@FindBy(how = How.XPATH, using = "//li[contains(text(),'Confirmed')]")
	public WebElement confirmedstatus;

	@FindBy(how = How.XPATH, using = "//span[contains(text(),'Donor Type')]")
	public WebElement donortypedropdown;

	@FindBy(how = How.XPATH, using = "//li[contains(text(),'Individual')]")
	public WebElement individual;

	@FindBy(how = How.XPATH, using = "//input[@id='filter_search']")
	public WebElement searchbox;

	@FindBy(how = How.XPATH, using = "//span[@class='icon-search']")
	public WebElement searchicon;

	@FindBy(how = How.XPATH, using = "//a[contains(text(),'JGOID-000510')]")
	public WebElement donationID;

	@FindBy(how = How.XPATH, using = "//button[text()='View 80G Certificate']")
	public WebElement viewcertificatebtn;

	@FindBy(how = How.XPATH, using = "//button[text()='Print Receipt']")
	public WebElement printreceipt;

	@FindBy(how = How.XPATH, using = "//div[@id='toolbar-back']//button[1]")
	public WebElement backbtn;

	@FindBy(how = How.XPATH, using = "//input[@id='cb1']")
	public WebElement checkboxnum;

	@FindBy(how = How.XPATH, using = "//button[@class='btn btn-small button-delete']")
	public WebElement deletebtn;

	@FindBy(how = How.XPATH, using = "//select[@id='jform_vendor_id']")
	public WebElement selectvendor;

	/*
	 * 
	 * Method for New Donations
	 * 
	 */

	public AdminDonationsPage donations(String donorname, String donationamt, String donationstatus,
			String transactionid) throws Exception {

		click(donationclick); // Donations Tab
		logger.pass("User click on the Donations");
		click(newbutton); // New Button
		logger.pass("User click on the new button of donations");
		enterValue(donor, donorname);
		logger.pass("User fetching donor name from excelsheet");
		click(autosuggname); // Donor from autosuggestion list
		logger.pass("User click on the autosuggestion list of donors");
		click(donateannoymously); // Donate Annoymously
		logger.pass("User click on donate annoymously");
		click(selcamp); // Select Campaign
		logger.pass("User selecting campaign for donation");
		driver.switchTo().frame(frameElement);
		click(campclick); // click on selected campaign
		logger.pass("User click on the selected campaign");
		nogiveback.click();
		clearAndEnterValue(donationamount, donationamt);
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,4000)", "");
		logger.pass("User fetching donation amount from excelsheet");
		click(paymentrecdate); // Payment received date
		logger.pass("User click on payment received date");
		click(todaybutton);
		if (allElementsPaymentMethods.size() != 0) { // If list size is non-zero, element is present
			click(paymentmethods);
		}
		selectDropdown(selectdonationstatus, donationstatus);
		enterValue(transid, transactionid);
		logger.pass("User fetching transid from excelsheet");
		click(savedonation); // Save Donation
		logger.pass("User click on save donation button");
		logger.pass(" Donation saved successfully");
		return new AdminDonationsPage(driver);

	}

	/*
	 * 
	 * Method for Failed Donations
	 * 
	 */

	public AdminDonationsPage donationExpectingFailure(String donorname, String donationamt, String donationstatus,
			String transactionid) throws Exception {

		click(donationclick); // Donations Tab
		logger.pass("User click on the Donations");
		click(newbutton); // New Button
		logger.pass("User click on the new button of donations");
		enterValue(donor, donorname);
		logger.pass("User fetching donor name from excelsheet");
		click(autosuggname); // Donor from autosuggestion list
		logger.pass("User click on the autosuggestion list of donors");
		click(donateannoymously); // Donate Annoymously
		logger.pass("User click on donate annoymously");
		click(selcamp); // Select Campaign
		logger.pass("User selecting campaign for donation");
		driver.switchTo().frame(frameElement);
		click(campclick); // click on selected campaign
		logger.pass("User click on the selected campaign");
		nogiveback.click();
		clearAndEnterValue(donationamount, donationamt);
		logger.pass("User fetching donation amount from excelsheet");
		click(paymentrecdate); // Payment received date
		logger.pass("User click on payment received date");
		click(todaybutton);
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,2500)", "");
		if (allElementsPaymentMethods.size() != 0) { // If list size is non-zero, element is present
			click(paymentmethods);
		}
		selectDropdown(selectdonationstatus, donationstatus);
		enterValue(transid, transactionid);
		click(canceldonation);
		logger.pass("User click on save donations");
		logger.pass("User click on save&close button");
		logger.pass("Donation Failed");
		return new AdminDonationsPage(driver);

	}

	/*
	 * 
	 * Method for Send Email
	 * 
	 */

	public AdminDonationsPage email(String emailsub, String emailbody) {

		donationclick.click(); // Donations Tab
		logger.pass("User click on the Donations");
		checkboxnum.click(); // Checkbox
		logger.pass("User click on the checkbox");
		emailtodonorsbtn.click(); // Emailtodonor button
		logger.pass("User click on the email to donor button");
		enterValue(emailsubject, emailsub); // Email Subject
		logger.pass("User fetching email subject from excelsheet");
		enterValueInIframe(emaildesc, emailbody); // Email body
		logger.pass("User fetching email body from excelsheet");
		sendemail.click(); // Send email
		logger.pass("User click on the send email button");
		logger.pass("User sent email successfully");
		return new AdminDonationsPage(driver);
	}

	/*
	 * 
	 * Method for Donations List View
	 * 
	 */

	public AdminDonationsPage listview(String donorname) throws Exception {

		click(donationclick); // Donations
		logger.pass("Click on Donations");

		click(searchtools); // Search Tools
		logger.pass("Click on search tools button");
		enterValue(searchbox, donorname); // Search box
		logger.pass("User fetching donation ID from excelsheet");
		click(searchicon); // Search Icon
		logger.pass("Click on search icon");
		logger.pass("This is the list view of SearchByDonationID");
		click(clear);// Clear
		logger.pass("User click on the clear button");
		logger.pass("This is the list view of Donations");

		click(searchtools); // Search Tools
		logger.pass("Click on search tools button");
		WebDriverWait w = new WebDriverWait(driver, 30);
		w.until(ExpectedConditions.visibilityOf(campaigntype));
		click(campaigntype); // Campaign Type
		logger.pass("Click on Campaign Type dropdown");
		click(donation); // Donation /Investment
		logger.pass("User select campaign type as donation");
		logger.pass("This is the list view of selected campaign type");
		click(clear); // Clear
		logger.pass("User click on the clear button");
		logger.pass("This is the list view of Campaign Type");

		click(searchtools); // Search Tools
		logger.pass("Click on search tools button");
		w.until(ExpectedConditions.visibilityOf(approvalstatusdropdown));
		click(approvalstatusdropdown); // Approval Status Dropdown
		logger.pass("Click on Approval Status dropdown");
		click(confirmedstatus); // Confirmed Status
		logger.pass("User select approval status as Confirmed");
		logger.pass("This is the list view of selected Approval Status");
		click(clear); // Clear
		logger.pass("User click on the clear button");
		logger.pass("This is the list view of Approval Status");

		click(searchtools); // Search Tools
		logger.pass("Click on search tools button");
		w.until(ExpectedConditions.visibilityOf(selectcategorydropdown));
		click(selectcategorydropdown); // Select Category Dropdown
		logger.pass("Click on Select Category dropdown");
		click(uncategorised); // Uncategorized
		logger.pass("User select category as uncategorised");
		logger.pass("This is the list view of selected category");
		click(clear); // Clear
		logger.pass("User click on the clear button");
		logger.pass("This is the list view of Select Campaign Type");

		click(searchtools); // Search Tools
		logger.pass("Click on search tools button");
		w.until(ExpectedConditions.visibilityOf(selectcampaigndropdown));
		click(selectcampaigndropdown); // Select Campaign Dropdown
		logger.pass("Click on Select Campaign dropdown");
		click(selectcampaign); // Select Campaign
		logger.pass("User select campaign from the dropdownlist");
		logger.pass("This is the list view of selected campaign");
		click(clear); // Clear
		logger.pass("User click on the clear button");
		logger.pass("This is the list view of Select Campaign");

		click(searchtools); // Search Tools
		logger.pass("Click on search tools button");
		w.until(ExpectedConditions.visibilityOf(donortypedropdown));
		click(donortypedropdown); // Donor Type Dropdown
		logger.pass("Click on Donor Type dropdown");
		click(individual); // Individual
		logger.pass("User select donor type as Individual");
		logger.pass("This is the list view of selected Donor Type");
		click(clear); // Clear
		logger.pass("User click on the clear button");
		logger.pass("This is the list view of Donor Type");

		click(clear); // Clear
		logger.pass("User click on the clear button");
		logger.pass("This is the list view of Donations");
		System.out.println(" This is the list view for Donations");
		return new AdminDonationsPage(driver);

	}

	/*
	 * 
	 * Method for New Donations
	 * 
	 */

	public AdminDonationsPage donations() throws Exception {

		ExcelUtils.setExcelFile(Constant.TESTDATAPATH, "Donations");
		donationclick.click(); // Donations Tab
		logger.pass("User click on the Donations");
		newbutton.click(); // New Button
		logger.pass("User click on the new button of donations");
		donor.sendKeys(ExcelUtils.getCellData(2, 1)); // Select Donor
		logger.pass("User fetching donor name from excelsheet");
		autosuggname.click(); // Donor from autosuggestion list
		logger.pass("User click on the autosuggestion list of donors");
		donateannoymously.click(); // Donate Annoymously
		logger.pass("User click on donate annoymously");
		selcamp.click(); // Select Campaign
		logger.pass("User selecting campaign for donation");
		driver.switchTo().frame(frameElement);
		campclick.click(); // click on selected campaign
		logger.pass("User click on the selected campaign");
		donationamount.clear();
		donationamount.sendKeys(ExcelUtils.getCellData(2, 3)); // Donation amount
		logger.pass("User fetching donation amount from excelsheet");
		paymentrecdate.click(); // Payment received date
		logger.pass("User click on payment received date");
		todaybutton.click();
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,2500)", "");
		if (allElementsPaymentMethods.size() != 0) { // If list size is non-zero, element is present
			paymentmethods.click();
		}
		donationdropdown.click(); // Donation dropdown
		logger.pass("User click on the donation dropdown list");
		donationstatus.click(); // Donation status
		logger.pass("User click on donation status");
		transid.sendKeys(ExcelUtils.getCellData(2, 2)); // Transaction ID
		logger.pass("User fetching transid from excelsheet");
		savedonation.click(); // Save Donation
		logger.pass("User click on save donation button");
		logger.pass(" Donation saved successfully");
		return new AdminDonationsPage(driver);

	}

	/*
	 * 
	 * Method for Failed Donations
	 * 
	 */

	public AdminDonationsPage donationExpectingFailure() throws Exception {

		ExcelUtils.setExcelFile(Constant.TESTDATAPATH, "Donations");
		donationclick.click(); // Donations Tab
		logger.pass("User click on Donations");
		newbutton.click(); // New Button
		logger.pass("User click on new button of donations");
		donor.sendKeys(ExcelUtils.getCellData(3, 1)); // Donor name
		logger.pass("User fetching donor name from excelsheet");
		autosuggname.click(); // Select donor from auto suggestion list
		logger.pass("User click on autosuggestion list of donors");
		donateannoymously.click(); // Donate annoymously
		logger.pass("User click on donate annoymously");
		selcamp.click(); // Select Campaign
		logger.pass("User select campaign for donation");
		driver.switchTo().frame(frameElement);
		campclick.click(); // Click on selected campaign
		logger.pass("User click on the selected campaign");
		donationamount.clear();
		donationamount.sendKeys(ExcelUtils.getCellData(3, 3)); // Donation amount
		logger.pass("User fetching donation amount from excelsheet");
		paymentrecdate.click(); // Payment received date
		logger.pass("User click on payment received date");
		todaybutton.click();
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,2500)", "");
		if (allElementsPaymentMethods.size() != 0) { // If list size is non-zero, element is present
			paymentmethods.click();
		}
		donationdropdown.click(); // Donation dropdown
		logger.pass("User click on the donation dropdown list");
		donationstatus.click(); // Donation status
		logger.pass("User click on donation status");
		transid.sendKeys(ExcelUtils.getCellData(3, 2)); // Transaction ID
		logger.pass("User fetching transidfrom excelsheet");
		canceldonation.click(); // Cancel Donation
		logger.pass("User click on save donations");
		logger.pass("User click on save&close button");
		logger.pass("Donation Failed");
		return new AdminDonationsPage(driver);

	}

	/*
	 * 
	 * Method for selecting donor as individual
	 * 
	 */

	public AdminDonationsPage newindividualdonor() throws Exception {

		ExcelUtils.setExcelFile(Constant.TESTDATAPATH, "Donations");
		donationclick.click(); // Donations tab
		logger.pass("User click on Donations");
		newbutton.click(); // New Button
		logger.pass("User click on the new button of donations");
		newindidonor.click(); // New individual donor
		logger.pass("User click on individual donor for donations");
		driver.switchTo().frame(frameElement);
		s = new Select(selectvendor); // Select Vendor
		s.selectByVisibleText(ExcelUtils.getCellData(2, 28));
		fn.sendKeys(ExcelUtils.getCellData(2, 4)); // First name
		logger.pass("User fetching first name from excelsheet");
		ln.sendKeys(ExcelUtils.getCellData(2, 5)); // Last Name
		logger.pass("User fetching last name from excelsheet");
		logger.pass("User fetching email from excelsheet");
		phone.sendKeys(ExcelUtils.getCellData(2, 7)); // Phone
		logger.pass("User fetching phone from excelsheet");
		logger.pass("User click on the checkbox ");
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click();", addresstab); // Address tab
		logger.pass("User click on address tab");
		add1.sendKeys(ExcelUtils.getCellData(2, 8)); // Address1
		logger.pass("User fetching address1 from excelsheet");
		add2.sendKeys(ExcelUtils.getCellData(2, 9)); // Address2
		logger.pass("User fetching address2  from excelsheet");
		s = new Select(country);
		s.selectByVisibleText(ExcelUtils.getCellData(2, 23)); // Country
		logger.pass("User selecting country");
		s = new Select(state);
		s.selectByVisibleText(ExcelUtils.getCellData(2, 24)); // State
		logger.pass("User selecting state");
		s = new Select(city);
		s.selectByVisibleText(ExcelUtils.getCellData(2, 25)); // City
		logger.pass("User selecting city");
		othercity.click(); // Othercity checkbox
		logger.pass("User click on othercity checkbox");
		entercity.sendKeys(ExcelUtils.getCellData(2, 10)); // Other city
		logger.pass("User fetching othercity from excelsheet");
		zip.sendKeys(ExcelUtils.getCellData(2, 11)); // Zip
		logger.pass("User fetching zip from excelsheet");
		taxno.sendKeys(ExcelUtils.getCellData(2, 12)); // TaxNo.
		logger.pass("User fetching taxno.from excelsheet");
		savebutton.click(); // Individual donor save
		logger.pass("User click on save button");
		donateannoymously.click(); // Donate annoymously
		logger.pass("User click on donate annoymously");
		selcamp.click(); // Select Campaign
		logger.pass("User select campaign for donation");
		driver.switchTo().frame(frameElement);
		campclick.click(); // Click on selected campaign
		logger.pass("User click on the selected campaign");
		donationamount.clear();
		donationamount.sendKeys(ExcelUtils.getCellData(2, 3)); // Donation amount
		logger.pass("User fetching donation amount from excelsheet");
		paymentrecdate.click(); // Payment received date
		logger.pass("User click on payment received date");
		todaybutton.click();
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,2500)", "");
		if (allElementsPaymentMethods.size() != 0) { // If list size is non-zero, element is present
			paymentmethods.click();
		}
		donationdropdown.click(); // Donation dropdown
		logger.pass("User click on the donation dropdown list");
		donationstatus.click(); // Donation status
		logger.pass("User click on donation status");
		transid.sendKeys(ExcelUtils.getCellData(3, 2)); // Transaction ID
		logger.pass("User fetching transidfrom excelsheet");
		savedonation.click(); // Save Donation
		logger.pass("User saved the donation");
		return new AdminDonationsPage(driver);

	}

	/*
	 * 
	 * Method for selecting donor as organizational
	 * 
	 */

	public AdminDonationsPage neworgdonor() throws Exception {

		ExcelUtils.setExcelFile(Constant.TESTDATAPATH, "Donations");
		donationclick.click(); // Donations tab
		logger.pass("User click on Donations");
		newbutton.click(); // New Button
		logger.pass("User click on new button of donations");
		orgdonor.click(); // Organisational donor
		logger.pass("User click on organisational donor for donations");
		driver.switchTo().frame(frameElement);
		s = new Select(selectvendor);
		s.selectByVisibleText(ExcelUtils.getCellData(2, 28)); // Select Vendor
		orgname.sendKeys(ExcelUtils.getCellData(2, 13)); // Organisation Name
		logger.pass("User fetching organisation name from excelsheet");
		website.sendKeys(ExcelUtils.getCellData(2, 14)); // Website
		logger.pass("User fetching website from excelsheet");
		orgemail.sendKeys(ExcelUtils.getCellData(2, 15)); // Email
		logger.pass("User fetching email from excelsheet");
		orgphone.sendKeys(ExcelUtils.getCellData(2, 16)); // Organisation phone
		logger.pass("User fetching organisation phone from excelsheet");
		contactperson.sendKeys(ExcelUtils.getCellData(2, 21)); // Contact person
		logger.pass("User fetching contact person from excelsheet");
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click();", addresstab); // Address tab
		logger.pass("User click on address tab");
		add1.sendKeys(ExcelUtils.getCellData(2, 8)); // Address1
		logger.pass("User fetching address1 from excelsheet");
		add2.sendKeys(ExcelUtils.getCellData(2, 9)); // Address2
		logger.pass("User fetching address2 from excelsheet");
		s = new Select(country);
		s.selectByVisibleText(ExcelUtils.getCellData(2, 23)); // Country
		logger.pass("User selecting country");
		s = new Select(state);
		s.selectByVisibleText(ExcelUtils.getCellData(2, 24)); // State
		logger.pass("User selecting state");
		s = new Select(city);
		s.selectByVisibleText(ExcelUtils.getCellData(2, 25)); // City
		logger.pass("User selecting city");
		othercity.click(); // othercity checkbox
		logger.pass("User click on othercity checkbox");
		entercity.sendKeys(ExcelUtils.getCellData(2, 10)); // Other city
		logger.pass("User fetching othercity from excelsheet");
		zip.sendKeys(ExcelUtils.getCellData(2, 11)); // Zip
		logger.pass("User fetching zip from excelsheet");
		taxno.sendKeys(ExcelUtils.getCellData(2, 12)); // TaxNo.
		logger.pass("User fetching taxno. from excelsheet");
		savebutton.click(); // Save
		logger.pass("User save organisational donor");
		donateannoymously.click(); // Donate annoymously
		logger.pass("User click on donate annoymously");
		selcamp.click(); // Select Campaign
		logger.pass("User select campaign for donation");
		driver.switchTo().frame(frameElement);
		campclick.click(); // Click on selected campaign
		logger.pass("User click on the selected campaign");
		donationamount.clear();
		donationamount.sendKeys(ExcelUtils.getCellData(2, 3)); // Donation amount
		logger.pass("User fetching donation amount from excelsheet");
		paymentrecdate.click(); // Payment received date
		logger.pass("User click on payment received date");
		todaybutton.click();
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,2500)", "");
		if (allElementsPaymentMethods.size() != 0) { // If list size is non-zero, element is present
			paymentmethods.click();
		}
		donationdropdown.click(); // Donation dropdown
		logger.pass("User click on the donation dropdown list");
		donationstatus.click(); // Donation status
		logger.pass("User click on donation status");
		transid.sendKeys(ExcelUtils.getCellData(3, 2)); // Transaction ID
		logger.pass("User fetching transidfrom excelsheet");
		savedonation.click(); // Save Donation
		logger.pass("User saved the donation");
		return new AdminDonationsPage(driver);

	}

	/*
	 * 
	 * Method for Donations List View
	 * 
	 */

	public AdminDonationsPage listview() throws Exception {

		donationclick.click(); // Donations
		logger.pass("Click on Donations");
		searchbydonationID();
		campaigntype();
		approvalstatus();
		selectcategory();
		selectcampaign();
		donortype();
		clear.click(); // Clear
		logger.pass("User click on the clear button");
		logger.pass("This is the list view of Donations");
		return new AdminDonationsPage(driver);

	}

	private void campaigntype() {

		searchtools.click(); // Search Tools
		logger.pass("Click on search tools button");
		WebDriverWait w = new WebDriverWait(driver, 30);
		w.until(ExpectedConditions.visibilityOf(campaigntype));
		campaigntype.click(); // Campaign Type
		logger.pass("Click on Campaign Type dropdown");
		donation.click(); // Donation /Investment
		logger.pass("User select campaign type as donation");
		logger.pass("This is the list view of selected campaign type");
		clear.click(); // Clear
		logger.pass("User click on the clear button");
		logger.pass("This is the list view of Campaign Type");

	}

	private void selectcategory() {

		searchtools.click(); // Search Tools
		logger.pass("Click on search tools button");
		WebDriverWait w = new WebDriverWait(driver, 30);
		w.until(ExpectedConditions.visibilityOf(selectcategorydropdown));
		selectcategorydropdown.click(); // Select Category Dropdown
		logger.pass("Click on Select Category dropdown");
		uncategorised.click(); // Uncategorized
		logger.pass("User select category as uncategorised");
		logger.pass("This is the list view of selected category");
		clear.click(); // Clear
		logger.pass("User click on the clear button");
		logger.pass("This is the list view of Select Campaign Type");

	}

	private void selectcampaign() {

		searchtools.click(); // Search Tools
		logger.pass("Click on search tools button");
		WebDriverWait w = new WebDriverWait(driver, 30);
		w.until(ExpectedConditions.visibilityOf(selectcampaigndropdown));
		selectcampaigndropdown.click(); // Select Campaign Dropdown
		logger.pass("Click on Select Campaign dropdown");
		selectcampaign.click(); // Select Campaign
		logger.pass("User select campaign from the dropdownlist");
		logger.pass("This is the list view of selected campaign");
		clear.click(); // Clear
		logger.pass("User click on the clear button");
		logger.pass("This is the list view of Select Campaign");

	}

	private void approvalstatus() {

		searchtools.click(); // Search Tools
		logger.pass("Click on search tools button");
		WebDriverWait w = new WebDriverWait(driver, 30);
		w.until(ExpectedConditions.visibilityOf(approvalstatusdropdown));
		approvalstatusdropdown.click(); // Approval Status Dropdown
		logger.pass("Click on Approval Status dropdown");
		confirmedstatus.click(); // Confirmed Status
		logger.pass("User select approval status as Confirmed");
		logger.pass("This is the list view of selected Approval Status");
		clear.click(); // Clear
		logger.pass("User click on the clear button");
		logger.pass("This is the list view of Approval Status");

	}

	private void donortype() {

		searchtools.click(); // Search Tools
		logger.pass("Click on search tools button");
		WebDriverWait w = new WebDriverWait(driver, 30);
		w.until(ExpectedConditions.visibilityOf(donortypedropdown));
		donortypedropdown.click(); // Donor Type Dropdown
		logger.pass("Click on Donor Type dropdown");
		individual.click(); // Individual
		logger.pass("User select donor type as Individual");
		logger.pass("This is the list view of selected Donor Type");
		clear.click(); // Clear
		logger.pass("User click on the clear button");
		logger.pass("This is the list view of Donor Type");

	}

	private void searchbydonationID() throws Exception {

		ExcelUtils.setExcelFile(Constant.TESTDATAPATH, "Donations");
		searchtools.click(); // Search Tools
		logger.pass("Click on search tools button");
		searchbox.sendKeys(ExcelUtils.getCellData(2, 26)); // Search box
		logger.pass("User fetching donation ID from excelsheet");
		searchicon.click(); // Search Icon
		logger.pass("Click on search icon");
		logger.pass("This is the list view of SearchByDonationID");
		clear.click();// Clear
		logger.pass("User click on the clear button");
		logger.pass("This is the list view of Donations");

	}

	public AdminDonationsPage certificate() {

		donationclick.click(); // Donations Tab
		logger.pass("User click on the Donations");
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click();", donationID); // Donation ID
		logger.pass("User click on Donation ID from donation list view");
		viewcertificatebtn.click(); // View 80G Certificate Button
		backbtn.click();
		logger.pass("User click on View 80G Certificate button");
		logger.pass("User will get the 80G Certificate for selected donation");
		return new AdminDonationsPage(driver);

	}

	public AdminDonationsPage invoiceprint() {

		donationclick.click(); // Donations Tab
		logger.pass("User click on the Donations");
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click();", donationID); // Donation ID
		logger.pass("User click on Donation ID from donation list view");
		backbtn.click();
		logger.pass("This is the donation invoice of selected donation from donations list view");
		return new AdminDonationsPage(driver);

	}

}
