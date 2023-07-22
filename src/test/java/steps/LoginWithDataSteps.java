package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginWithDataSteps {
	
	@Given("user is at login page")
	public void user_is_at_login_page() {
	    System.out.println("Given statement for login page");
	}

	@When("user enters the username as {string}")
	public void user_enters_the_username_as(String uname) {
	    System.out.println("Entered username is "+uname);
	}

	@When("user enters the password as {string}")
	public void user_enters_the_password_as(String string) {
		System.out.println("Entered password is "+string);
	}

	@When("user click on login button")
	public void user_click_on_login_button() {
	    System.out.println("Clicked on login button");
	}

	@Then("user should redirect to homepage")
	public void user_should_redirect_to_homepage() {
	  System.out.println("Then statement ");
	}


}
