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
import com.utils.jgive.Screenshot;
import com.pageobjects.jgive.UserHomePage;

/**
 * This is Page Class for User Login. It contains all the elements and actions
 * related to User Login.
 * 
 */

public class UserLoginPage extends BaseClass {

	private WebDriver driver;
	private static Logger log = Logger.getLogger(UserLoginPage.class);

	public UserLoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	/*
	 * Locators for User Login
	 */

	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Login')]")
	public WebElement login;

	@FindBy(how = How.XPATH, using = "//input[@id='username']")
	public WebElement username;

	@FindBy(how = How.XPATH, using = "//input[@id='password']")
	public WebElement password;

	@FindBy(how = How.XPATH, using = "//button[@class='btn btn-block btn-success']")
	public WebElement loginButton;

	@FindBy(how = How.XPATH, using = "//div[@class='alert-message']")
	public WebElement loginerror;

	/*
	 * 
	 * Method for User Valid login
	 * 
	 */

	public UserHomePage validLogin(String uname, String upw) throws Exception {

		click(login);
		enterValue(username, uname); // Login Username
		logger.pass("user name is fetched from excelsheet");
		enterValue(password, upw); // Login Password
		logger.pass("password fetched from excelsheet");
		click(loginButton); // Login Button
		logger.pass("User click on the login button");
		logger.pass("User logged Successfully");
		Screenshot.captureScreenshot(driver, "Valid User Login");
		return new UserHomePage(driver);

	}

	/*
	 * 
	 * Method for User invalid login
	 * 
	 */

	public UserLoginPage invalidLogin(String uname, String upw) throws Exception {

		click(login);
		enterValue(username, uname); // Login Username
		logger.pass("username is fetched from excelsheet");
		enterValue(password, upw); // Login Password
		logger.pass("password is fetched from excelsheet");
		click(loginButton); // Login Button
		logger.pass(" User click on the login button");
		logger.pass(" User login with invalid Credentials");
		Screenshot.captureScreenshot(driver, "Invalid User Login");
		return new UserLoginPage(driver);

	}

	/*
	 * 
	 * Method for User Valid login
	 * 
	 */

	public UserHomePage validLogin() throws Exception {

		try {
			if (!Constant.TESTDATAEXCEL.isEmpty())
				driver.get(Constant.TESTDATAEXCEL);
		} catch (Exception e) {
			ExcelUtils.setExcelFile(Constant.TESTDATAPATH, "ULoginDetails");
		}
		login.click();
		username.sendKeys(ExcelUtils.getCellData(2, 1)); // Login Username
		logger.pass("user name is fetched from excelsheet");
		password.sendKeys(ExcelUtils.getCellData(2, 2)); // Login Password
		logger.pass("password fetched from excelsheet");
		loginButton.click(); // Login Button
		logger.pass("User click on the login button");
		logger.pass("User logged Successfully");
		Screenshot.captureScreenshot(driver, "Valid User Login");
		return new UserHomePage(driver);

	}

	/*
	 * 
	 * Method for User invalid login
	 * 
	 */

	public UserLoginPage invalidLogin() throws Exception {

		try {
			if (!Constant.TESTDATAEXCEL.isEmpty())
				driver.get(Constant.TESTDATAEXCEL);
		} catch (Exception e) {
			ExcelUtils.setExcelFile(Constant.TESTDATAPATH, "ULoginDetails");
		}
		login.click();
		username.sendKeys(ExcelUtils.getCellData(3, 1)); // Login Username
		logger.pass("username is fetched from excelsheet");
		password.sendKeys(ExcelUtils.getCellData(3, 2)); // Login Password
		logger.pass("password is fetched from excelsheet");
		loginButton.click(); // Login Button
		logger.pass(" User click on the login button");
		logger.pass(" User login with invalid Credentials");
		Screenshot.captureScreenshot(driver, "Invalid User Login");
		return new UserLoginPage(driver);

	}

}
