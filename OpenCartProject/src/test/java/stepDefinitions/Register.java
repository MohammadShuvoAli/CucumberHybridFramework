package stepDefinitions;

import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import factory.DriverFactory;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Register {
	
	WebDriver driver;
	
	@Given("User navigates to Register Account page")
	public void user_navigates_to_register_account_page() {
		
		DriverFactory.getDriver();
		
		driver.findElement(By.xpath("//span[normalize-space()='My Account']")).click();
		driver.findElement(By.xpath("//a[normalize-space()='Register']")).click();
	    
	}

	@When("User enters the details into below fields")
	public void user_enters_the_details_into_below_fields(DataTable dataTable) {
		
		Map<String, String> dataMap = dataTable.asMap(String.class, String.class);
		
		driver.findElement(By.xpath("//input[@id='input-firstname']")).sendKeys("firstName");
		driver.findElement(By.xpath("//input[@id='input-lastname']")).sendKeys("lastName");
		driver.findElement(By.xpath("//input[@id='input-email']")).sendKeys("email");
		driver.findElement(By.xpath("//input[@id='input-telephone']")).sendKeys("telephone");
		driver.findElement(By.xpath("//input[@id='input-password']")).sendKeys("password");
		driver.findElement(By.xpath("//input[@id='input-confirm']")).sendKeys("password");
		
	}

	@When("User selects Privacy Policy")
	public void user_selects_privacy_policy() {
	    
		driver.findElement(By.xpath("//input[@name='agree']")).click();
		
	}

	@When("User clicks on Continue button")
	public void user_clicks_on_continue_button() {
	    
		driver.findElement(By.xpath("//input[@value='Continue']")).click();
		
	}

	@Then("User account should get created successfully")
	public void user_account_should_get_created_successfully() {
	    
		Assert.assertEquals("Your Account Has Been Created!", driver.findElement(By.xpath("//div[@id='content']/h1")));
		
	}

	@When("User selects Yes for Newsletter")
	public void user_selects_yes_for_newsletter() {
		
		driver.findElement(By.xpath("//label[normalize-space()='Yes']//input[@name='newsletter']")).click();
	    
	}

	@When("User enters the details into below fields with duplicate email")
	public void user_enters_the_details_into_below_fields_with_duplicate_email() {
	    
	}

	@Then("User should get a proper warning about duplicate email")
	public void user_should_get_a_proper_warning_about_duplicate_email() {
	    
	}

	@When("User dont enter any details into fields")
	public void user_dont_enter_any_details_into_fields() {
	    
	}

	@Then("User should get proper warning messages for every mandatory field")
	public void user_should_get_proper_warning_messages_for_every_mandatory_field() {
	    
	}

}
