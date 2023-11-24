package pageObjects;

import org.openqa.selenium.WebDriver;

import commons.BasePage;
import pageUI.CommonUI;

public class CommonPO extends BasePage{
	
	public void clickToOpenMenuButton(WebDriver driver) {
		waitForElementClickable(driver, CommonUI.Common_button_OpenMenu);
		clickToElement(driver, CommonUI.Common_button_OpenMenu);
	}
	
}
