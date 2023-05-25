package com.suresh.CustomerDataManagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.JpaRepositoryConfigExtension;

import com.suresh.CustomerDataManagement.entity.Person;

public interface PersonRepository extends JpaRepository<Person, Integer>{

}
