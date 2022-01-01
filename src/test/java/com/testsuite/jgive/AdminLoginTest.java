package com.testsuite.jgive;

import org.testng.annotations.Test;

import com.config.jgive.BaseClass;
import com.dataproviders.jgive.DataProviderClass;
import com.pageobjects.jgive.AdminLoginPage;

public class AdminLoginTest extends BaseClass {

	@Test(dataProvider = "adminlogin", dataProviderClass = DataProviderClass.class)
	public void adminlogin(String testdesc, String un, String pw) throws Exception {

		AdminLoginPage login = new AdminLoginPage(driver);
		driver.get(properties.getProperty("url") + properties.getProperty("admin"));
		logger = extent.createTest(new Object() {
		}.getClass().getEnclosingMethod().getName());
		
		if (testdesc.equals("negative")) {
			login.invalidLogin(un, pw);
		
		}
		if (testdesc.equals("positive")) {
			login.validLogin(un, pw);
		}
		
	}

}
