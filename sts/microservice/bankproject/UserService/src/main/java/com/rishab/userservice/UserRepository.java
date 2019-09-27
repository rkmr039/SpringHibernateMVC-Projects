package com.rishab.userservice;

import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Integer> {

	public User getUserByUsername(String username);
		
	public User getByUsernameAndPassword(String username, String password);
}
