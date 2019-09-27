package com.rishab.userservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;
	
	public User getUserByUsername(String username) {
		User user = userRepository.getUserByUsername(username);
		return user;
	}
	
	public User getByUsernameAndPassword(String username, String password) {
		User user = userRepository.getByUsernameAndPassword(username, password);
		return user;
	}
}
