package com.testsuite.jgive;

import org.testng.annotations.Test;

import com.config.jgive.BaseClass;
import com.pageobjects.jgive.AdminMenusPage;

public class AdminMenusTest extends BaseClass {

	@Test
	public void adminmenus() throws Exception {

		AdminMenusPage menuspage = new AdminMenusPage(driver);
		driver.get(properties.getProperty("url") + "administrator/index.php?option=com_jgive");
		logger = extent.createTest(new Object() {
		}.getClass().getEnclosingMethod().getName());
		menuspage.components();
		menuspage.menus();
		menuspage.content();
		menuspage.extensions();
		menuspage.system();

	}

}
