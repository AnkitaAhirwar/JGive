package com.testsuite.jgive;

import org.testng.annotations.Test;

import com.config.jgive.BaseClass;
import com.pageobjects.jgive.UserDonationsPage;

public class UserDonationsTest extends BaseClass {

	@Test
	public void userdonations() throws Exception {

		UserDonationsPage userdonationspage = new UserDonationsPage(driver);
		driver.get(properties.getProperty("url"));
		logger = extent.createTest(new Object() {
		}.getClass().getEnclosingMethod().getName());
		userdonationspage.donation();

	}

}
