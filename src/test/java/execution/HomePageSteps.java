package execution;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;
import qa.DriverFactory;

public class HomePageSteps {
	HomePage homepage = new HomePage(DriverFactory.getDriver());
	
	@Given("user is at the landing page")
	public void user_is_at_the_landing_page() {
	   WebDriver driver = DriverFactory.getDriver();
	   
	   driver.get("https://www.aircanada.com/ca/en/aco/home.html");
	}

	@Then("title of page should contains {string}")
	public void title_of_page_should_contains(String wordinsidetitle) {
		String title = homepage.fetchTitleOfPage();
		
		boolean ispresent = title.contains(wordinsidetitle);
		
		Assert.assertTrue(ispresent);	
	}

	@Then("signin icon should get display")
	public void signin_icon_should_get_display() {
	  
		boolean isdisplay = homepage.isSigninDisplay();
		
		Assert.assertTrue(isdisplay);
	}

	@When("user enters the to city as {string}")
	public void user_enters_the_to_city_as(String cityName) {
	 
		homepage.enterCityName(cityName);
	}

	@When("Enter the departure with Return date")
	public void enter_the_departure_with_return_date() {
	    
		homepage.selectDepartureAndReturn();
	}

	@When("click on search flight button")
	public void click_on_search_flight_button() {
	   homepage.clickOnSearchFlight();
	}

	
	
	
}
