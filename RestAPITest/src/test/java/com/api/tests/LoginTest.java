package com.api.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.api.endpoints.EndPoints;
import com.api.payloads.LoginRequest;
import com.api.utils.LocalStorage;

import io.restassured.response.Response;

public class LoginTest {

	@Test
	public void testLoginUser() {
		LoginRequest loginRequest = new LoginRequest();
		loginRequest.setEmail(LocalStorage.getUsername());
		loginRequest.setPassword(LocalStorage.getPassword());
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
