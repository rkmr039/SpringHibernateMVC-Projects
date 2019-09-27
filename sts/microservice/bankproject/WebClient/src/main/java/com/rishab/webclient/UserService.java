package com.rishab.webclient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;
	
	/*
	 * public User getUserByUsername(String username) { User user =
	 * userRepository.getUserByUsername(username); return user; }
	 */
	public User validateUser(User user) {
		System.out.println("**************UserService : Validating User****************");
		System.out.println(user.getUsername() + " : " + user.getPassword() );
		user = userRepository.validateUser(user);
		return user;
	}
}
