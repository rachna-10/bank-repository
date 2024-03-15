package com.bank.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bank.dao.BankInterface;
import com.bank.entity.Address;
import com.bank.entity.Bank;
import com.bank.repository.BankRepository;

@Service
public class BankService implements BankInterface {

	@Autowired
	private BankRepository repository;

	@Override
	public Bank saveBank(Bank bank) {
		return repository.save(bank);
	}

	public List<Bank> getAllBank() {
		return repository.findAll();
	}

	public Bank getBankById(long id) {
		return repository.findById(id).orElse(null);
	}

	public String deleteBankById(long id) {
		repository.deleteById(id);
		return "Bank Deleted";
	}

	public double checkBalance() {

		double balance = 5000;

		return balance;

	}

	public double depositBalance(double amount) {
		double balance = getCurrentBalance();
		balance = balance + amount;
		System.out.println("Deposited balance is:" + balance);
		return balance;
	}

	public double getCurrentBalance() {
		double balance = 5000;

		return balance;
	}

	public double withdrawBalance(double amount) {
		double balance = getCurrentBalance();
		balance = balance - amount;
		System.out.println("Withdraw balance is:" + balance);
		return balance;
	}

	@Override
	public List<Bank> findAllBanks() {
		return repository.findAll();
	}


}
