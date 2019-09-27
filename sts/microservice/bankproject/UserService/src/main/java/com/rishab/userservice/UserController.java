package com.rishab.userservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserService userService;
	
	
	@GetMapping("/login/{username}/{password}")
	public ResponseEntity<User> userAuthentication(@PathVariable("username") String username,@PathVariable("password") String password) {
		System.out.println("************** Controller UserLogin ************* " );
		User tempUser =  userService.getByUsernameAndPassword(username, password);
		return new ResponseEntity<User>(tempUser,new  HttpHeaders(),HttpStatus.OK);
	}
	
	
	@GetMapping("/findByUsername/{username}")
	public ResponseEntity<User> getUdserByUsername(@PathVariable("username") String username) {
		System.out.println("Controller Username : " + username);
		User user = userService.getUserByUsername(username);
		System.out.println(user.toString());
		return new ResponseEntity<User>(user,new HttpHeaders(),HttpStatus.OK);
	}
}
