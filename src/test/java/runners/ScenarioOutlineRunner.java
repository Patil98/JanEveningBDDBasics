package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		
		
	features = {"src\\test\\resources\\applicationfeatures\\ScenarioOutline.feature"},
	
	glue = {"steps"},
	
	plugin = {"pretty"}
		
		
		
		
		)




public class ScenarioOutlineRunner extends AbstractTestNGCucumberTests {

}
