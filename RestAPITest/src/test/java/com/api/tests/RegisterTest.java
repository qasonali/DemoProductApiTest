package com.api.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.api.endpoints.EndPoints;
import com.api.payloads.RegisterRequest;
import com.api.utils.LocalStorage;

import io.restassured.response.Response;

public class RegisterTest {

	@Test
	public void testRegisterUser() {
		RegisterRequest regReq = new RegisterRequest();
		regReq.setEmail("somith@example.com");
		regReq.setName("somith");
		regReq.setPassword("securePassword123");

		EndPoints register = new EndPoints();
		Response response = register.registerUser(regReq);

		System.out.println("Register Response: " + response.asString());
		String email = response.jsonPath().getString("user.email");
		String password = regReq.getPassword();
		Assert.assertEquals(response.getStatusCode(), 200);
		LocalStorage.saveCredentials(email, password);
	}
}
