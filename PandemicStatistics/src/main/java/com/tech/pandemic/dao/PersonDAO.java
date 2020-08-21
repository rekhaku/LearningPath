package com.tech.pandemic.dao;

import java.util.List;

import com.tech.pandemic.model.Person;


public interface PersonDAO {

	// update user
	void updatePerson(long id, Person person);

	// fetch User
	Person fetchPerson(long id);

	// fetch all Persons
	List<Person> getAllUsers();

	// inactivate Person
	void inactivatePerson(long id);

	Person getPersonDetailsByUserName(String userName) throws Exception;
	
	void updatePerson( Person person) ;

}
