package com.testsuite.jgive;

import org.testng.annotations.Test;

import com.config.jgive.BaseClass;
import com.dataproviders.jgive.DataProviderClass;
import com.pageobjects.jgive.AdminCampaignFormFieldsPage;

public class AdminCampaignFormFieldsTest extends BaseClass {

	@Test(dataProvider = "admincampaignformfields", dataProviderClass = DataProviderClass.class)
	public void admincampaignformfields(String testdesc, String labelname, String title, String minchar, String maxchar,
			String rownum, String colnum, String defaultvalue, String tooltipvalue) throws Exception {

		AdminCampaignFormFieldsPage campaignformfields = new AdminCampaignFormFieldsPage(driver);
		driver.get(properties.getProperty("url") + "administrator/index.php?option=com_jgive");
		logger = extent.createTest(new Object() {
		}.getClass().getEnclosingMethod().getName());

		if (testdesc.equals("Text")) {

			campaignformfields.campaignfieldtext(labelname, title, minchar, maxchar, defaultvalue, tooltipvalue);
		}
		if (testdesc.equals("Radio")) {
			campaignformfields.campaignfieldradio(labelname, title, minchar, maxchar, tooltipvalue);
		}
		if (testdesc.equals("SingleSelect")) {
			campaignformfields.campaignfieldsingleselect(labelname, title, minchar, maxchar, tooltipvalue);
		}
		if (testdesc.equals("MultipleSelect")) {
			campaignformfields.campaignfieldmultipleselect(labelname, title, minchar, maxchar, tooltipvalue);
		}
		if (testdesc.equals("TextArea")) {
			campaignformfields.campaignfieldtextarea(labelname, title, minchar, maxchar, rownum, colnum, defaultvalue,
					tooltipvalue);
		}
		if (testdesc.equals("Calendar")) {
			campaignformfields.campaignfieldcalendar(labelname, title, defaultvalue, tooltipvalue);
		}
		if (testdesc.equals("Editor")) {
			campaignformfields.campaignfieldeditor(labelname, title, tooltipvalue);
		}
		if (testdesc.equals("Email")) {
			campaignformfields.campaignfieldemail(labelname, title, minchar, maxchar, defaultvalue, tooltipvalue);
		}
		if (testdesc.equals("SelectUser")) {
			campaignformfields.campaignfieldselectuser(labelname, title, tooltipvalue);
			campaignformfields.deletefields();
		}

	}

}
