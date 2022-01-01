package com.testsuite.jgive;

import org.testng.annotations.Test;

import com.config.jgive.BaseClass;
import com.dataproviders.jgive.DataProviderClass;
import com.pageobjects.jgive.UserAllCampaignsPage;

public class UserAllCampaignsTest extends BaseClass {

	@Test(dataProvider = "userallcampaigns", dataProviderClass = DataProviderClass.class)
	public void userallcampaigns(String sortbycampaigns, String searchcamp) throws Exception {

		UserAllCampaignsPage userallcampaignspage = new UserAllCampaignsPage(driver);
		driver.get(properties.getProperty("url"));
		logger = extent.createTest(new Object() {
		}.getClass().getEnclosingMethod().getName());
		userallcampaignspage.allcampaigns(sortbycampaigns, searchcamp);
		
	}

}
