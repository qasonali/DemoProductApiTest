package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RegFormSteps {


	@Given("user is on registration page")
	public void user_is_on_registration_page() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
	}
	@When("user enters valid details")
	public void user_enters_valid_details() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
	}
	@When("click on new user button")
	public void click_on_new_user_button() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
	}
	
	@When("user enters already registered username")
	public void enterExistingUsername() {
	    System.out.println("Entering existing username");
	}
	
	@Then("user account should be created successfully")
	public void user_account_should_be_created_successfully() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
	}

}
