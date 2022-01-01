package com.testsuite.jgive;

import org.testng.annotations.Test;

import com.config.jgive.BaseClass;
import com.dataproviders.jgive.DataProviderClass;
import com.pageobjects.jgive.AdminDonorsPage;

public class AdminDonorsTest extends BaseClass {

	@Test(dataProvider = "admindonors", dataProviderClass = DataProviderClass.class)
	public void admindonors(String testdesc, String donorname) throws Exception {

		AdminDonorsPage donorspage = new AdminDonorsPage(driver);
		driver.get(properties.getProperty("url") + "administrator/index.php?option=com_jgive");
		logger = extent.createTest(new Object() {
		}.getClass().getEnclosingMethod().getName());

		if (testdesc.equals("positive")) {
			donorspage.donorslistview(donorname);
			donorspage.searchByCampaign();
			donorspage.searchByDonortype();
		}

	}

}
