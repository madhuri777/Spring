package com.bridgeit.secondprogram;

public class Employee {

	int eid;
	String name;
	Address address;
	
	public Employee() {
		System.out.println("----construction of Employee Object----");
	}

	//Construct Injection
	public Employee(Address address) {
		this.address = address;
	}


	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Address getAddress() {
		return address;
	}

	//Setter Injection
	public void setAddress(Address address) {
		this.address = address;
	}
	
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", name=" + name + ", address=" + address + "]";
	}
	public void Employeeinit() {
		System.out.println("-------Create the object of BeanEmployee-------");
	}
	public void EmployeeDistroy() {
		System.out.println("-------Distroyed the BeanEmployee Object-------");
	}
}
