package com.bank.dao;

import java.util.List;

import com.bank.entity.Bank;

public interface BankInterface {
	
	public Bank saveBank(Bank bank);
		
	public List<Bank> findAllBanks();


}
