package com.testsuite.jgive;

import org.testng.annotations.Test;

import com.config.jgive.BaseClass;
import com.pageobjects.jgive.UserMyDonationsPage;

public class UserMyDonationsTest extends BaseClass {

	@Test
	public void usermydonations() throws Exception {

		UserMyDonationsPage usermydonationspage = new UserMyDonationsPage(driver);
		driver.get(properties.getProperty("url"));
		logger = extent.createTest(new Object() {
		}.getClass().getEnclosingMethod().getName());
		usermydonationspage.confirmeddonations();
		usermydonationspage.pendingdonations();
		usermydonationspage.refundeddonations();
		usermydonationspage.canceleddonations();
		usermydonationspage.denieddonations();
		usermydonationspage.donationinvoice();

	}

}
