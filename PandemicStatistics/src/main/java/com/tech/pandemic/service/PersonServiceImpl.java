package com.tech.pandemic.service;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tech.pandemic.dao.AddressDAO;
import com.tech.pandemic.dao.PersonDAO;
import com.tech.pandemic.dao.UserDAOImpl;
import com.tech.pandemic.model.Person;

@Service
public class PersonServiceImpl implements PersonService {

	private static final Logger logger = LogManager.getLogger(UserDAOImpl.class);

	@Autowired
	private PersonDAO personDAO;
	
	@Autowired
	private AddressDAO addressDAO;

	@Override
	public void updatePerson(long id, Person person) {
		personDAO.updatePerson(id, person);
	}

	@Override
	public Person fetchPerson(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void inactivatePerson(long id) {
		// TODO Auto-generated method stub

	}

	@Override
	public Person getPersonDetailsByUserName(String userName) throws Exception {
		try {
			return personDAO.getPersonDetailsByUserName(userName);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			throw e;
		}
	}

	@Override
	public List<Person> getAllUsers() {
		// TODO Auto-generated method stub
		return personDAO.getAllUsers();
	}

	@Override
	public void updatePerson(Person person) {		
		personDAO.updatePerson(person);
		
	}


}
