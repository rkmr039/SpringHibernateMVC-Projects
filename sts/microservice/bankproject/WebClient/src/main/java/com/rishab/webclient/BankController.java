package com.rishab.webclient;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.server.Session;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BankController {

	
	public BankController() {
		// session = new Session();
		System.out.println("************WebClient : Bank Controller************");
	}
	
	// Session session;
	
	@Autowired
	private AccountRepository accountRepository;
	
	@Autowired
	private UserRepository userRepository;
	
	
	@RequestMapping("/")
	public String home() {
		System.out.println("****************View Home Page******************");
		
		return "index";
	}
	
	@RequestMapping("/loginPage")
	public String login(Model model) {
		System.out.println("****************View Login Page******************");
		
		model.addAttribute("user", new User());
		return "login";
	}
	
	@GetMapping(value="/addAccountPage")
	public String addAccountPage() {
		return "addAccount";
	}
	
	@GetMapping(value="/findAccountPage")
	public String findAccountPage() {
		return "searchAccount";
	}
	
	
	@RequestMapping("/findByAccountnum/{accountnum}")
	public String accountDetails(@PathVariable("accountnum") int accountnum, Model model) {
		model.addAttribute("account",accountRepository.findByAccountnum(accountnum));
		return "accountDetails";
	}
	
	@RequestMapping("/login")
	public String validateUser(@ModelAttribute User user, Model model) {
		System.out.println("*************Validating User Details***********");
		System.out.println(user.getUsername() + " : " + user.getPassword() );
		User tempUser = userRepository.validateUser(user);
		System.out.println("BankController : Validate Result : "+ user.toString());
		// if login information is valid
		if(user.getUsername().equals(tempUser.getUsername())) {
			model.addAttribute("userid",+tempUser.getId());
			model.addAttribute("username",tempUser.getUsername());
			 return "dashboard";
		} else {
			return "index";
		}
	//	return new ResponseEntity<User>(tempUser,new HttpHeaders(), HttpStatus.OK);
	}
	
	@RequestMapping("/getAllAccountsByUserid/{userId}")
	public String getAllAccountsByUserid(@PathVariable("userId") int userId, Model model ) {
		System.out.println("****************BankController : Getting All Account for userid : "+ userId+"******************");
		List<Account> accList = accountRepository.getAllAccountsByUserid(userId);
		System.out.println("*********BankController : Number of account fetched : "+ accList.size()+"***********");
		model.addAttribute("accountList",accList);
		return "accountDetails";
	}
	
	
	
	
	@GetMapping(value="/addAccount")
	public String addAccount() {
		
		return "addAccount";
	}
	
}
