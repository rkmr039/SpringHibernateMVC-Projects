package com.rishab.data;

import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
@RequestMapping("/address")
public class AddressController {

	@Autowired
	private AddressRepository addressRepository;
	@Autowired
	CustomerRepository customerRepository;

	@RequestMapping("/")
	public ModelAndView getEmployee() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("SetProfile");
		return mv;
	}

	@RequestMapping("/saveDetails")
	public void user(Address address) {
		String name = address.getName();
		addressRepository.save(address);

		int addr_id = addressRepository.getAddressId();
		/*
		 * System.out.println("Addr_ID : "+addr_id); System.out.println("NAME : "+name);
		 */
		saveCustomer(name, addr_id);

	}

	public ModelAndView saveCustomer(String name, int addr_id) {
		Customer customer = new Customer();
		customer.setName(name);
		customer.setAdd_id(addr_id);
		customer.setCredit_score(8);
		customerRepository.save(customer);
		// displayDashboard();
		ModelAndView mv = new ModelAndView();
		mv.setViewName("SetProfile");
		return mv;
	}
	

}
