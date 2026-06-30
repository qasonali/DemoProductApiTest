package com.api.tests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.api.endpoints.EndPoints;
import com.api.payloads.LoginRequest;
import com.api.utils.LocalStorage;

import io.restassured.response.Response;

public class LoginTest {

	
	@DataProvider(name="loginData",parallel=true)
	public Object[][] getData() {
		return new Object[][] {
			{"sonali@gmail.com","abc@1234#"},{"somith@example.com","securePassword123"},{"ssmit@ymail.com","Xyz234"}
		};
	}
	
	@Test(dataProvider="loginData")
	public void testLoginUser(String email,String password) {
		LoginRequest loginRequest = new LoginRequest();
		//loginRequest.setEmail(LocalStorage.getUsername());
		//loginRequest.setPassword(LocalStorage.getPassword());
		loginRequest.setEmail(email);
		loginRequest.setPassword(password);
		EndPoints endPoints = new EndPoints();
		Response response = endPoints.loginUser(loginRequest);
		System.out.println("Register Response: " + response.asString());
		
		// Assertions
		Assert.assertEquals(response.getStatusCode(), 200);
		Assert.assertNotNull(response.jsonPath().getString("token"));
		Assert.assertEquals(response.jsonPath().getString("tokenType"), "Bearer");
		Assert.assertTrue(response.jsonPath().getInt("expiresIn") > 0);
		Assert.assertEquals(response.jsonPath().getString("user.email"), "somith@example.com");
   }
}
