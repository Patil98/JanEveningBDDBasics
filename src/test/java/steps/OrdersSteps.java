package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class OrdersSteps {
	
	@Given("user should be logged in")
	public void user_should_be_logged_in() {
	   System.out.println("Given statement for login");
	}

	@When("user clicks on orders link")
	public void user_clicks_on_orders_link() {
	   System.out.println("click on orders");
	}

	@When("user clicks on past order order button")
	public void user_clicks_on_past_order_order_button() {
	    System.out.println("clicked on past order");
	}

	@Then("user should be able to see past order")
	public void user_should_be_able_to_see_past_order() {
	   System.out.println("Past order information");
	}

	@When("user clicks on current order button")
	public void user_clicks_on_current_order_button() {
	   System.out.println("clicked on current order");
	}

	@Then("user should be able to see current order")
	public void user_should_be_able_to_see_current_order() {
	  System.out.println("current order information");
	}


}
