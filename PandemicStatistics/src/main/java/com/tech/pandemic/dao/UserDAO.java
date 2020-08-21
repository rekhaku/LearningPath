package com.tech.pandemic.dao;

import java.util.List;

import com.tech.pandemic.model.User;

public interface UserDAO {
	
	//register user
	void registerUser(User user);
	
	//fetch all users
	List<User> listUsers();
	
	//update user
	void updateUser(long id,User user);
	
	//inactivate user
	void inactivateUser(long id);

	//fetch User
	User fetchUser(String userName);

}
