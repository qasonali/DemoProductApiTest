package com.api.tests;

import org.junit.jupiter.api.Test;

import com.api.endpoints.EndPoints;
import com.api.payloads.CollectionRequest;
import com.api.payloads.CollectionRequest.Data;
import com.api.utils.ConfigManager;

import io.restassured.response.Response;

public class UpdateCollections {
	
	@Test
	public void updateCollectionRequest() {
		EndPoints endPoints = new EndPoints();	
		
		CollectionRequest req = new CollectionRequest();
		req.setName("Apple MacBook Pro 16");
		Data data = new Data();
		data.setPrice(20000);
		data.setYear(2020);
		data.setHd_size("1 TB");
		data.setCpu_model("Intel Core i9");
		data.setColor("Black");
		req.setData(data);
		Response response= endPoints
				.updateCollection(req,ConfigManager.getInstance().getProperty("collection_name"),"ff8081819d82fab6019e8442ea3a2987");
		System.out.println("status code :" + response.getStatusCode()+"\n"+response.asPrettyString());
		//System.out.println("UpdateCollectionTest------>" + response.jsonPath().getString("name")+" price:"+response.jsonPath().getInt("price"));		
	}
	
	@Test
	public void updateCollectionPartially() {
		EndPoints endPoints = new EndPoints();
		
		CollectionRequest req = new CollectionRequest();
		Data data = new Data();
		data.setYear(2022);
		data.setColor("Black");
		req.setData(data);
		String collectionName = ConfigManager.getInstance().getProperty("collection_name");
		Response response = endPoints.updateCllectionPartially(req,collectionName, "ff8081819d82fab6019e8442ea3a2987");
		System.out.println("Update collection partially : " + response.asPrettyString());
	}

}
