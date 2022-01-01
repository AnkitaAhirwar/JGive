package com.dataproviders.jgive;

import java.io.IOException;

import org.testng.annotations.DataProvider;

import com.utils.jgive.ExcelUtils;

public class DataProviderClass {
	
	public static final String TESTDATAEXCELFILE = "testData.xlsx";
	
	@DataProvider(name = "userlogin")

	public static Object[][] userlogin() throws IOException {

		return ExcelUtils.getExcelData(TESTDATAEXCELFILE, "ULoginDetails");

	}
	
	@DataProvider(name = "usercampaign")

	public static Object[][] usercampaign() throws IOException {

		return ExcelUtils.getExcelData(TESTDATAEXCELFILE, "UCampaign");

	}
	
	@DataProvider(name = "usermycampaign")

	public static Object[][] usermycampaign() throws IOException {

		return ExcelUtils.getExcelData(TESTDATAEXCELFILE, "UMyCampaign");

	}
	
	@DataProvider(name = "uservendor")

	public static Object[][] usercreatevendor() throws IOException {

		return ExcelUtils.getExcelData(TESTDATAEXCELFILE, "UVendors");

	}
	
	@DataProvider(name = "userindividualcontacts")

	public static Object[][] userindividualcontacts() throws IOException {

		return ExcelUtils.getExcelData(TESTDATAEXCELFILE, "UserIndividualDonor");

	}
	
	@DataProvider(name = "userorganizationcontacts")

	public static Object[][] userorganizationcontacts() throws IOException {

		return ExcelUtils.getExcelData(TESTDATAEXCELFILE, "UOrganizationDonor");

	}
	
	@DataProvider(name = "userdonors")

	public static Object[][] userdonors() throws IOException {

		return ExcelUtils.getExcelData(TESTDATAEXCELFILE, "UDonors");

	}
	
	@DataProvider(name = "userallcampaigns")

	public static Object[][] userallcampaigns() throws IOException {

		return ExcelUtils.getExcelData(TESTDATAEXCELFILE, "UserAllCampaigns");

	}
	
	@DataProvider(name = "useralldonations")

	public static Object[][] useralldonations() throws IOException {

		return ExcelUtils.getExcelData(TESTDATAEXCELFILE, "UAllDonations");

	}
	
	@DataProvider(name = "userdonations")

	public static Object[][] userdonations() throws IOException {

		return ExcelUtils.getExcelData(TESTDATAEXCELFILE, "UserDonations");

	}

	@DataProvider(name = "userreports")

	public static Object[][]  userreports() throws IOException {

		return ExcelUtils.getExcelData(TESTDATAEXCELFILE, "UReports");

	}
	
	@DataProvider(name = "adminlogin")

	public static Object[][]  adminlogin() throws IOException {

		return ExcelUtils.getExcelData(TESTDATAEXCELFILE, "ALoginDetails");

	}
	
	@DataProvider(name = "admindonations")

	public static Object[][]  admindonations() throws IOException {

		return ExcelUtils.getExcelData(TESTDATAEXCELFILE, "ADonations");

	}
	
	@DataProvider(name = "adminvendors")

	public static Object[][]  adminvendors() throws IOException {

		return ExcelUtils.getExcelData(TESTDATAEXCELFILE, "Vendors");

	}
	
	@DataProvider(name = "adminindividualdonors")

	public static Object[][]  adminindividualdonors() throws IOException {

		return ExcelUtils.getExcelData(TESTDATAEXCELFILE, "IndividualDonors");

	}
	
	@DataProvider(name = "admincampaignfieldsgroup")

	public static Object[][]  admincampaignfieldsgroup() throws IOException {

		return ExcelUtils.getExcelData(TESTDATAEXCELFILE, "ACampaignFieldsGroup");

	}
	
	@DataProvider(name = "adminorganizationaldonor")

	public static Object[][]  adminorganizationaldonor() throws IOException {

		return ExcelUtils.getExcelData(TESTDATAEXCELFILE, "OrgDonors");

	}
	
	@DataProvider(name = "admincampaignformfields")

	public static Object[][]  admincampaignformfields() throws IOException {

		return ExcelUtils.getExcelData(TESTDATAEXCELFILE, "ACampaignFields");

	}
	
	@DataProvider(name = "admincountries")

	public static Object[][]  admincountries() throws IOException {

		return ExcelUtils.getExcelData(TESTDATAEXCELFILE, "Countries");

	}
	
	@DataProvider(name = "adminregions")

	public static Object[][]  adminregions() throws IOException {

		return ExcelUtils.getExcelData(TESTDATAEXCELFILE, "Regions");

	}
	
	@DataProvider(name = "admincities")

	public static Object[][]  admincities() throws IOException {

		return ExcelUtils.getExcelData(TESTDATAEXCELFILE, "Cities");

	}
	
	@DataProvider(name = "admincampaign")

	public static Object[][]  admincampaign() throws IOException {

		return ExcelUtils.getExcelData(TESTDATAEXCELFILE, "Campaign");

	}
	
	@DataProvider(name = "admincontrolpanel")

	public static Object[][]  admincontrolpanel() throws IOException {

		return ExcelUtils.getExcelData(TESTDATAEXCELFILE, "AControlPanel");

	}
	
	@DataProvider(name = "admindonors")

	public static Object[][] admindonors() throws IOException {

		return ExcelUtils.getExcelData(TESTDATAEXCELFILE, "ADonors");
		
	}
	
	@DataProvider(name = "adminreports")

	public static Object[][] adminreports() throws IOException {

		return ExcelUtils.getExcelData(TESTDATAEXCELFILE, "AReports");
		
	}
	
	@DataProvider(name = "adminmenus")

	public static Object[][] adminmenus() throws IOException {

		return ExcelUtils.getExcelData(TESTDATAEXCELFILE, "Menus");
		
	}
	
	@DataProvider(name = "userguestdonation")

	public static Object[][] userguestdonation() throws IOException {

		return ExcelUtils.getExcelData(TESTDATAEXCELFILE, "GuestDonations");
		
	}
	
	@DataProvider(name = "adminModules")

	public static Object[][] adminModules() throws IOException {

		return ExcelUtils.getExcelData(TESTDATAEXCELFILE, "Modules");
		
	}

}
