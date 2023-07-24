package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CampaignSteps {
	
	@Given("User should be logged in")
	public void user_should_be_logged_in() {
	   System.out.println("Given statement");
	}

	@When("User click on create campaign button")
	public void user_click_on_create_campaign_button() {
	   System.out.println("Creating campaign");
	}

	@When("user provide the name of campaign")
	public void user_provide_the_name_of_campaign() {
	    System.out.println("Entering name of campaign");
	}

	@Then("Campaign gets created")
	public void campaign_gets_created() {
	   System.out.println("Creation of campaign");
	}

	@When("User clicks on campaign")
	public void user_clicks_on_campaign() {
	   System.out.println("Click on campaign");
	}

	@When("Enter the details to schedule")
	public void enter_the_details_to_schedule() {
	    System.out.println("Entering details to schedule");
	}

	@Then("Campaign will get schedule")
	public void campaign_will_get_schedule() {
	  System.out.println("Campaign got scheduled");
	}

	@When("user select draft status")
	public void user_select_draft_status() {
	    System.out.println("Draft status has been selected");
	}

	@Then("User should see all drafted campaign")
	public void user_should_see_all_drafted_campaign() {
	   System.out.println("See all draft status campaign");
	}

}
