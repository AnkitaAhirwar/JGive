package com.testsuite.jgive;

import org.testng.annotations.Test;

import com.config.jgive.BaseClass;
import com.dataproviders.jgive.DataProviderClass;
import com.pageobjects.jgive.UserLoginPage;

public class UserLoginTest extends BaseClass {

	@Test(dataProvider = "userlogin", dataProviderClass = DataProviderClass.class)
	public void userlogin(String testdesc, String uname, String upw) throws Exception {

		UserLoginPage login = new UserLoginPage(BaseClass.driver);
		driver.get(BaseClass.properties.getProperty("url"));
		logger = BaseClass.extent.createTest(new Object() {
		}.getClass().getEnclosingMethod().getName());

		if (testdesc.equals("negative")) {
			login.invalidLogin(uname, upw);
		}
		if (testdesc.equals("positive")) {
			login.validLogin(uname, upw);
		}

	}

}
