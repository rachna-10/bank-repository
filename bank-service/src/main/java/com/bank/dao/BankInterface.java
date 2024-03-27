package com.bank.dao;

import java.util.List;

import com.bank.entity.Bank;

public interface BankInterface {
	
	public Bank saveBank(Bank bank);
		
	public List<Bank> findAllBanks();
	
	public Bank getBankById(long id);
	
	public String deleteBankById(long id);
	
	public double checkBalance(long id);
	
	public double depositBalance(double amount,long id);
	
	public double getCurrentBalance();
	
	public double withdrawBalance(double amount,long id);
	
	  

}
