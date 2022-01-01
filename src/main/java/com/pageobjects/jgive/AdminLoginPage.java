package com.pageobjects.jgive;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.config.jgive.BaseClass;
import com.utils.jgive.Constant;
import com.utils.jgive.ExcelUtils;
import com.utils.jgive.Screenshot;

/**
 * This is Page Class for Admin Login. It contains all the elements and actions
 * related to Admin Login.
 * 
 */

public class AdminLoginPage extends BaseClass {

	private WebDriver driver;
	static Logger log = Logger.getLogger(AdminLoginPage.class);

	public AdminLoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	/*
	 * Locators for Login
	 */

	@FindBy(how = How.ID, using = "mod-login-username")
	public WebElement username;

	@FindBy(how = How.ID, using = "mod-login-password")
	public WebElement password;

	@FindBy(how = How.XPATH, using = "//button[@class='btn btn-primary btn-block btn-large login-button']")
	public WebElement loginButton;
	
	@FindBy(how = How.XPATH, using = "//input[@class='new-todo']")
	public WebElement firsttodo;
	

	
	/*
	 * 
	 * Method for valid login
	 * 
	 */

	public AdminDashboardPage validLogin() throws Exception {

		try {
			if (!Constant.TESTDATAEXCEL.isEmpty())
				driver.get(Constant.TESTDATAEXCEL);
		} catch (Exception e) {
			ExcelUtils.setExcelFile(Constant.TESTDATAPATH, "LoginDetails");
		}
		username.sendKeys(ExcelUtils.getCellData(2, 2)); // Login Username
		logger.pass("user name is fetched from excelsheet");
		password.sendKeys(ExcelUtils.getCellData(2, 3)); // Login Password
		logger.pass("password fetched from excelsheet");
		loginButton.click(); // Login Button
		logger.pass("User click on the login button");
		logger.pass("User logged Successfully");
		Screenshot.captureScreenshot(driver, "Valid Login");
		return new AdminDashboardPage(driver);

	}

	/*
	 * 
	 * Method for invalid login
	 * 
	 */

	public AdminLoginPage invalidLogin() throws Exception {

		try {
			if (!Constant.TESTDATAEXCEL.isEmpty())
				driver.get(Constant.TESTDATAEXCEL);
		} catch (Exception e) {
			ExcelUtils.setExcelFile(Constant.TESTDATAPATH, "LoginDetails");
		}
		username.sendKeys(ExcelUtils.getCellData(3, 2)); // Login Username
		logger.pass("username is fetched from excelsheet");
		password.sendKeys(ExcelUtils.getCellData(3, 3)); // Login Password
		logger.pass("password is fetched from excelsheet");
		loginButton.click(); // Login Button
		logger.pass(" User click on the login button");
		logger.pass(" User login with invalid Credentials");
		Screenshot.captureScreenshot(driver, "Invalid Login");
		return new AdminLoginPage(driver);

	}
	
	/*
	 * 
	 * Method for valid login
	 * 
	 */

	public AdminDashboardPage validLogin(String un, String pw) throws Exception {

		enterValue(username, un); // Login Username
		logger.pass("user name is fetched from excelsheet");
		enterValue(password, pw); // Login Password
		logger.pass("password fetched from excelsheet");
		click(loginButton); // Login Button
		logger.pass("User click on the login button");
		logger.pass("User logged Successfully");
		Screenshot.captureScreenshot(driver, "Valid Login");
		return new AdminDashboardPage(driver);

	}

	/*
	 * 
	 * Method for invalid login
	 * 
	 */

	public AdminLoginPage invalidLogin(String un, String pw) throws Exception {

		
		enterValue(username, un); // Login Username
		logger.pass("username is fetched from excelsheet");
		enterValue(password, pw);  // Login Password
		logger.pass("password is fetched from excelsheet");
		click(loginButton); // Login Button
		logger.pass(" User click on the login button");
		logger.pass(" User login with invalid Credentials");
		Screenshot.captureScreenshot(driver, "Invalid Login");
		return new AdminLoginPage(driver);

	}

	

	

	

	
}

