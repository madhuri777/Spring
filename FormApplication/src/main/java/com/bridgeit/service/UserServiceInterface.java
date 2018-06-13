package com.bridgeit.service;

import java.util.List;

import com.bridgeit.model.UserRegistration;

public interface UserServiceInterface {

	 void InsertUser(UserRegistration user);
	 boolean getUserById(String pass);
	 void deletEmpById(int empId);
	 void updateEmpNameById(String pass,int empId);
	 List<UserRegistration> getAllUserDetails();
	 boolean getEmailId(String email);
}
