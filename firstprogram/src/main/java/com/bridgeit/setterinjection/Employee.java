package com.bridgeit.setterinjection;

public class Employee {

	int eid;
	String name;
	Address address;
	
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
		System.out.println("employeee ids");
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
	  System.out.println("employee name");
		this.name = name;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		
		this.address = address;
	}
//	@Override
//	public String toString() {
//		return "Employee [eid=" + eid + ", name=" + name + ", address=" + address + "]";
//	}
//	
	
	public void displayInfo() {
		System.out.println("  "+eid+" "+name +" "+address);
		System.out.println(" "+address);
	}
}