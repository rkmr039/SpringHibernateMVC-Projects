package com.rishab.accountservice;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface AccountRepository extends CrudRepository<Account, Integer> {

	public Account findByAccountnum(int accountnum);
	
	public List<Account> findByUserid(int userId);
	 
}
