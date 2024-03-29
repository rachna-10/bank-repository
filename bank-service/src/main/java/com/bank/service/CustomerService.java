package com.bank.service;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bank.dao.CustomerInterface;
import com.bank.entity.Address;
import com.bank.entity.Customer;
import com.bank.repository.CustomerRepository;

@Service
public class CustomerService implements CustomerInterface {

	@Autowired
	private CustomerRepository repository;

	@Autowired
	AddressService service;

	Address addressId;

	@Override
	public Customer saveCustomer(Customer customer) {

		addressId=service.saveAddress(customer.getAddress());
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
