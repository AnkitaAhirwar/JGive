package com.testsuite.jgive;

import org.testng.annotations.Test;

import com.config.jgive.BaseClass;
import com.dataproviders.jgive.DataProviderClass;
import com.pageobjects.jgive.AdminCampaignFieldsGroupPage;

public class AdminCampaignFieldsGroupTest extends BaseClass {

	@Test(dataProvider = "admincampaignfieldsgroup", dataProviderClass = DataProviderClass.class)
	public void admincampaignfieldsgroup(String testdesc, String name) throws Exception {

		AdminCampaignFieldsGroupPage campaignfieldgroup = new AdminCampaignFieldsGroupPage(driver);
		driver.get(properties.getProperty("url") + "administrator/index.php?option=com_jgive");
		logger = extent.createTest(new Object() {
		}.getClass().getEnclosingMethod().getName());

		if (testdesc.equals("positive")) {
			campaignfieldgroup.campaignGroup(name);
		} else if (testdesc.equals("negative")) {
			campaignfieldgroup.campaignGroupExpectingFailure(name);
		}

	}

}
