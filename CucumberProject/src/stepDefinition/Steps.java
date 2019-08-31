package stepDefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Steps {

	@Given("^Application is up and running$")
	public void application_is_up_and_running() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
		System.out.println("Application is Up and Running");
		
		
		
	}

	@When("^I enter valid credentials$")
	public void i_enter_valid_credentials() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		
		System.out.println("Enter username and password");
	    
	}

	@Then("^I should be logged in successfully\\.$")
	public void i_should_be_logged_in_successfully() throws Throwable {
	    
		System.out.println("I logged in successfully");
		
	}


	
	
	
	
	
	
}
