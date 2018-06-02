package com.bridgeit.AnnotationOfAutowired;

public class Hostel {

	String hostelname;
	String hostelcity;
	String hostelstate;
	public String getHostelname() {
		return hostelname;
	}
	public void setHostelname(String hostelname) {
		this.hostelname = hostelname;
	}
	public String getHostelcity() {
		return hostelcity;
	}
	public void setHostelcity(String hostelcity) {
		this.hostelcity = hostelcity;
	}
	public String getHostelstate() {
		return hostelstate;
	}
	public void setHostelstate(String hostelstate) {
		this.hostelstate = hostelstate;
	}
	@Override
	public String toString() {
		return "Hostel [hostelname=" + hostelname + ", hostelcity=" + hostelcity + ", hostelstate=" + hostelstate + "]";
	}
	
}
