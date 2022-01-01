package com.testsuite.jgive;

import org.testng.annotations.Test;

import com.config.jgive.BaseClass;
import com.pageobjects.jgive.AdminCampaignWiseReportPage;

public class AdminCampaignwiseReportTest extends BaseClass {

	@Test
	public void admincampaignwisereport() throws Exception {

		AdminCampaignWiseReportPage campaignwisereportpage = new AdminCampaignWiseReportPage(driver);
		driver.get(properties.getProperty("url") + "administrator/index.php?option=com_jgive");
		logger = extent.createTest(new Object() {
		}.getClass().getEnclosingMethod().getName());
		campaignwisereportpage.campaignwisereport();

	}

}
