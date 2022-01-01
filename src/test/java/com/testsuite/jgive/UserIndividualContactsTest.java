package com.testsuite.jgive;

import org.testng.annotations.Test;

import com.config.jgive.BaseClass;
import com.pageobjects.jgive.UserIndividualContactsPage;

public class UserIndividualContactsTest extends BaseClass {

	@Test
	public void userindividualcontacts() throws Exception {

		UserIndividualContactsPage usermydonationspage = new UserIndividualContactsPage(driver);
		driver.get(properties.getProperty("url"));
		logger = extent.createTest(new Object() {
		}.getClass().getEnclosingMethod().getName());
		//usermydonationspage.individualcontact();
		usermydonationspage.newdonor();

	}

}
