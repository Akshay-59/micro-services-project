package com.ct.user.service.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ct.user.service.entity.User;
import com.ct.user.service.service.UserService;

@RestController
@RequestMapping("/users")
public class userController {

	@Autowired
	private UserService userService;

	// save
	@PostMapping
	public ResponseEntity<User> saveUser(@RequestBody User user) {
		User user1 = userService.saveUser(user);
		return ResponseEntity.status(HttpStatus.CREATED).body(user1);
	}
	// findAll

	@GetMapping("/{userId}")
	public ResponseEntity<User> getUserById(@PathVariable String userId) {
		User user11 = userService.getUser(userId);
		return ResponseEntity.ok(user11);
	}
	
	@GetMapping
	public ResponseEntity<List<User>> getAllUsers(){
		List<User> allUsers= userService.getAllUser();
		return ResponseEntity.ok(allUsers);
	}

}
