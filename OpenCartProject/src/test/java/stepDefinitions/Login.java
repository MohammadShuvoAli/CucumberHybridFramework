package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login {
	
	@Given("User has navigated to login page")
	public void user_has_navigated_to_login_page() {
	    
	}

	@When("User enters valid email address {string} into email field")
	public void user_enters_valid_email_address_into_email_field(String emailText) {
	    
	}

	@When("User enters valid password {string} into password field")
	public void user_enters_valid_password_into_password_field(String passwordText) {
	    
	}

	@When("User clicks on Login button")
	public void user_clicks_on_login_button() {
	    
	}

	@Then("User should get successfully logged in")
	public void user_should_get_successfully_logged_in() {
	    
	}

	@When("User has entered valid password {string} into password field")
	public void user_has_entered_valid_password_into_password_field(String string) {
	    
	}

	@Then("User should get a proper warning message about credentials mismatch")
	public void user_should_get_a_proper_warning_message_about_credentials_mismatch() {
	    
	}

	@When("User dont enter any email address into email field")
	public void user_dont_enter_any_email_address_into_email_field() {
	    
	}

	@When("User dont enter password into password field")
	public void user_dont_enter_password_into_password_field() {
	    
	}

}
