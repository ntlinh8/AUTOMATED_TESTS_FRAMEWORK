package pageObjects;

import org.openqa.selenium.WebDriver;

import pageUI.HomeUI;

public class HomePO extends CommonPO{
	WebDriver driver;
	
	HomePO(WebDriver driver) {
		this.driver = driver;
	}

}
