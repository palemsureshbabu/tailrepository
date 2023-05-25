package com.suresh.CustomerDataManagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.suresh.CustomerDataManagement.dto.CustomerDto;
import com.suresh.CustomerDataManagement.dto.ResponseStructure;
import com.suresh.CustomerDataManagement.entity.Customer;
import com.suresh.CustomerDataManagement.service.CustomerService;


@RestController
public class CustomerController {
    @Autowired
	private CustomerService service;
	@PostMapping(value="/insert")
	public @ResponseBody ResponseStructure<Customer> saveCustomer(@RequestBody CustomerDto customer) {
	return service.saveCustomer(customer);
	}
	
	@PutMapping(value="/insert")
	public @ResponseBody ResponseStructure updateCustomer( @RequestBody Customer customer) {
		return service.UpdateCustomer(customer);
	}
	
	@GetMapping(value="/insert")
	public @ResponseBody ResponseStructure<List<Customer>> getCustomers(){
		return service.getAllCustomers();
	}
	
	@GetMapping(value="/insert{p}")
	public Customer getcustomerbyid(@PathVariable("p")int id) {
		return service.findByCustomerId(id);
	}
	@DeleteMapping(value="/insert")
	public Customer deletecustomerbyid(@RequestParam("id")int id) {
		return service.DeleteCustomerById(id);
	}
	
	@GetMapping(value="/insert{name}")
	public @ResponseBody List<Customer> getcustomername(@PathVariable("name") String name){
		return service.getCustomerByName(name);
	}
	
	@PostMapping(value=("validate"))
	public List<Customer> validatecustomer(@RequestParam("name")String name,@RequestParam("email")String email){
		return service.validateCustomer(name, email);	
	}
}
