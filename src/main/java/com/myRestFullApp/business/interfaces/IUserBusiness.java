package com.myRestFullApp.business.interfaces;

import java.util.Collection;

import com.myRestFullApp.domain.user.User;

public interface IUserBusiness {
	
	Collection<User> findAll();
	User findById(Long id);
	User save(User user);
	User update(User user);
	void delete(User user);

}
