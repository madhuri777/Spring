package com.bridgeit.service;

import com.bridgeit.model.UserModel;

public interface IUserService {

	int insertUser(UserModel user);
	boolean getUserByEmail(String email);
	
}
