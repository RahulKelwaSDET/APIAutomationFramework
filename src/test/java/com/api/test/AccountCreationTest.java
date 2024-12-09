package com.api.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.api.base.AuthService;
import com.api.models.request.signUpRequest;

import io.restassured.response.Response;

public class AccountCreationTest {

	@Test(description = "Verify account creation")
	public void createAccountTest()
	{
	
		signUpRequest signUpRequest = new signUpRequest.Builder()
				.username("dfgyf34")
				.password("dfs34")
				.email("fgdfg@yahoo.com")
				.mobileNumber("9857685758")
				.firstName("dfgrt")
				.lastName("jfyth").build();
		
		AuthService authService = new AuthService();
		
	Response response = authService.signUp(signUpRequest);
	
	System.out.println(response.asPrettyString());
	Assert.assertEquals(response.statusCode(), 200);
		
		
		
	}
	
}
