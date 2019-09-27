package com.rishab.webclient;

import java.util.List;

public interface AccountRepository {

	public Account findByAccountnum(int accountnum);
	
	public Account save(Account account);
	
	public List<Account> getAllAccountsByUserid(int userId);
}
