package com.api.tests;

import java.util.ArrayList;
import java.util.List;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.api.endpoints.EndPoints;
import com.api.payloads.CollectionRequest;
import com.api.payloads.CollectionRequest.Data;

import io.restassured.response.Response;

public class CreateCollectionTest {

	@Test
	public void createCollectionTest() {

		/*
		 * CollectionRequest cr = new CollectionRequest();
		 * cr.setName("Google Pixel 6 Pro");
		 * 
		 * Data d = new Data(); d.setCapacity("129.5gb"); d.setColor("Cloudy White");
		 * cr.setData(d);
		 */
		
		CollectionRequest cr2 = new CollectionRequest();
		cr2.setName("Apple iPad Air");

		Data d2 = new Data();
		d2.setCapacity("129.5gb");
		d2.setGeneration("4th");
		d2.setPrice(799);
		d2.setCapacity("128 GB");
		cr2.setData(d2);
		

		CollectionRequest cr3 = new CollectionRequest();
		cr3.setName("Apple iPhone 12 Pro Max");

		Data d3 = new Data();
		d3.setCapacity("129.5gb");
		d3.setColor("Cloudy White");
		d3.setPrice(519);
		d3.setCapacity("256 GB");
		cr3.setData(d3);
		
		List<CollectionRequest> collections= new ArrayList<>();
		//collections.add(cr);
		collections.add(cr2);
		collections.add(cr3);
		EndPoints endPoints = new EndPoints();
		Response response = endPoints.createCollection(collections,"Laptop");
		System.out.println("CreateCollectionTest------>" + response.jsonPath().getString("name"));
	}
	
	
	
	@Test
	public void getCollectionsTest() {
		EndPoints endPoints = new EndPoints();

		Response response = endPoints.getCollections();
		String jsonPath = response.asString();
		System.out.println("Collections ---->" + jsonPath);
	}
}
