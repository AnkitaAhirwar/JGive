package com.testsuite.jgive;

import org.testng.annotations.Test;

import com.config.jgive.BaseClass;
import com.dataproviders.jgive.DataProviderClass;
import com.pageobjects.jgive.AdminReportsPage;

/**
 * This is Test Class for Admin Reports . It contains test methods related to
 * Admin Reports.
 * 
 */

public class AdminReportsTest extends BaseClass {

	@Test(dataProvider = "adminreports", dataProviderClass = DataProviderClass.class)
	public void adminreports(String datefromvalue, String datetovalue) throws Exception {

		AdminReportsPage adminreportspage = new AdminReportsPage(driver);
		driver.get(properties.getProperty("url") + "administrator/index.php?option=com_jgive");
		logger = extent.createTest(new Object() {
		}.getClass().getEnclosingMethod().getName());
		
		adminreportspage.campaignReport();
		adminreportspage.campaignPromoterReport();
		adminreportspage.contributionsReport(datefromvalue, datetovalue);
		adminreportspage.givebackReport();
		adminreportspage.organisationalDonorReport();
		adminreportspage.individualDonorReport();
		adminreportspage.donorsReport();
		
	}

}
