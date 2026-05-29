package com.api.endpoints;

import com.api.base.BaseTest;
import com.api.payloads.LoginRequest;
import com.api.payloads.RegisterRequest;

import io.restassured.response.Response;

public class EndPoints extends BaseTest{
    private static final String REGISTER = "/register";
    private static final String LOGIN = "/login";
    
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

	
}
