package com.api.base;

import com.api.utils.ConfigManager;

import io.restassured.RestAssured;
import io.restassured.specification.RequestSpecification;

public class BaseTest {
	protected RequestSpecification req;

	public BaseTest() {
		RestAssured.baseURI = ConfigManager.getInstance().getProperty("baseurl");
		req = RestAssured
				.given()
				.header("x-api-key", ConfigManager.getInstance().getProperty("api-key"))
				.header("Content-Type","application/json");
	}
}
