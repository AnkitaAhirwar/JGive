package com.testsuite.jgive;

import org.testng.annotations.Test;

import com.config.jgive.BaseClass;
import com.dataproviders.jgive.DataProviderClass;
import com.pageobjects.jgive.AdminDonationsPage;

/**
 * This is Test Class for Admin Donations . It contains test methods related to
 * Admin Donations.
 * 
 */

public class AdminDonationsTest extends BaseClass {

	@Test(dataProvider = "admindonations", dataProviderClass = DataProviderClass.class)
	public void admindonations(String testdesc, String donorname, String donationamt, String donationstatus,
			String transactionid, String emailsub, String emailbody) throws Exception {

		AdminDonationsPage donationspage = new AdminDonationsPage(driver);
		driver.get(properties.getProperty("url") + "administrator/index.php?option=com_jgive");
		logger = extent.createTest(new Object() {
		}.getClass().getEnclosingMethod().getName());

		/*
		 * if (testdesc.equals("negative")) {
		 * donationspage.donationExpectingFailure(donorname, donationamt,
		 * donationstatus, transactionid); }
		 */
		if (testdesc.equals("positive")) {
			donationspage.donations(donorname, donationamt, donationstatus, transactionid);
		}
		/*
		 * if (testdesc.equals("listview")) { donationspage.listview(donorname); } if
		 * (testdesc.equals("email")) { donationspage.email(emailsub, emailbody); }
		 */

	}

}
