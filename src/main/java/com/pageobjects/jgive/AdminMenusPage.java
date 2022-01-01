package com.pageobjects.jgive;

import org.openqa.selenium.JavascriptExecutor;
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
 * This is Page Class for Menu Page. It contains all the actions related to Menu
 * Page.
 * 
 */

public class AdminMenusPage extends BaseClass {

	private WebDriver driver;

	public AdminMenusPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	/*
	 * Locators for Create User
	 */

	@FindBy(how = How.XPATH, using = "//*[@id=\"menu\"]/li[2]/a")
	public WebElement Users;

	@FindBy(how = How.XPATH, using = "//*[@id=\"menu\"]/li[2]/ul/li[1]/a")
	public WebElement manage;
	
	@FindBy(how = How.CSS, using = "#toolbar-new > button")
	public WebElement newbtn;

	@FindBy(how = How.XPATH, using = "//*[@id=\"nav-empty\"]/li/a")
	public WebElement adduser;

	@FindBy(how = How.XPATH, using = "//button[@onclick=\"Joomla.submitbutton('user.add');\"]")
	public WebElement newbutton;

	@FindBy(how = How.XPATH, using = "//*[@id=\"toolbar-apply\"]/button")
	public WebElement savebutton;

	@FindBy(how = How.XPATH, using = "//*[@id=\"toolbar-save\"]/button")
	public WebElement saveclosebutton;

	@FindBy(how = How.XPATH, using = "//*[@id=\"toolbar-save-new\"]/button")
	public WebElement savenewbutton;

	@FindBy(how = How.XPATH, using = "//*[@id=\"j-main-container\"]/div[1]/div[1]/div[1]/div[3]/button")
	public WebElement clearbutton;

	@FindBy(how = How.XPATH, using = "//*[@id=\"j-main-container\"]/div[1]/div[1]/div[1]/div[1]/button")
	public WebElement searchbutton;

	@FindBy(how = How.XPATH, using = "//*[@id=\"toolbar-cancel\"]/button")
	public WebElement cancelbutton;

	@FindBy(how = How.XPATH, using = "//*[@id=\"jform_name\"]")
	public WebElement name;

	@FindBy(how = How.XPATH, using = " //*[@id=\"jform_username\"]")
	public WebElement loginname;

	@FindBy(how = How.XPATH, using = " //*[@id=\"jform_password\"]")
	public WebElement password;

	@FindBy(how = How.XPATH, using = "//*[@id=\"jform_password2\"]")
	public WebElement confirmpassword;

	@FindBy(how = How.XPATH, using = "//*[@id=\"jform_email\"]")
	public WebElement email;

	@FindBy(how = How.XPATH, using = "//*[@id=\"jform_sendEmail\"]/label[1]")
	public WebElement sendEmailYes;

	@FindBy(how = How.XPATH, using = "//*[@id=\"jform_sendEmail\"]/label[2]")
	public WebElement sendEmailNo;

	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Components')]")
	public WebElement components;

	@FindBy(how = How.XPATH, using = "//a[@class='dropdown-toggle menu-icon-16-jgive']")
	public WebElement jgive;

	@FindBy(how = How.XPATH, using = "//a[@class='dropdown-toggle'][contains(text(),'Menus')]")
	public WebElement menus;

	@FindBy(how = How.XPATH, using = "//a[@class='dropdown-toggle menu-menumgr']")
	public WebElement menumanage;

	@FindBy(how = How.XPATH, using = "//a[@class='no-dropdown menu-allmenu']")
	public WebElement allmenu;

	@FindBy(how = How.XPATH, using = "//a[@class='dropdown-toggle menu-menu']")
	public WebElement mainmenu;

	@FindBy(how = How.XPATH, using = "//a[@class='dropdown-toggle'][contains(text(),'Content')]")
	public WebElement content;

	@FindBy(how = How.XPATH, using = "//a[@class='dropdown-toggle menu-article']")
	public WebElement articles;

	@FindBy(how = How.XPATH, using = "//li[@class='dropdown open']//a[@class='dropdown-toggle menu-category'][contains(text(),'Categories')]")
	public WebElement categories;

	@FindBy(how = How.XPATH, using = "//a[@class='dropdown-toggle menu-install']")
	public WebElement menuinstall;

	@FindBy(how = How.XPATH, using = "//a[@class='dropdown-toggle'][contains(text(),'Extensions')]")
	public WebElement extensions;

	@FindBy(how = How.XPATH, using = "//a[@class='no-dropdown menu-module']")
	public WebElement menumodule;

	@FindBy(how = How.XPATH, using = "//a[@class='no-dropdown menu-plugin']")
	public WebElement menuplugin;

	@FindBy(how = How.XPATH, using = "//a[@class='dropdown-toggle menu-themes']")
	public WebElement menuthemes;

	@FindBy(how = How.XPATH, using = "//a[@class='dropdown-toggle menu-language']")
	public WebElement menulanguage;

	@FindBy(how = How.XPATH, using = "//a[@class='dropdown-toggle'][contains(text(),'System')]")
	public WebElement system;

	@FindBy(how = How.XPATH, using = "//a[@class='no-dropdown menu-cpanel']")
	public WebElement menu_cpanel;

	@FindBy(how = How.XPATH, using = "//a[@class='no-dropdown menu-config']")
	public WebElement menuglobalconfig;

	@FindBy(how = How.XPATH, using = "//ul[@class='nav nav-tabs']//a[contains(text(),'System')]")
	public WebElement systemtab;

	@FindBy(how = How.XPATH, using = "//fieldset[@id='jform_debug']//label[@class='btn'][contains(text(),'Yes')]")
	public WebElement debug_yes;

	@FindBy(how = How.XPATH, using = "//fieldset[@id='jform_debug']//label[@class='btn active btn-danger'][contains(text(),'No')]")
	public WebElement debug_no;

	/*
	 * 
	 * Method for Users menu
	 * 
	 */

	public void users() throws Exception {

		try {
			if (!Constant.TESTDATAEXCEL.isEmpty())
				driver.get(Constant.TESTDATAEXCEL);
		} catch (Exception e) {
			ExcelUtils.setExcelFile(Constant.TESTDATAPATH, "Menus");
		}
		Users.click();
		logger.pass("Click on Users menu");
		manage.click();
		logger.pass("Click on manage");
		newbutton.click();
		logger.pass("Click on new button");
		name.sendKeys(ExcelUtils.getCellData(1, 0));
		logger.pass("User fetching name from excelsheet");
		loginname.sendKeys(ExcelUtils.getCellData(1, 1));
		logger.pass("User fetching loginname from excelsheet");
		password.sendKeys(ExcelUtils.getCellData(1, 2));
		logger.pass("User fetching password from excelsheet");
		confirmpassword.sendKeys(ExcelUtils.getCellData(1, 3));
		logger.pass("User fetching confirmpassword from excelsheet");
		email.sendKeys(ExcelUtils.getCellData(1, 4));
		logger.pass("User fetching email from excelsheet");
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,2500)", "");
		sendEmailNo.click();
		logger.pass("User click on Receive System Emails as No");
		cancelbutton.click();
		logger.pass("User click on cancel button");
		Screenshot.captureScreenshot(driver, "New User Added");

	}

	/*
	 * 
	 * Method for Components menu
	 * 
	 */

	public void components() {

		components.click();
		logger.pass("User click on Components menu");
		Screenshot.captureScreenshot(driver, "Components Menu");
		jgive.click();
		logger.pass("User click on JGive");

	}

	/*
	 * 
	 * Method for Menus
	 * 
	 */

	public void menus() {

		menus.click();
		logger.pass("User click on Menus");
		Screenshot.captureScreenshot(driver, "Menus");
		allmenu.click();
		logger.pass("User click on All Menu Items");

	}

	/*
	 * 
	 * Method for Content menu
	 * 
	 */

	public void content() {

		content.click();
		logger.pass("User click on Content menu");
		Screenshot.captureScreenshot(driver, "Content Menu");
		articles.click();
		logger.pass("User click on articles");
		content.click();
		logger.pass("User click on Content menu");
		categories.click();
		logger.pass("User click on categories");

	}

	/*
	 * 
	 * Method for Extensions menu
	 * 
	 */

	public void extensions() {

		extensions.click();
		logger.pass("User click on Extensions menu");
		Screenshot.captureScreenshot(driver, "Extensions Menu");
		menuplugin.click();
		logger.pass("User click on Plugins");
		extensions.click();
		logger.pass("User click on Extensions menu");
		menumodule.click();
		logger.pass("User click on Modules");

	}

	/*
	 * 
	 * Method for System menu
	 * 
	 */

	public void system() {

		system.click();
		logger.pass("User click on System menu");
		Screenshot.captureScreenshot(driver, "System Menu");
		menu_cpanel.click();
		logger.pass("User click on Control Panel");
		system.click();
		logger.pass("User click on System menu");
		menuglobalconfig.click();
		logger.pass("User click on Global Configuration");
		systemtab.click();
		logger.pass("User click on System tab");
		debug_no.click();
		logger.pass("User click on Debug System button");
		saveclosebutton.click();
		logger.pass("User click on Saveclose buton");

	}

}

