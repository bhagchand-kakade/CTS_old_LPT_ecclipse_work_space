package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Customer;
import com.example.demo.repository.CustomerRepository;

@RestController
@RequestMapping
public class CustometController {

	@Autowired
	CustomerRepository customerRepository;

	// Post method to add new customer in database

	@PostMapping("/addCustomer") // http://localhost:8080/addCustomer
	public String addCustomer(@RequestBody Customer customer) {
		customerRepository.save(customer);
		return "Customer added successfully...!!!";
	}

	/*
	 * this is for reference
	 * 
	 * @GetMapping("/hello") ResponseEntity<String> hello() { return
	 * ResponseEntity.ok("Hello World!"); }
	 */

	// Get method view customer present in database

	@GetMapping("/Customers") // http://localhost:8080/Customers
	public ResponseEntity<List<Customer>> getAllCustomers() {
		List<Customer> customerList = new ArrayList<>();
		customerRepository.findAll().forEach(customerList::add);
		return new ResponseEntity<List<Customer>>(customerList, HttpStatus.OK);
	}
	

	// Get method view customer present in database By ID
	
	@GetMapping("/Customer/{ID}")   // http://localhost:8080/Customer/ID
	public ResponseEntity <Customer> getCustomerById(@PathVariable long ID){
		Optional<Customer> customerbyId=customerRepository.findById(ID);
		if(customerbyId.isPresent()) {
			return new ResponseEntity<Customer>(customerbyId.get(), HttpStatus.FOUND);
		}else {
			return new ResponseEntity<Customer>(HttpStatus.NOT_FOUND);
		}
	}

	// Put method to update the customer already exist in database
	
	@PutMapping("/updateCustomer/{ID}") // http://localhost:8080/updateCustmore/{ID}
	public String updateCustomerById(@PathVariable long ID, @RequestBody Customer customer) {
		Optional<Customer> cust = customerRepository.findById(ID);
		if (cust.isPresent()) {
			Customer custExist = cust.get();
			custExist.setAge(customer.getAge());
			custExist.setAddress(customer.getAddress());
			custExist.setCustomer_name(customer.getCustomer_name());
			customerRepository.save(custExist);
			return "Customer details against " + ID + " updated successfully";
		} else {
			return "Customer details for " + ID + " does not exist";
		}
	}

	// Delete method to delete the customer by ID from database
	
	@DeleteMapping("/deleteCustomer/{ID}") // http://localhost:8080/deleteCustomer/{ID}
	public String deleteCustomerById(@PathVariable long ID) {
		Optional<Customer> customer = customerRepository.findById(ID);
		if(customer.isPresent()){
			customerRepository.deleteById(ID);
			return "Customer of " + ID + " deleted.";
		}else
		{
			return "Customer details of " + ID + " does not exist. ";
		}
				
	}

	//Delete method to delete all Customers
	
	@DeleteMapping("/deleteCustomers") // http://localhost:8080/deleteCustomers
	public String deleteCustomers() {
		customerRepository.deleteAll();
		return "All Customers from database are deleted.";
	}
}
