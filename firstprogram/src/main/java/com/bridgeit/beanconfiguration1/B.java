package com.bridgeit.beanconfiguration1;

public class B {

	private String city;
	private String state;
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	@Override
	public String toString() {
		return "B [city=" + city + ", state=" + state + "]";
	}
	
}
