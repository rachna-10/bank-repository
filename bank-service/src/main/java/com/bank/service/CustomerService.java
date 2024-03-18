package com.bank.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bank.dao.CustomerInterface;
import com.bank.dao.CustomerRepository;
import com.bank.entity.Customer;

@Service
public class CustomerService implements CustomerInterface {

	@Autowired
	private CustomerRepository repository;

	@Override
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
