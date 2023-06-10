package com.jsp.CustomerDataManagement.dto;

import java.io.Serializable;

import com.jsp.CustomerDataManagement.Entity.Customer;

public class CustomerDTO implements Serializable {
	private Integer id;
	private String name;
	private String email;
	
	public CustomerDTO(Customer customer) {
		this.id=customer.getId();
		this.name=customer.getName();
		this.email=customer.getEmail();
	}

	public Integer geatId() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getName() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getEmail() {
		// TODO Auto-generated method stub
		return null;
	}

}
