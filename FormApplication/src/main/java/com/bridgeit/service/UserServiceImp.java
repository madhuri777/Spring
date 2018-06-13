package com.bridgeit.service;

import java.sql.SQLException;
import java.util.List;

import org.springframework.stereotype.Service;

import com.bridgeit.dao.UserDaoInterface;
import com.bridgeit.model.UserRegistration;

@Service
public class UserServiceImp implements UserServiceInterface{

	private UserDaoInterface userdao;
	
	public void setUserdao(UserDaoInterface userdao) {
		this.userdao = userdao;
	}

	@Override
	public void InsertUser(UserRegistration user) {
		userdao.InsertUser(user);
		
	}

	@Override
	public boolean getUserById(String passwd) {
		System.out.println("this is service layer "+userdao.getUserById(passwd));
		boolean flag=userdao.getUserById(passwd);
		System.out.println("value of flag in service "+flag);
		return flag; 
	}

	@Override
	public void deletEmpById(int empId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateEmpNameById(String pass, int empId) {
		
	}

	@Override
	public List<UserRegistration> getAllUserDetails() {
		
		return null;
	}

	@Override
	public boolean getEmailId(String email) {
		
	return userdao.getEmailId(email);
	}

}
