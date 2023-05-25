package com.suresh.CustomerDataManagement.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.suresh.CustomerDataManagement.entity.Customer;
import com.suresh.CustomerDataManagement.repository.CostomerRepository;
@Component
public class CustomerDao {
	@Autowired
      private CostomerRepository crepository;
	
	public Customer saveCustomer(Customer c) {
		return crepository.save(c);
	}
	
	public List<Customer> getallcustomer(){
		return crepository.findAll();
	}
	
	public Customer findCustomerByid(int id) {
		return crepository.findById(id).orElse(new Customer(HttpStatus.NOT_FOUND.value(),HttpStatus.NOT_FOUND.name(),HttpStatus.NOT_FOUND.name()));
	}
	
	public Customer DeleteCustomerById(int id) {
		Customer repositoryCustomer=findCustomerByid(id);
		crepository.delete(repositoryCustomer);
		return repositoryCustomer;
	}
	
	public List<Customer> getcustomerbyname(String name){
		
		return crepository.findByName(name);
	}
	
	public List<Customer> validatecustomer(String name,String email){
		return crepository.validateCustomer(name, email);
	}
	

}
