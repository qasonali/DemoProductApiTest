package stepdefinitions;

import java.io.IOException;

import org.testng.Assert;

import Pages.LoginPage;
import Pages.RegisterPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RegFormSteps {

	RegisterPage registerPage;
	LoginPage loginPage;
	@Given("user is on registration page")
	public void user_is_on_registration_page() throws Throwable {
		registerPage=new RegisterPage();
		loginPage=new LoginPage();
		loginPage.goLoginPage();
		registerPage.newUserClick();
	}
	@When("user enters valid details")
	public void user_enters_valid_details() throws IOException {
		registerPage.enterDetails();
	    
	}
	@When("click on new user button")
	public void click_on_new_user_button() {
	   try {
		registerPage.doRegister();
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	 
	    
	}
	
	@When("user enters already registered username")
	public void enterExistingUsername() {
	    System.out.println("Entering existing username");
	}
	
	@Then("user account should be created successfully")
	public void user_account_should_be_created_successfully() {
	   
	}

}
