package com.myRestFullApp.business.impl;

import java.util.Collection;

import org.springframework.stereotype.Component;

import com.myRestFullApp.business.interfaces.IUserBusiness;
import com.myRestFullApp.domain.user.User;
import com.myRestFullApp.repository.interfaces.IUserRepository;

@Component
public class UserBusiness implements IUserBusiness{
	
	private IUserRepository repository;
	
	public UserBusiness(IUserRepository userRepository) {
		repository = userRepository;
	}

	@Override
	public Collection<User> findAll() {
		return repository.findAll();
	}

	@Override
	public User findById(Long id) {
		return repository.findOne(id);
	}

	@Override
	public User save(User user) {
		return repository.save(user);
	}

	@Override
	public User update(User user) {
		return repository.save(user);
	}

	@Override
	public void delete(User user) {
		repository.delete(user);
		
	}

}
