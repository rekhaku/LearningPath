package com.tech.pandemic.dao;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.tech.pandemic.controller.HomeController;
import com.tech.pandemic.model.User;

@Repository
public class UserDAOImpl implements UserDAO {
	
	private static final Logger logger = LogManager.getLogger(UserDAOImpl.class);
	
	
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public void registerUser(User user) {
		sessionFactory.getCurrentSession().save(user);
		
	}

	
	
	@Override
	public List<User> listUsers() {
		// TODO Auto-generated method stub
		List <User> users = sessionFactory.getCurrentSession().createQuery("from User").list();
		return users;
	}

	@Override
	public void updateUser(long id, User user) {
		// TODO Auto-generated method stub

	}

	@Override
	public void inactivateUser(long id) {
		// TODO Auto-generated method stub

	}


	@Override
	public User fetchUser(String userName) {
		User user = (User) sessionFactory.getCurrentSession().get(userName,1);//  (userName);
		return user;
	}


}
