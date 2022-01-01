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
 * This is Page Class for User Organization Contacts. It contains all the
 * elements and actions related to User Organization Contacts.
 * 
 */

public class UserOrganizationContactsPage extends BaseClass {

	private WebDriver driver;
	private static Logger log = Logger.getLogger(UserOrganizationContactsPage.class);

	public UserOrganizationContactsPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	/*
	 * Locators for User Organization Contacts
	 */

	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Organization Contacts')]")
	public WebElement organizationcontacts;

	@FindBy(how = How.CSS, using = "#tjtoolbar-add .btn-success")
	public WebElement newbutton;

	@FindBy(how = How.CSS, using = "#tjtoolbar-edit .btn-success")
	public WebElement editbutton;

	@FindBy(how = How.CSS, using = "#tjtoolbar-publish .btn-success")
	public WebElement publish;

	@FindBy(how = How.CSS, using = "#tjtoolbar-unpublish .btn-warning")
	public WebElement unpublish;

	@FindBy(how = How.CSS, using = "#tjtoolbar-delete .btn-danger")
	public WebElement delete;

	@FindBy(how = How.CSS, using = "button[title='Send email to selected contact']")
	public WebElement sendemail;

	@FindBy(how = How.CSS, using = "button[title='Export']")
	public WebElement export;

	@FindBy(how = How.XPATH, using = "//*[@id=\"cb0\"]")
	public WebElement checkbox;

	@FindBy(how = How.CSS, using = "[onclick='Joomla\\.submitbutton\\(\\'organizationform\\.cancel\\'\\)']")
	public WebElement cancel;

	@FindBy(how = How.CSS, using = "[onclick] span")
	public WebElement submit;

	@FindBy(how = How.CSS, using = "input#filter_search")
	public WebElement filtersearch;

	@FindBy(how = How.CSS, using = "button > .icon-search")
	public WebElement searchicon;

	@FindBy(how = How.XPATH, using = "//button[@class='btn hasTooltip js-stools-btn-clear']")
	public WebElement clearsearch;

	@FindBy(how = How.CSS, using = "#jform_name")
	public WebElement orgname;

	@FindBy(how = How.CSS, using = "#jform_website")
	public WebElement website;

	@FindBy(how = How.CSS, using = "input#jform_email")
	public WebElement orgemail;

	@FindBy(how = How.CSS, using = "input#jform_phone")
	public WebElement orgphone;

	@FindBy(how = How.CSS, using = "input#jform_contact_name")
	public WebElement contactperson;

	@FindBy(how = How.CSS, using = "[onclick='Joomla\\.submitbutton\\(\\'organizationform\\.save\\'\\)']")
	public WebElement submitform;

	@FindBy(how = How.CSS, using = "input#jgive_subject")
	public WebElement emailsubject;

	@FindBy(how = How.CSS, using = "iframe#jgive_message_ifr")
	public WebElement frame;

	@FindBy(how = How.CSS, using = "#tjtoolbar-custom > button")
	public WebElement sendemailbtn;

	/*
	 * 
	 * Method for User Organization Contacts
	 * 
	 */

	public void organizationcontacts() throws Exception {

		try {
			if (!Constant.TESTDATAEXCEL.isEmpty())
				driver.get(Constant.TESTDATAEXCEL);
		} catch (Exception e) {
			ExcelUtils.setExcelFile(Constant.TESTDATAPATH, "UOrganizationDonor");
		}
		organizationcontacts.click();
		logger.pass("User click on Organization Contacts");
		checkbox.click();
		logger.pass("User click on checkbox");
		unpublish.click();
		logger.pass("User click on unpublish Organization Contacts");
		checkbox.click();
		logger.pass("User click on checkbox");
		publish.click();
		logger.pass("User click on publish Organization Contacts");
		checkbox.click();
		logger.pass("User click on checkbox");
		editbutton.click();
		logger.pass("User click on edit button");
		submit.click();
		logger.pass("User click on submit button");
		filtersearch.sendKeys(ExcelUtils.getCellData(1, 0));
		logger.pass("User click on filter search");
		searchicon.click();
		logger.pass("User click on search icon");
		clearsearch.click();
		logger.pass("User click on clear search");

	}

	/*
	 * 
	 * Method for New User Organization Contacts Creation
	 * 
	 */

	public void newdonor() throws Exception {

		try {
			if (!Constant.TESTDATAEXCEL.isEmpty())
				driver.get(Constant.TESTDATAEXCEL);
		} catch (Exception e) {
			ExcelUtils.setExcelFile(Constant.TESTDATAPATH, "UOrganizationDonor");
		}
		organizationcontacts.click();
		logger.pass("User click on Organization Contacts");
		newbutton.click();
		logger.pass("User click on new button");
		orgname.sendKeys(ExcelUtils.getCellData(1, 0));
		logger.pass("User fetching organization name from excelsheet");
		website.sendKeys(ExcelUtils.getCellData(1, 1));
		logger.pass("User fetching organization website from excelsheet");
		orgemail.sendKeys(ExcelUtils.getCellData(1, 2));
		logger.pass("User fetching organization email from excelsheet");
		orgphone.sendKeys(ExcelUtils.getCellData(1, 3));
		logger.pass("User fetching organization phone from excelsheet");
		contactperson.sendKeys(ExcelUtils.getCellData(1, 4));
		logger.pass("User fetching contact person from excelsheet");
		submitform.click();
		logger.pass("User click on submit button");
		filtersearch.sendKeys(ExcelUtils.getCellData(1, 0));
		logger.pass("User fetching organization name from excelsheet");
		searchicon.click();
		logger.pass("User click on search icon");
		checkbox.click();
		logger.pass("User click on checkbox");
		sendemail.click();
		logger.pass("User click on send email");
		emailsubject.sendKeys(ExcelUtils.getCellData(1, 5));
		logger.pass("User fetching email subject from excelsheet");
		driver.switchTo().frame(frame); // Description
		WebElement editable = driver.switchTo().activeElement();
		editable.sendKeys(ExcelUtils.getCellData(1, 6));
		driver.switchTo().defaultContent();
		logger.pass("User fetching email body from excelsheet");
		sendemailbtn.click();
		logger.pass("User click on send email button");
		filtersearch.clear();
		logger.pass("User clear filter search");
		filtersearch.sendKeys(ExcelUtils.getCellData(1, 0));
		logger.pass("User fetching organization name from excelsheet");
		searchicon.click();
		logger.pass("User click on search icon");
		checkbox.click();
		logger.pass("User click on checkbox");
		delete.click();
		logger.pass("User click on delete button");
		driver.switchTo().alert().accept();
		logger.pass("User accepts the alert");

	}

}
