package com.bridgeit.beanconfiguration;

public class HelloWord {

	private String message;

	public String getMessage() {
		System.out.println("message will be "+message);
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
}
