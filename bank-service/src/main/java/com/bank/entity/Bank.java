package com.bank.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "bank")
public class Bank {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	@Column(name = "bank_name")
	private String bankName;
	@Column(name = "ifsc_number")
	private String ifscNumber;
	@Column(name = "total_number_Customer")
	private int totalNumberofCustomer;
	@Column(name = "bank_balance")
	private double bankBalance;
	@Column(name = "is_enable")
	private int isEnable;
	@OneToOne
	private Address address;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public String getIfscNumber() {
		return ifscNumber;
	}

	public void setIfscNumber(String ifscNumber) {
		this.ifscNumber = ifscNumber;
	}

	public int getTotalNumberofCustomer() {
		return totalNumberofCustomer;
	}

	public void setTotalNumberofCustomer(int totalNumberofCustomer) {
		this.totalNumberofCustomer = totalNumberofCustomer;
	}

	public double getBankBalance() {
		return bankBalance;
	}

	public void setBankBalance(double bankBalance) {
		this.bankBalance = bankBalance;
	}

	public int getIsEnable() {
		return isEnable;
	}

	public void setIsEnable(int isEnable) {
		this.isEnable = isEnable;
	}

	@Override
	public String toString() {
		return "Bank [id=" + id + ", bankName=" + bankName + ", ifscNumber=" + ifscNumber + ", totalNumberofCustomer="
				+ totalNumberofCustomer + ", bankBalance=" + bankBalance + ", isEnable=" + isEnable + "]";
	}

}
