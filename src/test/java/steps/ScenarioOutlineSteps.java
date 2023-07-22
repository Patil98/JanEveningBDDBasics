package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ScenarioOutlineSteps {
	
	@Given("user is at the signup page")
	public void user_is_at_the_signup_page() {
	    System.out.println("given statement");
	}

	@When("user enters the {string} on form")
	public void user_enters_the_on_form(String string) {
	    System.out.println("entered name is : "+string);
	}

	@When("user enters the {int}")
	public void user_enters_the(Integer int1) {
	    System.out.println("entered age is : "+int1);
	}

	@When("user select the {string}")
	public void user_select_the(String string) {
	  System.out.println("Selected gender is : "+string);
	}

	@Then("userid get generate")
	public void userid_get_generate() {
	   System.out.println("user id generated");
	}


}
