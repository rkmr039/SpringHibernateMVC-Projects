package com.faultdemo;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService(name="HelloWorld", serviceName="HelloWorldService")
public class HelloWorld {

	@WebMethod
	public String sayHello(String message) throws MissingName {
		if(message == null || message.isEmpty()) {
			throw new MissingName(); 
		}
		return "here is the message : "+ message;
	}
	
}
  