package com.bank.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "address")

public class Address {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	@Column(name = "flat_number")
	private int flatNumber;
	@Column(name = "land_mark")
	private String landMark;
	@Column(name = "city")
	private String city;
	@Column(name = "district")
	private String district;
	@Column(name = "state")
	private String state;
	@Column(name = "pin_number")
	private int pinNumber;
	@Column(name = "country")
	private String country;
	@Column(name = "is_enable")
	private int isEnable;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public int getFlatNumber() {
		return flatNumber;
	}
	public void setFlatNumber(int flatNumber) {
		this.flatNumber = flatNumber;
	}
	public String getLandMark() {
		return landMark;
	}
	public void setLandMark(String landMark) {
		this.landMark = landMark;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getDistrict() {
		return district;
	}
	public void setDistrict(String district) {
		this.district = district;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public int getPinNumber() {
		return pinNumber;
	}
	public void setPinNumber(int pinNumber) {
		this.pinNumber = pinNumber;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public int getIsEnable() {
		return isEnable;
	}
	public void setIsEnable(int isEnable) {
		this.isEnable = isEnable;
	}
	@Override
	public String toString() {
		return "Address [id=" + id + ", flatNumber=" + flatNumber + ", landMark=" + landMark + ", city=" + city
				+ ", district=" + district + ", state=" + state + ", pinNumber=" + pinNumber + ", country=" + country
				+ ", isEnable=" + isEnable + "]";
	}
	
	

}
