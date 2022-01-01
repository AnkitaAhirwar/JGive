package com.testsuite.jgive;

import org.testng.annotations.Test;

import com.config.jgive.BaseClass;
import com.dataproviders.jgive.DataProviderClass;
import com.pageobjects.jgive.AdminCountriesPage;

public class AdminCountriesTest extends BaseClass {

	@Test(dataProvider = "admincountries", dataProviderClass = DataProviderClass.class)
	public void admincountries(String countryname, String threedigit, String twodigit, String language)
			throws Exception {

		AdminCountriesPage countriespage = new AdminCountriesPage(driver);
		driver.get(properties.getProperty("url") + "administrator/index.php?option=com_jgive");
		logger = extent.createTest(new Object() {
		}.getClass().getEnclosingMethod().getName());
		countriespage.country(countryname, threedigit, twodigit, language);

	}

}
