package com.testsuite.jgive;

import org.testng.annotations.Test;

import com.config.jgive.BaseClass;
import com.dataproviders.jgive.DataProviderClass;
import com.pageobjects.jgive.AdminControlPanelPage;

public class AdminControlPanelTest extends BaseClass {

	@Test(dataProvider = "admincontrolpanel", dataProviderClass = DataProviderClass.class)
	public void admincontrolpanel(String datefromvalue, String datetovalue) throws Exception {

		AdminControlPanelPage controlpanelpage = new AdminControlPanelPage(driver);
		driver.get(properties.getProperty("url") + "administrator/index.php?option=com_jgive");
		logger = extent.createTest(new Object() {
		}.getClass().getEnclosingMethod().getName());

		controlpanelpage.noOfCampaigns();
		controlpanelpage.totalGoalAmount();
		controlpanelpage.fundedAmount();
		controlpanelpage.commissionAmount();
		controlpanelpage.periodicDonations(datefromvalue, datetovalue);
		controlpanelpage.recentDonations();

	}

}
