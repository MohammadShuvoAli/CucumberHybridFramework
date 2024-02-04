package hooks;

import java.util.Properties;

import org.openqa.selenium.WebDriver;

import factory.DriverFactory;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import utils.ConfigReader;

public class ProjectHooks {
	
	WebDriver driver;

	@Before
	public void setup() {
		
		Properties prop = ConfigReader.initializeProperties();
		driver = DriverFactory.initializeBrowser(prop.getProperty("browser"));
		driver.get(prop.getProperty("url"));

	}

	@After
	public void tearDown() {
		
		driver.quit();

	}

}
