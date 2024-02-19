package pageObjects;
import org.openqa.selenium.WebDriver;

import commons.BasePage;
import commons.GlobalConstants;
import io.qameta.allure.Step;
import pageUI.UserHomePageUI;

public class UserHomePageObject extends BasePage {
	WebDriver driver;
	
	public UserHomePageObject(WebDriver driver) {
		this.driver = driver;
	}
	
	@Step("Click to Register link")
	public UserRegisterPageObject clickToRegisterLink() {
		waitForElementVisible(driver, UserHomePageUI.REGISTER_LINK);
		clickToElement(driver, UserHomePageUI.REGISTER_LINK);
		return PageGeneratorManager.getUserRegisterPage(driver);
	}
	
	@Step("Click to Login link")
	public UserLoginPageObject clickToLoginLink() {
		waitForElementVisible(driver, UserHomePageUI.LOGIN_LINK);
		clickToElement(driver, UserHomePageUI.LOGIN_LINK);
		return PageGeneratorManager.getUserLoginPage(driver);
	}
	
	@Step("My Dashboard page displayed")
	public boolean isMyAccountLinkDisplayed() {
		return isElementDisplayed(driver, UserHomePageUI.MYACCOUNT_LINK);
	}

	@Step("Input keyword to Search textbox")
	public void inputKeywordToSearchTextbox(String keyword) {
		waitForElementVisible(driver, UserHomePageUI.SEARCH_TEXTBOX);
		sendkeyToElement(driver, UserHomePageUI.SEARCH_TEXTBOX, keyword);
	}
	
	@Step("Open register page")
	public void openRegisterPage() {
		openPageUrl(driver, GlobalConstants.PORTAL_DEV_URL + "register");
		SleepInSecond(2);
	}
	
	@Step("Open login page")
	public void openLoginPage() {
		openPageUrl(driver, GlobalConstants.PORTAL_DEV_URL + "login");
		SleepInSecond(2);
	}

}
