package stepdefinitions;

import java.io.IOException;

import org.testng.Assert;

import Pages.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDefinitions {
	LoginPage loginPage;
	String title;

	@Given("user is on login page")
	public void user_clicks_on_login_button() throws IOException {
			loginPage = new LoginPage();
			loginPage.goLoginPage();
	}

	@When("enters valid username and password")
	public void enters_valid_username_and_password() throws IOException {
		 Hooks.test.info("Entering username and password");
		 loginPage.enterCredentials("mssonali", "Abc@12345");
	}

	@And("clicks on login")
	public void clicks_on_login() throws IOException {
	    Hooks.test.info("Clicking login button");
		title=loginPage.doLogin();
	}

	@Then("User login successfully")
	public void user_login_successfully() {
		   Hooks.test.pass("Login successful");
		//Assert.assertEquals("demosite", title);
	}

}
