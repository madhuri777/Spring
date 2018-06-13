package com.bridgeit.model;

public class UserModel {

	private int id;
	private String username;
	private String email;
	private String password;
	private String bdydate;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
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
		return "UserModel [id=" + id + ", username=" + username + ", email=" + email + ", password=" + password
				+ ", bdydate=" + bdydate + "]";
	}
	
	
//	
//	public int getId() {
//		return id;
//	}
//	public void setId(int id) {
//		this.id = id;
//	}
//	public String getUserName() {
//		return username;
//	}
//	public void setUserName(String userName) {
//		this.username = userName;
//	}
//	public String getEmail_id() {
//		return email;
//	}
//	public void setEmail_id(String email_id) {
//		this.email = email_id;
//	}
//	public String getPassWord() {
//		return password;
//	}
//	public void setPassWord(String passWord) {
//		this.password = passWord;
//	}
//	public String getDateOfBirth() {
//		return bdydate;
//	}
//	public void setDateOfBirth(String dateOfBirth) {
//		this.bdydate = dateOfBirth;
//	}
//	@Override
//	public String toString() {
//		return "UserModel [id=" + id + ", userName=" + username + ", email_id=" + email + ", passWord=" + password
//				+ ", dateOfBirth=" + bdydate + "]";
//	}
//	
	
}
