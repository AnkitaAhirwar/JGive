package com.testsuite.jgive;

import org.testng.annotations.Test;

import com.config.jgive.BaseClass;
import com.pageobjects.jgive.UserVendorsPage;

public class UserVendorsTest extends BaseClass {

	@Test
	public void usercreatevendor() throws Exception {

		UserVendorsPage usercreatevendorpage = new UserVendorsPage(driver);
		driver.get(properties.getProperty("url"));
		logger = extent.createTest(new Object() {
		}.getClass().getEnclosingMethod().getName());
		usercreatevendorpage.createvendor();

	}

}
