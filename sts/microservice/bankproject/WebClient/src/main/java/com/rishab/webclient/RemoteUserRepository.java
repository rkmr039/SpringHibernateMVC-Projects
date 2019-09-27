package com.rishab.webclient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.client.RestTemplate;

public class RemoteUserRepository implements UserRepository{
	
	@Autowired
	protected RestTemplate restTemplate;
	
	protected String serviceUrl;
	
	public RemoteUserRepository(String serviceUrl) {
		this.serviceUrl = serviceUrl.startsWith("http") ? serviceUrl : "http://"+serviceUrl;	
	}

	/*
	 * @Override public User getUserByUsername(String username) { return
	 * restTemplate.getForObject(serviceUrl+"findByUsername/{username}",
	 * User.class,username); }
	 */

	@Override
	public User validateUser(User user) {
		System.out.println("**************RemoteUserRepository : Validating User**************");
		System.out.println(user.getUsername() + " : " + user.getPassword());
		String url = serviceUrl+"/user/login/"+user.getUsername()+"/"+user.getPassword();
		System.out.println(url);
		user =  restTemplate.getForObject(url,User.class);
		// System.out.println("Result : "+result);
		return user;
	}

}
