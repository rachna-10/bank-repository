package com.bank.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bank.entity.Address;
import com.bank.entity.Customer;
import com.bank.repository.CustomerRepository;

@Service
public class CustomerService {

	@Autowired
	private CustomerRepository repository;

	public Customer saveCustomer(Customer customer) {
		return repository.save(customer);
	}

	public List<Customer> getAllCustomer() {
		return repository.findAll();
	}

	public Customer getCustomerById(long id) {
		return repository.findById(id).orElse(null);
	}

	public String deleteCustomerById(long id) {
		repository.deleteById(id);
		return "Customer Deleted";
	}

}
