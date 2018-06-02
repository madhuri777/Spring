package com.bridgeit.constructoorbaseddependacy;

public class Employee {

	private int empid;
	private PANCard pancard;
	public Employee(int empid, PANCard pancard) {
		super();
		this.empid = empid;
		this.pancard = pancard;
	}
	public int getEmpid() {
		return empid;
	}

	public PANCard getPancard() {
		return pancard;
	}
	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", pancard=" + pancard + "]";
	}
	
	
}
