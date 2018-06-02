package com.bridgeit.setterinjection;

import org.springframework.beans.factory.annotation.Required;

public class Address {

	String city;
	String state;
	int zipcode;
	
	public String getCity() {
		
		return city;
	}
	@Required
	public void setCity(String city) {
		System.out.println("city name");
		this.city = city;
	}
	public String getState() {
		return state;
	}
	@Required
	public void setState(String state) {
		System.out.println("name of state");
		this.state = state;
	}
	public int getZipcode() {
		return zipcode;
	}
	@Required
	public void setZipcode(int zipcode) {
		System.out.println(" zipcode");
		this.zipcode = zipcode;
	}
	@Override
	public String toString() {
		return "Address [city=" + city + ", state=" + state + ", zipcode=" + zipcode + "]";
	}
	
	
}
