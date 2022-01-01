package com.pageobjects.jgive;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.config.jgive.BaseClass;
import com.pageobjects.jgive.UserHomePage;

/**
 * This is Page Class for User Log Out. It contains the elements and actions
 * related to User Log Out.
 * 
 */

public class UserLogOutPage extends BaseClass {

	private WebDriver driver;
	private static Logger log = Logger.getLogger(UserLogOutPage.class);

	public UserLogOutPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	/*
	 * Locators for User LogOut Page
	 */

	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Logout')]")
	public WebElement logoutbtn;

	/*
	 * 
	 * Method for User LogOut
	 * 
	 */

	public UserHomePage logOut() {

		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOf(logoutbtn));
		logoutbtn.click(); // Log Out
		logger.pass("User click on LogOut");
		logger.pass("User logged out successfully");
		return new UserHomePage(driver);

	}

}
