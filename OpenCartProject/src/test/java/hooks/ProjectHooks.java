package hooks;

import java.time.Duration;

import org.openqa.selenium.WebDriver;

import factory.DriverFactory;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class ProjectHooks {
	
	WebDriver driver;

	@Before
	public void setup() {
		
		DriverFactory.initializeBrowser("chrome");
		driver = DriverFactory.getDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/register");

	}

	@After
	public void tearDown() {
		
		driver.quit();

	}

}
