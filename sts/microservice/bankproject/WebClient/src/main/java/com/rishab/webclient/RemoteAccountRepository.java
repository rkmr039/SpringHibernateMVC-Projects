package com.rishab.webclient;




import java.util.ArrayList;
import java.util.List;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.JSONValue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.client.RestTemplate;

public class RemoteAccountRepository implements AccountRepository {

	@Autowired
	protected RestTemplate restTemplate;
	
	protected String serviceUrl;
	
	public RemoteAccountRepository(String serviceUrl) {
		this.serviceUrl = serviceUrl.startsWith("http") ? serviceUrl : "http://"+serviceUrl;	
	}
	
	@Override
	public Account findByAccountnum(int accountnum) {
		return restTemplate.getForObject(serviceUrl+"/account/findByAccountnum/{accountnum}", Account.class,accountnum);
	}
	
	@Override
	public List<Account> getAllAccountsByUserid(int userId) {
		System.out.println("*********RemoteAccountRepository : Getting All Accounts for User Id : "+userId+"***********");
		String url = serviceUrl+"/account/getAllByUserid/"+userId;
		System.out.println(url);
		Account[] accArray = restTemplate.getForObject(url, Account[].class);
		System.out.println(accArray.length);
		/*
		 * Object object = JSONValue.parse(accountListJson); JSONArray jsonArray =
		 * (JSONArray)object; for (Object object2 : jsonArray) {
		 * System.out.println(object2); }
		 */
		List<Account> accList = new ArrayList<Account>();
		for (Account account : accArray) {
			accList.add(account);
		}
		
		System.out.println("*********Number of account fetched : "+ accList.size()+"***********");
		
		return accList;
	}

	

	@Override
	public Account save(Account account) {
		return restTemplate.getForObject(serviceUrl+"/account/addAccount/", Account.class,account);
	}
}
