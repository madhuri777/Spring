package com.bridgeit.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import com.bridgeit.model.UserRegistration;

@Repository
public class UserDaoImp implements UserDaoInterface {

	private JdbcTemplate jdbcTemplate;

	
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	

	@Override
	public void InsertUser(UserRegistration user) {
		String query="Insert into Userspring(name,email,password,bday)  values(?,?,?,?)";
		Object[] inputs = new Object[] {user.getUsername(), user.getEmail(), user.getPassword(), user.getBdydate()};
		jdbcTemplate.update(query,inputs);
		System.out.println("insert recor successfully");
		
	}

	@Override
	public boolean getUserById(String psswrd) {
		String query="Select * from Userspring where password=?";
		Object[] input=new Object[] {psswrd };
		List<UserRegistration> user=jdbcTemplate.query(query,input, new ResultSetExtractor<List<UserRegistration>>(){

			public List<UserRegistration> extractData(ResultSet rs) throws SQLException, DataAccessException {
				List<UserRegistration> userlist=new ArrayList<UserRegistration>();
				while(rs.next()) {
					UserRegistration user=new UserRegistration();
					user.setUsername("name "+rs.getString(1));
					System.out.println(rs.getString(1));
					user.setEmail("email "+rs.getString(2));
					System.out.println(rs.getString(3));
					user.setPassword(rs.getString(3));
					System.out.println("Password "+rs.getString(3));
					userlist.add(user);
				}
				return userlist;
			}
			});
		return user.isEmpty() ? false:true;
		
	}
//	public UserRegistration getUserById(String username,String psswrd) {
//		String query="Select * from Userspring where name=? and password=?";
//		Object[] input=new Object[] {username, psswrd };
//		//UserMapper user=new UserMapper();
//		UserRegistration user=jdbcTemplate.queryForObject(query,input,new RowMapper<UserRegistration>(){
//      public UserRegistration  mapRow(ResultSet rs, int roenum) throws SQLException {
//				
//				UserRegistration user1=new UserRegistration();
//				user1.setUsername(rs.getString(1));
//				user1.setEmail(rs.getString(2));
//				user1.setPassword(rs.getString(3));
//				user1.setBdydate(rs.getString(4));
//				return user1;
//			}
//			
//		});
//		return user;
//	}

	@Override
	public void deletEmpById(int empId) {
		
		
	}

	@Override
	public void updateEmpNameById(String pass, int empId) {
		
		
	}

	@Override
	public List<UserRegistration> getAllUserDetails() {
		
		return null;
	}

	class UserMapper implements RowMapper<UserRegistration>{

		@Override
		public UserRegistration mapRow(ResultSet rs, int rowNum) throws SQLException {
			UserRegistration user1=new UserRegistration();
			user1.setUsername(rs.getString(1));
			user1.setEmail(rs.getString(2));
			user1.setPassword(rs.getString(3));
			user1.setBdydate(rs.getString(4));
			return user1;
		}
		
	}

	@Override
	public boolean getEmailId(String email) {
		String query="Select * from Userspring where email=?";
		Object[] input=new Object[] {email };
		List<UserRegistration> user=jdbcTemplate.query(query,input, new ResultSetExtractor<List<UserRegistration>>(){

			public List<UserRegistration> extractData(ResultSet rs) throws SQLException, DataAccessException {
				List<UserRegistration> userlist=new ArrayList<UserRegistration>();
				while(rs.next()) {
					UserRegistration user=new UserRegistration();
					user.setUsername("name "+rs.getString(1));
					System.out.println(rs.getString(1));
					user.setEmail("email "+rs.getString(2));
					System.out.println(rs.getString(3));
					user.setPassword(rs.getString(3));
					System.out.println("Password "+rs.getString(3));
					userlist.add(user);
				}
				return userlist;
			}
			});
		return user.isEmpty() ? false:true;
		
		//return false;
	}
	
}
