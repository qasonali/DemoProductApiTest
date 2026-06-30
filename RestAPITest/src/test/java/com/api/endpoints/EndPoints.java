package com.api.endpoints;

import java.util.List;

import com.api.base.BaseTest;
import com.api.payloads.CollectionRequest;
import com.api.payloads.LoginRequest;
import com.api.payloads.RegisterRequest;
import io.restassured.response.Response;

public class EndPoints extends BaseTest {
	private static final String REGISTER = "/register";
	private static final String LOGIN = "/login";
	private static final String CREATE_COLLECTION = "/collections/{collectionName}/objects";
	private static final String COLLECTIONS = "/collections";
	private static final String UPDATE_COLLECTIONS = "/collections/{collectionName}/objects/{id}";
	private static final String ALL_COLLECTIONS = "/collections/products/objects";
	private static final String GET_COLLECTION_BY_ID = "/collections/{collectionName}/objects/{id}";
	private static final String PARTIALLY_UPDATE = "/collections/{collectionName}/objects/{id}";

	public Response registerUser(RegisterRequest payload) {
		return req
				.body(payload)
				.when()
				.post(REGISTER);
	}

	public Response loginUser(LoginRequest payload) {
		return req
				.body(payload)
				.when()
				.post(LOGIN);
	}

	public Response createCollection(List<CollectionRequest> creq, String typeOfCollection) {
		return req
				.body(creq)
				.pathParam("collectionName", typeOfCollection)
				.when()
				.post(CREATE_COLLECTION);
	}	
	public Response getCollections() {
		return req
				.when()
				.get(COLLECTIONS);
	}

	public Response updateCollection(CollectionRequest creq,String collectionName,String id) {
		return req
				.body(creq)
				.pathParam("collectionName",collectionName)
				.pathParam("id", id)
		        .when()
		        .put(UPDATE_COLLECTIONS);
		   		   
	}
	
	public Response getAllCollections() {
		return req
				.when()
				.get(ALL_COLLECTIONS);
		
	}
	
	public Response getCollectionByid(String collectionName,String id) {
		return req
				.pathParam("collectionName", collectionName)
				.pathParam("id", id)
		        .when()
		        .get(GET_COLLECTION_BY_ID);
		   		   
	}
	
	public Response updateCllectionPartially(CollectionRequest creq, String collectionName,String id) {
		return req
				.body(creq)
				.pathParam("collectionName", collectionName)
				.pathParam("id", id)
				.when()
				.patch(PARTIALLY_UPDATE);
	}
}
