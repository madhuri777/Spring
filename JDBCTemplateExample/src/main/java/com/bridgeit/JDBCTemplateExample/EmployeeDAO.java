package com.bridgeit.JDBCTemplateExample;

import java.util.List;

public interface EmployeeDAO {

	public void InsertEmployee(Employee emp);
	public Employee getEmpById(int empId);
	public void deletEmpById(int empId);
	public void updateEmpNameById(int salary,int empId);
	public List<Employee> getAllEmployeeDetails();
	
}
