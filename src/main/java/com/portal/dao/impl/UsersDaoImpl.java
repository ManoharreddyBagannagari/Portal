package com.portal.dao.impl;

import org.springframework.stereotype.Repository;

import com.portal.dao.AbstractDao;
import com.portal.dao.UsersDao;
import com.portal.model.Users;

@Repository("userDao")
public class UsersDaoImpl extends AbstractDao<Integer, Users>implements UsersDao {

	@Override
	public void createUser(Users user) {
		persist(user);		
	}
}
