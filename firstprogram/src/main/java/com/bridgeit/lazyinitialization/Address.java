package com.bridgeit.lazyinitialization;

public class Address {

	private String city;
	private String state;
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		System.out.println("city name "+city);
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		System.out.println("state name "+state);
		this.state = state;
	}
	public void infoAddress() {
		System.out.println(" "+getCity()+" "+getState());
	}
	public void initAddress() {
		System.out.println("object of address");
	}
	public void distroyAddress() {
		System.out.println("distroy object of Address");
	}
	@Override
	public String toString() {
		return "Address [city=" + city + ", state=" + state + "]";
	}
	
	
}
