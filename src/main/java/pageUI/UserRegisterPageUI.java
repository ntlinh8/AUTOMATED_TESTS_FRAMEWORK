package pageUI;

public class UserRegisterPageUI {
	public static final String FIRST_NAME_TEXTBOX = "xpath=//input[@id='FirstName']";
	public static final String LAST_NAME_TEXTBOX = "xpath=//input[@id='LastName']";
	public static final String EMAIL_TEXTBOX = "xpath=//input[@id='Email']";
	public static final String PASSWORD_TEXTBOX = "xpath=//input[@id='Password']";
	public static final String CONFIRM_PASSWORD_TEXTBOX = "xpath=//input[@id='ConfirmPassword']";
	public static final String REGISTER_BUTTON = "xpath=//button[@id='register-button']";
	public static final String DYNAMIC_ERROR_MESSAGE_BY_ID = "xpath=//span[@id='%s']";
	public static final String REGISTER_SUCCESS_MESSAGE = "xpath=//div[@class='result']";
	public static final String EXISTING_EMAIL_MESSAGE = "xpath=//div[@class='message-error validation-summary-errors']";
	public static final String CONTINUE_BUTTON = "xpath=//a[contains(@class, 'register-continue-button')]";
}
