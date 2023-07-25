package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		
		features = {"src\\test\\resources\\applicationfeatures\\Campaigns.feature"},
		
		glue = {"steps", "hooks"},
		
		tags = "@campaignfeature"
			)






public class CampaignRunner extends AbstractTestNGCucumberTests {

}
