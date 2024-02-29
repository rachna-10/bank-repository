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
import com.bank.entity.Bank;
import com.bank.service.AddressService;

@RestController

@RequestMapping("/address")
public class AddressController {

	@Autowired
	private AddressService service;

	@PostMapping("/save")
	public Address saveAddress(@RequestBody Address address) {
		return service.saveAddress(address);

	}

	@GetMapping("/findAll")
	public List<Address> getAllAddress() {
		return service.getAllAddress();
	}

	@GetMapping("/findById/{id}")
	public Address getAddressById(@PathVariable long id) {
		return service.getAddressById(id);
	}

	@DeleteMapping("/delete/{id}")
	public String deleteAddressById(@PathVariable long id) {
		return service.deleteAddressById(id);
	}

}
