package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		
		features = {"src\\test\\resources\\applicationfeatures\\Registration.feature"},
		
		glue = {"steps"},
		
		plugin = {"pretty"},
		
		dryRun = true
	
		)



public class RegistrationRunner extends AbstractTestNGCucumberTests {

}
