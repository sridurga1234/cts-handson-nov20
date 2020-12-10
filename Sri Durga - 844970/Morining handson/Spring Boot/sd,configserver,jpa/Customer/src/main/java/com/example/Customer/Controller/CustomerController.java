package com.example.Customer.Controller;

	import java.time.LocalDate;
	import java.util.List;

	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.stereotype.Controller;
	import org.springframework.web.bind.annotation.DeleteMapping;
	import org.springframework.web.bind.annotation.GetMapping;
	import org.springframework.web.bind.annotation.PathVariable;
	import org.springframework.web.bind.annotation.PostMapping;
	import org.springframework.web.bind.annotation.PutMapping;
	import org.springframework.web.bind.annotation.RequestBody;
	import org.springframework.web.bind.annotation.RequestMapping;
	import org.springframework.web.bind.annotation.RestController;

import com.example.Customer.Dao.Customer;
import com.example.Customer.Service.CustomerService;

	
	@Controller
	@RequestMapping("/customer")
	@RestController
	public class CustomerController {
		@Autowired
		private CustomerService customerService;
		
		@PostMapping
		public Customer createCustomerAPI(@RequestBody Customer customer) {
			Customer createdCustomer = customerService.addCustomer(customer);
			return createdCustomer;
		}
		@GetMapping
		public List<Customer> getAllCustomers(){
			return customerService.fetchCustomers();
		}
		@GetMapping("{customerId}")
		public Customer getCustomer(@PathVariable("customerId") int id) {
			return customerService.fetcCustomer(id);
		}
		@PutMapping("{customerId}/{dob}")
		public Customer updateCustomerDobAPI(@PathVariable("customerId") int id,@PathVariable("dob") String stringdob) {
			return customerService.updateCustomer(id, LocalDate.parse(stringdob));
		}
		@DeleteMapping("{customerId}")
		public void deleteCustomerbyId(@PathVariable("customerId") int id) {
			customerService.deleteCustomer(id);
		}
	}

}
