package com.ct.user.service.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ct.user.service.entity.User;

public interface UserService {

	//save
	User saveUser(User user);
	
	//getAll users
	List<User> getAllUser();
	
	//get by id
	User getUser(String userId);
	
	
	
	
}
