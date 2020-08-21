package com.tech.pandemic.dao;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.tech.pandemic.model.Address;


@Repository
@Transactional
public class AddressDAOImpl implements AddressDAO {
	
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public void updateAddress(Address address) {
		Session session= sessionFactory.getCurrentSession();
		session.saveOrUpdate(address);
		session.flush();
	}

	@Override
	public Address getAddress(long houseNo) {
		// TODO Auto-generated method stub
		return null;
	}

}
