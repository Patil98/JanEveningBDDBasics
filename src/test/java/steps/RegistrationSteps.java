package steps;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;



public class RegistrationSteps {
	
	@Given("user should be at registration page")
	public void user_should_be_at_registration_page() {
	  
		System.out.println("Given statement");
	}

	@When("user enters the following details")
	public void user_enters_the_following_details(DataTable dataTable) {
	    
		List<List<String>> data = dataTable.asLists();
		
//			List<String> firstIndexList = data.get(0);
			
//			String value = firstIndexList.get(2);
//			
//			System.out.println(value);// erin.smith@gmail.com
		
		String datavalue = data.get(0).get(1);
		
		System.out.println(datavalue);//Smith
		
	}

	@Then("user gets registration confirmation")
	public void user_gets_registration_confirmation() {
	   
		System.out.println("Then statement");
	}

}
