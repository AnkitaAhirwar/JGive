package com.testsuite.jgive;

import org.testng.annotations.Test;

import com.config.jgive.BaseClass;
import com.dataproviders.jgive.DataProviderClass;
import com.pageobjects.jgive.AdminCampaignsPage;

public class AdminCampaignsTest extends BaseClass {

	@Test(dataProvider = "admincampaign", dataProviderClass = DataProviderClass.class)
	public void admincampaign(String testdesc, String camptitle, String sdate, String edate, String description,
			String campimage, String goalamount, String mindonation, String maxallowdonation, String givebacktitle,
			String minimumgiveback, String totalgivebackvalue, String gbdesc, String givebackimage,
			String galleryimagevalue, String videourlvalue) throws Exception {

		AdminCampaignsPage createcampaignpage = new AdminCampaignsPage(driver);
		driver.get(properties.getProperty("url") + "administrator/index.php?option=com_jgive");
		logger = extent.createTest(new Object() {
		}.getClass().getEnclosingMethod().getName());

		if (testdesc.equals("negative")) {
			createcampaignpage.campaignCreationExpectingFailure(camptitle, sdate, edate, description, campimage,
					goalamount, mindonation, maxallowdonation, givebacktitle, minimumgiveback, totalgivebackvalue,
					gbdesc, givebackimage, galleryimagevalue, videourlvalue);
		}
		if (testdesc.equals("positive")) {
			createcampaignpage.campaignCreation(camptitle, sdate, edate, description, campimage, goalamount,
					mindonation, maxallowdonation, givebacktitle, minimumgiveback, totalgivebackvalue, gbdesc,
					givebackimage, galleryimagevalue, videourlvalue);
		}
		if (testdesc.equals("listview")) {
			createcampaignpage.listView(camptitle);
		}

	}

}
