package com.myRestFullApp.rest;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.myRestFullApp.domain.user.User;
import com.myRestFullApp.service.interfaces.IUserService;

@RestController
@RequestMapping("/usuarios")
public class UserResource {
	
	@Autowired
	private IUserService userService;
	
	@RequestMapping(method = RequestMethod.GET)
	@ResponseBody
	public Collection<User> get(){
		return userService.findAll();
	}

}
