package com.bank.dao;

import java.util.List;

import com.bank.entity.Address;

public interface AddressInterface {

	public Address saveAddress(Address address);

	public List<Address> getAllAddress();

	public Address getAddressById(long id);

	public String deleteAddressById(long id);

}
