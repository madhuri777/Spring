package com.bridgeit.dao;

import java.util.List;

import com.bridgeit.model.UserRegistration;

public interface UserDaoInterface {

	 void InsertUser(UserRegistration user);
	 boolean getUserById(String pass);
	 void deletEmpById(int empId);
	 void updateEmpNameById(String pass,int empId);
	 List<UserRegistration> getAllUserDetails();
	 boolean getEmailId(String email);
}
