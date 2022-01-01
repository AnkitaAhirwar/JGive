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
 * This is Page Class for Campaign Form Fields. It contains all the elements and
 * actions related to Campaign Form Fields view.
 * 
 */

public class AdminCampaignFormFieldsPage extends BaseClass {

	private WebDriver driver;
	private static Logger log = Logger.getLogger(AdminCampaignFormFieldsPage.class);

	public AdminCampaignFormFieldsPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	/*
	 * Left menu locators
	 */

	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Campaign form fields')]")
	public WebElement campaignformfields;

	@FindBy(how = How.XPATH, using = "//span[@class='icon-new icon-white']")
	public WebElement newbutton;

	/*
	 * Locators for basic field attributes
	 */

	@FindBy(how = How.XPATH, using = "//input[@id='jform_label']")
	public WebElement label;

	@FindBy(how = How.XPATH, using = "//input[@id='jform_name']")
	public WebElement name;

	@FindBy(how = How.XPATH, using = "//*[@id=\"jform_type_chzn\"]/a/span")
	public WebElement fieldtypedropdown;

	@FindBy(how = How.XPATH, using = "//div[@id='jform_type_chzn']//ul[@class='chzn-results']/li[.='Text']")
	public WebElement fieldtypetext;

	@FindBy(how = How.XPATH, using = "//li[contains(text(),'Radio')]")
	public WebElement fieldtyperadio;

	@FindBy(how = How.XPATH, using = "//li[contains(text(),'Single select')]")
	public WebElement fieldtypesingleselect;

	@FindBy(how = How.XPATH, using = "//li[contains(text(),'Multiple select')]")
	public WebElement fieldtypemultipleselect;

	@FindBy(how = How.XPATH, using = "//li[contains(text(),'Textarea')]")
	public WebElement fieldtypetextarea;

	@FindBy(how = How.XPATH, using = "//li[contains(text(),'Calendar')]")
	public WebElement fieldtypecalendar;

	@FindBy(how = How.XPATH, using = "//li[contains(text(),'Editor')]")
	public WebElement fieldtypeeditor;

	@FindBy(how = How.XPATH, using = "//li[contains(text(),'Email')]")
	public WebElement fieldtypeemail;

	@FindBy(how = How.XPATH, using = "//li[contains(text(),'Select User')]")
	public WebElement fieldtypeselectuser;

	@FindBy(how = How.XPATH, using = "//input[@id='jform_min']")
	public WebElement minimumcharacters;

	@FindBy(how = How.XPATH, using = "//input[@id='jform_max']")
	public WebElement maximumcharacters;

	@FindBy(how = How.XPATH, using = "//input[@id='jform_default_value']")
	public WebElement defaulttext;

	@FindBy(how = How.XPATH, using = "//*[@id=\"jform_rows\"]")
	public WebElement rows;

	@FindBy(how = How.XPATH, using = "//*[@id=\"jform_cols\"]")
	public WebElement columns;

	@FindBy(how = How.XPATH, using = "//*[@id=\"jform_format_chzn\"]/a/span")
	public WebElement dateformatdropdown;

	@FindBy(how = How.XPATH, using = "//li[contains(text(),'DD-MM-YYYY')]")
	public WebElement dateformatselection;

	@FindBy(how = How.XPATH, using = "//button[@class='btn btn-small button-apply btn-success']")
	public WebElement save;

	@FindBy(how = How.XPATH, using = "//button[@class='btn btn-small button-save']")
	public WebElement saveclose;

	@FindBy(how = How.XPATH, using = "//button[@class='btn btn-small button-save-new']")
	public WebElement savenew;

	@FindBy(how = How.XPATH, using = "//button[@class='btn btn-small button-cancel']")
	public WebElement cancel;

	@FindBy(how = How.XPATH, using = "//*[@id=\"tjfields_optionname_0\"]")
	public WebElement fieldoptionsname;

	@FindBy(how = How.XPATH, using = "//*[@id=\"tjfields_optionvalue_0\"]")
	public WebElement fieldoptionsvalue;

	@FindBy(how = How.XPATH, using = "//button[@id='add']//i[contains(@class,'icon-plus-2')]")
	public WebElement addbutton;

	/*
	 * Locators for Extra Field Attributes
	 */

	@FindBy(how = How.XPATH, using = "//*[@id=\"jformgroup_id_chzn\"]/a/span")
	public WebElement groupdropdown;

	@FindBy(how = How.XPATH, using = "//li[contains(text(),'Rashi')]")
	public WebElement groupname;

	@FindBy(how = How.XPATH, using = "//*[@id=\"jform_state_chzn\"]/a/span")
	public WebElement statusdropdown;

	@FindBy(how = How.XPATH, using = "//li[contains(text(),'Published')]")
	public WebElement status;

	@FindBy(how = How.XPATH, using = "//fieldset[@id='jform_required']//label[@class='btn active btn-danger'][contains(text(),'No')]")
	public WebElement required;

	@FindBy(how = How.XPATH, using = "//fieldset[@id='jform_readonly']//label[@class='btn active btn-danger'][contains(text(),'No')]")
	public WebElement readonly;

	@FindBy(how = How.XPATH, using = "//input[@id='jform_placeholder']")
	public WebElement placeholder;

	@FindBy(how = How.XPATH, using = "//input[@class='default']")
	public WebElement category;

	@FindBy(how = How.XPATH, using = "//li[contains(text(),'Uncategorised')]")
	public WebElement categoryselection;

	@FindBy(how = How.XPATH, using = "//input[@id='jform_description']")
	public WebElement tooltip;

	@FindBy(how = How.XPATH, using = "//*[@id=\"tjfields_jsoptions_1\"]")
	public WebElement events;

	@FindBy(how = How.XPATH, using = "//input[@id='tjfields_jsfunctionname_1']")
	public WebElement functionname;

	@FindBy(how = How.XPATH, using = "//button[@id='add_js']//i[contains(@class,'icon-plus-2')]")
	public WebElement jsfunctionaddbutton;

	@FindBy(how = How.XPATH, using = "//input[@id='jform_validation_class']")
	public WebElement validationclass;

	@FindBy(how = How.XPATH, using = "//input[@name='checkall-toggle']")
	public WebElement checkallbtn;

	@FindBy(how = How.XPATH, using = "//*[@id=\"toolbar-trash\"]/button")
	public WebElement trash;

	@FindBy(how = How.XPATH, using = "//*[@id=\"filter_published_chzn\"]/a/span")
	public WebElement selectstatus;

	@FindBy(how = How.XPATH, using = "//li[contains(text(),'Trashed')]")
	public WebElement trashed;

	@FindBy(how = How.XPATH, using = "//button[@class='btn btn-small button-delete']")
	public WebElement emptytrash;

	/*
	 * 
	 * Method for Campaign Text Fields
	 * 
	 */

	public AdminCampaignFormFieldsPage campaignfieldtext(String labelname, String title, String minchar, String maxchar,
			String defaultvalue, String tooltipvalue) throws Exception {

		click(campaignformfields); // Campaign form fields
		logger.pass("User click on the Campaign Form Fields");
		click(newbutton); // New button
		logger.pass("User click on the new button");
		enterValue(label, labelname); // Label
		logger.pass("User fetching label from excelsheet");
		enterValue(name, title); // Name
		logger.pass("User fetching name from excelsheet");
		click(fieldtypedropdown); // Dropdown
		logger.pass("User click on the field type dropdown list");
		click(fieldtypetext); // Text
		logger.pass("User click on the field type as Text");
		enterValue(minimumcharacters, minchar); // Minimum characters
		logger.pass("User fetching minimum characters from excelsheet");
		enterValue(maximumcharacters, maxchar); // Maximum characters
		logger.pass("User fetching maximum characters from excelsheet");
		enterValue(defaulttext, defaultvalue); // Set default text
		logger.pass("User fetching default text from excelsheet");
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,-2500)", "");
		click(groupdropdown); // Group dropdown list
		logger.pass("User click on the group dropdown list");
		click(groupname); // Group name
		logger.pass("User click on the group name");
		click(statusdropdown); // Status dropdown list
		logger.pass("User click on the status dropdown list");
		click(status); // Status
		logger.pass("User click on the status");
		click(required); // Required
		logger.pass("User click on the Required field");
		click(readonly); // Read-only
		logger.pass("User click on the read-only field");
		enterValue(tooltip, tooltipvalue);
		logger.pass("User click on the tooltip"); // Tooltip
		click(category); // Category
		logger.pass("User click on the Category");
		click(categoryselection); // category Selection
		logger.pass("User click on the category selection list");
		click(saveclose); // Save&close
		logger.pass("User click on the save&close button");
		logger.pass("User saved Campaign Text field successfully");
		logger.pass("User saved Campaign Form fields successfully");
		System.out.println(" User saved Campaign Form fields successfully");
		return this;

	}

	/*
	 * 
	 * Method for Campaign Radio field
	 * 
	 */

	public void campaignfieldradio(String labelname, String title, String minchar, String maxchar,
			String tooltipvalue) {

		click(campaignformfields); // Campaign Form Fields
		logger.pass("User click on the Campaign Form Fields");
		click(newbutton); // New button
		logger.pass("User click on the new button");
		enterValue(label, labelname); // Label
		logger.pass("User fetching label from excelsheet");
		enterValue(name, title); // Name
		logger.pass("User fetching name from excelsheet");
		click(fieldtypedropdown); // Field type dropdown
		logger.pass("User click on the field type dropdown list");
		click(fieldtyperadio); // Radio
		logger.pass("User click on the field type as radio");
		enterValue(fieldoptionsname, minchar); // Field Options Name
		logger.pass("User fetching field options name from excelsheet");
		enterValue(fieldoptionsvalue, maxchar); // Field Options Value
		logger.pass("User fetching field options value from excelsheet");
		click(addbutton); // Add button logger.pass("User click on the Add button");
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,-2500)", "");
		click(groupdropdown); // Group dropdown list
		logger.pass("User click on the group dropdown list");
		click(groupname); // Group Name
		logger.pass("User click on the group name");
		click(statusdropdown); // Status Dropdown
		logger.pass("User click on the status dropdown list");
		click(status); // Status
		logger.pass("User click on the status");
		click(required); // Required
		logger.pass("User click on the Required field");
		click(readonly); // Read-only
		logger.pass("User click on the read-only field");
		click(category);// Category
		logger.pass("User click on the category");
		click(categoryselection); // Category selection
		logger.pass("User click on the category selection list");
		enterValue(tooltip, tooltipvalue); // Tooltip
		logger.pass("User fetching tooltip from excelsheet");
		click(saveclose); // Save&close
		logger.pass("User click on the save&close button");
		logger.pass("User saved Campaign Radio field successfully");

	}

	/*
	 * 
	 * Method for Campaign Single Select field
	 * 
	 */

	public void campaignfieldsingleselect(String labelname, String title, String minchar, String maxchar,
			String tooltipvalue) {

		click(campaignformfields); // Campaign Form Fields
		logger.pass("User click on the campaign form fields");
		click(newbutton); // New button
		logger.pass("User click on the new button");
		enterValue(label, labelname); // Label
		logger.pass("User fetching label from excelsheet");
		enterValue(name, title); // Name
		logger.pass("User fetching name from excelsheet");
		click(fieldtypedropdown); // Field type dropdown list
		logger.pass("User click on the field type dropdown list");
		click(fieldtypesingleselect); // Single Select
		logger.pass("User click on the field type as Single Select");
		enterValue(fieldoptionsname, minchar); // Field Options Name
		logger.pass("User fetching field options name from excelsheet");
		enterValue(fieldoptionsvalue, maxchar); // Field Options Value
		logger.pass("User fetching field options value from excelsheet");
		click(addbutton); // Add button logger.pass("User click on the add button");
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,-2500)", "");
		click(groupdropdown); // Group dropdown list
		logger.pass("User click on the group dropdown list");
		click(groupname); // Group Name
		logger.pass("User click on the group name");
		click(statusdropdown); // Status dropdown list
		logger.pass("User click on the status dropdown list");
		click(status); // Status
		logger.pass("User click on the status");
		click(required); // Required
		logger.pass("User click on the Required field");
		click(readonly); // Read-only
		logger.pass("User click on the read-only field");
		click(category);// Category
		logger.pass("User click on the category");
		click(categoryselection); // Category selection
		logger.pass("User click on the category selection list");
		enterValue(tooltip, tooltipvalue); // Tooltip
		logger.pass("User fetching tooltip from excelsheet");
		click(saveclose); // Save&close
		logger.pass("User click on the save&close button");
		logger.pass("User saved Campaign Single Select field successfully");

	}

	/*
	 * 
	 * Method for Campaign Multiple Select field
	 * 
	 */

	public void campaignfieldmultipleselect(String labelname, String title, String minchar, String maxchar,
			String tooltipvalue) {

		click(campaignformfields); // Campaign Form Fields
		logger.pass("User click on the campaign form fields");
		click(newbutton); // New button
		logger.pass("User click on the new button");
		enterValue(label, labelname); // Label
		logger.pass("User fetching label from excelsheet");
		enterValue(name, title); // Name
		logger.pass("User fetching name from excelsheet");
		click(fieldtypedropdown); // Field type dropdown
		logger.pass("User click on the field type dropdownlist");
		click(fieldtypemultipleselect); // Multiple Select
		logger.pass("User click on the field type as multiple select");
		enterValue(fieldoptionsname, minchar); // Field Options Name
		logger.pass("User fetching field options name from excelsheet");
		enterValue(fieldoptionsvalue, maxchar); // Field Options Value
		logger.pass("User fetching field options value from excelsheet");
		click(addbutton); // Add button logger.pass("User click on the add button");
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,-2500)", "");
		click(groupdropdown); // Group dropdown
		logger.pass("User click on the group dropdown list");
		click(groupname); // Group Name
		logger.pass("User click on the group name");
		click(statusdropdown); // Status dropdown
		logger.pass("User click on the status dropdown list");
		click(status); // Status
		logger.pass("User click on the status");
		click(required); // Required
		logger.pass("User click on the Required field");
		click(readonly); // Read-only
		logger.pass("User click on the read-only field");
		click(category); // Category
		logger.pass("User click on the category");
		click(categoryselection); // Category selection
		logger.pass("User click on the category selection list");
		enterValue(tooltip, tooltipvalue); // Tooltip
		logger.pass("User fetching tooltip from excelsheet");
		click(saveclose); // Save&close
		logger.pass("User click on the save&close button");
		logger.pass("User saved Campaign Multiple Select field successfully");

	}

	/*
	 * 
	 * Method for Campaign TextArea field
	 * 
	 */

	public void campaignfieldtextarea(String labelname, String title, String minchar, String maxchar, String rownum,
			String colnum, String defaultvalue, String tooltipvalue) {

		click(campaignformfields); // Campaign Form Fields
		logger.pass("User click on the campaign form fields");
		click(newbutton); // New button
		logger.pass("User click on the new button");
		enterValue(label, labelname); // Label
		logger.pass("User fetching label from excelsheet");
		enterValue(name, title); // Name
		logger.pass("User fetching name from excelsheet");
		click(fieldtypedropdown); // Field type dropdown
		logger.pass("User click on the field type dropdown list");
		click(fieldtypetextarea); // Textarea
		logger.pass("User click on the field type as textarea");
		enterValue(minimumcharacters, minchar); // Minimum characters
		logger.pass("User fetching minimum characters from excelsheet");
		enterValue(maximumcharacters, maxchar); // Maximum characters
		logger.pass("User fetching maximum characters from excelsheet");
		enterValue(rows, rownum); // Rows
		logger.pass("User fetching rows from excelsheet");
		enterValue(columns, colnum); // Columns
		logger.pass("User fetching columns from excelsheet");
		enterValue(defaulttext, defaultvalue); // Set default text
		logger.pass("User fetching default text from excelsheet");
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,-2500)", "");
		click(groupdropdown); // Group dropdown
		logger.pass("User click on the group dropdown list");
		click(groupname); // Group name
		logger.pass("User click on the group name");
		click(statusdropdown); // Status dropdown
		logger.pass("User click on the status dropdown list");
		click(status); // Status
		logger.pass("User click on the status");
		click(required); // Required
		logger.pass("User click on the Required field");
		click(readonly); // Read-only
		logger.pass("User click on the read-only field");
		click(category);// Category
		logger.pass("User click on the category");
		click(categoryselection); // Category selection
		logger.pass("User click on the category selection list");
		enterValue(tooltip, tooltipvalue); // Tooltip
		logger.pass("User fetching tooltip from excelsheet");
		click(saveclose); // Save&close
		logger.pass("User click on the save&close button");
		logger.pass("User saved Campaign Textarea field successfully");

	}

	/*
	 * 
	 * Method for Campaign Calendar field
	 * 
	 */

	public void campaignfieldcalendar(String labelname, String title, String defaultvalue, String tooltipvalue) {

		click(campaignformfields); // Campaign Form Fields
		logger.pass("User click on the campaign form fields");
		click(newbutton); // New button
		logger.pass("User click on the new button");
		enterValue(label, labelname); // Label
		logger.pass("User fetching label from excelsheet");
		enterValue(name, title); // Name
		logger.pass("User fetching name from excelsheet");
		click(fieldtypedropdown); // Field type dropdown
		logger.pass("User click on the field type dropdown list");
		click(fieldtypecalendar); // Calendar
		logger.pass("User click on the field type as Calendar");
		click(dateformatdropdown); // Date format dropdown
		logger.pass("User click on the date format dropdown list");
		click(dateformatselection); // Date format selection
		logger.pass("User click on the date format selection list");
		enterValue(defaulttext, defaultvalue); // Set default text
		logger.pass("User fetching default text from excelsheet");
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,-2500)", "");
		click(groupdropdown); // Group dropdown
		logger.pass("User click on the group dropdown list");
		click(groupname); // Group name
		logger.pass("User click on the group name");
		click(statusdropdown); // Status dropdown
		logger.pass("User click on the status dropdown list");
		click(status); // status
		logger.pass("User click on the status");
		click(required); // Required
		logger.pass("User click on the Required field");
		click(readonly); // Read-only
		logger.pass("User click on the read-only field");
		click(category);// Category
		logger.pass("User click on the category");
		click(categoryselection); // Category selection
		logger.pass("User click on the category selection list");
		enterValue(tooltip, tooltipvalue); // Tooltip
		logger.pass("User fetching tooltip from excelsheet");
		click(saveclose); // Save&close
		logger.pass("User click on the save&close button");
		logger.pass("User saved Campaign Calendar field successfully");

	}

	/*
	 * 
	 * Method for Campaign Editor field
	 * 
	 */

	public void campaignfieldeditor(String labelname, String title, String tooltipvalue) {

		click(campaignformfields); // Campaign Form Fields
		logger.pass("User click on the campaign form fields");
		click(newbutton); // New button
		logger.pass("User click on the new button");
		enterValue(label, labelname); // Label
		logger.pass("User fetching label from excelsheet");
		enterValue(name, title); // Name
		logger.pass("User fetching name from excelsheet");
		click(fieldtypedropdown); // Field type dropdown
		logger.pass("User click on the field type dropdown list");
		click(fieldtypeeditor); // Editor
		logger.pass("User click on the field type as editor");
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,-2500)", "");
		click(groupdropdown); // Group dropdown
		logger.pass("User click on the group dropdown list");
		click(groupname); // Group name
		logger.pass("User click on the group name");
		click(statusdropdown); // Status dropdown
		logger.pass("User click on the status dropdown list");
		click(status); // Status
		logger.pass("User click on the status");
		click(required); // Required
		logger.pass("User click on the Required field");
		click(readonly); // Read-only
		logger.pass("User click on the read-only field");
		click(category); // Category
		logger.pass("User click on the category");
		click(categoryselection); // Category selection
		logger.pass("User click on the category selection list");
		enterValue(tooltip, tooltipvalue); // Tooltip
		logger.pass("User fetching tooltip from excelsheet");
		click(saveclose); // Save&close
		logger.pass("User click on save&close button");
		logger.pass("User saved Campaign Editor field successfully");

	}

	/*
	 * 
	 * Method for Campaign Email field
	 * 
	 */

	public void campaignfieldemail(String labelname, String title, String minchar, String maxchar, String defaultvalue,
			String tooltipvalue) {

		click(campaignformfields); // Campaign Form Fields
		logger.pass("User click on the campaign form fields");
		click(newbutton); // New button
		logger.pass("User click on the new button");
		enterValue(label, labelname); // Label
		logger.pass("User fetching label from excelsheet");
		enterValue(name, title); // Name
		logger.pass("User fetching name from excelsheet");
		click(fieldtypedropdown); // Field type dropdown
		logger.pass("User click on the field type dropdown list");
		click(fieldtypeemail); // Email
		logger.pass("User click on the field type as email");
		enterValue(minimumcharacters, minchar); // Minimum characters
		logger.pass("User fetching minimum characters from excelsheet");
		enterValue(maximumcharacters, maxchar); // Maximum characters
		logger.pass("User fetching maximum characters from excelsheet");
		enterValue(defaulttext, defaultvalue); // Set default text
		logger.pass("User fetching default text from excelsheet");
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,-2500)", "");
		click(groupdropdown); // Group dropdown
		logger.pass("User click on the group dropdown list");
		click(groupname); // Group Name
		logger.pass("User click on the group name");
		click(statusdropdown); // Status dropdown
		logger.pass("User click on the status dropdown list");
		click(status); // Status
		logger.pass("User click on the status");
		click(required); // Required
		logger.pass("User click on the Required field");
		click(readonly); // Read-only
		logger.pass("User click on the read-only field");
		click(category); // Category
		logger.pass("User click on the category");
		click(categoryselection); // category selection
		logger.pass("User click on the category selection list");
		enterValue(tooltip, tooltipvalue); // Tooltip
		logger.pass("User fetching tooltip from excelsheet");
		click(saveclose); // Save&close
		logger.pass("User click on save&close button");
		logger.pass("User saved Campaign Email field successfully");

	}

	/*
	 * 
	 * Method for Campaign Select User field
	 * 
	 */

	public void campaignfieldselectuser(String labelname, String title, String tooltipvalue) {

		click(campaignformfields); // Campaign Form Fields
		logger.pass("User click on the campaign form fields");
		click(newbutton); // New button
		logger.pass("User click on the new button");
		enterValue(label, labelname); // Label
		logger.pass("User fetching label from excelsheet");
		enterValue(name, title); // Name
		logger.pass("User fetching name from excelsheet");
		click(fieldtypedropdown); // Field type dropdown
		logger.pass("User click on the field type dropdown list");
		click(fieldtypeselectuser); // Select User
		logger.pass("User click on the field type as Select User");
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,-2500)", "");
		click(groupdropdown); // Group dropdown
		logger.pass("User click on the group dropdown list");
		click(groupname); // Group name
		logger.pass("User click on the group name");
		click(statusdropdown); // Status dropdown
		logger.pass("User click on the status dropdown list");
		click(status); // Status
		logger.pass("User click on the status");
		click(required); // Required
		logger.pass("User click on the Required field");
		click(readonly); // Read-only
		logger.pass("User click on the read-only field");
		click(category);// Category
		logger.pass("User click on the category");
		click(categoryselection); // Category selection
		logger.pass("User click on the category selection list");
		enterValue(tooltip, tooltipvalue); // Tooltip
		logger.pass("User fetching tooltip from excelsheet");
		click(saveclose); // Save&close
		logger.pass("User click on save&close button");
		logger.pass("User saved Campaign Select User field successfully");

	}

	/*
	 * 
	 * Method for Campaign Form fields deletion
	 * 
	 */

	public AdminCampaignFormFieldsPage deletefields() {

		click(campaignformfields); // Campaign Form Fields
		logger.pass("User click on the campaign form fields");
		click(checkallbtn); // Check all button
		logger.pass("User click on the checkall button");
		click(trash); // Trash button logger.pass("User click on the trash button");
		logger.pass("User deleted Campaign Form fields successfully");
		System.out.println(" User deleted Campaign Form fields successfully");
		return this;

	}

	/*
	 * 
	 * Method for Empty Trash
	 * 
	 */

	public AdminCampaignFormFieldsPage emptytrash() {

		click(campaignformfields); // Campaign Form Fields
		logger.pass("User click on the campaign form fields");
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,2500)", "");
		click(selectstatus);
		click(trashed);
		jse.executeScript("window.scrollBy(0,-2500)", "");
		click(checkallbtn);
		click(emptytrash);
		driver.switchTo().alert().accept();
		driver.switchTo().alert().accept();
		return this;
	}

	/*
	 * 
	 * Method for Campaign Text Fields
	 * 
	 */

	private void campaignfieldtext() {

		campaignformfields.click(); // Campaign form fields
		logger.pass("User click on the Campaign Form Fields");
		newbutton.click(); // New button
		logger.pass("User click on the new button");
		label.sendKeys(ExcelUtils.getCellData(8, 2)); // Label
		logger.pass("User fetching label from excelsheet");
		name.sendKeys(ExcelUtils.getCellData(9, 2)); // Name
		logger.pass("User fetching name from excelsheet");
		fieldtypedropdown.click(); // Dropdown
		logger.pass("User click on the field type dropdown list");
		fieldtypetext.click(); // Text
		logger.pass("User click on the field type as Text");
		minimumcharacters.sendKeys(ExcelUtils.getCellData(10, 2)); // Minimum characters
		logger.pass("User fetching minimum characters from excelsheet");
		maximumcharacters.sendKeys(ExcelUtils.getCellData(11, 2)); // Maximum characters
		logger.pass("User fetching maximum characters from excelsheet");
		defaulttext.sendKeys(ExcelUtils.getCellData(12, 2)); // Set default text
		logger.pass("User fetching default text from excelsheet");
		groupdropdown.click(); // Group dropdown list
		logger.pass("User click on the group dropdown list");
		groupname.click(); // Group name
		logger.pass("User click on the group name");
		statusdropdown.click(); // Status dropdown list
		logger.pass("User click on the status dropdown list");
		status.click(); // Status
		logger.pass("User click on the status");
		required.click(); // Required
		logger.pass("User click on the Required field");
		readonly.click(); // Read-only
		logger.pass("User click on the read-only field");
		tooltip.sendKeys(ExcelUtils.getCellData(13, 2));
		logger.pass("User click on the tooltip"); // Tooltip
		category.click(); // Category
		logger.pass("User click on the Category");
		categoryselection.click(); // category Selection
		logger.pass("User click on the category selection list");
		saveclose.click(); // Save&close
		logger.pass("User click on the save&close button");
		logger.pass("User saved Campaign Text field successfully");

	}

	/*
	 * 
	 * Method for Campaign Radio field
	 * 
	 */

	private void campaignfieldradio() {

		campaignformfields.click(); // Campaign Form Fields
		logger.pass("User click on the Campaign Form Fields");
		newbutton.click(); // New button
		logger.pass("User click on the new button");
		label.sendKeys(ExcelUtils.getCellData(16, 2)); // Label
		logger.pass("User fetching label from excelsheet");
		name.sendKeys(ExcelUtils.getCellData(17, 2)); // Name
		logger.pass("User fetching name from excelsheet");
		fieldtypedropdown.click(); // Field type dropdown
		logger.pass("User click on the field type dropdown list");
		fieldtyperadio.click(); // Radio
		logger.pass("User click on the field type as radio");
		fieldoptionsname.sendKeys(ExcelUtils.getCellData(18, 2)); // Field Options Name
		logger.pass("User fetching field options name from excelsheet");
		fieldoptionsvalue.sendKeys(ExcelUtils.getCellData(19, 2)); // Field Options Value
		logger.pass("User fetching field options value from excelsheet");
		addbutton.click(); // Add button
		logger.pass("User click on the Add button");
		groupdropdown.click(); // Group dropdown list
		logger.pass("User click on the group dropdown list");
		groupname.click(); // Group Name
		logger.pass("User click on the group name");
		statusdropdown.click(); // Status Dropdown
		logger.pass("User click on the status dropdown list");
		status.click(); // Status
		logger.pass("User click on the status");
		required.click(); // Required
		logger.pass("User click on the Required field");
		readonly.click(); // Read-only
		logger.pass("User click on the read-only field");
		category.click(); // Category
		logger.pass("User click on the category");
		categoryselection.click(); // Category selection
		logger.pass("User click on the category selection list");
		tooltip.sendKeys(ExcelUtils.getCellData(20, 2)); // Tooltip
		logger.pass("User fetching tooltip from excelsheet");
		saveclose.click(); // Save&close
		logger.pass("User click on the save&close button");
		logger.pass("User saved Campaign Radio field successfully");

	}

	/*
	 * 
	 * Method for Campaign Single Select field
	 * 
	 */

	private void campaignfieldsingleselect() {

		campaignformfields.click(); // Campaign Form Fields
		logger.pass("User click on the campaign form fields");
		newbutton.click(); // New button
		logger.pass("User click on the new button");
		label.sendKeys(ExcelUtils.getCellData(23, 2)); // Label
		logger.pass("User fetching label from excelsheet");
		name.sendKeys(ExcelUtils.getCellData(24, 2)); // Name
		logger.pass("User fetching name from excelsheet");
		fieldtypedropdown.click(); // Field type dropdown list
		logger.pass("User click on the field type dropdown list");
		fieldtypesingleselect.click(); // Single Select
		logger.pass("User click on the field type as Single Select");
		fieldoptionsname.sendKeys(ExcelUtils.getCellData(25, 2)); // Field Options Name
		logger.pass("User fetching field options name from excelsheet");
		fieldoptionsvalue.sendKeys(ExcelUtils.getCellData(26, 2)); // Field Options Value
		logger.pass("User fetching field options value from excelsheet");
		addbutton.click(); // Add button
		logger.pass("User click on the add button");
		groupdropdown.click(); // Group dropdown list
		logger.pass("User click on the group dropdown list");
		groupname.click(); // Group Name
		logger.pass("User click on the group name");
		statusdropdown.click(); // Status dropdown list
		logger.pass("User click on the status dropdown list");
		status.click(); // Status
		logger.pass("User click on the status");
		required.click(); // Required
		logger.pass("User click on the Required field");
		readonly.click(); // Read-only
		logger.pass("User click on the read-only field");
		category.click(); // Category
		logger.pass("User click on the category");
		categoryselection.click(); // Category selection
		logger.pass("User click on the category selection list");
		tooltip.sendKeys(ExcelUtils.getCellData(27, 2)); // Tooltip
		logger.pass("User fetching tooltip from excelsheet");
		saveclose.click(); // Save&close
		logger.pass("User click on the save&close button");
		logger.pass("User saved Campaign Single Select field successfully");

	}

	/*
	 * 
	 * Method for Campaign Multiple Select field
	 * 
	 */

	private void campaignfieldmultipleselect() {

		campaignformfields.click(); // Campaign Form Fields
		logger.pass("User click on the campaign form fields");
		newbutton.click(); // New button
		logger.pass("User click on the new button");
		label.sendKeys(ExcelUtils.getCellData(30, 2)); // Label
		logger.pass("User fetching label from excelsheet");
		name.sendKeys(ExcelUtils.getCellData(31, 2)); // Name
		logger.pass("User fetching name from excelsheet");
		fieldtypedropdown.click(); // Field type dropdown
		logger.pass("User click on the field type dropdownlist");
		fieldtypemultipleselect.click(); // Multiple Select
		logger.pass("User click on the field type as multiple select");
		fieldoptionsname.sendKeys(ExcelUtils.getCellData(32, 2)); // Field Options Name
		logger.pass("User fetching field options name from excelsheet");
		fieldoptionsvalue.sendKeys(ExcelUtils.getCellData(33, 2)); // Field Options Value
		logger.pass("User fetching field options value from excelsheet");
		addbutton.click(); // Add button
		logger.pass("User click on the add button");
		groupdropdown.click(); // Group dropdown
		logger.pass("User click on the group dropdown list");
		groupname.click(); // Group Name
		logger.pass("User click on the group name");
		statusdropdown.click(); // Status dropdown
		logger.pass("User click on the status dropdown list");
		status.click(); // Status
		logger.pass("User click on the status");
		required.click(); // Required
		logger.pass("User click on the Required field");
		readonly.click(); // Read-only
		logger.pass("User click on the read-only field");
		category.click(); // Category
		logger.pass("User click on the category");
		categoryselection.click(); // Category selection
		logger.pass("User click on the category selection list");
		tooltip.sendKeys(ExcelUtils.getCellData(34, 2)); // Tooltip
		logger.pass("User fetching tooltip from excelsheet");
		saveclose.click(); // Save&close
		logger.pass("User click on the save&close button");
		logger.pass("User saved Campaign Multiple Select field successfully");

	}

	/*
	 * 
	 * Method for Campaign Textarea field
	 * 
	 */

	private void campaignfieldtextarea() {

		campaignformfields.click(); // Campaign Form Fields
		logger.pass("User click on the campaign form fields");
		newbutton.click(); // New button
		logger.pass("User click on the new button");
		label.sendKeys(ExcelUtils.getCellData(37, 2)); // Label
		logger.pass("User fetching label from excelsheet");
		name.sendKeys(ExcelUtils.getCellData(38, 2)); // Name
		logger.pass("User fetching name from excelsheet");
		fieldtypedropdown.click(); // Field type dropdown
		logger.pass("User click on the field type dropdown list");
		fieldtypetextarea.click(); // Textarea
		logger.pass("User click on the field type as textarea");
		minimumcharacters.sendKeys(ExcelUtils.getCellData(39, 2)); // Minimum characters
		logger.pass("User fetching minimum characters from excelsheet");
		maximumcharacters.sendKeys(ExcelUtils.getCellData(40, 2)); // Maximum characters
		logger.pass("User fetching maximum characters from excelsheet");
		rows.sendKeys(ExcelUtils.getCellData(41, 2)); // Rows
		logger.pass("User fetching rows from excelsheet");
		columns.sendKeys(ExcelUtils.getCellData(42, 2)); // Columns
		logger.pass("User fetching columns from excelsheet");
		defaulttext.sendKeys(ExcelUtils.getCellData(43, 2)); // Set default text
		logger.pass("User fetching default text from excelsheet");
		groupdropdown.click(); // Group dropdown
		logger.pass("User click on the group dropdown list");
		groupname.click(); // Group name
		logger.pass("User click on the group name");
		statusdropdown.click(); // Status dropdown
		logger.pass("User click on the status dropdown list");
		status.click(); // Status
		logger.pass("User click on the status");
		required.click(); // Required
		logger.pass("User click on the Required field");
		readonly.click(); // Read-only
		logger.pass("User click on the read-only field");
		category.click(); // Category
		logger.pass("User click on the category");
		categoryselection.click(); // Category selection
		logger.pass("User click on the category selection list");
		tooltip.sendKeys(ExcelUtils.getCellData(44, 2)); // Tooltip
		logger.pass("User fetching tooltip from excelsheet");
		saveclose.click(); // Save&close
		logger.pass("User click on the save&close button");
		logger.pass("User saved Campaign Textarea field successfully");

	}

	/*
	 * 
	 * Method for Campaign Calendar field
	 * 
	 */

	private void campaignfieldcalendar() {

		campaignformfields.click(); // Campaign Form Fields
		logger.pass("User click on the campaign form fields");
		newbutton.click(); // New button
		logger.pass("User click on the new button");
		label.sendKeys(ExcelUtils.getCellData(47, 2)); // Label
		logger.pass("User fetching label from excelsheet");
		name.sendKeys(ExcelUtils.getCellData(48, 2)); // Name
		logger.pass("User fetching name from excelsheet");
		fieldtypedropdown.click(); // Field type dropdown
		logger.pass("User click on the field type dropdown list");
		fieldtypecalendar.click(); // Calendar
		logger.pass("User click on the field type as Calendar");
		dateformatdropdown.click(); // Date format dropdown
		logger.pass("User click on the date format dropdown list");
		dateformatselection.click(); // Date format selection
		logger.pass("User click on the date format selection list");
		defaulttext.sendKeys(ExcelUtils.getCellData(49, 2)); // set default text
		logger.pass("User fetching default text from excelsheet");
		groupdropdown.click(); // Group dropdown
		logger.pass("User click on the group dropdown list");
		groupname.click(); // Group name
		logger.pass("User click on the group name");
		statusdropdown.click(); // Status dropdown
		logger.pass("User click on the status dropdown list");
		status.click(); // status
		logger.pass("User click on the status");
		required.click(); // Required
		logger.pass("User click on the Required field");
		readonly.click(); // Read-only
		logger.pass("User click on the read-only field");
		category.click(); // Category
		logger.pass("User click on the category");
		categoryselection.click(); // Category selection
		logger.pass("User click on the category selection list");
		tooltip.sendKeys(ExcelUtils.getCellData(50, 2)); // Tooltip
		logger.pass("User fetching tooltip from excelsheet");
		saveclose.click(); // Save&close
		logger.pass("User click on the save&close button");
		logger.pass("User saved Campaign Calendar field successfully");

	}

	/*
	 * 
	 * Method for Campaign Editor field
	 * 
	 */

	private void campaignfieldeditor() {

		campaignformfields.click(); // Campaign Form Fields
		logger.pass("User click on the campaign form fields");
		newbutton.click(); // New button
		logger.pass("User click on the new button");
		label.sendKeys(ExcelUtils.getCellData(53, 2)); // Label
		logger.pass("User fetching label from excelsheet");
		name.sendKeys(ExcelUtils.getCellData(54, 2)); // Name
		logger.pass("User fetching name from excelsheet");
		fieldtypedropdown.click(); // Field type dropdown
		logger.pass("User click on the field type dropdown list");
		fieldtypeeditor.click(); // Editor
		logger.pass("User click on the field type as editor");
		groupdropdown.click(); // Group dropdown
		logger.pass("User click on the group dropdown list");
		groupname.click(); // Group name
		logger.pass("User click on the group name");
		statusdropdown.click(); // Status dropdown
		logger.pass("User click on the status dropdown list");
		status.click(); // Status
		logger.pass("User click on the status");
		required.click(); // Required
		logger.pass("User click on the Required field");
		readonly.click(); // Read-only
		logger.pass("User click on the read-only field");
		category.click(); // Category
		logger.pass("User click on the category");
		categoryselection.click(); // Category selection
		logger.pass("User click on the category selection list");
		tooltip.sendKeys(ExcelUtils.getCellData(55, 2)); // Tooltip
		logger.pass("User fetching tooltip from excelsheet");
		saveclose.click(); // Save&close
		logger.pass("User click on save&close button");
		logger.pass("User saved Campaign Editor field successfully");

	}

	/*
	 * 
	 * Method for Campaign Email field
	 * 
	 */

	private void campaignfieldemail() {

		campaignformfields.click(); // Campaign Form Fields
		logger.pass("User click on the campaign form fields");
		newbutton.click(); // New button
		logger.pass("User click on the new button");
		label.sendKeys(ExcelUtils.getCellData(58, 2)); // Label
		logger.pass("User fetching label from excelsheet");
		name.sendKeys(ExcelUtils.getCellData(59, 2)); // Name
		logger.pass("User fetching name from excelsheet");
		fieldtypedropdown.click(); // Field type dropdown
		logger.pass("User click on the field type dropdown list");
		fieldtypeemail.click(); // Email
		logger.pass("User click on the field type as email");
		minimumcharacters.sendKeys(ExcelUtils.getCellData(60, 2)); // Minimum characters
		logger.pass("User fetching minimum characters from excelsheet");
		maximumcharacters.sendKeys(ExcelUtils.getCellData(61, 2)); // Maximum characters
		logger.pass("User fetching maximum characters from excelsheet");
		defaulttext.sendKeys(ExcelUtils.getCellData(62, 2)); // Set default text
		logger.pass("User fetching default text from excelsheet");
		groupdropdown.click(); // Group dropdown
		logger.pass("User click on the group dropdown list");
		groupname.click(); // Group Name
		logger.pass("User click on the group name");
		statusdropdown.click(); // Status dropdown
		logger.pass("User click on the status dropdown list");
		status.click(); // Status
		logger.pass("User click on the status");
		required.click(); // Required
		logger.pass("User click on the Required field");
		readonly.click(); // Read-only
		logger.pass("User click on the read-only field");
		category.click(); // Category
		logger.pass("User click on the category");
		categoryselection.click(); // category selection
		logger.pass("User click on the category selection list");
		tooltip.sendKeys(ExcelUtils.getCellData(63, 2)); // Tooltip
		logger.pass("User fetching tooltip from excelsheet");
		saveclose.click(); // Save&close
		logger.pass("User click on save&close button");
		logger.pass("User saved Campaign Email field successfully");

	}

	/*
	 * 
	 * Method for Campaign Select User field
	 * 
	 */

	private void campaignfieldselectuser() {

		campaignformfields.click(); // Campaign Form Fields
		logger.pass("User click on the campaign form fields");
		newbutton.click(); // New button
		logger.pass("User click on the new button");
		label.sendKeys(ExcelUtils.getCellData(66, 2)); // Label
		logger.pass("User fetching label from excelsheet");
		name.sendKeys(ExcelUtils.getCellData(67, 2)); // Name
		logger.pass("User fetching name from excelsheet");
		fieldtypedropdown.click(); // Field type dropdown
		logger.pass("User click on the field type dropdown list");
		fieldtypeselectuser.click(); // Select User
		logger.pass("User click on the field type as Select User");
		groupdropdown.click(); // Group dropdown
		logger.pass("User click on the group dropdown list");
		groupname.click(); // Group name
		logger.pass("User click on the group name");
		statusdropdown.click(); // Status dropdown
		logger.pass("User click on the status dropdown list");
		status.click(); // Status
		logger.pass("User click on the status");
		required.click(); // Required
		logger.pass("User click on the Required field");
		readonly.click(); // Read-only
		logger.pass("User click on the read-only field");
		category.click(); // Category
		logger.pass("User click on the category");
		categoryselection.click(); // Category selection
		logger.pass("User click on the category selection list");
		tooltip.sendKeys(ExcelUtils.getCellData(68, 2)); // Tooltip
		logger.pass("User fetching tooltip from excelsheet");
		saveclose.click(); // Save&close
		logger.pass("User click on save&close button");
		logger.pass("User saved Campaign Select User field successfully");

	}

}
