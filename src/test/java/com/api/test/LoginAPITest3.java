package com.api.test;

import org.testng.annotations.Test;

import com.api.base.AuthService;
import com.api.models.request.LoginRequest;
import com.api.models.response.LoginResponse;

import io.restassured.response.Response;

public class LoginAPITest3 {

	@Test(description = "Verify if the login API is working")
	public void loginTest() {
		
		LoginRequest loginRequest =new LoginRequest("rahulkelwa", "rahulkelwa");
		AuthService authService = new AuthService();
		System.out.println("authserviceobject created");
		Response response = authService.login(loginRequest);
		    LoginResponse loginresponse =    response.as(LoginResponse.class);
		    
		    System.out.println(loginresponse.getToken());

	}
}
