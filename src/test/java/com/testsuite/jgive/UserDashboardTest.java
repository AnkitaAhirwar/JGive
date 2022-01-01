package com.testsuite.jgive;

import org.testng.annotations.Test;

import com.config.jgive.BaseClass;
import com.pageobjects.jgive.UserDashboardPage;

/**
 * This is Test Class for User Dashboard Page . It contains test methods related
 * to User Dashboard Page.
 * 
 */

public class UserDashboardTest extends BaseClass {

	@Test
	public void userdashboard() throws Exception {

		UserDashboardPage userdashboardpage = new UserDashboardPage(driver);
		driver.get(properties.getProperty("url"));
		logger = extent.createTest(new Object() {
		}.getClass().getEnclosingMethod().getName());
		userdashboardpage.mycampaigns();

	}
	
}
