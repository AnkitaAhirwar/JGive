package com.testsuite.jgive;

import org.testng.annotations.Test;

import com.config.jgive.BaseClass;
import com.dataproviders.jgive.DataProviderClass;
import com.pageobjects.jgive.UserReportsPage;

public class UserReportsTest extends BaseClass {

	@Test(dataProvider = "userreports", dataProviderClass = DataProviderClass.class)
	public void userreports(String dateFrom, String dateTo) throws Exception {

		UserReportsPage userreports = new UserReportsPage(driver);
		driver.get(properties.getProperty("url"));
		logger = extent.createTest(new Object() {
		}.getClass().getEnclosingMethod().getName());

		userreports.campaignsreport();
		userreports.campaignpromoterreport();
		userreports.contributionsreport(dateFrom, dateTo);
		userreports.individualdonorreport();
		userreports.organizationdonorreport();
		userreports.givebackreport();
		userreports.donorsreport();

	}

}
