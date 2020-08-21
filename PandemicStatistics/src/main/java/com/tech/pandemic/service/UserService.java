package com.tech.pandemic.service;

import java.util.List;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.tech.pandemic.dto.LoginDTO;
import com.tech.pandemic.dto.UserRegistrationDTO;
import com.tech.pandemic.model.User;

public interface UserService extends UserDetailsService{
	
	//register user
	long registerUser(UserRegistrationDTO user) throws Exception ;
	
	//fetch User
	User fetchUser(long id);
	
	//fetch all users
	List<User> listUsers();
	
	//update user
	void updateUser(long id,User user);
	
	//inactivate user
	void inactivateUser(User user);
	
	
	
	public User validateLogin(LoginDTO user) throws UsernameNotFoundException,Exception;
	

}
