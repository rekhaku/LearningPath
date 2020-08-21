package com.tech.pandemic.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.tech.pandemic.model.Person;

@Repository
@Transactional
public class PersonDAOImpl implements PersonDAO {

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public void updatePerson(long id, Person person) {
		Session session= sessionFactory.getCurrentSession();
		Person oldRecord = session.byId(Person.class).load(id);
		oldRecord.setFirstName(person.getFirstName());
		oldRecord.setLastName(person.getLastName());
		oldRecord.setAddress(person.getAddress());
		oldRecord.setAge(person.getAge());
		oldRecord.setGender(person.getGender());
		session.flush();
	}

	@Override
	public Person fetchPerson(long id) {
		// TODO Auto-generated method stub
		return null;	
	}

	@Override
	public List<Person> getAllUsers() {
		List<Person> persons = sessionFactory.getCurrentSession().createQuery("from PERSON").list();
		return persons;
	}

	@Override
	public void inactivatePerson(long id) {
		// TODO Auto-generated method stub

	}

	@Override
	public Person getPersonDetailsByUserName(String userName) throws Exception {
		Person person ;
		try {
		Query query = sessionFactory.getCurrentSession().createQuery("from Person where email = :email",Person.class)
				.setParameter("email", userName);
		person = (Person) query.getSingleResult();
		}
		catch (Exception e) {
			throw new Exception("Person data not found");
		}
		return person;
	}
	
	
	@Override
	public void updatePerson( Person person) {
		Session session= sessionFactory.getCurrentSession();
		session.saveOrUpdate(person);
		session.flush();
	}


}
