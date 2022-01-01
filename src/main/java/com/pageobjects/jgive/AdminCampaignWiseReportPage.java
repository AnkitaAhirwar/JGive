package com.pageobjects.jgive;

import org.apache.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.config.jgive.BaseClass;

/**
 * This is Page Class for Admin Campaign-Wise Report. It contains all the
 * elements and actions related to Admin Campaign-Wise Report.
 * 
 */

public class AdminCampaignWiseReportPage extends BaseClass {

	private WebDriver driver;
	static Logger log = Logger.getLogger(AdminCampaignWiseReportPage.class);

	public AdminCampaignWiseReportPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	/*
	 * Locators for Control Panel
	 */

	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Campaign-wise report')]")
	public WebElement campaignwisereport;

	@FindBy(how = How.XPATH, using = "//button[@class='btn btn-small export']")
	public WebElement csvexportbutton;

	/*
	 * 
	 * Method for Campaign-Wise Report
	 * 
	 */

	public AdminCampaignWiseReportPage campaignwisereport() {

		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click();", campaignwisereport); // Campaign-wise report
		logger.pass("User click on Campaign Wise Report");
		csvexportbutton.click(); // CSVExport button
		logger.pass("User click on CSVExport button");
		logger.pass("Campaign-Wise Report downloaded on your system");
		return new AdminCampaignWiseReportPage(driver);

	}

}
