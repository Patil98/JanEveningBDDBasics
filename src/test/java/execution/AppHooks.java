package execution;

import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
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
	
	@After(order = 2)
	public void tearDown(Scenario scenario)
	{
		if(scenario.isFailed())
		{
			String scenarioname = scenario.getName();
			
			String scenarioUpdatedName = scenarioname.replaceAll(" ", "_");
			
			TakesScreenshot ts = (TakesScreenshot)driver;
			
			byte[] source = ts.getScreenshotAs(OutputType.BYTES);
			
			scenario.attach(source, "image/png", scenarioUpdatedName);
		}
	}
	
	
	@After(order = 1)
	public void quitBrowser()
	{
		driver.quit();
	}

}
