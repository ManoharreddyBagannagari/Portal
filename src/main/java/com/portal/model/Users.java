package com.portal.model;

import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;
import org.springframework.format.annotation.DateTimeFormat;

import com.portal.RolesEnum;

@Entity
@Table(name="Users")
public class Users {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Size(min=3, max=50)
	@Column(name="username", nullable= false)
	private String username;
	
	@NotNull
	@Column(name="password", nullable=false)
	private String password;
	
	@NotNull
	@Column(name="first_name",nullable=false)
	private String firstName;
	
	@NotNull
	@Column(name="last_name", nullable=false)
	private String lastName;
	
	@NotNull
	@Column(name="phone_number", nullable=true)
	private int phoneNumber;
	
	@NotNull
	@DateTimeFormat(pattern ="dd/mm/yyyy")
	@Column(name="birth_date", nullable=true)
	private LocalDate dob;
	
	@NotNull
	@Email
	@Column(name="email", nullable=false)
	private String email;
	
	@NotNull
	@OneToOne(fetch=FetchType.EAGER, cascade=CascadeType.ALL)
	private Address address;
	
	@NotNull
	@Column(name="user_role", nullable=false)
	private RolesEnum userRole;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public LocalDate getDob() {
		return dob;
	}

	public void setDob(LocalDate dob) {
		this.dob = dob;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public RolesEnum getUserRole() {
		return userRole;
	}

	public void setUserRole(RolesEnum userRole) {
		this.userRole = userRole;
	}
}
