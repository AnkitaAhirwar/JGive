package com.pageobjects.jgive;

import java.util.Set;

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
 * This is Page Class for Admin Control Panel. It contains all the elements and
 * actions related to Admin Control Panel.
 * 
 */

public class AdminControlPanelPage extends BaseClass {

	private WebDriver driver;
	private static Logger log = Logger.getLogger(AdminControlPanelPage.class);

	public AdminControlPanelPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	/*
	 * Locators for Control Panel
	 */

	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Control panel')]")
	public WebElement controlpanel;

	@FindBy(how = How.XPATH, using = "//input[@id='from']")
	public WebElement datefrom;

	@FindBy(how = How.XPATH, using = "//input[@id='to']")
	public WebElement dateto;

	@FindBy(how = How.XPATH, using = "//input[@id='btnRefresh']")
	public WebElement refreshbutton;

	@FindBy(how = How.XPATH, using = "//div[@class='panel panel-green']//div[@class='huge']")
	public WebElement greenpanel;

	@FindBy(how = How.XPATH, using = "//div[@class='panel panel-primary']//div[@class='huge']")
	public WebElement primarypanel;

	@FindBy(how = How.XPATH, using = "//div[@class='panel panel-yellow']//div[@class='huge']")
	public WebElement yellowpanel;

	@FindBy(how = How.XPATH, using = "//div[@class='panel panel-red']//div[@class='huge']")
	public WebElement redpanel;

	@FindBy(how = How.CSS, using = "div.panel-red span:only-child")
	public WebElement commissionamount;

	@FindBy(how = How.CSS, using = "div.panel-green span:only-child")
	public WebElement numberofcampaigns;

	@FindBy(how = How.CSS, using = "div.panel-yellow span:only-child")
	public WebElement fundedamount;

	@FindBy(how = How.CSS, using = "div.panel-primary span:only-child")
	public WebElement goalamt;

	@FindBy(how = How.CSS, using = "div:nth-of-type(1) > .panel-body > a[title='See All']")
	public WebElement recentdonations;

	/*
	 * 
	 * Method for Control Panel Page
	 * 
	 */

	public AdminControlPanelPage controlPanel() throws Exception {

		campaigns();
		totalgoalamount();
		fundedamount();
		commissionamount();
		periodicdonations();
		recentdonations();
		return new AdminControlPanelPage(driver);

	}

	/*
	 * 
	 * Method for Periodic Donations
	 * 
	 */

	private void periodicdonations() throws Exception {

		try {
			if (!Constant.TESTDATAEXCEL.isEmpty())
				driver.get(Constant.TESTDATAEXCEL);
		} catch (Exception e) {
			ExcelUtils.setExcelFile(Constant.TESTDATAPATH, "Reports");
		}
		controlpanel.click(); // Control Panel
		logger.pass("User click on control panel");
		datefrom.clear(); // Date from
		datefrom.sendKeys(ExcelUtils.getCellData(2, 1));
		logger.pass("User fetching 'datefrom' from excelsheet");
		dateto.clear(); // Date to
		dateto.sendKeys(ExcelUtils.getCellData(2, 2));
		logger.pass("User fetching 'dateto' from excelsheet");
		refreshbutton.click(); // Refresh button
		logger.pass("Graph is shown for donations between two dates entered by the user");

	}

	/*
	 * 
	 * Method for Campaigns
	 * 
	 */

	private void campaigns() {

		controlpanel.click(); // Control Panel
		logger.pass("User click on control panel");
		logger.pass("Number of campaigns are " + numberofcampaigns.getText()); // No. of Campaigns
		greenpanel.click(); // Green Panel
		logger.pass("User click on green panel");
		logger.pass("User redirects to Campaign Dashboard Page");

	}

	/*
	 * 
	 * Method for total goal amount
	 * 
	 */

	private void totalgoalamount() {

		controlpanel.click(); // Control Panel
		logger.pass("User click on control panel");
		logger.pass("Total Goal Amount is" + goalamt.getText()); // Total goal amount
		primarypanel.click(); // Blue panel
		logger.pass("User click on blue panel");
		logger.pass("User redirects to Campaign Dashboard Page to check the total goal amount");

	}

	/*
	 * 
	 * Method for Funded Amount
	 * 
	 */

	private void fundedamount() {

		controlpanel.click(); // Control Panel
		logger.pass("User click on control panel");
		logger.pass("Funded Amount is  " + fundedamount.getText()); // Funded amount
		yellowpanel.click(); // Yellow panel
		logger.pass("User click on yellow panel");
		logger.pass("User redirects to Campaign-wise report Page to check the funded amount");

	}

	/*
	 * 
	 * Method for Commission Amount
	 * 
	 */

	private void commissionamount() {

		controlpanel.click(); // Control Panel
		logger.pass("User click on control panel");
		logger.pass("Commission Amount is " + commissionamount.getText()); // commission amount
		redpanel.click(); // Red panel
		logger.pass("User click on red panel");
		logger.pass("User redirects to Campaign-wise report Page to check the commission amount");

	}

	/*
	 * 
	 * Method for Recent Donations
	 * 
	 */

	public void recentdonations() {

		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click();", recentdonations); // Recent donations
		logger.pass("User click on see all button");
		logger.pass("User redirects to Donations list view page to check recent donations");
		String parentWindow = driver.getWindowHandle();
		Set<String> allWindow = driver.getWindowHandles();
		for (String curWindow : allWindow) {
			driver.switchTo().window(curWindow);
		}
		driver.close();
		driver.switchTo().window(parentWindow);

	}

	/*
	 * 
	 * Method for Periodic Donations
	 * 
	 */

	public AdminControlPanelPage periodicDonations(String datefromvalue, String datetovalue) throws Exception {

		click(controlpanel); // Control Panel
		logger.pass("User click on control panel");
		clearAndEnterValue(datefrom, datefromvalue); // Date from
		logger.pass("User fetching 'datefrom' from excelsheet");
		clearAndEnterValue(dateto, datetovalue); // Date to
		logger.pass("User fetching 'dateto' from excelsheet");
		click(refreshbutton); // Refresh button
		logger.pass("Graph is shown for donations between two dates entered by the user");
		return new AdminControlPanelPage(driver);

	}

	/*
	 * 
	 * Method for Campaigns
	 * 
	 */

	public AdminCampaignsPage noOfCampaigns() {

		click(controlpanel); // Control Panel
		logger.pass("User click on control panel");
		logger.pass("Number of campaigns are " + numberofcampaigns.getText()); // No. of Campaigns
		click(greenpanel); // Green Panel
		logger.pass("User click on green panel");
		logger.pass("User redirects to Campaign Dashboard Page");
		return new AdminCampaignsPage(driver);

	}

	/*
	 * 
	 * Method for total goal amount
	 * 
	 */

	public AdminCampaignsPage totalGoalAmount() {

		click(controlpanel); // Control Panel
		logger.pass("User click on control panel");
		logger.pass("Total Goal Amount is" + goalamt.getText()); // Total goal amount
		click(primarypanel); // Blue panel
		logger.pass("User click on blue panel");
		logger.pass("User redirects to Campaign Dashboard Page to check the total goal amount");
		return new AdminCampaignsPage(driver);

	}

	/*
	 * 
	 * Method for Funded Amount
	 * 
	 */

	public AdminCampaignWiseReportPage fundedAmount() {

		click(controlpanel); // Control Panel
		logger.pass("User click on control panel");
		logger.pass("Funded Amount is  " + fundedamount.getText()); // Funded amount
		click(yellowpanel); // Yellow panel
		logger.pass("User click on yellow panel");
		logger.pass("User redirects to Campaign-wise report Page to check the funded amount");
		return new AdminCampaignWiseReportPage(driver);

	}

	/*
	 * 
	 * Method for Commission Amount
	 * 
	 */

	public AdminCampaignWiseReportPage commissionAmount() {

		click(controlpanel); // Control Panel
		logger.pass("User click on control panel");
		logger.pass("Commission Amount is " + commissionamount.getText()); // commission amount
		click(redpanel); // Red panel
		logger.pass("User click on red panel");
		logger.pass("User redirects to Campaign-wise report Page to check the commission amount");
		return new AdminCampaignWiseReportPage(driver);

	}

	/*
	 * 
	 * Method for Recent Donations
	 * 
	 */

	public void recentDonations() {

		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click();", recentdonations); // Recent donations
		logger.pass("User click on see all button");
		logger.pass("User redirects to Donations list view page to check recent donations");
		String parentWindow = driver.getWindowHandle();
		Set<String> allWindow = driver.getWindowHandles();
		for (String curWindow : allWindow) {
			driver.switchTo().window(curWindow);
		}
		driver.close();
		driver.switchTo().window(parentWindow);

	}

}
