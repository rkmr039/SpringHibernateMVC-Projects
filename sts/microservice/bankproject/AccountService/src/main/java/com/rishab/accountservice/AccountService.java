package com.rishab.accountservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountService {

	@Autowired
	private AccountRepository accountRepository; 
	
	public AccountService() {
		System.out.println("************************AccountService : AccountService*************************");
	}
	
	
	public Account findAccountByAccountnum(int accountnum) {
		return accountRepository.findByAccountnum(accountnum);		
	}
	
	public List<Account> getAllAccountByUserId(int userId) {
		return accountRepository.findByUserid(userId);
	}
	
	public String addAccount(Account account) {
		account = accountRepository.save(account);
		if(account != null) {
			return "ACCOUNT CREATED SUCCESSFULLY";
		} else {
			return "THERE IS SOME ERROR";
		}
	}
}
