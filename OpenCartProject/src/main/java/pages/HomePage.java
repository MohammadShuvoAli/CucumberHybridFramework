package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.CommonUtils;
import utils.ElementUtils;

public class HomePage {

	WebDriver driver;
	private ElementUtils elementUtils;

	public HomePage(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);
		elementUtils = new ElementUtils(driver);
		
	}

	@FindBy(xpath = "//span[normalize-space()='My Account']")
	private WebElement myAccountDropdown;

	@FindBy(xpath = "//a[normalize-space()='Login']")
	private WebElement loginOption;

	@FindBy(linkText = "Register")
	private WebElement registerOption;

	@FindBy(name = "search")
	private WebElement seachBoxField;
	
	@FindBy(xpath="//*[@id=\"search\"]/span/button")
	private WebElement searchButton;

	public void selectLoginOption() {
		
		elementUtils.clickOnElement(loginOption, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);
		
	}

	public void clickOnMyAccount() {
		
		elementUtils.clickOnElement(myAccountDropdown, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);
		
	}

	public void selectRegisterOption() {
		
		elementUtils.clickOnElement(registerOption, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);
		
	}

	public void enterProductIntoSearchBox(String productText) {
		
		elementUtils.typeTextIntoElement(seachBoxField, productText, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);
		
	}
	
	public void clickOnSearchButton() {
		
		elementUtils.clickOnElement(searchButton, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);
		
	}

}
