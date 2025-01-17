package com.api.models.request;

public class signUpRequest {
	private String username;
	private String password;
	private String email;
	private String firstName;
	private String lastName;
	private String mobileNumber;

	public signUpRequest(String username, String password, String email, String firstName, String lastName,
			String mobileNumber) {
		super();

		this.username = username;
		this.password = password;
		this.email = email;
		this.firstName = firstName;
		this.lastName = lastName;
		this.mobileNumber = mobileNumber;

	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public static class Builder {

		private String username;
		private String password;
		private String email;
		private String firstName;
		private String lastName;
		private String mobileNumber;

		public Builder username(String username) {
			return this;
		}

		public Builder password(String password) {
			return this;
		}

		public Builder email(String email) {
			return this;
		}

		public Builder firstName(String firstName) {
			return this;
		}

		public Builder lastName(String lastName) {
			return this;
		}

		public Builder mobileNumber(String mobileNumber) {
			return this;
		}

		public signUpRequest build() {
			signUpRequest signUpRequest = new signUpRequest(username, password, email, firstName, lastName,
					mobileNumber);
			return signUpRequest;
		}

	}

}
