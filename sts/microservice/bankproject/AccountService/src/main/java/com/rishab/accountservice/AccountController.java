package com.rishab.accountservice;
import java.util.List;

import org.json.simple.JSONObject;
import org.json.simple.JSONValue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RequestMapping("/account")
public class AccountController {

	@Autowired
	private AccountService accountService; 
	
	public AccountController() {
		System.out.println("************Account Service : Account Controller************");
	}
	
	@GetMapping("/getAllByUserid/{userId}")
	public ResponseEntity<Account[]> getAllAccountByUserId(@PathVariable("userId") int userId) {
		System.out.println("************Account Service : Account Controller : GetAllAccountByUserId("+userId+")************");
		List<Account> accounts = accountService.getAllAccountByUserId(userId);
		
		Account[] accArray = new Account[accounts.size()];
		int i =0;
		for (Account account : accounts) {
			accArray[i] = account;
			i++;
		} 
		return new ResponseEntity<Account[]>(accArray,new HttpHeaders(),HttpStatus.OK);
	}
	
	@GetMapping(value="/findByAccountnum/{accountnum}")
	public ResponseEntity<Account> getAccountByAccountnum(@PathVariable("accountnum") int accountnum) {
		Account account = null;
		System.out.println("Searching for Accountnum : "+accountnum);
		account = (Account) accountService.findAccountByAccountnum(accountnum);
		System.out.println("Account Found : "+ account.toString());
		return new ResponseEntity<Account>(account,new HttpHeaders(),HttpStatus.OK);
	}
	
	
	
	
	@PostMapping(value="/addAccount")
	public @ResponseBody String addAccount(@RequestBody String accountJsonText) {
		  Object object = JSONValue.parse(accountJsonText);
		  JSONObject jsonObject = (JSONObject)object;
		 //  int accountnum = Integer.parseInt((String)jsonObject.get("accountnum"));
		  double amount = (double) jsonObject.get("amount");
		  char accounttype = ((String)jsonObject.get("accounttype")).charAt(0);
		  int userid = Integer.parseInt((String)jsonObject.get("userid"));
		  
		  Account account = new Account();
		 // account.setAccountnum(accountnum);
		  account.setAccounttype(accounttype);
		  account.setAmount(amount);
		  account.setUserid(userid);
		  
		  String result = accountService.addAccount(account);
		  return result;
	}
	 
	
}
