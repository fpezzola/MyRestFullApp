package com.myRestFullApp.service.impl;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.myRestFullApp.business.interfaces.IUserBusiness;
import com.myRestFullApp.domain.user.User;
import com.myRestFullApp.service.interfaces.IUserService;
@Service
@Transactional
public class UserService implements IUserService{
	
	@Autowired
	private IUserBusiness business;

	@Override
	public Collection<User> findAll() {
		return business.findAll();
	}

	@Override
	public User findById(Long id) {
		return business.findById(id);
	}

	@Override
	public User save(User user) {
		return business.save(user);
	}

	@Override
	public User update(User user) {
		return business.update(user);
	}

	@Override
	public void delete(User user) {
		business.delete(user);
	}

}
