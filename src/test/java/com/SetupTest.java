package com;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import commons.BaseTest;
import io.qameta.allure.Epic;
@Epic("Before And after Test")
public class SetupTest extends BaseTest{
	
	@Parameters({"browser", "environment"})
	@BeforeTest
	public void beforeTest(String browserName, String environment) {
		getBrowserDriver(browserName, environment);
	}
	
	@AfterTest(alwaysRun=true)
	public void afterTest() {
		closeBrowserDriver();
	}
}