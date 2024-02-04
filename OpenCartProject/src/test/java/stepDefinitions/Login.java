package stepDefinitions;

import java.util.Date;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import factory.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;
import pages.LoginPage;

public class Login {

	WebDriver driver;
	private LoginPage loginPage;

	@Given("User has navigated to login page")
	public void user_has_navigated_to_login_page() {

		driver = DriverFactory.getDriver();
		HomePage homepage = new HomePage(driver);
		homepage.clickOnMyAccount();
		homepage.selectLoginOption();
	}

	@When("User enters valid email address {string} into email field")
	public void user_enters_valid_email_address_into_email_field(String emailText) {
		
		loginPage = new LoginPage(driver);
		loginPage.enterEmailAddress(emailText);

	}
	
	@When("User enters invalid email address into email field")
	public void user_enters_invalid_email_address_into_email_field() {

		driver.findElement(By.id("input-email")).sendKeys(randomEmailGenerator());

	}

	@When("User enters valid password {string} into password field")
	public void user_enters_valid_password_into_password_field(String passwordText) {

		loginPage.enterPassword(passwordText);

	}

	@When("User clicks on Login button")
	public void user_clicks_on_login_button() {
		
		loginPage.clickOnLoginButton();
		
	}

	@Then("User should get successfully logged in")
	public void user_should_get_successfully_logged_in() {
		String expectedTitle = "My Account";
		String actualTitle = driver.getTitle();

		if (expectedTitle.equals(actualTitle)) {
			Assert.assertTrue(true);
		} else {
			Assert.fail("Login failed. Expected title: " + expectedTitle + ", Actual title: " + actualTitle);
		}
	}

	@When("User has entered valid password {string} into password field")
	public void user_has_entered_valid_password_into_password_field(String passwordText) {
		
		loginPage.enterPassword(passwordText);

	}

	@Then("User should get a proper warning message about credentials mismatch")
	public void user_should_get_a_proper_warning_message_about_credentials_mismatch() {

		Assert.assertTrue(driver.findElement(By.xpath("//div[@class='alert alert-danger alert-dismissible']")).getText()
				.contains("Warning: No match for E-Mail Address and/or Password."));

	}

	@When("User dont enter any email address into email field")
	public void user_dont_enter_any_email_address_into_email_field() {

		driver.findElement(By.id("input-email")).sendKeys("");

	}

	@When("User dont enter password into password field")
	public void user_dont_enter_password_into_password_field() {

		driver.findElement(By.id("input-password")).sendKeys("");

	}
	
	private String randomEmailGenerator() {
		
		Date date = new Date();
		return "shuvo" + date.toString().replace(" ","_").replace(":", "_") + "@gmail.com";
		
	}
}
