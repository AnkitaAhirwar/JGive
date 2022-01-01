package com.testsuite.jgive;

import org.testng.annotations.Test;

import com.config.jgive.BaseClass;
import com.dataproviders.jgive.DataProviderClass;
import com.pageobjects.jgive.UserMyCampaignsPage;

public class UserMyCampaignsTest extends BaseClass {

	@Test(dataProvider = "usermycampaign", dataProviderClass = DataProviderClass.class)
	public void usermycampaign(String title, String desc, String image) throws Exception {

		UserMyCampaignsPage mycampaignspage = new UserMyCampaignsPage(driver);
		driver.get(properties.getProperty("url"));
		logger = extent.createTest(new Object() {
		}.getClass().getEnclosingMethod().getName());
		mycampaignspage.myCampaign();
		mycampaignspage.reports(title, desc, image);

	}

}
