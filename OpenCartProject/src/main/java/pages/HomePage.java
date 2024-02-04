package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	WebDriver driver;
	
	public HomePage(WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//span[normalize-space()='My Account']")
	private WebElement myAccountDropdown;
	
	@FindBy(xpath="//a[normalize-space()='Login']")
	private WebElement loginOption;
	

	@FindBy(linkText = "Register")
	private WebElement registerOption;
	
	public void selectLoginOption() {
		loginOption.click();
	}
	
	public void clickOnMyAccount() {
		myAccountDropdown.click();
	}
	
	public void selectRegisterOption() {
		registerOption.click();
	}

}