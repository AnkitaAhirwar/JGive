package com.testsuite.jgive;

import org.testng.annotations.Test;

import com.config.jgive.BaseClass;
import com.pageobjects.jgive.UserOrganizationContactsPage;

public class UserOrganizationContactsTest extends BaseClass {

	@Test
	public void userorganizationcontacts() throws Exception {

		UserOrganizationContactsPage userorganizationcontactspage = new UserOrganizationContactsPage(driver);
		driver.get(properties.getProperty("url"));
		logger = extent.createTest(new Object() {
		}.getClass().getEnclosingMethod().getName());
		userorganizationcontactspage.organizationcontacts();
		userorganizationcontactspage.newdonor();

	}

}
