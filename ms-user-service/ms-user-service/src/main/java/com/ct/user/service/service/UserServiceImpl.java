package com.ct.user.service.service;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ct.user.service.entity.User;
import com.ct.user.service.exception.ResourceNotFoundException;
import com.ct.user.service.repository.UserRepository;
@Service
public class UserServiceImpl implements UserService{

	
	@Autowired
	private UserRepository userRepository;
	
	@Override
	public User saveUser(User user) {
		//set random unique user id
		String randomUserId= UUID.randomUUID().toString();
		user.setUserId(randomUserId);
		
		return userRepository.save(user);
	}

	@Override
	public List<User> getAllUser() {
		// TODO Auto-generated method stub
		return userRepository.findAll();
	}

	@Override
	public User getUser(String userId) {
		// TODO Auto-generated method stub
		return userRepository.findById(userId).orElseThrow(()-> new ResourceNotFoundException("User not found on server with given id: "+userId));
	}

}
