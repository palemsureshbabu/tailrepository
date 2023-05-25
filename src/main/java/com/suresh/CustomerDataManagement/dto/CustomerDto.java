package com.suresh.CustomerDataManagement.dto;

import java.io.Serializable;

import com.suresh.CustomerDataManagement.entity.Customer;

import lombok.Data;
@Data
public class CustomerDto implements Serializable{
	private Integer id;
	private String name;
	private String email;
	public CustomerDto(Customer customer) {
		this.id=customer.getId();
		this.name=customer.getName();
		this.email=customer.getEmail();
	}
	public CustomerDto() {
		
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	

}
