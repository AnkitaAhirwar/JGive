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

/**
 * This is Page Class for User Reports Page. It contains all the elements and
 * actions related to User Reports Page.
 * 
 */

public class UserReportsPage extends BaseClass {

	private WebDriver driver;
	private static Logger log = Logger.getLogger(UserReportsPage.class);

	public UserReportsPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	/*
	 * Locators for User Reports Page
	 */

	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Reports')]")
	public WebElement reports;

	@FindBy(how = How.XPATH, using = "//*[@id=\"report_select_chzn\"]/a/span")
	public WebElement reportsdropdown;

	@FindBy(how = How.XPATH, using = "//li[contains(text(),'Campaigns Report')]")
	public WebElement campaignsreport;

	@FindBy(how = How.XPATH, using = "//li[contains(text(),'Campaigns Promoter Report')]")
	public WebElement campaignspromoterreport;

	@FindBy(how = How.XPATH, using = "//li[contains(text(),'Contributions Report')]")
	public WebElement contributionsreport;

	@FindBy(how = How.XPATH, using = "//li[contains(text(),'Donors Report')]")
	public WebElement donorsreport;

	@FindBy(how = How.XPATH, using = "//li[contains(text(),'Giveback Report')]")
	public WebElement givebackreport;

	@FindBy(how = How.XPATH, using = "//li[contains(text(),'Organization donor report')]")
	public WebElement organizationdonorreport;

	@FindBy(how = How.XPATH, using = "//li[contains(text(),'Individual donor report')]")
	public WebElement individualdonorreport;

	@FindBy(how = How.CSS, using = ".title > .table-heading > a[title='search'] > .fa.fa-search")
	public WebElement campaignsearchicon;

	@FindBy(how = How.XPATH, using = "//*[@id=\"filterstitle_chzn\"]/a/span")
	public WebElement campaignfilter;

	@FindBy(how = How.XPATH, using = "//li[contains(text(),'Save Environment')]")
	public WebElement campaignselect;

	@FindBy(how = How.CSS, using = ".title button[title='Cancel Search'] > .fa.fa-remove")
	public WebElement clearcampaign;

	@FindBy(how = How.CSS, using = ".type > .table-heading > a[title='search'] > .fa.fa-search")
	public WebElement typesearchicon;

	@FindBy(how = How.XPATH, using = "//*[@id=\"filterstype_chzn\"]/a/span")
	public WebElement typedropdown;

	@FindBy(how = How.XPATH, using = "//li[contains(text(),'Donation')]")
	public WebElement type;

	@FindBy(how = How.XPATH, using = "//*[@id=\"show-hide-cols-btn\"]")
	public WebElement hideshowcolbtn;

	@FindBy(how = How.XPATH, using = "//*[@id=\"promoteraddress\"]")
	public WebElement promoteraddress;

	@FindBy(how = How.XPATH, using = "//*[@id=\"promoterphone\"]")
	public WebElement promoterphone;

	@FindBy(how = How.XPATH, using = "//*[@id=\"donorphone\"]")
	public WebElement donorphone;

	@FindBy(how = How.XPATH, using = "//*[@id=\"country\"]")
	public WebElement country;

	@FindBy(how = How.XPATH, using = "//*[@id=\"show-filter\"]")
	public WebElement searchtools;

	@FindBy(how = How.XPATH, using = "//*[@id=\"filters_o.cdate_from\"]")
	public WebElement datefrom;

	@FindBy(how = How.XPATH, using = "//*[@id=\"filters_o.cdate_to\"]")
	public WebElement dateto;

	@FindBy(how = How.CSS, using = "[onclick] .fa-search")
	public WebElement datesearchicon;

	@FindBy(how = How.CSS, using = ".filter-btn-block .fa-remove")
	public WebElement dateclearicon;

	@FindBy(how = How.XPATH, using = "//*[@id=\"email\"]")
	public WebElement email;

	@FindBy(how = How.XPATH, using = "//*[@id=\"amount\"]")
	public WebElement amount;

	@FindBy(how = How.XPATH, using = "//*[@id=\"zip\"]")
	public WebElement zip;

	@FindBy(how = How.XPATH, using = "//*[@id=\"donationcount\"]")
	public WebElement numofdonations;

	@FindBy(how = How.XPATH, using = "//*[@id=\"state\"]")
	public WebElement state;

	@FindBy(how = How.XPATH, using = "//*[@id=\"website\"]")
	public WebElement website;

	@FindBy(how = How.XPATH, using = "//*[@id=\"campaign_title\"]")
	public WebElement campaigntitle;

	@FindBy(how = How.XPATH, using = "//*[@id=\"total_quantity\"]")
	public WebElement totalgiveback;

	@FindBy(how = How.XPATH, using = "//*[@id=\"filtersdonor_type_chzn\"]/a/span")
	public WebElement selectoption;

	@FindBy(how = How.XPATH, using = "//li[contains(text(),'Guest Donors')]")
	public WebElement guestdonors;

	@FindBy(how = How.XPATH, using = "//*[@id=\"filterstypeOfDonor_chzn\"]/a/div/b")
	public WebElement donortype;

	@FindBy(how = How.XPATH, using = "//li[contains(text(),'Individual')]")
	public WebElement individual;

	@FindBy(how = How.XPATH, using = "//*[@id=\"totaldonatedamount\"]")
	public WebElement totaldonatedamt;

	@FindBy(how = How.XPATH, using = "//*[@id=\"org_name\"]")
	public WebElement orgname;

	@FindBy(how = How.XPATH, using = "//*[@id=\"campaign_id\"]")
	public WebElement donationcount;

	/*
	 * 
	 * Method for User Campaigns Reports
	 * 
	 */

	public UserReportsPage campaignsreport() {

		reports.click();
		logger.pass("User click on the Reports");
		reportsdropdown.click();
		logger.pass("User click on the reports dropdown");
		campaignsreport.click();
		logger.pass("User click on the Campaigns Report");
		campaignsearchicon.click();
		logger.pass("User click on the campaigns search icon");
		campaignfilter.click();
		logger.pass("User click on the campaigns filters");
		campaignselect.click();
		logger.pass("User selects campaign");
		driver.navigate().refresh();
		typesearchicon.click();
		logger.pass("User click on the typesearch icon");
		typedropdown.click();
		logger.pass("User click on the typedropdown");
		type.click();
		logger.pass("User selects type for campaigns report");
		driver.navigate().refresh();
		logger.pass("This is the list view of Campaigns Report");
		return new UserReportsPage(driver);

	}

	/*
	 * 
	 * Method for User Campaigns Promoter Report
	 * 
	 */

	public UserReportsPage campaignpromoterreport() {

		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,-2500)", "");
		reports.click();
		logger.pass("User click on the Reports");
		reportsdropdown.click();
		logger.pass("User click on the reports dropdown");
		campaignspromoterreport.click();
		logger.pass("User click on the Campaigns Promoter Report");
		hideshowcolbtn.click();
		logger.pass("User click on hideandshow columns button");
		promoteraddress.click();
		logger.pass("User click on promoter address");
		driver.navigate().refresh();
		hideshowcolbtn.click();
		logger.pass("User click on hideandshow columns button");
		promoterphone.click();
		logger.pass("User click on promoter phone");
		driver.navigate().refresh();
		logger.pass("This is the list view of Campaigns Promoter Report");
		return new UserReportsPage(driver);

	}

	/*
	 * 
	 * Method for User Contributions Reports
	 * 
	 */

	public UserReportsPage contributionsreport() throws Exception {

		try {
			if (!Constant.TESTDATAEXCEL.isEmpty())
				driver.get(Constant.TESTDATAEXCEL);
		} catch (Exception e) {
			ExcelUtils.setExcelFile(Constant.TESTDATAPATH, "Reports");
		}
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,-2500)", "");
		reports.click();
		logger.pass("User click on the Reports");
		reportsdropdown.click();
		logger.pass("User click on the reports dropdown");
		contributionsreport.click();
		logger.pass("User click on the Contributions Report");
		hideshowcolbtn.click();
		logger.pass("User click on hideandshow columns button");
		donorphone.click();
		logger.pass("User click on donor phone");
		driver.navigate().refresh();
		hideshowcolbtn.click();
		logger.pass("User click on hideandshow columns button");
		country.click();
		logger.pass("User click on country");
		driver.navigate().refresh();
		searchtools.click();
		logger.pass("User click on search tools");
		datefrom.sendKeys(ExcelUtils.getCellData(2, 1));
		logger.pass("User fetching 'datefrom' from excelsheet");
		dateto.sendKeys(ExcelUtils.getCellData(2, 2));
		logger.pass("User fetching 'dateto' from excelsheet");
		datesearchicon.click();
		logger.pass("User click on datesearchicon");
		driver.navigate().refresh();
		logger.pass("This is the list view of Contributions Report");
		return new UserReportsPage(driver);

	}

	/*
	 * 
	 * Method for User Contributions Reports
	 * 
	 */

	public void contributionsreport(String dateFrom, String dateTo) {

		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,-2500)", "");
		click(reports);
		logger.pass("User click on reports");
		click(reportsdropdown);
		logger.pass("User click on reports dropdown");
		click(contributionsreport);
		logger.pass("User click on contributions report");
		click(hideshowcolbtn);
		logger.pass("User click on hideshow column button");
		click(donorphone);
		logger.pass("User click on donor phone");
		driver.navigate().refresh();
		click(hideshowcolbtn);
		logger.pass("User click on hideshow column button");
		click(country);
		logger.pass("User click on country");
		driver.navigate().refresh();
		click(searchtools);
		logger.pass("User click on search tools");
		enterValue(datefrom, dateFrom);
		logger.pass("User fetching dateFrom from excelsheet");
		enterValue(dateto, dateTo);
		logger.pass("User fetching dateTo from excelsheet");
		click(datesearchicon);
		logger.pass("User click on date search icon");
		driver.navigate().refresh();
		logger.pass("This is the contributions report");

	}

	/*
	 * 
	 * Method for User Individual Donors Reports
	 * 
	 */

	public UserReportsPage individualdonorreport() {

		reports.click();
		logger.pass("User click on the Reports");
		reportsdropdown.click();
		logger.pass("User click on the reports dropdown");
		individualdonorreport.click();
		logger.pass("User click on the Individual donor Report");
		hideshowcolbtn.click();
		logger.pass("User click on hideandshow columns button");
		email.click();
		logger.pass("User click on email");
		driver.navigate().refresh();
		hideshowcolbtn.click();
		logger.pass("User click on hideandshow columns button");
		amount.click();
		logger.pass("User click on amount");
		driver.navigate().refresh();
		hideshowcolbtn.click();
		logger.pass("User click on hideandshow columns button");
		zip.click();
		logger.pass("User click on zip address");
		driver.navigate().refresh();
		logger.pass("This is the list view of Individual Donor Report");
		return new UserReportsPage(driver);

	}

	/*
	 * 
	 * Method for User Organization Donors Reports
	 * 
	 */

	public UserReportsPage organizationdonorreport() {

		reports.click();
		logger.pass("User click on the Reports");
		reportsdropdown.click();
		logger.pass("User click on the reports dropdown");
		organizationdonorreport.click();
		logger.pass("User click on the Organization donor Report");
		hideshowcolbtn.click();
		logger.pass("User click on hideandshow columns button");
		numofdonations.click();
		logger.pass("User click on number of donations");
		driver.navigate().refresh();
		hideshowcolbtn.click();
		logger.pass("User click on hideandshow columns button");
		state.click();
		logger.pass("User click on state");
		driver.navigate().refresh();
		hideshowcolbtn.click();
		logger.pass("User click on hideandshow columns button");
		website.click();
		logger.pass("User click on website");
		driver.navigate().refresh();
		logger.pass("This is the list view of Organization Donor Report");
		return new UserReportsPage(driver);

	}

	/*
	 * 
	 * Method for User Giveback Reports
	 * 
	 */

	public UserReportsPage givebackreport() {

		reports.click();
		logger.pass("User click on the Reports");
		reportsdropdown.click();
		logger.pass("User click on the reports dropdown");
		givebackreport.click();
		logger.pass("User click on the Giveback Report");
		hideshowcolbtn.click();
		logger.pass("User click on hideandshow columns button");
		campaigntitle.click();
		logger.pass("User click on campaign title");
		driver.navigate().refresh();
		hideshowcolbtn.click();
		logger.pass("User click on hideandshow columns button");
		totalgiveback.click();
		logger.pass("User click on total giveback");
		driver.navigate().refresh();
		logger.pass("This is the list view of Giveback Report");
		return new UserReportsPage(driver);

	}

	/*
	 * 
	 * Method for User Donors Reports
	 * 
	 */

	public UserReportsPage donorsreport() throws Exception {

		reports.click();
		logger.pass("User click on the Reports");
		reportsdropdown.click();
		logger.pass("User click on the reports dropdown");
		donorsreport.click();
		logger.pass("User click on the Donors Report");
		hideshowcolbtn.click();
		logger.pass("User click on hideandshow columns button");
		totaldonatedamt.click();
		logger.pass("User click on total donated amount");
		driver.navigate().refresh();
		hideshowcolbtn.click();
		logger.pass("User click on hideandshow columns button");
		orgname.click();
		logger.pass("User click on organization name");
		driver.navigate().refresh();
		hideshowcolbtn.click();
		logger.pass("User click on hideandshow columns button");
		donationcount.click();
		logger.pass("User click on donation count");
		driver.navigate().refresh();
		searchtools.click();
		logger.pass("User click on search tools");
		Thread.sleep(1000);
		selectoption.click();
		logger.pass("User click on select option");
		guestdonors.click();
		logger.pass("User click on guest donors");
		Thread.sleep(1000);
		donortype.click();
		logger.pass("User click on donortype");
		individual.click();
		logger.pass("User click on individual");
		driver.navigate().refresh();
		logger.pass("This is the list view of Donors Report");
		return new UserReportsPage(driver);
	}

}
