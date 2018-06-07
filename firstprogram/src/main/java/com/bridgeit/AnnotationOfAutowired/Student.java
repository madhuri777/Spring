package com.bridgeit.AnnotationOfAutowired;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Student {

	private int studentid;
	private String studentname;
	@Autowired
	@Qualifier("mm")
	private Hostel hostel;
	public int getStudentid() {
		return studentid;
	}
	public void setStudentid(int studentid) {
		this.studentid = studentid;
	}
	public String getStudentname() {
		return studentname;
	}
	public void setStudentname(String studentname) {
		this.studentname = studentname;
	}
	public Hostel getHostel() {
		return hostel;
	}
	
	public void setHostel(Hostel hostel) {
		this.hostel = hostel;
	}
	public void studentInfo() {
		System.out.println("student if is ");
	}
	@Override
	public String toString() {
		return "Student [studentid=" + studentid + ", studentname=" + studentname + ", hostel=" + hostel + "]";
	}
	
}
