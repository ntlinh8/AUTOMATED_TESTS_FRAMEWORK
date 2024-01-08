package pageObjects;

import org.openqa.selenium.WebDriver;

import commons.BasePage;
import io.qameta.allure.Step;
import pageUI.CommonUI;

public class CommonPO extends BasePage{
	
	@Step("Click To Open Menu")
	public void clickToOpenMenuButton(WebDriver driver) {
		waitForElementClickable(driver, CommonUI.Common_button_OpenMenu);
		clickToElement(driver, CommonUI.Common_button_OpenMenu);
	}
	
	@Step("Click To Header Menu By Label")
	public void clickToHeaderMenuByLabel(WebDriver driver, String headerOption) {
		waitForElementVisible(driver, CommonUI.Common_button_DynamicHeaderMenuByLabel, headerOption);
		clickToElement(driver, CommonUI.Common_button_DynamicHeaderMenuByLabel, headerOption);
	}
	
	@Step("Click To Accept Cookie")
	public void clickToAcceptCookie(WebDriver driver) {
		clickToElementIfVisible(driver, CommonUI.Common_button_AcceptCookie);
	}
	
	@Step("Input Text To Dynamic Textbox By Place Holder")
	public void inputTextToDynamicTextboxByPlaceholder(WebDriver driver, String textValue, String placeholder) {
		waitForElementVisible(driver, CommonUI.Common_textbox_DynamicTextboxByPlaceholder, placeholder);
		sendkeyToElement(driver, CommonUI.Common_textbox_DynamicTextboxByPlaceholder, textValue, placeholder);
	}
}
