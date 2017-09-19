package com.portal.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="Address")
public class Address {

	@Column(name="Street_Address", nullable=false)
	private String streetAddress;
	@Column(name="House_Number", nullable=true)
	private String houseNumber;
	@Column(name="City", nullable=false)
	private String city;
	@Column(name="State",nullable=false)
	private String state;
	@Column(name="Country", nullable=false)
	private String country;
	@Column(name="ZipCode", nullable=false)
	private int zipCode;
	public String getStreetAddress() {
		return streetAddress;
	}
	public void setStreetAddress(String streetAddress) {
		this.streetAddress = streetAddress;
	}
	public String getHouseNumber() {
		return houseNumber;
	}
	public void setHouseNumber(String houseNumber) {
		this.houseNumber = houseNumber;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public int getZipCode() {
		return zipCode;
	}
	public void setZipCode(int zipCode) {
		this.zipCode = zipCode;
	}
}
