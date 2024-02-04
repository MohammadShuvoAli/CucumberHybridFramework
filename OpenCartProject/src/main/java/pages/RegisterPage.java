package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage {

	WebDriver driver;

	public RegisterPage(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(id = "input-firstname")
	private WebElement firstNameField;

	@FindBy(id = "input-lastname")
	private WebElement lastNameField;

	@FindBy(id = "input-email")
	private WebElement emailField;

	@FindBy(id = "input-telephone")
	private WebElement telephoneField;

	@FindBy(id = "input-password")
	private WebElement passwordField;

	@FindBy(id = "input-confirm")
	private WebElement confirmPasswordField;

	@FindBy(name = "agree")
	private WebElement privacyPolicyOption;

	@FindBy(xpath = "//input[@value='Continue']")
	private WebElement continueButton;

	@FindBy(xpath = "//input[@name='newsletter' and @value=1]")
	private WebElement YesNewsLetterOption;

	@FindBy(xpath = "//div[@class='alert alert-danger alert-dismissible']")
	private WebElement warningMessage;

	@FindBy(xpath = "//*[@id=\"account\"]/div[2]/div/div")
	private WebElement firstNameWarning;

	@FindBy(xpath = "//*[@id=\"account\"]/div[3]/div/div")
	private WebElement lastNameWarning;

	@FindBy(xpath = "//*[@id=\"account\"]/div[4]/div/div")
	private WebElement emailWarning;

	@FindBy(xpath = "//*[@id=\"account\"]/div[5]/div/div")
	private WebElement telephoneWarning;

	@FindBy(xpath = "//*[@id=\"content\"]/form/fieldset[2]/div[1]/div/div")
	private WebElement passwordWarning;

	public void enterFirstName(String firstNameText) {

		firstNameField.sendKeys(firstNameText);

	}

	public void enterLastName(String lastNameText) {

		lastNameField.sendKeys(lastNameText);

	}

	public void enterEmail(String emailText) {

		emailField.sendKeys(emailText);

	}

	public void enterTelephone(String telephoneText) {

		telephoneField.sendKeys(telephoneText);

	}

	public void enterPassword(String passwordText) {

		passwordField.sendKeys(passwordText);

	}

	public void enterConfirmPassword(String confirmPasswordText) {

		confirmPasswordField.sendKeys(confirmPasswordText);

	}

	public void selectPrivacyPolicy() {

		privacyPolicyOption.click();

	}

	public void clickOnContinueButton() {

		continueButton.click();

	}

	public void selectYesNewsLetterOption() {

		YesNewsLetterOption.click();

	}

	public String getWarningMessageText() {

		return warningMessage.getText();
	}

	public String getFirstNameWarning() {
		
		return firstNameWarning.getText();

	}

	public String getLastNameWarning() {
		
		return lastNameWarning.getText();

	}

	public String getEmailWarning() {
		
		return emailWarning.getText();
		
	}

	public String getTelephoneWarning() {
		
		return telephoneWarning.getText();
		
	}

	public String getPassowrdWarning() {
		
		return passwordWarning.getText();
		
	}
}