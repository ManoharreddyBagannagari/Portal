package com.portal.services.impl;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.portal.dao.UsersDao;
import com.portal.model.Address;
import com.portal.model.Users;
import com.portal.services.UsersService;

@Service("userService")
@Transactional
public class UserServiceImpl implements UsersService {
	
	@Autowired
	private UsersDao userDao;

	@Override
	public void saveUser(Users users) {
		Address address = new Address();
		
		address.setStreetAddress("2902 W Sweetwater Ave");
		address.setHouseNumber("2215");
		address.setCity("Phoenix");
		address.setCountry("USA");
		address.setZipCode(85029);
		users.setAddress(address);
		userDao.createUser(users);
	}
}
