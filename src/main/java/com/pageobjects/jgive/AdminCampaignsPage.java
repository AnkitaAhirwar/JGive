package com.pageobjects.jgive;

import java.util.List;

import org.apache.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.config.jgive.BaseClass;
import com.utils.jgive.Constant;
import com.utils.jgive.ExcelUtils;

/**
 * 
 * This is Page Class for Create Campaign. It contains all the elements and
 * actions related to Create Campaign view.
 *
 */

public class AdminCampaignsPage extends BaseClass {

	private WebDriver driver;
	private static Logger log = Logger.getLogger(AdminCampaignsPage.class);
	Select s;

	public AdminCampaignsPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	/*
	 * Left menu locators
	 */

	@FindBy(how = How.XPATH, using = "//ul[@id=\"submenu\"]//a[contains(text(),'Campaigns')]")
	public WebElement campaignselect;

	@FindBy(how = How.XPATH, using = "//button[@class='btn btn-small button-new btn-success']")
	public WebElement newbutton;

	/*
	 * Locators for Campaign Tab
	 */

	@FindBy(how = How.XPATH, using = "//input[@id='jform_title']")
	public WebElement title;

	@FindBy(how = How.ID, using = "jform_org_ind_type")
	public WebElement type;

	@FindBy(how = How.XPATH, using = "//label[contains(text(),'Donation')]")
	List<WebElement> allElementsDonation;

	@FindBy(how = How.XPATH, using = "//label[contains(text(),'Donation')]")
	WebElement donation;

	@FindBy(how = How.XPATH, using = "//fieldset[@id='jform_published']//label[@class='btn active btn-success'][contains(text(),'Yes')]")
	public WebElement publish;

	@FindBy(how = How.XPATH, using = "//fieldset[@id='jform_allow_view_donations']//label[@class='btn active btn-success'][contains(text(),'Yes')]")
	public WebElement seedonations;

	@FindBy(how = How.XPATH, using = "//fieldset[@id='jform_allow_exceed']//label[@class='btn active btn-success'][contains(text(),'Yes')]")
	public WebElement exgoalamt;

	@FindBy(how = How.XPATH, using = "//input[@id='jform_goal_amount']")
	public WebElement goalamt;

	@FindBy(how = How.NAME, using = "jform[minimum_amount]")
	public WebElement mindonamt;

	@FindBy(how = How.NAME, using = "jform[max_donors]")
	public WebElement maxallowdon;

	@FindBy(how = How.XPATH, using = "//input[@id='jform_image']")
	public WebElement image;

	@FindBy(how = How.XPATH, using = "//input[@id='jform_start_date']")
	public WebElement startdate;

	@FindBy(how = How.XPATH, using = "//input[@id='jform_end_date']")
	public WebElement enddate;

	@FindBy(how = How.XPATH, using = "//*[@id=\"jform_long_description_ifr\"]")
	public WebElement descriptionbox;

	@FindBy(how = How.XPATH, using = "//button[@class='btn btn-small button-apply btn-success']")
	public WebElement save;

	/*
	 * Locators for Givebacks Tab
	 */

	@FindBy(how = How.LINK_TEXT, using = "Givebacks")
	public WebElement givebackclick;

	@FindBy(how = How.XPATH, using = "//span[@class='icon-plus']")
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

	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Gallery')]")
	public WebElement gallerytab;

	@FindBy(how = How.XPATH, using = "//input[@id='jform_video_on_details_page']")
	public WebElement gallerycheckbox;

	@FindBy(how = How.XPATH, using = "//input[@id='jform_gallery_file']")
	public WebElement galleryimage;

	@FindBy(how = How.XPATH, using = "//input[@id='jform_gallery_link']")
	List<WebElement> allElementsVideoUrl;

	@FindBy(how = How.XPATH, using = "//input[@id='jform_gallery_link']")
	public WebElement videourl;

	@FindBy(how = How.XPATH, using = "//input[@class='validate_video_link']")
	public WebElement videolink;

	@FindBy(how = How.XPATH, using = "//button[@class='btn btn-small button-save']")
	public WebElement saveclose;

	@FindBy(how = How.XPATH, using = "//button[@class='btn btn-small button-cancel']")
	public WebElement cancel;

	/*
	 * Locators for List View
	 */

	@FindBy(how = How.XPATH, using = "//input[@id='filter_search']")
	public WebElement filtersearch;

	@FindBy(how = How.XPATH, using = "//i[@class='icon-search']")
	public WebElement searchicon;

	@FindBy(how = How.XPATH, using = "//i[@class='icon-remove']")
	public WebElement removeicon;

	@FindBy(how = How.XPATH, using = "//*[@id=\"filter-bar\"]/div[7]/div/a/span")
	public WebElement categorydropdown;

	@FindBy(how = How.XPATH, using = "//li[contains(text(),'Uncategorised')]")
	public WebElement uncategorised;

	@FindBy(how = How.XPATH, using = "//*[@id=\"publish_states_chzn\"]/a/span")
	public WebElement statusdropdown;

	@FindBy(how = How.XPATH, using = "//li[contains(text(),'Published')]")
	public WebElement published;

	@FindBy(how = How.XPATH, using = "//li[contains(text(),'Unpublished')]")
	public WebElement unpublished;

	@FindBy(how = How.XPATH, using = "//*[@id=\"campaign_type_chzn\"]/a/span")
	public WebElement campaigntypedropdown;

	@FindBy(how = How.XPATH, using = "//li[contains(text(),'Donation')]")
	public WebElement campaigndonation;

	@FindBy(how = How.XPATH, using = "//li[contains(text(),'Investment')]")
	public WebElement campaigninvestment;

	@FindBy(how = How.XPATH, using = "//*[@id=\"org_ind_type_chzn\"]/a/span")
	public WebElement org_ind_type_dropdown;

	@FindBy(how = How.XPATH, using = "//li[contains(text(),'Non-profits')]")
	public WebElement nonprofits;

	@FindBy(how = How.XPATH, using = "//*[@id=\"limit_chzn\"]/a/span")
	public WebElement setlimitdropdown;

	@FindBy(how = How.XPATH, using = "//li[contains(text(),'30')]")
	public WebElement setlimit;

	@FindBy(how = How.XPATH, using = "//input[@id='cb0']")
	public WebElement checkbox;

	@FindBy(how = How.XPATH, using = "//button[@class='btn btn-small button-featured']")
	public WebElement featuredbutton;

	@FindBy(how = How.XPATH, using = "//button[@class='btn btn-small button-star-empty']")
	public WebElement unfeaturedbutton;

	@FindBy(how = How.XPATH, using = "//button[@class='btn btn-small button-publish']")
	public WebElement publishbutton;

	@FindBy(how = How.XPATH, using = "//button[@class='btn btn-small button-unpublish']")
	public WebElement unpublishbutton;

	@FindBy(how = How.XPATH, using = "//button[@class='btn btn-small button-delete']")
	public WebElement deletebutton;

	@FindBy(how = How.LINK_TEXT, using = "Save Environment")
	public WebElement campaignname;

	/*
	 * Locators for Additional info
	 */

	@FindBy(how = How.XPATH, using = "//*[@id=\"myTabTabs\"]/li[5]/a")
	public WebElement additionalinfotab;

	@FindBy(how = How.XPATH, using = "//input[@id='jform_com_jgive_campaign_Text_115']")
	public WebElement campaigntextlabel;

	@FindBy(how = How.XPATH, using = "//input[@id='jform_com_jgive_campaign_Radio_1160']")
	public WebElement campaignradiolabel;

	@FindBy(how = How.XPATH, using = "//select[@id='jform_com_jgive_campaign_SingleSelect_117']")
	public WebElement campaignsingleselectlabel;

	@FindBy(how = How.XPATH, using = "//select[@id='jform_com_jgive_campaign_MultipleSelect_118']")
	public WebElement campaignmultipleselectlabel;

	@FindBy(how = How.XPATH, using = "//textarea[@id='jform_com_jgive_campaign_Textarea_119']")
	public WebElement campaigntextarealabel;

	@FindBy(how = How.XPATH, using = "//button[@id='jform_com_jgive_campaign_Calendar_120_btn']//span[@class='icon-calendar']")
	public WebElement campaigncalendarbtnlabel;

	@FindBy(how = How.XPATH, using = "//div[@id='accordion-Group1']//button[@class='js-btn btn btn-today'][contains(text(),'Today')]")
	public WebElement todaybutton;

	@FindBy(how = How.XPATH, using = "//input[@id='jform_com_jgive_campaign_Email_122']")
	public WebElement campaignemaillabel;

	/*
	 * 
	 * Method for positive campaign creation
	 * 
	 */

	public AdminCampaignsPage campaignCreation(String camptitle, String sdate, String edate, String description,
			String campimage, String goalamount, String mindonation, String maxallowdonation, String givebacktitle,
			String minimumgiveback, String totalgivebackvalue, String gbdesc, String givebackimage,
			String galleryimagevalue, String videourlvalue) throws Exception {

		click(campaignselect); // Campaign Selection from left side tab
		click(newbutton); // Click on new button
		enterValue(title, camptitle); // Title
		logger.pass("User fetching title name for campaign from excelsheet");
		click(type); // Organization/Individual type
		logger.pass("User click on campaign type");
		if (allElementsDonation.size() != 0) { // If list size is non-zero, element is present
			click(donation); // Donation or Investment
		}
		click(publish);// Publish
		logger.pass("User click on publish button");
		clearAndEnterValue(startdate, sdate); // Start date
		logger.pass("User entering startdate for campaign");
		clearAndEnterValue(enddate, edate); // End-date
		logger.pass("User entering end date for campaign");
		enterValueInIframe(descriptionbox, description);
		WebDriverWait w = new WebDriverWait(driver, 30);
		w.until(ExpectedConditions.visibilityOf(image));
		enterValue(image, Constant.DEFAULTSYSTEMPATH + campimage); // Uploading campaign image
		logger.pass("User fetching image for campaign from excelsheet");
		click(seedonations); // Let others see donations for the campaign
		logger.pass("User click on 'Let other see donations'");
		click(exgoalamt); // Allow donation to exceed goal amount
		logger.pass("User click on exceed goal amount");
		enterValue(goalamt, goalamount); // Goal Amount
		logger.pass("User fetching goal amount from excelsheet");
		clearAndEnterValue(mindonamt, mindonation); // Minimum donation/investment amount
		logger.pass("User fetching minimum donation amount for campaign from excelsheet");
		clearAndEnterValue(maxallowdon, maxallowdonation); // max. allowed donations/investments
		logger.pass("User fetching maximum allowed donations for campaign from excelsheet");
		click(save); // Save
		logger.pass("User click on save button to redirect on next page");
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,-2500)", "");
		click(givebackclick); // Click on GiveBack tab
		logger.pass("User click on givebacktab");
		click(givebackaddbutton); // Click on add more button
		logger.pass("User click on giveback addbutton");
		enterValue(gbtitle, givebacktitle); // GiveBack title
		logger.pass("User fetching givebacktitle from excelsheet");
		clearAndEnterValue(mingiveback, minimumgiveback); // Minimum giveback
		logger.pass("User fetching minimum giveback from excelsheet");
		clearAndEnterValue(totalgiveback, totalgivebackvalue); // Total giveback
		logger.pass("User fetching totalgiveback from excelsheet");
		enterValue(gbdescription, gbdesc); // Giveback description
		logger.pass("User fetching giveback description from excelsheet");
		enterValue(gbimage, Constant.DEFAULTSYSTEMPATH + givebackimage); // Giveback image
		logger.pass("User fetching giveback image from excelsheet");
		click(save); // Save
		logger.pass("User click on the save button to redirect on next page");
		click(gallerytab); // Click on gallery tab
		logger.pass("User click on gallerytab");
		click(gallerycheckbox); // Click on gallery checkbox
		logger.pass("User click on gallery checkbox");
		enterValue(galleryimage, Constant.DEFAULTSYSTEMPATH + galleryimagevalue); // Gallery image
		logger.pass("User fetching gallery image from excelsheet");
		if (allElementsVideoUrl.size() != 0) { // If list size is non-zero, element is present
			enterValue(videourl, videourlvalue); // video url
			click(videolink);
		}
		click(save); // Save
		logger.pass("User click on save button");
		click(saveclose);
		logger.pass("User click on save&close button");
		logger.pass("Campaign Created Successfully");
		return new AdminCampaignsPage(driver);

	}

	/*
	 * 
	 * Method for negative campaign creation
	 * 
	 */

	public AdminCampaignsPage campaignCreationExpectingFailure(String camptitle, String sdate, String edate,
			String description, String campimage, String goalamount, String mindonation, String maxallowdonation,
			String givebacktitle, String minimumgiveback, String totalgivebackvalue, String gbdesc,
			String givebackimage, String galleryimagevalue, String videourlvalue) throws Exception {

		click(campaignselect); // Campaign Selection from left side tab
		click(newbutton); // Click on new button
		enterValue(title, camptitle); // Title
		logger.pass("User fetching title name for campaign from excelsheet");
		click(type); // Organization/Individual type
		logger.pass("User click on campaign type");
		if (allElementsDonation.size() != 0) { // If list size is non-zero, element is present
			click(donation); // Donation or Investment
		}
		click(publish);// Publish
		logger.pass("User click on publish button");
		clearAndEnterValue(startdate, sdate); // Start date
		logger.pass("User entering startdate for campaign");
		clearAndEnterValue(enddate, edate); // End-date
		logger.pass("User entering end date for campaign");
		enterValueInIframe(descriptionbox, description);
		WebDriverWait w = new WebDriverWait(driver, 30);
		w.until(ExpectedConditions.visibilityOf(image));
		enterValue(image, Constant.DEFAULTSYSTEMPATH + campimage); // Uploading campaign image
		logger.pass("User fetching image for campaign from excelsheet");
		click(seedonations); // Let others see donations for the campaign
		logger.pass("User click on 'Let other see donations'");
		click(exgoalamt); // Allow donation to exceed goal amount
		logger.pass("User click on exceed goal amount");
		enterValue(goalamt, goalamount); // Goal Amount
		logger.pass("User fetching goal amount from excelsheet");
		clearAndEnterValue(mindonamt, mindonation); // Minimum donation/investment amount
		logger.pass("User fetching minimum donation amount for campaign from excelsheet");
		clearAndEnterValue(maxallowdon, maxallowdonation); // max. allowed donations/investments
		logger.pass("User fetching maximum allowed donations for campaign from excelsheet");
		logger.pass("User click on save button to redirect on next page");
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,-2500)", "");
		click(givebackclick); // Click on GiveBack tab
		logger.pass("User click on givebacktab");
		click(givebackaddbutton); // Click on add more button
		logger.pass("User click on giveback addbutton");
		enterValue(gbtitle, givebacktitle); // GiveBack title
		logger.pass("User fetching givebacktitle from excelsheet");
		clearAndEnterValue(mingiveback, minimumgiveback); // Minimum giveback
		logger.pass("User fetching minimum giveback from excelsheet");
		clearAndEnterValue(totalgiveback, totalgivebackvalue); // Total giveback
		logger.pass("User fetching totalgiveback from excelsheet");
		enterValue(gbdescription, gbdesc); // Giveback description
		logger.pass("User fetching giveback description from excelsheet");
		enterValue(gbimage, Constant.DEFAULTSYSTEMPATH + givebackimage); // Giveback image
		logger.pass("User fetching giveback image from excelsheet");
		click(save); // Save
		logger.pass("User click on the save button to redirect on next page");
		click(gallerytab); // Click on gallery tab
		logger.pass("User click on gallerytab");
		click(gallerycheckbox); // Click on gallery checkbox
		logger.pass("User click on gallery checkbox");
		enterValue(galleryimage, Constant.DEFAULTSYSTEMPATH + galleryimagevalue); // Gallery image
		logger.pass("User fetching gallery image from excelsheet");
		if (allElementsVideoUrl.size() != 0) { // If list size is non-zero, element is present
			enterValue(videourl, videourlvalue); // video url
			click(videolink);
		}
		click(cancel);
		logger.pass("Campaign Creation Failed");
		return new AdminCampaignsPage(driver);

	}

	/*
	 * 
	 * Method for Campaigns List View
	 * 
	 */

	public AdminCampaignsPage listView(String camptitle) throws Exception {

		click(campaignselect); // Campaign Selection from left side tab
		logger.pass("Click on Campaign");
		click(filtersearch); // Filter Search
		logger.pass("Click on filter search");
		enterValue(filtersearch, camptitle);
		logger.pass("User fetching campaign name from excelsheet");
		click(searchicon); // Search Icon
		logger.pass("User click on search icon");
		logger.pass("This is the list view of searched campaign");
		click(removeicon); // Remove Icon
		logger.pass("This is the list view of All Campaigns");

		click(categorydropdown); // Select Category
		logger.pass("User click on the Select Category dropdown");
		click(uncategorised); // Uncategorised
		logger.pass("User select category as uncategorised");
		logger.pass("This is the list view of selected category");

		click(statusdropdown); // Select Status
		logger.pass("User click on Select Status dropdown");
		click(published); // Unpublished
		logger.pass("User select status as unpublished");
		logger.pass("This is the list view of selected status");

		click(campaigntypedropdown); // Campaign Type
		logger.pass("User click on campaign type dropdown");
		click(campaigndonation); // Donation
		logger.pass("User select campaign type as donation");
		logger.pass("This is the list view of selected campaign type");

		click(org_ind_type_dropdown); // Organization/Individual Type
		logger.pass("User click on Organisation/Individual Type dropdown");
		click(nonprofits); // Non-Profits
		logger.pass("User select type as Non-Profit");
		logger.pass("This is the list view of selected organisation/individual type");

		click(setlimitdropdown); // Limit
		logger.pass("User click on Limit dropdown");
		click(setlimit); // Set limit
		logger.pass("User set limit");
		logger.pass("This is list view of campaigns as per limit set by user");

		click(checkbox); // Checkbox
		logger.pass("User click on checkbox");
		click(featuredbutton);// Featured button
		logger.pass("User click on featured button");
		logger.pass("Selected campaign is set as Featured");

		click(checkbox); // Checkbox
		logger.pass("User click on checkbox");
		click(unfeaturedbutton);// Unfeatured button
		logger.pass("User click on Unfeatured button");
		logger.pass("Selected campaign is set as Unfeatured");

		click(checkbox);// Checkbox
		logger.pass("User click on checkbox");
		click(publishbutton);// Publish button
		logger.pass("User click on publish button");
		logger.pass("Selected campaign is set as Published");
		return new AdminCampaignsPage(driver);

	}

	/*
	 * 
	 * Method for campaign tab of positive campaign creation
	 * 
	 */

	private void camptab() throws Exception {

		try {
			if (!Constant.TESTDATAEXCEL.isEmpty())
				driver.get(Constant.TESTDATAEXCEL);
		} catch (Exception e) {
			ExcelUtils.setExcelFile(Constant.TESTDATAPATH, "Campaign");
		}
		title.sendKeys(ExcelUtils.getCellData(2, 2)); // Title
		logger.pass("User fetching title name for campaign from excelsheet");
		type.click(); // Organization/Individual type
		logger.pass("User click on campaign type");
		if (allElementsDonation.size() != 0) { // If list size is non-zero, element is present
			donation.click(); // Donation or Investment
		}
		publish.click();// Publish
		logger.pass("User click on publish button");
		seedonations.click(); // Let others see donations for the campaign
		logger.pass("User click on 'Let other see donations'");
		exgoalamt.click(); // Allow donation to exceed goal amount
		logger.pass("User click on exceed goal amount");
		goalamt.sendKeys(ExcelUtils.getCellData(2, 3)); // Goal Amount
		logger.pass("User fetching goal amount from excelsheet");
		mindonamt.clear();
		mindonamt.sendKeys(ExcelUtils.getCellData(2, 4)); // Minimum donation/investment amount
		logger.pass("User fetching minimum donation amount for campaign from excelsheet");
		maxallowdon.clear();
		maxallowdon.sendKeys(ExcelUtils.getCellData(2, 5)); // max. allowed donations/investments
		logger.pass("User fetching maximum allowed donations for campaign from excelsheet");
		WebDriverWait w = new WebDriverWait(driver, 30);
		w.until(ExpectedConditions.visibilityOf(image));
		image.sendKeys(Constant.DEFAULTSYSTEMPATH + ExcelUtils.getCellData(2, 6)); // Uploading campaign image
		logger.pass("User fetching image for campaign from excelsheet");
		startdate.clear();
		startdate.sendKeys(ExcelUtils.getCellData(2, 7)); // Start date
		logger.pass("User entering startdate for campaign");
		enddate.clear();
		enddate.sendKeys(ExcelUtils.getCellData(2, 8)); // End-date
		logger.pass("User entering end date for campaign");
		save.click(); // Save
		logger.pass("User click on save button to redirect on next page");

	}

	/*
	 * 
	 * Method for Givebacks tab of positive campaign creation
	 * 
	 */

	private void givebacktab() throws Exception {

		try {
			if (!Constant.TESTDATAEXCEL.isEmpty())
				driver.get(Constant.TESTDATAEXCEL);
		} catch (Exception e) {
			ExcelUtils.setExcelFile(Constant.TESTDATAPATH, "Campaign");
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
		save.click(); // Save
		logger.pass("User click on the save button to redirect on next page");

	}

	/*
	 * 
	 * Method for gallery tab of positive campaign creation
	 * 
	 */

	private void posgallerytab() throws Exception {

		try {
			if (!Constant.TESTDATAEXCEL.isEmpty())
				driver.get(Constant.TESTDATAEXCEL);
		} catch (Exception e) {
			ExcelUtils.setExcelFile(Constant.TESTDATAPATH, "Campaign");
		}
		gallerytab.click(); // Click on gallery tab
		logger.pass("User click on gallerytab");
		gallerycheckbox.click(); // Click on gallery checkbox
		logger.pass("User click on gallery checkbox");
		galleryimage.sendKeys(Constant.DEFAULTSYSTEMPATH + ExcelUtils.getCellData(17, 2)); // Gallery image
		logger.pass("User fetching gallery image from excelsheet");
		if (allElementsVideoUrl.size() != 0) { // If list size is non-zero, element is present
			videourl.sendKeys(ExcelUtils.getCellData(17, 3)); // video url
			videolink.click();
		}
		save.click(); // Save
		logger.pass("User click on save button");
		saveclose.click();
		logger.pass("User click on save&close button");

	}

	/*
	 * 
	 * Method for campaign tab of negative campaign creation
	 * 
	 */

	private void negcamptab() throws Exception {

		try {
			if (!Constant.TESTDATAEXCEL.isEmpty())
				driver.get(Constant.TESTDATAEXCEL);
		} catch (Exception e) {
			ExcelUtils.setExcelFile(Constant.TESTDATAPATH, "Campaign");
		}
		title.sendKeys(ExcelUtils.getCellData(3, 2)); // Title
		logger.pass("User fetching title name for campaign from excelsheet");
		type.click(); // Organization/Individual type
		logger.pass("User click on campaign type");
		if (allElementsDonation.size() != 0) { // If list size is non-zero, element is present
			donation.click(); // Donation or Investment
		}
		publish.click();// Publish
		logger.pass("User click on publish button");
		seedonations.click(); // Let others see donations for the campaign
		logger.pass("User click on 'Let others see donations'");
		exgoalamt.click(); // Allow donation to exceed goal amount
		logger.pass("User click on exceed goal amount");
		goalamt.sendKeys(ExcelUtils.getCellData(3, 3)); // Goal Amount
		logger.pass("User fetching goal amount for campaign from excelsheet");
		mindonamt.clear();
		mindonamt.sendKeys(ExcelUtils.getCellData(3, 4)); // Minimum donation/investment amount
		logger.pass("User fetching minimum donation amount for campaign from excelsheet");
		maxallowdon.clear();
		maxallowdon.sendKeys(ExcelUtils.getCellData(3, 5)); // max. allowed donations/investments
		logger.pass("User fetching maximum allowed donations for campaign from excelsheet");
		WebDriverWait w = new WebDriverWait(driver, 30);
		w.until(ExpectedConditions.visibilityOf(image));
		image.sendKeys(Constant.DEFAULTSYSTEMPATH + ExcelUtils.getCellData(3, 6)); // Uploading campaign image
		logger.pass("User fetching image for campaign from excelsheet");
		startdate.clear();
		startdate.sendKeys(ExcelUtils.getCellData(3, 7)); // Start date
		logger.pass("User entering start date for campaign");
		enddate.sendKeys(ExcelUtils.getCellData(3, 8)); // End-date
		logger.pass("User entering end date for campaign");
		save.click(); // Save
		logger.pass("User click on save button to redirect on next page");

	}

	/*
	 * 
	 * Method for givebacks tab of negative campaign creation
	 * 
	 */

	private void neggivebacktab() throws Exception {

		try {
			if (!Constant.TESTDATAEXCEL.isEmpty())
				driver.get(Constant.TESTDATAEXCEL);
		} catch (Exception e) {
			ExcelUtils.setExcelFile(Constant.TESTDATAPATH, "Campaign");
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
		save.click(); // Save
		logger.pass("User click on save button to redirect on next page");

	}

	/*
	 * 
	 * Method for gallery tab of negative campaign creation
	 * 
	 */

	private void neggallerytab() throws Exception {

		try {
			if (!Constant.TESTDATAEXCEL.isEmpty())
				driver.get(Constant.TESTDATAEXCEL);
		} catch (Exception e) {
			ExcelUtils.setExcelFile(Constant.TESTDATAPATH, "Campaign");
		}
		gallerytab.click(); // Click on gallery tab
		logger.pass("User click on gallery tab");
		gallerycheckbox.click(); // Click on gallery checkbox
		logger.pass("User click on gallery checkbox");
		galleryimage.sendKeys(Constant.DEFAULTSYSTEMPATH + ExcelUtils.getCellData(18, 2)); // Gallery image
		logger.pass("User fetching gallery image from excelsheet");
		if (allElementsVideoUrl.size() != 0) { // If list size is non-zero, element is present
			videourl.sendKeys(ExcelUtils.getCellData(18, 3)); // video url
			videolink.click();
		}
		save.click();
		logger.pass("User click on save button to redirect on next page");
		cancel.click();
		logger.pass("User click on save&close button");

	}

	/*
	 * 
	 * Method for positive campaign creation
	 * 
	 */

	public AdminCampaignsPage campaignCreation() throws Exception {

		campaignselect.click(); // Campaign Selection from left side tab
		newbutton.click(); // Click on new button
		camptab();
		givebacktab();
		posgallerytab();
		logger.pass("Campaign Created Successfully");
		return new AdminCampaignsPage(driver);

	}

	/*
	 * 
	 * Method for negative campaign creation
	 * 
	 */

	public AdminCampaignsPage campaignCreationExpectingFailure() throws Exception {

		campaignselect.click(); // Campaign Selection from left side tab
		newbutton.click(); // Click on new button
		negcamptab();
		neggivebacktab();
		neggallerytab();
		logger.pass("Campaign Creation Failed");
		return new AdminCampaignsPage(driver);
		
	}

	public AdminCampaignsPage listView() throws Exception {

		try {
			if (!Constant.TESTDATAEXCEL.isEmpty())
				driver.get(Constant.TESTDATAEXCEL);
		} catch (Exception e) {
			ExcelUtils.setExcelFile(Constant.TESTDATAPATH, "Campaign");
		}
		campaignselect.click(); // Campaign Selection from left side tab
		logger.pass("Click on Campaign");
		filtersearch.click(); // Filter Search
		logger.pass("Click on filter search");
		filtersearch.sendKeys(ExcelUtils.getCellData(21, 2));
		logger.pass("User fetching campaign name from excelsheet");
		searchicon.click(); // Search Icon
		logger.pass("User click on search icon");
		logger.pass("This is the list view of searched campaign");
		removeicon.click(); // Remove Icon
		logger.pass("This is the list view of All Campaigns");

		categorydropdown.click(); // Select Category
		logger.pass("User click on the Select Category dropdown");
		uncategorised.click(); // Uncategorised
		logger.pass("User select category as uncategorised");
		logger.pass("This is the list view of selected category");

		statusdropdown.click(); // Select Status
		logger.pass("User click on Select Status dropdown");
		published.click(); // Unpublished
		logger.pass("User select status as unpublished");
		logger.pass("This is the list view of selected status");

		campaigntypedropdown.click(); // Campaign Type
		logger.pass("User click on campaign type dropdown");
		campaigndonation.click(); // Donation
		logger.pass("User select campaign type as donation");
		logger.pass("This is the list view of selected campaign type");

		org_ind_type_dropdown.click(); // Organization/Individual Type
		logger.pass("User click on Organisation/Individual Type dropdown");
		nonprofits.click(); // Non-Profits
		logger.pass("User select type as Non-Profit");
		logger.pass("This is the list view of selected organisation/individual type");

		setlimitdropdown.click(); // Limit
		logger.pass("User click on Limit dropdown");
		setlimit.click(); // Set limit
		logger.pass("User set limit");
		logger.pass("This is list view of campaigns as per limit set by user");

		checkbox.click(); // Checkbox
		logger.pass("User click on checkbox");
		featuredbutton.click();// Featured button
		logger.pass("User click on featured button");
		logger.pass("Selected campaign is set as Featured");

		checkbox.click(); // Checkbox
		logger.pass("User click on checkbox");
		unfeaturedbutton.click();// Unfeatured button
		logger.pass("User click on Unfeatured button");
		logger.pass("Selected campaign is set as Unfeatured");

		checkbox.click();// Checkbox
		logger.pass("User click on checkbox");
		publishbutton.click();// Publish button
		logger.pass("User click on publish button");
		logger.pass("Selected campaign is set as Published");
		return new AdminCampaignsPage(driver);

	}

	public AdminCampaignsPage editcampaign() throws Exception {

		try {
			if (!Constant.TESTDATAEXCEL.isEmpty())
				driver.get(Constant.TESTDATAEXCEL);
		} catch (Exception e) {
			ExcelUtils.setExcelFile(Constant.TESTDATAPATH, "Campaign");
		}
		campaignselect.click(); // Campaign Selection from left side tab
		logger.pass("User click on campaigns");
		campaignname.click(); // Campaign Name
		logger.pass("User click on campaign name");
		title.clear(); // Title
		logger.pass("User clear title");
		title.sendKeys(ExcelUtils.getCellData(24, 2));
		logger.pass("User fetching title from excelsheet");
		goalamt.clear(); // Goal Amount
		logger.pass("User clear goalamount");
		goalamt.sendKeys(ExcelUtils.getCellData(24, 3));
		logger.pass("User fetching goal amount from excelsheet");
		saveclose.click(); // Save&Close button
		logger.pass("User edit campaign successfully");
		return new AdminCampaignsPage(driver);

	}

}
