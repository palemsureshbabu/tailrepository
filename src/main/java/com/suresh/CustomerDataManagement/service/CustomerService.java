package com.suresh.CustomerDataManagement.service;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.suresh.CustomerDataManagement.dao.CustomerDao;
import com.suresh.CustomerDataManagement.dto.CustomerDto;
import com.suresh.CustomerDataManagement.dto.ResponseStructure;
import com.suresh.CustomerDataManagement.entity.Customer;
import com.suresh.CustomerDataManagement.repository.CostomerRepository;

@Service
public class CustomerService {

    @Autowired
	private CustomerDao dao;
	
	public ResponseStructure<Customer> saveCustomer(CustomerDto dto) {
		Customer cus=new Customer(dto);
		 Customer customer = dao.saveCustomer(cus);
		 ResponseStructure<Customer> rs = new ResponseStructure<> ();
		 rs.setData(customer);
		 rs.setStatusCode(HttpStatus.OK.value());
		 rs.setMessage("customer data saved successfully");
		 rs.setTimeStamp(LocalDateTime.now());
		 return rs;
	}
	
	public   ResponseStructure UpdateCustomer(Customer c) {
		 Customer customer = dao.saveCustomer(c);
		 ResponseStructure<Customer> rs=new ResponseStructure<>();
		 rs.setData(customer);
		 rs.setStatusCode(HttpStatus.ACCEPTED.value());
		 rs.setTimeStamp(LocalDateTime.now());
		 rs.setMessage(HttpStatus.ACCEPTED.name());
		 return rs;
	}
	
	public ResponseStructure<List<Customer>> getAllCustomers(){
		List<Customer> list=dao.getallcustomer();
		ResponseStructure<List<Customer>> rs=new ResponseStructure<>();
		if(list.size()!=0) {
			rs.setStatusCode(HttpStatus.FOUND.value());
			rs.setData(list);
			rs.setTimeStamp(LocalDateTime.now());
			rs.setMessage("customers entry found in database");
		}else {
			rs.setStatusCode(HttpStatus.NOT_FOUND.value());
			rs.setData(null);
			rs.setTimeStamp(LocalDateTime.now());
			rs.setMessage("no customer entry found in database");
		}
		return rs;
	}
	
	public List<Customer> validateCustomer(String name,String email){
		return dao.validatecustomer(name, email);
	}
	
	public Customer findByCustomerId(int id) {
		return dao.findCustomerByid(id);
	}
	
	public Customer DeleteCustomerById(int id) {
		return dao.DeleteCustomerById(id);
	}
	
   public List<Customer> getCustomerByName(String name){
	   
	   return dao.getcustomerbyname(name);
   }
}
