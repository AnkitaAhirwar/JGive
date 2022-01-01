package com.testsuite.jgive;

import org.testng.annotations.Test;

import com.config.jgive.BaseClass;
import com.dataproviders.jgive.DataProviderClass;
import com.pageobjects.jgive.AdminOrganizationDonorPage;

public class AdminOrganizationalDonorTest extends BaseClass {

	@Test(dataProvider = "adminorganizationaldonor", dataProviderClass = DataProviderClass.class)
	public void adminorganizationaldonor(String testdesc, String vendorname, String orgtitle, String websiteaddress,
			String emailaddress, String orgphonenum, String contactpeople, String address1, String address2,
			String countryname, String statename, String cityname, String newcity, String zipaddress, String taxnum)
			throws Exception {

		AdminOrganizationDonorPage organizationalpage = new AdminOrganizationDonorPage(driver);
		driver.get(properties.getProperty("url") + "administrator/index.php?option=com_jgive");
		logger = extent.createTest(new Object() {
		}.getClass().getEnclosingMethod().getName());

		if (testdesc.equals("positive")) {
			organizationalpage.organisationaldonor(vendorname, orgtitle, websiteaddress, emailaddress, orgphonenum,
					contactpeople, address1, address2, countryname, statename, cityname, newcity, zipaddress, taxnum);
		}
		if (testdesc.equals("negative")) {
			organizationalpage.organisationaldonorExpectingFailure(vendorname, orgtitle, websiteaddress, emailaddress,
					orgphonenum, contactpeople, address1, address2, countryname, statename, cityname, newcity,
					zipaddress, taxnum);
		}
		if (testdesc.equals("listview")) {
			organizationalpage.listView(orgtitle);
		}

	}

}
