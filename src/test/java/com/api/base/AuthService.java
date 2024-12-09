package com.api.base;

import java.util.HashMap;

import com.api.models.request.LoginRequest;
import com.api.models.request.signUpRequest;

import io.restassured.response.Response;

public class AuthService extends BaseService {

	private static final String BASE_PATH = "/api/auth/";

	public Response login(LoginRequest payload) {
		System.out.println("Inside login of authService");
		return postRequest(payload, BASE_PATH + "login");
	}

	public Response signUp(signUpRequest payload) {

		return postRequest(payload, BASE_PATH + "signup");
	}

	public Response forgotPassword(String emailAddress) {
		HashMap<String, String> payload = new HashMap<String, String>();
		payload.put("email", emailAddress);
		return postRequest(payload, BASE_PATH + "forgot-password");
	}

}