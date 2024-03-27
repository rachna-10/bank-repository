package com.bank.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.bank.entity.Address;
import com.bank.entity.Bank;
import com.bank.service.AddressService;
import com.bank.service.BankService;

@RestController

@RequestMapping("/bank")
public class BankController {

	@Autowired
	private BankService service;

	@PostMapping("/save")
	public Bank saveBank(@RequestBody Bank bank) {
		return service.saveBank(bank);

	}

	@GetMapping("/findAll")
	public List<Bank> getAllBank() {
		return service.getAllBank();
	}

	@GetMapping("/findById/{id}")
	public Bank getBankById(@PathVariable long id) {
		return service.getBankById(id);
	}

	@DeleteMapping("/delete/{id}")
	public String deleteBankById(@PathVariable long id) {
		return service.deleteBankById(id);
	}

	@GetMapping("/checkbalance/{id}")
	public double checkbalance(@PathVariable  long id) {
		return service.checkBalance(id);
	}

	@PostMapping("/depositBalance/{Amount}/{id}")
	public double depositBalance(@PathVariable double Amount, @PathVariable long id) {
		return service.depositBalance(Amount, id);
	}

	@GetMapping("/getCurrentBalance")
	public double getCurrentBalance() {
		return service.getCurrentBalance();
	}

	@PostMapping("/withdrawBalance/{Amount}/{id}")
	public double withdrawBalance(@PathVariable double Amount, @PathVariable long id) {
		return service.withdrawBalance(Amount, id);
	}
	
	@GetMapping("/findAllBanks")
	public List<Bank> findAllBanks(){
		return service.findAllBanks();
	}

//	// BankService service = new BankService();
//
//	@Autowired
//	BankService service;
//
//	@GetMapping("/test")
//	public String getMessage() {
//
//		return "These is test API";
//	}
//
//	@GetMapping("/checkBalance")
//	public String checkBalance() {
//
//		double balance = service.checkBalance();
//
//		return " Your balance is " + balance;
//	}
//
////	@GetMapping("/deposit/{amount}")
////	public double depositAmount(@PathVariable double amount) {
////		double balance = service.depositBalance(amount);
////
////		return balance;
////	}
//
//	@GetMapping("/deposit")
//	public double depositAmount(@RequestParam double amount) {
//		double balance = service.depositBalance(amount);
//
//		return balance;
//	}
//
//	@GetMapping("/withdraw/{amount}")
//	public double withdrawAmount(@PathVariable double amount) {
//		double balance = service.withdrawBalance(amount);
//
//		return balance;
//	}
//

}
