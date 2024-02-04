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

	public void enterFirstName(String firstNameText) {

		firstNameField.sendKeys(firstNameText);

	}

	public void enterLastName(String lastNameText) {

		firstNameField.sendKeys(lastNameText);

	}

	public void enterEmail(String emailText) {

		firstNameField.sendKeys(emailText);

	}

	public void enterTelephone(String telephoneText) {

		firstNameField.sendKeys(telephoneText);

	}

	public void enterPassword(String passwordText) {

		firstNameField.sendKeys(passwordText);

	}

	public void enterConfirmPassword(String confirmPasswordText) {

		firstNameField.sendKeys(confirmPasswordText);

	}
	
	public void selectPrivacyPolicy() {

		privacyPolicyOption.click();

	}

}
