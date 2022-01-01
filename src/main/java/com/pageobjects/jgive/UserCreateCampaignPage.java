package com.pageobjects.jgive;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.config.jgive.BaseClass;
import com.utils.jgive.Constant;
import com.utils.jgive.ExcelUtils;
import com.pageobjects.jgive.UserMyCampaignsPage;
import com.pageobjects.jgive.UserAllCampaignsPage;

/**
 * This is Page Class for User Create Campaign. It contains all the elements and
 * actions related to User Create Campaign.
 * 
 */

public class UserCreateCampaignPage extends BaseClass {

	private WebDriver driver;
	private static Logger log = Logger.getLogger(UserCreateCampaignPage.class);

	public UserCreateCampaignPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	/*
	 * Locators for User Campaign Creation
	 */

	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Create Campaign')]")
	public WebElement createcampaign;

	@FindBy(how = How.XPATH, using = "//input[@id='jform_title']")
	public WebElement title;

	@FindBy(how = How.XPATH, using = "//*[@id=\"jform_org_ind_type_chzn\"]/a/span")
	public WebElement typedropdown;

	@FindBy(how = How.XPATH, using = "//li[contains(text(),'Non-profits')]")
	public WebElement type;

	@FindBy(how = How.XPATH, using = "//li[contains(text(),'Uncategorised')]")
	public WebElement category;

	@FindBy(how = How.XPATH, using = "//*[@id=\"jform_category_id_chzn\"]/a/span")
	public WebElement categorydropdown;

	@FindBy(how = How.XPATH, using = "//input[@id='jform_type0']")
	List<WebElement> allElementsDonation;

	@FindBy(how = How.XPATH, using = "//input[@id='jform_type0']")
	WebElement donation;

	@FindBy(how = How.XPATH, using = "//input[@id='jform_published0']")
	public WebElement publish;

	@FindBy(how = How.XPATH, using = "//input[@id='jform_published0']")
	List<WebElement> allElementspublish;

	@FindBy(how = How.XPATH, using = "//input[@id='jform_allow_view_donations0']")
	public WebElement seedonations;

	@FindBy(how = How.XPATH, using = "//input[@id='jform_allow_exceed0']")
	public WebElement exgoalamt;

	@FindBy(how = How.XPATH, using = "//input[@id='jform_goal_amount']")
	public WebElement goalamt;

	@FindBy(how = How.NAME, using = "jform[minimum_amount]")
	public WebElement mindonamt;

	@FindBy(how = How.NAME, using = "jform[max_donors]")
	public WebElement maxallowdon;

	@FindBy(how = How.XPATH, using = "//*[@id=\"jform_long_description_ifr\"]")
	public WebElement descframe;

	@FindBy(how = How.XPATH, using = "//input[@id='jform_image']")
	public WebElement image;

	@FindBy(how = How.XPATH, using = "//input[@id='jform_start_date']")
	public WebElement startdate;

	@FindBy(how = How.XPATH, using = "//input[@id='jform_end_date']")
	public WebElement enddate;

	@FindBy(how = How.XPATH, using = "//button[@class='btn btn-small button-apply btn-success']")
	public WebElement save;

	@FindBy(how = How.XPATH, using = "//*[@id=\"jform_allow_exceed1\"]")
	public WebElement exceedgoalamtno;

	@FindBy(how = How.XPATH, using = "//a[contains(text(),'My Campaigns')]")
	public WebElement mycampaign;

	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Exceed Goal Amount')]")
	public WebElement campaignname;

	@FindBy(how = How.CSS, using = "button#donate-now")
	public WebElement donatebutton;

	@FindBy(how = How.CSS, using = "input#donation_amount")
	public WebElement donationamount;

	@FindBy(how = How.CSS, using = "[value='Continue']")
	public WebElement continuebutton;

	@FindBy(how = How.XPATH, using = "//*[@id=\"qtc_bycheck\"]")
	public WebElement paybycheck;

	@FindBy(how = How.CSS, using = "[value='Place donation']")
	public WebElement placedonation;

	@FindBy(how = How.CSS, using = "input#btn_check")
	public WebElement confirmorder;

	/*
	 * Locators for Givebacks Tab
	 */

	@FindBy(how = How.XPATH, using = "//*[@id=\"launchForm_nav\"]/li[1]/a")
	public WebElement givebackclick;

	@FindBy(how = How.XPATH, using = "//a[@class='btn btn-mini fa fa-plus group-add-sr-0']")
	public WebElement givebackaddbutton;

	@FindBy(how = How.XPATH, using = "//input[@id='jform_givebacks__givebacks0__title']")
	public WebElement gbtitle;

	@FindBy(how = How.XPATH, using = "//input[@id='jform_givebacks__givebacks0__amount']")
	public WebElement mingiveback;

	@FindBy(how = How.XPATH, using = "//input[@id='jform_givebacks__givebacks0__total_quantity']")
	public WebElement totalgiveback;

	@FindBy(how = How.XPATH, using = "//textarea[@id='jform_givebacks__givebacks0__description']")
	public WebElement gbdescription;

	@FindBy(how = How.XPATH, using = "//input[@id='jform_givebacks__givebacks0__giveback_image']")
	public WebElement gbimage;

	/*
	 * Locators for Gallery Tab
	 */

	@FindBy(how = How.XPATH, using = "//*[@id=\"launchForm_nav\"]/li[2]/a")
	public WebElement gallerytab;

	@FindBy(how = How.XPATH, using = "//input[@id='jform_video_on_details_page']")
	public WebElement gallerycheckbox;

	@FindBy(how = How.XPATH, using = "//input[@id='jform_gallery_file']")
	public WebElement galleryimage;

	@FindBy(how = How.XPATH, using = "//input[@id='jform_gallery_link']")
	List<WebElement> allElementsVideoUrl;

	@FindBy(how = How.XPATH, using = "//input[@id='jform_gallery_link']")
	public WebElement videourl;

	@FindBy(how = How.XPATH, using = "//input[@class='validate_video_link btn btn-primary btn-success btn-donate mt-5']")
	public WebElement validatevideolink;

	@FindBy(how = How.XPATH, using = "//button[@class='btn btn-small button-save']")
	public WebElement saveclose;

	@FindBy(how = How.XPATH, using = "//span[contains(text(),'Submit')]")
	public WebElement submit;

	@FindBy(how = How.XPATH, using = "//span[contains(text(),'Cancel')]")
	public WebElement cancel;

	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Click here')]")
	public WebElement clickhere;

	@FindBy(how = How.XPATH, using = "//button[contains(text(),'Cancel')]")
	public WebElement cancelbutton;

	/*
	 * 
	 * Method for positive campaign creation
	 * 
	 */

	public UserMyCampaignsPage campaignCreation(String titlename, String sdate, String edate, String campimage,
			String descframevalue, String goalamount, String mindonationamt, String maxdonationamt,
			String givebacktitle, String mingivebackvalue, String totalgivebackvalue, String gbdescriptionvalue,
			String givebackimage, String galleryimagevalue, String videourllink) throws Exception {

		click(createcampaign);
		enterValue(title, titlename); // Title
		logger.pass("User fetching title name for campaign from excelsheet");
		clearAndEnterValue(startdate, sdate);
		logger.pass("User entering startdate for campaign");
		clearAndEnterValue(enddate, edate); // End-date
		logger.pass("User entering end date for campaign");
		WebDriverWait w = new WebDriverWait(driver, 30);
		w.until(ExpectedConditions.visibilityOf(image));
		enterValue(image, Constant.DEFAULTSYSTEMPATH + campimage); // Uploading campaign image
		logger.pass("User fetching image for campaign from excelsheet");
		if (allElementsDonation.size() != 0) { // If list size is non-zero, element is present
			click(donation);// Donation or Investment
		}
		logger.pass("User click on campaign type");

		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,2500)", "");

		click(seedonations); // Let others see donations for the campaign
		logger.pass("User click on 'Let other see donations'");
		click(publish); // Publish
		logger.pass("User click on publish button");
		enterValueInIframe(descframe, descframevalue);
		click(typedropdown); // Organization/Individual type dropdown
		logger.pass("User click on organization/individual type dropdown");
		click(type); // Organization/Individual type
		logger.pass("User click on Non-profits type");
		click(categorydropdown); // Category dropdown
		logger.pass("User click on category dropdown");
		click(category); // Category
		logger.pass("User click on category type");
		enterValue(goalamt, goalamount); // Goal Amount
		logger.pass("User fetching goal amount from excelsheet");
		click(exgoalamt); // Allow donation to exceed goal amount
		logger.pass("User click on exceed goal amount");
		clearAndEnterValue(mindonamt, mindonationamt); // Minimum donation/investment amount
		logger.pass("User fetching minimum donation amount for campaign from excelsheet");
		clearAndEnterValue(maxallowdon, maxdonationamt); // max. allowed donations/investments
		logger.pass("User fetching maximum allowed donations for campaign from excelsheet");

		givebackclick.click(); // Click on GiveBack tab
		logger.pass("User click on givebacktab");
		givebackaddbutton.click(); // Click on add more button
		logger.pass("User click on giveback addbutton");
		enterValue(gbtitle, givebacktitle); // GiveBack title
		logger.pass("User fetching givebacktitle from excelsheet");
		clearAndEnterValue(mingiveback, mingivebackvalue); // Minimum giveback
		logger.pass("User fetching minimum giveback from excelsheet");
		clearAndEnterValue(totalgiveback, totalgivebackvalue); // Total giveback
		logger.pass("User fetching totalgiveback from excelsheet");
		enterValue(gbdescription, gbdescriptionvalue); // Giveback description
		logger.pass("User fetching giveback description from excelsheet");
		enterValue(gbimage, Constant.DEFAULTSYSTEMPATH + givebackimage); // Giveback image
		logger.pass("User fetching giveback image from excelsheet");

		gallerytab.click(); // Click on gallery tab
		logger.pass("User click on gallerytab");
		gallerycheckbox.click(); // Click on gallery checkbox
		logger.pass("User click on gallery checkbox");
		enterValue(galleryimage, Constant.DEFAULTSYSTEMPATH + galleryimagevalue); // Gallery image
		logger.pass("User fetching gallery image from excelsheet");
		if (allElementsVideoUrl.size() != 0) { // If list size is non-zero, element is present
			enterValue(videourl, videourllink); // video url
			validatevideolink.click();
		}
		submit.click(); // Save
		logger.pass("User click on save button");

		logger.pass("User Created Campaign Successfully");
		return new UserMyCampaignsPage(driver);

	}

	/*
	 * 
	 * Method for negative campaign creation
	 * 
	 */

	public UserAllCampaignsPage campaignCreationExpectingFailure(String titlename, String sdate, String edate,
			String campimage, String descframevalue, String goalamount, String mindonationamt, String maxdonationamt,
			String givebacktitle, String mingivebackvalue, String totalgivebackvalue, String gbdescriptionvalue,
			String givebackimage, String galleryimagevalue, String videourllink) throws Exception {

		click(createcampaign);
		enterValue(title, titlename); // Title
		logger.pass("User fetching title name for campaign from excelsheet");
		clearAndEnterValue(startdate, sdate);
		logger.pass("User entering startdate for campaign");
		clearAndEnterValue(enddate, edate); // End-date
		logger.pass("User entering end date for campaign");
		WebDriverWait w = new WebDriverWait(driver, 30);
		w.until(ExpectedConditions.visibilityOf(image));
		enterValue(image, Constant.DEFAULTSYSTEMPATH + campimage); // Uploading campaign image
		logger.pass("User fetching image for campaign from excelsheet");
		if (allElementsDonation.size() != 0) { // If list size is non-zero, element is present
			click(donation);// Donation or Investment
		}
		logger.pass("User click on campaign type");

		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,2500)", "");

		click(seedonations); // Let others see donations for the campaign
		logger.pass("User click on 'Let other see donations'");
		click(publish); // Publish
		logger.pass("User click on publish button");
		enterValueInIframe(descframe, descframevalue);
		click(typedropdown); // Organization/Individual type dropdown
		logger.pass("User click on organization/individual type dropdown");
		click(type); // Organization/Individual type
		logger.pass("User click on Non-profits type");
		click(categorydropdown); // Category dropdown
		logger.pass("User click on category dropdown");
		click(category); // Category
		logger.pass("User click on category type");
		enterValue(goalamt, goalamount); // Goal Amount
		logger.pass("User fetching goal amount from excelsheet");
		click(exgoalamt); // Allow donation to exceed goal amount
		logger.pass("User click on exceed goal amount");
		clearAndEnterValue(mindonamt, mindonationamt); // Minimum donation/investment amount
		logger.pass("User fetching minimum donation amount for campaign from excelsheet");
		clearAndEnterValue(maxallowdon, maxdonationamt); // max. allowed donations/investments
		logger.pass("User fetching maximum allowed donations for campaign from excelsheet");

		click(givebackclick); // Click on GiveBack tab
		logger.pass("User click on givebacktab");
		click(givebackaddbutton); // Click on add more button
		logger.pass("User click on giveback addbutton");
		enterValue(gbtitle, givebacktitle); // GiveBack title
		logger.pass("User fetching givebacktitle from excelsheet");
		clearAndEnterValue(mingiveback, mingivebackvalue); // Minimum giveback
		logger.pass("User fetching minimum giveback from excelsheet");
		clearAndEnterValue(totalgiveback, totalgivebackvalue); // Total giveback
		logger.pass("User fetching totalgiveback from excelsheet");
		enterValue(gbdescription, gbdescriptionvalue); // Giveback description
		logger.pass("User fetching giveback description from excelsheet");
		enterValue(gbimage, Constant.DEFAULTSYSTEMPATH + givebackimage); // Giveback image
		logger.pass("User fetching giveback image from excelsheet");

		click(gallerytab); // Click on gallery tab
		logger.pass("User click on gallerytab");
		click(gallerycheckbox); // Click on gallery checkbox
		logger.pass("User click on gallery checkbox");
		enterValue(galleryimage, Constant.DEFAULTSYSTEMPATH + galleryimagevalue); // Gallery image
		logger.pass("User fetching gallery image from excelsheet");
		if (allElementsVideoUrl.size() != 0) { // If list size is non-zero, element is present
			enterValue(videourl, videourllink); // video url
			click(validatevideolink);
		}
		click(cancel);
		logger.pass("User click on save&close button");
		logger.pass("User Created Campaign Failed");
		return new UserAllCampaignsPage(driver);

	}

	/*
	 * 
	 * Method for positive campaign tab
	 * 
	 */

	private UserCreateCampaignPage camptab() throws Exception {

		try {
			if (!Constant.TESTDATAEXCEL.isEmpty())
				driver.get(Constant.TESTDATAEXCEL);
		} catch (Exception e) {
			ExcelUtils.setExcelFile(Constant.TESTDATAPATH, "UserCampaign");
		}
		title.sendKeys(ExcelUtils.getCellData(2, 2)); // Title
		logger.pass("User fetching title name for campaign from excelsheet");
		startdate.clear();
		startdate.sendKeys(ExcelUtils.getCellData(2, 7)); // Start date
		logger.pass("User entering startdate for campaign");
		enddate.clear();
		enddate.sendKeys(ExcelUtils.getCellData(2, 8)); // End-date
		logger.pass("User entering end date for campaign");
		WebDriverWait w = new WebDriverWait(driver, 30);
		w.until(ExpectedConditions.visibilityOf(image));
		image.sendKeys(Constant.DEFAULTSYSTEMPATH + ExcelUtils.getCellData(2, 6)); // Uploading campaign image
		logger.pass("User fetching image for campaign from excelsheet");
		if (allElementsDonation.size() != 0) { // If list size is non-zero, element is present
			donation.click(); // Donation or Investment
		}
		logger.pass("User click on campaign type");

		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,2500)", "");

		seedonations.click(); // Let others see donations for the campaign
		logger.pass("User click on 'Let other see donations'");
		publish.click();
		logger.pass("User click on publish button");
		driver.switchTo().frame(descframe); // Description
		WebElement editable = driver.switchTo().activeElement();
		editable.sendKeys(ExcelUtils.getCellData(2, 9));
		driver.switchTo().defaultContent();
		typedropdown.click(); // Organization/Individual type dropdown
		logger.pass("User click on organization/individual type dropdown");
		type.click(); // Organization/Individual type
		logger.pass("User click on Non-profits type");
		categorydropdown.click(); // Category dropdown
		logger.pass("User click on category dropdown");
		category.click(); // Category
		logger.pass("User click on category type");
		goalamt.sendKeys(ExcelUtils.getCellData(2, 3)); // Goal Amount
		logger.pass("User fetching goal amount from excelsheet");
		exgoalamt.click(); // Allow donation to exceed goal amount
		logger.pass("User click on exceed goal amount");
		mindonamt.clear();
		mindonamt.sendKeys(ExcelUtils.getCellData(2, 4)); // Minimum donation/investment amount
		logger.pass("User fetching minimum donation amount for campaign from excelsheet");
		maxallowdon.clear();
		maxallowdon.sendKeys(ExcelUtils.getCellData(2, 5)); // max. allowed donations/investments
		logger.pass("User fetching maximum allowed donations for campaign from excelsheet");
		return new UserCreateCampaignPage(driver);

	}

	/*
	 * 
	 * Method for Givebacks tab of positive campaign creation
	 * 
	 */

	private UserCreateCampaignPage givebacktab() throws Exception {

		try {
			if (!Constant.TESTDATAEXCEL.isEmpty())
				driver.get(Constant.TESTDATAEXCEL);
		} catch (Exception e) {
			ExcelUtils.setExcelFile(Constant.TESTDATAPATH, "UserCampaign");
		}
		givebackclick.click(); // Click on GiveBack tab
		logger.pass("User click on givebacktab");
		givebackaddbutton.click(); // Click on add more button
		logger.pass("User click on giveback addbutton");
		gbtitle.sendKeys(ExcelUtils.getCellData(12, 2)); // GiveBack title
		logger.pass("User fetching givebacktitle from excelsheet");
		mingiveback.clear();
		mingiveback.sendKeys(ExcelUtils.getCellData(12, 3)); // Minimum giveback
		logger.pass("User fetching minimum giveback from excelsheet");
		totalgiveback.clear();
		totalgiveback.sendKeys(ExcelUtils.getCellData(12, 4)); // Total giveback
		logger.pass("User fetching totalgiveback from excelsheet");
		gbdescription.sendKeys(ExcelUtils.getCellData(12, 5)); // Giveback description
		logger.pass("User fetching giveback description from excelsheet");
		gbimage.sendKeys(Constant.DEFAULTSYSTEMPATH + ExcelUtils.getCellData(12, 6)); // Giveback image
		logger.pass("User fetching giveback image from excelsheet");
		return new UserCreateCampaignPage(driver);

	}

	/*
	 * 
	 * Method for gallery tab of positive campaign creation
	 * 
	 */

	private UserMyCampaignsPage posgallerytab() throws Exception {

		try {
			if (!Constant.TESTDATAEXCEL.isEmpty())
				driver.get(Constant.TESTDATAEXCEL);
		} catch (Exception e) {
			ExcelUtils.setExcelFile(Constant.TESTDATAPATH, "UserCampaign");
		}
		gallerytab.click(); // Click on gallery tab
		logger.pass("User click on gallerytab");
		gallerycheckbox.click(); // Click on gallery checkbox
		logger.pass("User click on gallery checkbox");
		galleryimage.sendKeys(Constant.DEFAULTSYSTEMPATH + ExcelUtils.getCellData(17, 2)); // Gallery image
		logger.pass("User fetching gallery image from excelsheet");
		if (allElementsVideoUrl.size() != 0) { // If list size is non-zero, element is present
			videourl.sendKeys(ExcelUtils.getCellData(17, 3)); // video url
			validatevideolink.click();
		}
		submit.click(); // Save
		logger.pass("User click on save button");
		return new UserMyCampaignsPage(driver);

	}

	/*
	 * 
	 * Method for campaign tab of negative campaign creation
	 * 
	 */

	private UserCreateCampaignPage negcamptab() throws Exception {

		try {
			if (!Constant.TESTDATAEXCEL.isEmpty())
				driver.get(Constant.TESTDATAEXCEL);
		} catch (Exception e) {
			ExcelUtils.setExcelFile(Constant.TESTDATAPATH, "UserCampaign");
		}
		title.sendKeys(ExcelUtils.getCellData(3, 2)); // Title
		logger.pass("User fetching title name for campaign from excelsheet");
		startdate.clear();
		startdate.sendKeys(ExcelUtils.getCellData(3, 7)); // Start date
		logger.pass("User entering start date for campaign");
		enddate.sendKeys(ExcelUtils.getCellData(3, 8)); // End-date
		logger.pass("User entering end date for campaign");
		WebDriverWait w = new WebDriverWait(driver, 30);
		w.until(ExpectedConditions.visibilityOf(image));
		image.sendKeys(Constant.DEFAULTSYSTEMPATH + ExcelUtils.getCellData(3, 6)); // Uploading display image of
																					// campaign
		logger.pass("User fetching image for campaign from excelsheet");
		if (allElementsDonation.size() != 0) { // If list size is non-zero, element is present
			donation.click(); // Donation or Investment
		}
		logger.pass("User click on campaign type");

		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,2500)", "");

		seedonations.click(); // Let others see donations for the campaign
		logger.pass("User click on 'Let other see donations'");
		publish.click();
		logger.pass("User click on publish button");
		driver.switchTo().frame(descframe); // Description
		WebElement editable = driver.switchTo().activeElement();
		editable.sendKeys(ExcelUtils.getCellData(2, 9));
		driver.switchTo().defaultContent();
		typedropdown.click(); // Organization/Individual type dropdown
		logger.pass("User click on organization/individual type dropdown");
		type.click(); // Organization/Individual type
		logger.pass("User click on Non-profits type");
		categorydropdown.click(); // Category dropdown
		logger.pass("User click on category dropdown");
		category.click(); // Category
		logger.pass("User click on category type");
		goalamt.sendKeys(ExcelUtils.getCellData(3, 3)); // Goal Amount
		logger.pass("User fetching goal amount for campaign from excelsheet");
		exgoalamt.click(); // Allow donation to exceed goal amount
		logger.pass("User click on exceed goal amount");
		mindonamt.clear();
		mindonamt.sendKeys(ExcelUtils.getCellData(3, 4)); // Minimum donation/investment amount
		logger.pass("User fetching minimum donation amount for campaign from excelsheet");
		maxallowdon.clear();
		maxallowdon.sendKeys(ExcelUtils.getCellData(3, 5)); // max. allowed donations/investments
		logger.pass("User fetching maximum allowed donations for campaign from excelsheet");
		return new UserCreateCampaignPage(driver);

	}

	/*
	 * 
	 * Method for givebacks tab of negative campaign creation
	 * 
	 */

	private UserCreateCampaignPage neggivebacktab() throws Exception {

		try {
			if (!Constant.TESTDATAEXCEL.isEmpty())
				driver.get(Constant.TESTDATAEXCEL);
		} catch (Exception e) {
			ExcelUtils.setExcelFile(Constant.TESTDATAPATH, "UserCampaign");
		}
		givebackclick.click(); // Click on GiveBack tab
		logger.pass("User click on giveback tab");
		givebackaddbutton.click(); // Click on add more button
		logger.pass("User click on giveback add button");
		gbtitle.sendKeys(ExcelUtils.getCellData(13, 2)); // GiveBack title
		logger.pass("User fetching giveback title from excelsheet");
		mingiveback.clear();
		mingiveback.sendKeys(ExcelUtils.getCellData(13, 3)); // Minimum Givebacks
		logger.pass("User fetching minimum giveback from excelsheet");
		totalgiveback.clear();
		totalgiveback.sendKeys(ExcelUtils.getCellData(13, 4)); // Total Givebacks
		logger.pass("User fetching totalgiveback from excelsheet");
		gbdescription.sendKeys(ExcelUtils.getCellData(13, 5)); // Givebacks description
		logger.pass("User fetching giveback description from excelsheet");
		gbimage.sendKeys(Constant.DEFAULTSYSTEMPATH + ExcelUtils.getCellData(13, 6)); // Givebacks image
		logger.pass("User fetching image from excelsheet");
		return new UserCreateCampaignPage(driver);

	}

	/*
	 * 
	 * Method for gallery tab of negative campaign creation
	 * 
	 */

	private UserCreateCampaignPage neggallerytab() throws Exception {

		try {
			if (!Constant.TESTDATAEXCEL.isEmpty())
				driver.get(Constant.TESTDATAEXCEL);
		} catch (Exception e) {
			ExcelUtils.setExcelFile(Constant.TESTDATAPATH, "UserCampaign");
		}
		gallerytab.click(); // Click on gallery tab
		logger.pass("User click on gallery tab");
		gallerycheckbox.click(); // Click on gallery checkbox
		logger.pass("User click on gallery checkbox");
		galleryimage.sendKeys(Constant.DEFAULTSYSTEMPATH + ExcelUtils.getCellData(18, 2)); // Gallery image
		logger.pass("User fetching gallery image from excelsheet");
		if (allElementsVideoUrl.size() != 0) { // If list size is non-zero, element is present
			videourl.sendKeys(ExcelUtils.getCellData(18, 3)); // video url
			validatevideolink.click();
		}
		cancel.click();
		logger.pass("User click on save&close button");
		return new UserCreateCampaignPage(driver);

	}

	/*
	 * 
	 * Method for positive campaign creation
	 * 
	 */

	public UserMyCampaignsPage campaignCreation() throws Exception {

		createcampaign.click();
		camptab();
		givebacktab();
		posgallerytab();
		logger.pass("User Created Campaign Successfully");
		return new UserMyCampaignsPage(driver);

	}

	/*
	 * 
	 * Method for negative campaign creation
	 * 
	 */

	public UserAllCampaignsPage campaignCreationExpectingFailure() throws Exception {

		createcampaign.click();
		negcamptab();
		neggivebacktab();
		neggallerytab();
		logger.pass("User Created Campaign Failed");
		return new UserAllCampaignsPage(driver);

	}

	/*
	 * 
	 * Method for promoter profile link
	 * 
	 */

	public UserCreateCampaignPage promoterprofile() {

		createcampaign.click();
		clickhere.click();
		ArrayList<String> al = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(al.get(1));
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,2500)", "");
		cancelbutton.click();
		driver.close();
		driver.switchTo().window(al.get(0));
		return this;

	}

}
