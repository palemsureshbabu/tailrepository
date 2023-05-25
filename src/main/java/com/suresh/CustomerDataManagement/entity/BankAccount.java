package com.suresh.CustomerDataManagement.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import org.hibernate.annotations.GenericGenerator;

import lombok.Data;
@Entity
@Data
public class BankAccount implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="p_id")
	private Integer pId;
	private String name;
	@Column(name="account_number")
	private Long accountNumber;
	@ManyToOne
	@JoinColumn
	private Person person;
	
	
	
	public BankAccount(Integer pId, String name, Long accountNumber, Person person) {
		super();
		this.pId = pId;
		this.name = name;
		this.accountNumber = accountNumber;
		this.person = person;
	}

	public BankAccount() {
		
	}

	public Integer getId() {
		return pId;
	}

	public void setId(Integer id) {
		this.pId = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(Long accountNumber) {
		accountNumber = accountNumber;
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}
	
}