package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ProfileSteps {
	
	@Given("User should be at home page")
	public void user_should_be_at_home_page() {
	    System.out.println("Given statement");
	}

	@When("User clicks on add profile button")
	public void user_clicks_on_add_profile_button() {
	  System.out.println("When for add information");
	}

	@When("User enters the information")
	public void user_enters_the_information() {
	    System.out.println("Entering information to add profile");
	}

	@Then("Profile should get created")
	public void profile_should_get_created() {
	    System.out.println("Then statement for add profile");
	}

	@When("User clicks on edit profile button")
	public void user_clicks_on_edit_profile_button() {
		 System.out.println("When for edit information");
	}

	@When("User updates the information")
	public void user_updates_the_information() {
	   System.out.println("When statement for update information");
	}

	@Then("Profile should get updated")
	public void profile_should_get_updated() {
	    System.out.println("Then statement for update profile");
	}

	@When("User clicks on delete profile button")
	public void user_clicks_on_delete_profile_button() {
		 System.out.println("When for delete information");
	}

	@Then("Profile should get deleted")
	public void profile_should_get_deleted() {
	   System.out.println("Then statement for delete profile");
	}

}
