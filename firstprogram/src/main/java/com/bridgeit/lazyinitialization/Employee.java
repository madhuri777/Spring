package com.bridgeit.lazyinitialization;

public class Employee {

	private String name;
	private Address address;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		System.out.println("name "+name);
		this.name = name;
	}
	public void initEmployee() {
		System.out.println("object of Employee");
	}
//	public Address getAddress() {
//		return address;
//	}
//	public void setAddress(Address address) {
//		System.out.println("adress ");
//		this.address = address;
//	}
	public void InfoMethod() {
		System.out.println("getInfoMethod "+getName());
	}
}
