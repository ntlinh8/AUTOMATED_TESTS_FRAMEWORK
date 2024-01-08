package com;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import commons.BaseTest;
import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;
import pageObjects.HomePO;
import pageObjects.PageGeneratorManager;

@Epic("Regrestion Tests")
@Feature("Check Menu Items")
public class HomePage_001_MenuItems extends BaseTest{

	WebDriver driver;
	private HomePO homePage;
	
	@BeforeSuite
	public void deleteFileInReport() {
		// Remove all file in ReportNG screenshot (image)
		deleteAllFileInFolder("reportNGImage");

		// Remove all file in Allure attachment (json file)
		deleteAllFileInFolder("allure-json");
	}
	
	@Parameters({"browser", "environment"})
	@BeforeTest
	public void beforeClass(String browserName, String environment) {
		log.info("Start Before Test");
		driver = getBrowserDriver(browserName, environment);
		homePage = PageGeneratorManager.getHomePage(driver);
		
	}
	
	@Description("About Us menu")
	@Story("Check menu system")
	@Severity(SeverityLevel.NORMAL)
	@Test
	public void  MenuItems_001_AboutUs() {
		log.info("Step 01: Click to Open Menu button");
		homePage.clickToOpenMenuButton(driver);
		
		log.info("Step 02: Verify the title of pages");
		verifyEquals(homePage.getPageTitle(driver), "Sytner Group: UK Prestige Car Dealerships");
	}
	
	@Description("Latest News menu")
	@Story("Check Latest News")
	@Severity(SeverityLevel.NORMAL)
	@Test
	public void  MenuItems_002_LatestNews() {
		log.info("Step 01: Click to Open Menu button");
		homePage.clickToOpenMenuButton(driver);
		
		log.info("Step 02: Click to Latest News button");
		homePage.clickToHeaderMenuByLabel(driver, "Latest News");
		
		log.info("Step 03: Verify the Latest News page displays in the screen");
		verifyEquals(homePage.getPageTitle(driver), "Latest News | Sytner Group");
	}
	
//	@Description("Customer Service menu")
//	@Story("Check Customer Service")
//	@Severity(SeverityLevel.NORMAL)
//	@Test
//	public void  MenuItems_003_CustomerService() {
//		log.info("Step 01: Click to Open Menu button");
//		homePage.clickToOpenMenuButton(driver);
//		
//		log.info("Step 02: Click to Customer Services button");
//		homePage.clickToHeaderMenuByLabel(driver, "Customer Services");
//		
//		log.info("Step 03: Verify the Customer Services page displays in the screen");
//		verifyEquals(homePage.getPageTitle(driver), "Customer Service ");
//	}
//	
//	@Description("Finance menu")
//	@Story("Check Finance")
//	@Severity(SeverityLevel.NORMAL)
//	@Test
//	public void  MenuItems_004_Finance() {
//		log.info("Step 01: Click to Open Menu button");
//		homePage.clickToOpenMenuButton(driver);
//		
//		log.info("Step 02: Click to Finance button");
//		homePage.clickToHeaderMenuByLabel(driver, "Finance");
//		
//		log.info("Step 03: Verify the Finance page displays in the screen");
//		verifyEquals(homePage.getPageTitle(driver), "Finance | Sytner Group");
//	}
//	
//	@Description("Check Value My Vehicle")
//	@Story("Check Value My Vehicle")
//	@Severity(SeverityLevel.NORMAL)
//	@Test
//	public void  MenuItems_005_ValueMyVehicle() {
//		log.info("Step 01: Click to Open Menu button");
//		homePage.clickToOpenMenuButton(driver);
//		
//		log.info("Step 02: Click to Value my Vehicle button");
//		homePage.clickToHeaderMenuByLabel(driver, "Value my Vehicle");
//		
//		log.info("Step 03: Verify the Value my Vehicle page displays in the screen");
//		verifyEquals(homePage.getPageTitle(driver), "Value Your Car | Sytner Group");
//	}
//	
//	@Description("Check Electric Vehicles")
//	@Story("Check Electric Vehicles")
//	@Severity(SeverityLevel.NORMAL)
//	@Test
//	public void  MenuItems_006_ElectricVehicles() {
//		log.info("Step 01: Click to Open Menu button");
//		homePage.clickToOpenMenuButton(driver);
//		
//		log.info("Step 02: Click to Electric Vehicles button");
//		homePage.clickToHeaderMenuByLabel(driver, "Electric Vehicles");
//		
//		log.info("Step 03: Verify the Electric Vehicles page displays in the screen");
//		verifyEquals(homePage.getPageTitle(driver), "Electric & Hybrid Cars | Sytner Group");
//	}
//	
//	@Description("Motability")
//	@Story("Check Motability")
//	@Severity(SeverityLevel.NORMAL)
//	@Test
//	public void  MenuItems_007_Motability() {
//		log.info("Step 01: Click to Open Menu button");
//		homePage.clickToOpenMenuButton(driver);
//		
//		log.info("Step 02: Click to Motability button");
//		homePage.clickToHeaderMenuByLabel(driver, "Motability");
//		
//		log.info("Step 03: Verify the Motability page displays in the screen");
//		verifyEquals(homePage.getPageTitle(driver), "Motability | Sytner Group");
//	}
//	
//	@Description("Check Service")
//	@Story("Check Service")
//	@Severity(SeverityLevel.NORMAL)
//	@Test
//	public void  MenuItems_008_Service() {
//		log.info("Step 01: Click to Open Menu button");
//		homePage.clickToOpenMenuButton(driver);
//		
//		log.info("Step 02: Click to Service, MOT & Repair button");
//		homePage.clickToHeaderMenuByLabel(driver, "Service, MOT & Repair");
//		
//		log.info("Step 03: Verify the Service, MOT & Repair page displays in the screen");
//		verifyEquals(homePage.getPageTitle(driver), "Car Servicing & Maintenance | Sytner Group");
//	}
//	
//	@Description("Protection Services menu")
//	@Story("Check Protection Services")
//	@Severity(SeverityLevel.NORMAL)
//	@Test
//	public void  MenuItems_009_ProtectionServices() {
//		log.info("Step 01: Click to Open Menu button");
//		homePage.clickToOpenMenuButton(driver);
//		
//		log.info("Step 02: Click to Protection Services button");
//		homePage.clickToHeaderMenuByLabel(driver, "Protection Services");
//		
//		log.info("Step 03: Verify the Protection Services page displays in the screen");
//		verifyEquals(homePage.getPageTitle(driver), "Insurance & Protection Products | Sytner Group");
//	}
//	
//	@Description("Business Users menu")
//	@Story("Check Business Users")
//	@Severity(SeverityLevel.NORMAL)
//	@Test
//	public void  MenuItems_010_BusinessUsers() {
//		log.info("Step 01: Click to Open Menu button");
//		homePage.clickToOpenMenuButton(driver);
//		
//		log.info("Step 02: Click to Business Users button");
//		homePage.clickToHeaderMenuByLabel(driver, "Business Users");
//		
//		log.info("Step 03: Verify the Business Users page displays in the screen");
//		verifyEquals(homePage.getPageTitle(driver), "Sytner Corporate for Business Users");
//	}
//	
//	@Description("Sustain ability menu")
//	@Story("Check Sustain ability")
//	@Severity(SeverityLevel.NORMAL)
//	@Test
//	public void  MenuItems_011_Sustainability() {
//		log.info("Step 01: Click to Open Menu button");
//		homePage.clickToOpenMenuButton(driver);
//		
//		log.info("Step 02: Click to Sustainability button");
//		homePage.clickToHeaderMenuByLabel(driver, "Sustainability");
//		
//		log.info("Step 03: Verify the Sustainability page displays in the screen");
//		verifyEquals(homePage.getPageTitle(driver), "Sustainability | Sytner Group");
//	}
//	
//	@Description("Good wood menu")
//	@Story("Check Good wood")
//	@Severity(SeverityLevel.NORMAL)
//	@Test
//	public void  MenuItems_012_Goodwood() {
//		log.info("Step 01: Click to Open Menu button");
//		homePage.clickToOpenMenuButton(driver);
//		
//		log.info("Step 02: Click to Goodwood 2023 button");
//		homePage.clickToHeaderMenuByLabel(driver, "Goodwood 2023");
//		
//		log.info("Step 03: Verify the Goodwood 2023 page displays in the screen");
//		verifyEquals(homePage.getPageTitle(driver), "Sytner Group announces official partnership with Goodwood Festival of Speed 2023 | Sytner Group");
//	}
//	
//	@Description("Careers menu")
//	@Story("Check Careers")
//	@Severity(SeverityLevel.NORMAL)
//	@Test
//	public void  MenuItems_013_Careers() {
//		log.info("Step 01: Click to Open Menu button");
//		homePage.clickToOpenMenuButton(driver);
//		
//		log.info("Step 02: Click to Careers button");
//		homePage.clickToHeaderMenuByLabel(driver, "Careers");
//		
//		log.info("Step 03: Accept Cookie");
//		homePage.clickToAcceptCookie(driver);
//		
//		log.info("Step 04: Verify the Careers page displays in the screen");
//		verifyEquals(homePage.getPageTitle(driver), "CareerZone - home");
//	}
//	
	@AfterTest
	public void afterClass() {
		closeBrowserDriver();
	}
}
