package com.tech.pandemic.dao;

import com.tech.pandemic.model.Address;

public interface AddressDAO {

	void updateAddress(Address address);
	
	Address getAddress(long houseNo);
}
