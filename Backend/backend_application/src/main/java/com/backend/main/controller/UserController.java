package com.backend.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.backend.main.model.User;
import com.backend.main.service.UserService;
@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api")
public class UserController {
	
	@Autowired
	private UserService userservice;
	
	@GetMapping("/getallusers")
	public List<User> getAllUsers(){
		return userservice.getAllUsers();
	}
	
	@PostMapping("/adduser")
	public User createUser(@RequestBody User usr) {
		return userservice.createUser(usr);
	}

}
