package com.suresh.CustomerDataManagement.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.suresh.CustomerDataManagement.entity.Person;
import com.suresh.CustomerDataManagement.repository.PersonRepository;
@Repository
public class PersonDao {
 @Autowired
 private PersonRepository repository;
 public Person save(Person person) {
	 return repository.save(person);
 }
}
