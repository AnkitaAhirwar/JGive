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
 * This is Page Class for User Individual Contacts . It contains all the
 * elements and actions related to User Individual Contacts.
 * 
 */

public class UserIndividualContactsPage extends BaseClass {

	private WebDriver driver;
	private static Logger log = Logger.getLogger(UserIndividualContactsPage.class);

	public UserIndividualContactsPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	/*
	 * Locators for User Individual Contacts
	 */

	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Individual Contacts')]")
	public WebElement individualcontacts;

	@FindBy(how = How.CSS, using = "#tjtoolbar-add .btn-success")
	public WebElement newbutton;

	@FindBy(how = How.CSS, using = "#tjtoolbar-edit .btn-success")
	public WebElement editbutton;

	@FindBy(how = How.CSS, using = "#tjtoolbar-publish .btn-success")
	public WebElement publishbutton;

	@FindBy(how = How.XPATH, using = "//button[@class='btn btn-small btn-warning']")
	public WebElement unpublishbutton;

	@FindBy(how = How.XPATH, using = "//button[@class='btn btn-small btn-danger']")
	public WebElement deletebutton;

	@FindBy(how = How.XPATH, using = "//*[@id=\"tjtoolbar-custom\"]/button")
	public WebElement sendemailbutton;

	@FindBy(how = How.CSS, using = "button[title='Export']")
	public WebElement exportbutton;

	@FindBy(how = How.XPATH, using = "//*[@id=\"cb0\"]")
	public WebElement checkbox;

	@FindBy(how = How.XPATH, using = "//*[@id=\"jform_phone\"]")
	public WebElement contactno;

	@FindBy(how = How.XPATH, using = "//*[@id=\"jform_create_user\"]")
	public WebElement createuser;

	@FindBy(how = How.XPATH, using = "//*[@id=\"jform_first_name\"]")
	public WebElement firstname;

	@FindBy(how = How.XPATH, using = "//*[@id=\"jform_last_name\"]")
	public WebElement lastname;

	@FindBy(how = How.XPATH, using = "//*[@id=\"jform_email\"]")
	public WebElement email;

	@FindBy(how = How.XPATH, using = "//*[@id=\"jform_taxnumber\"]")
	public WebElement taxid;

	@FindBy(how = How.XPATH, using = "//span[contains(text(),'Submit')]")
	public WebElement submit;

	@FindBy(how = How.XPATH, using = "//button[contains(text(),'Cancel')]")
	public WebElement cancel;

	@FindBy(how = How.XPATH, using = "//*[@id=\"jgive_subject\"]")
	public WebElement emailsubject;

	@FindBy(how = How.XPATH, using = "//*[@id=\"jgive_message_ifr\"]")
	public WebElement frame;

	@FindBy(how = How.XPATH, using = "//*[@id=\"tjtoolbar-custom\"]/button")
	public WebElement sendemail;

	@FindBy(how = How.XPATH, using = "//*[@id=\"filter_search\"]")
	public WebElement filtersearch;

	@FindBy(how = How.XPATH, using = "//span[@class='icon-search']")
	public WebElement searchicon;

	@FindBy(how = How.XPATH, using = "//button[@class='btn hasTooltip js-stools-btn-clear']")
	public WebElement clear;

	/*
	 * 
	 * Method for User Individual Contacts
	 * 
	 */

	public UserIndividualContactsPage individualcontact() throws Exception {

		try {
			if (!Constant.TESTDATAEXCEL.isEmpty())
				driver.get(Constant.TESTDATAEXCEL);
		} catch (Exception e) {
			ExcelUtils.setExcelFile(Constant.TESTDATAPATH, "UserIndividualDonor");
		}
		individualcontacts.click();
		logger.pass("User click on Individual Contacts");
		checkbox.click();
		logger.pass("User click on checkbox");
		unpublishbutton.click();
		logger.pass("User click on Unpublish donor button");
		checkbox.click();
		logger.pass("User click on checkbox");
		publishbutton.click();
		logger.pass("User click on Publish donor button");
		filtersearch.sendKeys(ExcelUtils.getCellData(1, 7));
		logger.pass("User click on fetching donor name from excelsheet");
		searchicon.click();
		logger.pass("User click on Search icon");
		clear.click();
		logger.pass("User click on Clear button");
		exportbutton.click();
		logger.pass("User click on Export button");
		return new UserIndividualContactsPage(driver);

	}

	/*
	 * 
	 * Method for New Individual Contacts Creation
	 * 
	 */

	public UserIndividualContactsPage newdonor() throws Exception {

		try {
			if (!Constant.TESTDATAEXCEL.isEmpty())
				driver.get(Constant.TESTDATAEXCEL);
		} catch (Exception e) {
			ExcelUtils.setExcelFile(Constant.TESTDATAPATH, "UserIndividualDonor");
		}
		individualcontacts.click();
		logger.pass("User click on Individual Contacts");
		newbutton.click();
		logger.pass("User click on new button");
		firstname.sendKeys(ExcelUtils.getCellData(1, 0));
		logger.pass("User fetching first name from excelsheet");
		lastname.sendKeys(ExcelUtils.getCellData(1, 1));
		logger.pass("User fetching last name from excelsheet");
		email.sendKeys(ExcelUtils.getCellData(1, 2));
		logger.pass("User fetching email from excelsheet");
		contactno.sendKeys(ExcelUtils.getCellData(1, 3));
		logger.pass("User fetching contact number from excelsheet");
		taxid.sendKeys(ExcelUtils.getCellData(1, 4));
		logger.pass("User fetching tax id from excelsheet");
		submit.click();
		logger.pass("Individual Donor created successfully");
		logger.pass("User click on submit button");
		filtersearch.sendKeys(ExcelUtils.getCellData(1, 8));
		logger.pass("User fetching donor name from excelsheet");
		searchicon.click();
		logger.pass("User click on the search icon");
		checkbox.click();
		logger.pass("User click on checkbox");
		sendemailbutton.click();
		logger.pass("User click on send email button");
		emailsubject.sendKeys(ExcelUtils.getCellData(1, 5));
		logger.pass("User fetching email subject from excelsheet");
		driver.switchTo().frame(frame); // Description
		WebElement editable = driver.switchTo().activeElement();
		editable.sendKeys(ExcelUtils.getCellData(1, 6));
		driver.switchTo().defaultContent();
		logger.pass("User fetching email body from excelsheet");
		sendemail.click();
		logger.pass("Email sent to donor successfully");
		logger.pass("User click on send email button");
		clear.click();
		logger.pass("User click on clear button");
		filtersearch.sendKeys(ExcelUtils.getCellData(1, 8));
		logger.pass("User fetching donor name from excelsheet");
		searchicon.click();
		logger.pass("User click on search icon");
		checkbox.click();
		logger.pass("User click on checkbox");
		deletebutton.click();
		logger.pass("User click on delete button");
		driver.switchTo().alert().accept();
		logger.pass("User accept pop alert");
		logger.pass("Individual Donor deleted successfully");
		return new UserIndividualContactsPage(driver);

	}

}
