package execution;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import qa.DriverFactory;
import utility.ConfigReader;

public class AppHooks {
	WebDriver driver;
	@Before
	public void launchBrowser() throws IOException {
		
		DriverFactory df = new DriverFactory();

		 driver = df.initBrowser(ConfigReader.readProperty("browser"));

		driver.manage().window().maximize();
	}
	
	@After
	public void tearDown()
	{
		driver.quit();
	}

}
