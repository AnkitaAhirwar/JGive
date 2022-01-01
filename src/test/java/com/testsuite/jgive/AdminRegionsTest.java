package com.testsuite.jgive;

import org.testng.annotations.Test;

import com.config.jgive.BaseClass;
import com.dataproviders.jgive.DataProviderClass;
import com.pageobjects.jgive.AdminRegionsPage;

public class AdminRegionsTest extends BaseClass {

	@Test(dataProvider = "adminregions", dataProviderClass = DataProviderClass.class)
	public void adminregions(String region, String threedigit, String twodigit, String countryname, String language)
			throws Exception {

		AdminRegionsPage regionspage = new AdminRegionsPage(driver);
		driver.get(properties.getProperty("url") + "administrator/index.php?option=com_jgive");
		logger = extent.createTest(new Object() {
		}.getClass().getEnclosingMethod().getName());
		regionspage.region(region, threedigit, twodigit, countryname, language);

	}

}
