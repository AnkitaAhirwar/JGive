package com.testsuite.jgive;

import org.testng.annotations.Test;

import com.config.jgive.BaseClass;
import com.pageobjects.jgive.UserDonorsPage;

public class UserDonorsTest extends BaseClass {

	@Test
	public void userdonors() throws Exception {

		UserDonorsPage userdonorspage = new UserDonorsPage(driver);
		driver.get(properties.getProperty("url"));
		logger = extent.createTest(new Object() {
		}.getClass().getEnclosingMethod().getName());
		userdonorspage.exportcsv();
		userdonorspage.filters();

	}

}
