package com.testsuite.jgive;

import org.testng.annotations.Test;

import com.config.jgive.BaseClass;
import com.pageobjects.jgive.UserLogOutPage;

/**
 * This is Test Class for User LogOut . It contains test methods related to User
 * LogOut.
 * 
 */

public class UserLogOutTest extends BaseClass {

	@Test
	public void userlogout() throws Exception {

		UserLogOutPage logout = new UserLogOutPage(driver);
		driver.get(properties.getProperty("url"));
		logger = extent.createTest(new Object() {
		}.getClass().getEnclosingMethod().getName());
		logout.logOut();

	}

}
