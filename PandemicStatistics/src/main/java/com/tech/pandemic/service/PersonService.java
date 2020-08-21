package com.tech.pandemic.service;

import java.util.List;

import com.tech.pandemic.model.Person;


public interface PersonService {

	// update user
	void updatePerson(long id, Person person);

	// fetch User
	Person fetchPerson(long id);

	// fetch all Persons
	List<Person> getAllUsers();

	// inactivate Person
	void inactivatePerson(long id);

	Person getPersonDetailsByUserName(String userName) throws Exception;

	void updatePerson(Person person);
	
//	void saveOrUpdatePerson(String userName,Person person);
	
	

}
