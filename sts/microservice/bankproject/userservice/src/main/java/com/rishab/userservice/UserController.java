package com.rishab.userservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserService userService;
	@GetMapping("/findByUsername")
	public ResponseEntity<User> getUdserByUsername(@RequestParam String username) {
		System.out.println("Controller Username : " + username);
		User user = userService.getUserByUsername(username);
		return new ResponseEntity<User>(user,new HttpHeaders(),HttpStatus.OK);
	}
}
