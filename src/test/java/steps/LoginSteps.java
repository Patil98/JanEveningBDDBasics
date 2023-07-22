package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {
	
	@When("user enters username")
	public void enteringUsername()
	{
		System.out.println("Username entered");
	}
	
	@When("user enters password")
	public void enteringPassword()
	{
		System.out.println("Password entered");
	}
	
	@When("user clicks on login button")
	public void clickOnLoginButton()
	{
		System.out.println("Clicked on login button");
	}
	
	@Then("user should see the home page")
	public void validateLogin()
	{
		System.out.println("Home page is displaying");
	}
	
	@Given("user is at the login screen")
	public void preconditions()
	{
		System.out.println("Given statement");
	}
	
	
	@Then("page title should get display")
	public void validatePageTitle()
	{
		System.out.println("Validated Page title");
	}
	



}
