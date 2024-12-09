package com.api.test;

import org.testng.annotations.Test;

import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class LoginAPITest2 {
	
	@Test(description= "Verify Login API" )
	public void LoginAPITest2() {
		
		baseURI="http://64.227.160.186:8080";
		
		Response response = given().header("Content-Type","application/json")
				.body("{\"username\": \"uday1234\",  \"password\": \"uday1234\"}")
				.post("api/auth/login");
		System.out.println(response.asPrettyString());
		
		
		
	}

}
