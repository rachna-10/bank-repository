package com.bank.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bank.entity.Bank;



public interface BankRepository extends JpaRepository<Bank, Long> {


}
