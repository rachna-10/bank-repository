package com.bank.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bank.dao.AddressInterface;
import com.bank.entity.Address;
import com.bank.entity.Bank;
import com.bank.repository.AddressRepository;

@Service
public class AddressService implements AddressInterface {

	@Autowired
	private AddressRepository repository;

	@Override
	public Address saveAddress(Address address) {
		return repository.save(address);
	}

	@Override
	public List<Address> getAllAddress() {
		return repository.findAll();
	}

	@Override
	public Address getAddressById(long id) {
		return repository.findById(id).orElse(null);
	}

	@Override
	public String deleteAddressById(long id) {
		repository.deleteById(id);
		return "Address Deleted";
	}

}
