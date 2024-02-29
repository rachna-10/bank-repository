package com.bank.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bank.entity.Address;
import com.bank.entity.Customer;
import com.bank.service.CustomerService;

@RestController
@RequestMapping("/customer")
public class CustomerController {
	
	@Autowired
	private CustomerService service;
	
	@PostMapping("/save")
	public Customer saveCustomer(@RequestBody Customer customer)
	{
		return service.saveCustomer(customer);
		
	}
	@GetMapping("/findAll")
	public List<Customer> getAllCustomer(){
		return service.getAllCustomer();
	}
	@GetMapping("/findById/{id}")
	public Customer getCustomerById(@PathVariable long id) {
		return service.getCustomerById(id);
	}

	@DeleteMapping("/delete/{id}")
	public String deleteCustomerById(@PathVariable long id) {
		return service.deleteCustomerById(id);
	}

}

