package com.bridgeit.model;

public class UserRegistration {

	private String username;
	private String email;
	private String password;
	private String bdydate;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getBdydate() {
		return bdydate;
	}
	public void setBdydate(String bdydate) {
		this.bdydate = bdydate;
	}
	@Override
	public String toString() {
		return "UserRegistration [username=" + username + ", email=" + email + ", password=" + password + ", bdydate="
				+ bdydate + "]";
	}
	
	
}
