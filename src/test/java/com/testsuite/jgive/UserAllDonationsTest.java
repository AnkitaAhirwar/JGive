package com.testsuite.jgive;

import org.testng.annotations.Test;

import com.config.jgive.BaseClass;
import com.pageobjects.jgive.UserAllDonationsPage;

/**
 * This is Test Class for User All Donations Page . It contains test methods
 * related to User All Donations Page.
 * 
 */

public class UserAllDonationsTest extends BaseClass {

	@Test
	public void useralldonations() throws Exception {

		UserAllDonationsPage useralldonationspage = new UserAllDonationsPage(driver);
		driver.get(properties.getProperty("url"));
		logger = extent.createTest(new Object() {
		}.getClass().getEnclosingMethod().getName());
		useralldonationspage.filtervalidations();

	}

}
