package com.testsuite.jgive;

import org.testng.annotations.Test;

import com.config.jgive.BaseClass;
import com.dataproviders.jgive.DataProviderClass;
import com.pageobjects.jgive.AdminVendorsPage;

public class AdminVendorsTest extends BaseClass {

	@Test(dataProvider = "adminvendors", dataProviderClass = DataProviderClass.class)
	public void adminvendors(String testdesc, String vendortitle, String vendordesc, String image, String phonenum,
			String add, String zipaddress, String websiteaddress, String vatno, String vendorcurrency,
			String commissioninpercent) throws Exception {

		AdminVendorsPage vendorspage = new AdminVendorsPage(driver);
		driver.get(properties.getProperty("url") + "administrator/index.php?option=com_jgive");
		logger = extent.createTest(new Object() {
		}.getClass().getEnclosingMethod().getName());

		if (testdesc.equals("positive")) {
			vendorspage.vendorcreation(vendortitle, vendordesc, image, phonenum, add, zipaddress, websiteaddress, vatno,
					vendorcurrency, commissioninpercent);

		}
		if (testdesc.equals("negative")) {
			vendorspage.vendorcreationExpectingFailure(vendortitle, vendordesc, image, phonenum, add, zipaddress,
					websiteaddress, vatno, vendorcurrency, commissioninpercent);
		}
	}

}
