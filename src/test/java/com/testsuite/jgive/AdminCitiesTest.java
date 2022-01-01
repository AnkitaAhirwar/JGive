package com.testsuite.jgive;

import org.testng.annotations.Test;

import com.config.jgive.BaseClass;
import com.dataproviders.jgive.DataProviderClass;
import com.pageobjects.jgive.AdminCitiesPage;

public class AdminCitiesTest extends BaseClass {

	@Test(dataProvider = "admincities", dataProviderClass = DataProviderClass.class)
	public void admincities(String city, String countryname, String regionname, String language) throws Exception {

		AdminCitiesPage citiespage = new AdminCitiesPage(driver);
		driver.get(properties.getProperty("url") + "administrator/index.php?option=com_jgive");
		logger = extent.createTest(new Object() {
		}.getClass().getEnclosingMethod().getName());
		citiespage.cities(city, countryname, regionname, language);

	}

}
