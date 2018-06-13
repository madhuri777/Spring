package com.bridgeit.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.bridgeit.model.UserModel;

@Repository
public class UserDAOImp implements IUserDAO {

	@Autowired
    JdbcTemplate jdbcTemplate;
	

	@Override
	public int insertUser(UserModel user) {
		System.out.println("inside dao");
		String query="Insert into UserInfo(username,email,password,bdy)  values(?,?,?,?)";
		Object[] inputs = new Object[] {user.getUsername(), user.getEmail(), user.getPassword(), user.getBdydate()};
		int row=jdbcTemplate.update(query,inputs);
		System.out.println("insert recor successfully");
		return row;
	}

	@Override
	public boolean getUserByEmail(String email) {
		// TODO Auto-generated method stub
		return false;
	}

}
