package com.api.tests;

import org.junit.jupiter.api.Test;

import com.api.endpoints.EndPoints;
import com.api.utils.ConfigManager;

import io.restassured.response.Response;

public class GetCollectionsTest {

	EndPoints endPoints = new EndPoints();

	@Test
	public void getCollectionTest() {

		Response res = endPoints.getAllCollections();
		System.out.println("All collections : " + res.getBody().asPrettyString());
	}
	
	@Test
	public void getCollectionByid() {
		String collectionName = ConfigManager.getInstance().getProperty("collection_name");
		Response res = endPoints.getCollectionByid(collectionName, "ff8081819d82fab6019e8442ea3a2987");
		System.out.println("Get Collection By id " + res.getBody().asPrettyString());
	}

}
