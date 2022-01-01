package com.testsuite.jgive;

import org.testng.annotations.Test;

import com.config.jgive.BaseClass;
import com.pageobjects.jgive.UserGuestDonationPage;

/**
 * This is Test Class for User Guest Donations . It contains test methods
 * related to User Guest Donation.
 * 
 */

public class UserGuestDonationTest extends BaseClass {

	@Test
	public void userguestdonation() throws Exception {

		UserGuestDonationPage guestdonation = new UserGuestDonationPage(driver);
		driver.get(properties.getProperty("url"));
		logger = extent.createTest(new Object() {
		}.getClass().getEnclosingMethod().getName());
		guestdonation.guestDonation();

	}

}
