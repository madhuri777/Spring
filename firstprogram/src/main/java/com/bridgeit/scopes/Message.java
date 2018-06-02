package com.bridgeit.scopes;

public class Message {

	private int messageid;
	private String messge;
	public int getMessageid() {
		return messageid;
	}
	public void setMessageid(int messageid) {
		this.messageid = messageid;
	}
	public String getMessge() {
		return messge;
	}
	public void setMessge(String messge) {
		this.messge = messge;
	}
	public void messageInfo() {
		System.out.println(" "+getMessageid()+"\t"+getMessge());
	}
}
