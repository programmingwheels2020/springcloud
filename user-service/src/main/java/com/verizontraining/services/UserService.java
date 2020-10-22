package com.verizontraining.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.verizontraining.models.User;
import com.verizontraining.repositories.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepository;

	public List<User> getUsersByEmailId(String email) {
		return userRepository.findByEmail(email);
	}
	
	public void saveUser(User user) {
		userRepository.save(user);
	}
}
