package com.bridgeit.model;

public class Account {

	private String accountNumber;
	private String  accountDiscription;
	public Account(String accountNumber, String accountDiscription) {
		super();
		this.accountNumber = accountNumber;
		this.accountDiscription = accountDiscription;
	}
	public String getAccountNumber() {
		return accountNumber;
	}
	public String getAccountDiscription() {
		return accountDiscription;
	}
	
}
