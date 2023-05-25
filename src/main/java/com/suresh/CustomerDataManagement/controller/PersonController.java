package com.suresh.CustomerDataManagement.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.suresh.CustomerDataManagement.entity.Person;
import com.suresh.CustomerDataManagement.service.PersonService;

@RestController
public class PersonController {
 @Autowired
 private PersonService service;
 @PostMapping("/Person")
 public Person savePerson( @RequestBody Person person) {
	 return service.savePerson(person);
 }

}
