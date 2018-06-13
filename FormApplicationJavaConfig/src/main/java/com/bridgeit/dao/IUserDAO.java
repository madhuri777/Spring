package com.bridgeit.dao;

import com.bridgeit.model.UserModel;

public interface IUserDAO {

	int insertUser(UserModel user);
	boolean getUserByEmail(String email);
}
