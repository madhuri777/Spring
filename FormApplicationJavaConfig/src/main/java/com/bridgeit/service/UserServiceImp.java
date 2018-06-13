package com.bridgeit.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bridgeit.dao.IUserDAO;
import com.bridgeit.model.UserModel;

@Service
public class UserServiceImp implements IUserService {

	@Autowired
	private IUserDAO userDAOImp;

    @Override
	public int insertUser(UserModel user) {
		int row=userDAOImp.insertUser(user);
		return row;
	}
    @Override
	public boolean getUserByEmail(String email) {
		// TODO Auto-generated method stub
		return false;
	}

	
}
