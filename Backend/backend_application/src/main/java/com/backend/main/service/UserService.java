package com.backend.main.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.backend.main.exception.DataNotFound;
import com.backend.main.model.User;
import com.backend.main.repo.UserRepo;

@Service
public class UserService {

	@Autowired
	private UserRepo userrepo;
	
	public List<User> getAllUsers(){
		return userrepo.findAll();
	}
	
	public User getUserbyId(Integer id) { 
		return userrepo.findById(id).orElseThrow(()->new DataNotFound("User with id = " +id+ " is not found"));
	}

	public User createUser(User usr) {
	
		return userrepo.save(usr);
	}
	
}
