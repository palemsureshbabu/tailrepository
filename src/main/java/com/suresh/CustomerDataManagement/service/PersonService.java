package com.suresh.CustomerDataManagement.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.suresh.CustomerDataManagement.dao.PersonDao;
import com.suresh.CustomerDataManagement.entity.Person;

@Service
public class PersonService {
	@Autowired
 private PersonDao dao;
 public Person savePerson( @RequestBody Person person) {
	 return dao.save(person);
 }
}
