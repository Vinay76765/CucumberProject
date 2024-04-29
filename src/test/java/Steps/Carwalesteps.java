package Steps;

import PageObjects.HomePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utils.SeleniumDriver;

public class Carwalesteps {
	
	HomePage home = new HomePage();
	
	@Given("User navigates to carwale website")
	public void user_navigates_to_carwale_website() {
	   
		
		SeleniumDriver.OpenPage(SeleniumDriver.config.getProperty("testsiteurl"));
	}

	@When("user mouseover to newcars")
	public void user_mouseover_to_newcars() {
	    
		home.mouseoverNewCars();
	}

	@Then("user clicks on Findnewcars")
	public void user_clicks_on_findnewcars() {
	   
		home.clickFindNewCars();
	}

	@Then("user clicks on Toyota car")
	public void user_clicks_on_toyota_car() {
	   
	}

	@Then("user validates carTitle as Toyota cars")
	public void user_validates_car_title_as_toyota_cars() {
	    
	}

}
