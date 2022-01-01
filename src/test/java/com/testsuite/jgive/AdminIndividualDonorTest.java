package com.testsuite.jgive;

import org.testng.annotations.Test;

import com.config.jgive.BaseClass;
import com.dataproviders.jgive.DataProviderClass;
import com.pageobjects.jgive.AdminIndividualDonorPage;

public class AdminIndividualDonorTest extends BaseClass {

	@Test(dataProvider = "adminindividualdonors", dataProviderClass = DataProviderClass.class)
	public void adminindividualdonors(String testdesc, String vendorname, String firstname, String lastname,
			String emailaddress, String phonenum, String address1, String address2, String countryname,
			String statename, String cityname, String newcity, String zipaddress, String taxnum, String searchname)
			throws Exception {

		AdminIndividualDonorPage individualdonorpage = new AdminIndividualDonorPage(driver);
		driver.get(properties.getProperty("url") + "administrator/index.php?option=com_jgive");
		logger = extent.createTest(new Object() {
		}.getClass().getEnclosingMethod().getName());

		if (testdesc.equals("positive")) {
			individualdonorpage.individualDonor(vendorname, firstname, lastname, emailaddress, phonenum, address1,
					address2, countryname, statename, cityname, newcity, zipaddress, taxnum, searchname);
		}

		if (testdesc.equals("negative")) {

			individualdonorpage.individualDonorExpectingFailure(vendorname, firstname, lastname, emailaddress, phonenum,
					address1, address2, countryname, statename, cityname, newcity, zipaddress, taxnum);
		}

		if (testdesc.equals("listview")) {
			individualdonorpage.listView(searchname);
		}

	}

}
