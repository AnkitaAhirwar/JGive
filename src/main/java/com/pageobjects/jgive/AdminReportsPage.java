package com.pageobjects.jgive;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.StaleElementReferenceException;
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
 * This is Page Class for Admin Reports. It contains all the elements and
 * actions related to Admin Reports.
 * 
 */

public class AdminReportsPage extends BaseClass {

	private WebDriver driver;
	private static Logger log = Logger.getLogger(AdminReportsPage.class);
	Select s;

	public AdminReportsPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	/*
	 * Locators for Reports
	 */

	@FindBy(how = How.XPATH, using = "//*[@id=\"submenu\"]/li[12]/a")
	public WebElement reports;

	@FindBy(how = How.XPATH, using = "//*[@id=\"report_select_chzn\"]/a/div/b")
	public WebElement reportsdropdown;

	@FindBy(how = How.XPATH, using = "//li[contains(text(),'Campaigns Report')]")
	public WebElement campaignreport;

	@FindBy(how = How.XPATH, using = "//li[contains(text(),'Campaigns Promoter Report')]")
	public WebElement campaignspromoterreport;

	@FindBy(how = How.XPATH, using = "//li[contains(text(),'Contributions Report')]")
	public WebElement contributionsreport;

	@FindBy(how = How.XPATH, using = "//li[contains(text(),'Donors Report')]")
	public WebElement donorsreport;

	@FindBy(how = How.XPATH, using = "//li[contains(text(),'Giveback Report')]")
	public WebElement givebackreport;

	@FindBy(how = How.XPATH, using = "//li[contains(text(),'Organization donor report')]")
	public WebElement organisationaldonorreport;

	@FindBy(how = How.XPATH, using = "//li[contains(text(),'Individual donor report')]")
	public WebElement individualdonorreport;

	@FindBy(how = How.XPATH, using = "//*[@id=\"show-filter\"]")
	public WebElement searchtools;

	@FindBy(how = How.XPATH, using = "//*[@id=\"filters_o.cdate_from\"]")
	public WebElement datefrom;

	@FindBy(how = How.XPATH, using = "//*[@id=\"filters_o.cdate_to\"]")
	public WebElement dateto;

	@FindBy(how = How.XPATH, using = "//button[@class='btn hasTooltip']//i[@class='fa fa-search']")
	public WebElement searchbutton;

	@FindBy(how = How.XPATH, using = "//button[@class='btn hasTooltip']//i[@class='fa fa-remove']")
	public WebElement clear;

	@FindBy(how = How.XPATH, using = "//*[@id=\"filtersdonor_type_chzn\"]/a/span")
	public WebElement searchoptions;

	@FindBy(how = How.XPATH, using = "//li[contains (text(), 'Guest Donors')]")
	public WebElement selectdonor;

	@FindBy(how = How.XPATH, using = "//*[@id=\"filterstypeOfDonor_chzn\"]/a/span")
	public WebElement donortype;

	@FindBy(how = How.XPATH, using = "//li[contains(text(),'Individual')]")
	public WebElement donortypeselect;

	@FindBy(how = How.XPATH, using = "//*[@id=\"show-hide-cols-btn\"]")
	public WebElement showhidecolbtn;

	@FindBy(how = How.XPATH, using = "//input[@id='goal_amount']")
	public WebElement goalamount;

	@FindBy(how = How.XPATH, using = "//input[@id='orgindtype']")
	public WebElement organizationtype;

	@FindBy(how = How.XPATH, using = "//*[@id=\"promoter\"]")
	public WebElement promotername;

	@FindBy(how = How.XPATH, using = "//input[@id='city']")
	public WebElement city;

	@FindBy(how = How.XPATH, using = "//input[@id='quantity']")
	public WebElement availedgivebacks;

	@FindBy(how = How.XPATH, using = "//input[@id='address']")
	public WebElement address;

	@FindBy(how = How.XPATH, using = "//input[@id='zip']")
	public WebElement zip;

	@FindBy(how = How.XPATH, using = "//input[@id='category']")
	public WebElement category;

	@FindBy(how = How.XPATH, using = "//input[@id='title']")
	public WebElement campaign;

	@FindBy(how = How.XPATH, using = "//input[@id='region']")
	public WebElement state;

	@FindBy(how = How.XPATH, using = "//input[@id='promoteremail']")
	public WebElement promoteremail;

	@FindBy(how = How.XPATH, using = "//input[@id='donor_count']")
	public WebElement donorcount;

	@FindBy(how = How.XPATH, using = "//input[@id='total_quantity']")
	public WebElement totalquantity;

	@FindBy(how = How.XPATH, using = "//input[@id='amount']")
	public WebElement amount;

	@FindBy(how = How.XPATH, using = "//input[@id='website']")
	public WebElement website;

	@FindBy(how = How.XPATH, using = "//input[@id='contactperson']")
	public WebElement contactperson;

	@FindBy(how = How.XPATH, using = "//input[@id='email']")
	public WebElement email;

	@FindBy(how = How.XPATH, using = "//input[@id='phone']")
	public WebElement phone;

	@FindBy(how = How.XPATH, using = "//input[@id='donationcount']")
	public WebElement donationcount;

	@FindBy(how = How.XPATH, using = "//input[@id='commission']")
	public WebElement commission;

	@FindBy(how = How.XPATH, using = "//input[@id='payment_method']")
	public WebElement paymentmethod;

	@FindBy(how = How.XPATH, using = "//input[@id='donor_type']")
	public WebElement contributortype;

	@FindBy(how = How.XPATH, using = "//input[@id='donoremail']")
	public WebElement donoremail;

	@FindBy(how = How.XPATH, using = "//input[@id='org_name']")
	public WebElement org_name;

	@FindBy(how = How.XPATH, using = "//*[@id=\"filterspromoter_chzn\"]/a/span")
	public WebElement selectpromoter;

	@FindBy(how = How.XPATH, using = "//li[contains(text(),'Ankita')]")
	public WebElement selectpromotername;

	public AdminReportsPage campaignReport() throws Exception {

		reports.click(); // Reports
		logger.pass("User click on Reports");
		reportsdropdown.click(); // Reports Dropdown
		logger.pass("User click on Reports dropdown");
		campaignreport.click(); // Campaigns Report
		logger.pass("User click on Campaigns Report");
		logger.pass("This is the list view of Campaigns Report");
		showhidecolbtn.click(); // ShowHide Column
		logger.pass("User click on hide and show columns button");
		goalamount.click(); // Goal amount
		logger.pass("User click on goal amount");
		driver.navigate().refresh();
		showhidecolbtn.click(); // ShowHide Column
		logger.pass("User click on hide and show columns button");
		promotername.click(); // Promoter name
		logger.pass("User click on promoter name");
		driver.navigate().refresh();
		showhidecolbtn.click(); // ShowHide Column
		logger.pass("User click on hide and show columns button");
		organizationtype.click(); // Organization type
		logger.pass("User click on orgaization type");
		driver.navigate().refresh();
		showhidecolbtn.click(); // ShowHide Column
		logger.pass("User click on hide and show columns button");
		campaign.click(); // Campaign
		logger.pass("User click on campaign");
		driver.navigate().refresh();
		searchtools.click(); // Search Tools
		logger.pass("User click on search tools");
		Thread.sleep(1000);
		selectpromoter.click(); // Select Promoter
		logger.pass("User click on select promoter");
		selectpromotername.click(); // Select Promoter Name
		logger.pass("User click on select promoter name");
		logger.pass("This is the Campaign Report Page");
		return new AdminReportsPage(driver);

	}

	public AdminReportsPage campaignPromoterReport() {

		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click();", reports); // Reports
		logger.pass("User click on Reports");
		reportsdropdown.click(); // Reports dropdown
		logger.pass("User click on Reports dropdown");
		campaignspromoterreport.click(); // Campaigns Promoter Report
		logger.pass("User click on Campaigns Promoter Report");
		logger.pass("This is the list view of Campaigns Promoter Report");
		showhidecolbtn.click(); // ShowHide Column
		logger.pass("User click on hide and show columns button");
		city.click(); // City
		logger.pass("User click on city");
		driver.navigate().refresh();
		showhidecolbtn.click(); // ShowHide Column
		logger.pass("User click on hide and show columns button");
		state.click(); // State
		logger.pass("User click on state");
		driver.navigate().refresh();
		showhidecolbtn.click(); // ShowHide Column
		logger.pass("User click on hide and show columns button");
		promoteremail.click(); // Promoter email
		logger.pass("User click on promoter email");
		driver.navigate().refresh();
		showhidecolbtn.click(); // ShowHide Column
		logger.pass("User click on hide and show columns button");
		donorcount.click(); // Donor count
		logger.pass("User click on donor count");
		return new AdminReportsPage(driver);

	}

	public void contributionsReport(String datefromvalue, String datetovalue) throws Exception {

		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click();", reports); // Reports
		logger.pass("User click on Reports");
		click(reportsdropdown); // Reports dropdown
		logger.pass("User click on Reports dropdown");
		click(contributionsreport); // Contributions Report
		logger.pass("User click on Contributions Report");
		click(searchtools); // Search tools
		logger.pass("User click on search tools");
		clearAndEnterValue(datefrom, datefromvalue); // Date From
		logger.pass("User fetching 'FromDate' from the excelsheet");
		clearAndEnterValue(dateto, datetovalue); // Date To
		logger.pass("User fetching 'ToDate' from the excelsheet");
		click(searchbutton); // Search Button
		logger.pass("User click on search button");
		driver.navigate().refresh();
		click(showhidecolbtn);
		click(commission);
		driver.navigate().refresh();
		click(showhidecolbtn);
		click(paymentmethod);
		driver.navigate().refresh();
		click(showhidecolbtn);
		click(contributortype);

	}

	public AdminReportsPage contributionsReport() throws Exception {

		ExcelUtils.setExcelFile(Constant.TESTDATAPATH, "Reports");
		JavascriptExecutor executor = (JavascriptExecutor) driver; // Reports
		executor.executeScript("arguments[0].click();", reports);
		logger.pass("User click on Reports");
		reportsdropdown.click(); // Reports dropdown
		logger.pass("User click on Reports dropdown");
		contributionsreport.click(); // Contributions Report
		logger.pass("User click on Contributions Report");
		searchtools.click(); // Search tools
		logger.pass("User click on search tools");
		datefrom.sendKeys(ExcelUtils.getCellData(1, 1)); // Date From
		logger.pass("User fetching 'FromDate' from the excelsheet");
		dateto.sendKeys(ExcelUtils.getCellData(1, 2)); // Date To
		logger.pass("User fetching 'ToDate' from the excelsheet");
		searchbutton.click(); // Search Button
		logger.pass("User click on search button");
		driver.navigate().refresh();
		showhidecolbtn.click(); // ShowHide Column
		logger.pass("User click on hide and show columns button");
		commission.click(); // Commission
		logger.pass("User click on commission");
		driver.navigate().refresh();
		showhidecolbtn.click(); // ShowHide Column
		logger.pass("User click on hide and show columns button");
		paymentmethod.click(); // Payment method
		logger.pass("User click on payment method");
		driver.navigate().refresh();
		showhidecolbtn.click(); // ShowHide Column
		logger.pass("User click on hide and show columns button");
		contributortype.click(); // Contributor type
		logger.pass("User click on contributor type");
		return new AdminReportsPage(driver);

	}

	public AdminReportsPage donorsReport() throws InterruptedException {

		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click();", reports); // Reports
		logger.pass("User click on Reports");
		reportsdropdown.click(); // Reports dropdown
		logger.pass("User click on Reports dropdown");
		donorsreport.click(); // Donors Report
		logger.pass("User click on Donors Report");
		showhidecolbtn.click(); // ShowHide Column
		logger.pass("User click on hide and show columns button");
		org_name.click(); // Organization name
		logger.pass("User click on organization name");
		driver.navigate().refresh();
		showhidecolbtn.click(); // ShowHide Column
		logger.pass("User click on hide and show columns button");
		donoremail.click(); // Donor email
		logger.pass("User click on donor email");
		driver.navigate().refresh();
		searchtools.click(); // Search tools
		logger.pass("User click on search tools");
		Thread.sleep(1000);
		searchoptions.click(); // Search options
		logger.pass("User click on search options");
		selectdonor.click(); // Select donor
		logger.pass("User selects donor as Guest Donors");
		Thread.sleep(1000);
		donortype.click(); // Donor type
		logger.pass("User click on donor type");
		donortypeselect.click(); // Select donor type
		logger.pass("User selects donor type as Individual");
		return new AdminReportsPage(driver);

	}

	public AdminReportsPage givebackReport() {

		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click();", reports); // Reports
		logger.pass("User click on Reports");
		reportsdropdown.click(); // Reports dropdown
		logger.pass("User click on Reports dropdown");
		givebackreport.click(); // Giveback Report
		logger.pass("User click on Giveback Report");
		logger.pass("This is the list view of Giveback Report");
		showhidecolbtn.click(); // ShowHide Column
		logger.pass("User click on hide and show columns button");
		availedgivebacks.click(); // Availed givebacks
		logger.pass("User click on availed givebacks");
		driver.navigate().refresh();
		showhidecolbtn.click(); // ShowHide Column
		logger.pass("User click on hide and show columns button");
		totalquantity.click(); // Total quantity
		logger.pass("User click on total quantity");
		driver.navigate().refresh();
		showhidecolbtn.click(); // ShowHide Column
		logger.pass("User click on hide and show columns button");
		amount.click(); // Amount
		logger.pass("User click on amount");
		return new AdminReportsPage(driver);

	}

	public AdminReportsPage organisationalDonorReport() {

		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click();", reports); // Reports
		logger.pass("User click on Reports");
		reportsdropdown.click(); // Reports dropdown
		logger.pass("User click on Reports dropdown");
		organisationaldonorreport.click(); // Organisation Donor Report
		logger.pass("User click on organization Donor Report");
		logger.pass("This is the list view of Organization Donor Report");
		showhidecolbtn.click(); // ShowHide Column
		logger.pass("User click on hide and show columns button");
		address.click(); // Address
		logger.pass("User click on address");
		driver.navigate().refresh();
		showhidecolbtn.click(); // ShowHide Column
		logger.pass("User click on hide and show columns button");
		website.click(); // Website
		logger.pass("User click on website");
		driver.navigate().refresh();
		showhidecolbtn.click(); // ShowHide Column
		logger.pass("User click on hide and show columns button");
		contactperson.click(); // Contact Person
		logger.pass("User click on contact person");
		return new AdminReportsPage(driver);

	}

	public AdminReportsPage individualDonorReport() {

		reports.click(); // Reports
		logger.pass("User click on Reports");
		reportsdropdown.click(); // reports dropdown
		logger.pass("User click on Reports dropdown");
		individualdonorreport.click(); // Individual Donor Report
		logger.pass("User click on individual Donor Report");
		logger.pass("This is the list view of Individual Donor Report");
		showhidecolbtn.click(); // ShowHide Column
		logger.pass("User click on hide and show columns button");
		zip.click(); // Zip address
		logger.pass("User click on zip address");
		driver.navigate().refresh();
		showhidecolbtn.click(); // ShowHide Column
		logger.pass("User click on hide and show columns button");
		email.click(); // Email
		logger.pass("User click on email");
		driver.navigate().refresh();
		showhidecolbtn.click(); // ShowHide Column
		logger.pass("User click on hide and show columns button");
		donationcount.click(); // Donation count
		logger.pass("User click on donation count");
		driver.navigate().refresh();
		showhidecolbtn.click(); // ShowHide Column
		logger.pass("User click on hide and show columns button");
		phone.click(); // Phone
		logger.pass("User click on phone");
		return new AdminReportsPage(driver);

	}

}
