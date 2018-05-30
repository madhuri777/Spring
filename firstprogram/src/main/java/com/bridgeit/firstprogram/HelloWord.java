package com.bridgeit.firstprogram;

public class HelloWord {

	private String message;

	public void  getMessage() {
		System.out.println("user message is "+message);
	}

	public void setMessage(String message) {
		this.message = message;
	}
	public void Myinit() {
		System.out.println("-------Create the object of Bean-------");
	}
	public void MyDistroy() {
		System.out.println("-------Distroyed the Bean Object-------");
	}
	
}
