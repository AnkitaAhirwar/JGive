package com.testsuite.jgive;

import org.testng.annotations.Test;

import com.config.jgive.BaseClass;
import com.dataproviders.jgive.DataProviderClass;
import com.pageobjects.jgive.UserCreateCampaignPage;

public class UserCreateCampaignTest extends BaseClass {

	@Test(dataProvider = "usercampaign", dataProviderClass = DataProviderClass.class)
	public void usercampaign(String testdesc, String titlename, String sdate, String edate, String campimage,
			String descframevalue, String goalamount, String mindonationamt, String maxdonationamt,
			String givebacktitle, String mingivebackvalue, String totalgivebackvalue, String gbdescriptionvalue,
			String givebackimage, String galleryimagevalue, String videourllink) throws Exception {

		UserCreateCampaignPage createcampaignpage = new UserCreateCampaignPage(driver);
		driver.get(properties.getProperty("url"));
		logger = extent.createTest(new Object() {
		}.getClass().getEnclosingMethod().getName());

		if (testdesc.equals("negative")) {
			createcampaignpage.campaignCreationExpectingFailure(titlename, sdate, edate, campimage, descframevalue,
					goalamount, mindonationamt, maxdonationamt, givebacktitle, mingivebackvalue, totalgivebackvalue,
					gbdescriptionvalue, givebackimage, galleryimagevalue, videourllink);
		}
		if (testdesc.equals("positive")) {
			createcampaignpage.campaignCreation(titlename, sdate, edate, campimage, descframevalue, goalamount,
					mindonationamt, maxdonationamt, givebacktitle, mingivebackvalue, totalgivebackvalue,
					gbdescriptionvalue, givebackimage, galleryimagevalue, videourllink);
			createcampaignpage.promoterprofile();
		}

	}

}
