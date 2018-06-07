package com.bridgeit.JDBCTemplateExample;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;

public class EmployeeDaoImpl implements EmployeeDAO {

	 private DataSource dataSources;
	private	JdbcTemplate jdbcTemplate;
	
		
	public void setDataSources(DataSource dataSources) {
		this.dataSources = dataSources;
	}


	public void InsertEmployee(Employee emp) {
		String query="Insert into employee(id,name,salary)  values(?,?,?)";
		jdbcTemplate=new JdbcTemplate(dataSources);
		Object[] inputs = new Object[] {emp.getEmpid(), emp.getEmpname(), emp.getSalary()};
		jdbcTemplate.update(query,inputs);
		System.out.println("insert recor successfully");
	}


	public Employee getEmpById(int empId) {
		String query="select * from employee where id=?";
		jdbcTemplate=new JdbcTemplate(dataSources);
		Employee employee=jdbcTemplate.queryForObject(query, new Object[] {empId} ,new RowMapper<Employee>() {

			public Employee  mapRow(ResultSet rs, int roenum) throws SQLException {
				
				Employee employee=new Employee();
				employee.setEmpid(rs.getInt(1));
				employee.setEmpname(rs.getString(2));
				employee.setSalary(rs.getInt(3));
				return employee;
			}
			
		});
		return employee;
	}


	public void deletEmpById(int empId) {
		jdbcTemplate=new JdbcTemplate(dataSources);
		String query="delete from employee where id=?";
		Object[] empid=new Object[] {empId};
		jdbcTemplate.update(query,empid);
		System.out.println("deleted record succesfully");
	}


	public void updateEmpNameById(int salary, int empId) {
		jdbcTemplate=new JdbcTemplate(dataSources);
		String query="Update employee set salary=? where id=?";
		Object[] arg=new Object[] {salary,empId};
		System.out.println("number of rows affeceted "+jdbcTemplate.update(query,arg));
	}


	public List<Employee> getAllEmployeeDetails() {
		String qury="select * from employee";
		jdbcTemplate=new JdbcTemplate(dataSources);
		List<Employee> employe=jdbcTemplate.query(qury, new ResultSetExtractor<List<Employee>>(){

			public List<Employee> extractData(ResultSet rs) throws SQLException, DataAccessException {
				List<Employee> emplist=new ArrayList<Employee>();
				while(rs.next()) {
					Employee emp=new Employee();
					emp.setEmpid(rs.getInt(1));
					System.out.println(rs.getInt(1));
					emp.setEmpname(rs.getString(2));
					System.out.println(rs.getString(2));
					emp.setSalary(rs.getInt(3));
					System.out.println(rs.getInt(3));
					emplist.add(emp);
				}
				return emplist;
			}
			
		});
		return employe;
	}

}
