package com.example.Customer.Service;



	import java.time.LocalDate;
	import java.util.ArrayList;
	import java.util.List;
	import java.util.Optional;

	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.stereotype.Service;

	import com.example.Customer.Dao.Customer;
import com.example.Customer.Dao.CustomerRepository;

	
	@Service
	public class CustomerService  implements CustomerRepository{

		@Autowired
		CustomerRepository dao;
		public Customer addCustomer(Customer customer) {
			//customer.setCustomerID(new Double(Math.random()*1000).intValue());
			Customer createdCustomer = dao.save(customer);
			return createdCustomer;
		}
		public List<Customer> fetchCustomers(){
			List<Customer> customers = dao.findAll();
			return customers;
		}
		public Customer fetcCustomer(int id) {
			Optional<Customer> customer = dao.findById(id);
			if(customer!=null)
				return customer.get();
			else
				return null;
		}
		public Customer updateCustomer(int id,LocalDate dob) {
			Customer customer = fetcCustomer(id);
			if(customer!=null) {
				customer.setDob(dob);
				return dao.save(customer);
			}
			else
				return null;
			}
		public void deleteCustomer(int id) {
			Customer customer = fetcCustomer(id);
			if(customer!=null)
				dao.deleteById(id);
		}

}
