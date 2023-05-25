package com.suresh.CustomerDataManagement.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.suresh.CustomerDataManagement.entity.Customer;

public interface CostomerRepository extends JpaRepository<Customer, Integer>{
//	 @Query("SELECT c FROM CUSTOMER c WHERE c.name=:name")
//	List<Customer> findByName(@Param("name")String name);
//    @Query("SELECT c FROM CUSTOMER c WHERE c.name=:name AND c.email=:email")
//	public List<Customer> validatecustomer(@Param("name") String name,@Param("email") String email);

	@Query ("SELECT c FROM Customer c WHERE c.name=:name  AND c.email=:email")
	 public List <Customer> validateCustomer(@Param("name")String name , @Param("email") String email);

	public List<Customer> findByName(String name);
}
