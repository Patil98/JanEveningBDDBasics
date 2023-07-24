package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		
		features = {"src\\test\\resources\\applicationfeatures\\Campaigns.feature"},
		
		glue = {"steps"},
		
		tags = "not @functional"
			)






public class CampaignRunner extends AbstractTestNGCucumberTests {

}
