package com.testsuite.jgive;

import org.testng.annotations.Test;

import com.config.jgive.BaseClass;
import com.pageobjects.jgive.AdminDashboardPage;

public class AdminDashboardTest extends BaseClass {

	@Test
	public void admindashboard() {

		AdminDashboardPage dashboardpage = new AdminDashboardPage(driver);
		driver.get(properties.getProperty("url") + "administrator/index.php?");
		logger = extent.createTest(new Object() {
		}.getClass().getEnclosingMethod().getName());
		dashboardpage.dashboard();

	}

}
