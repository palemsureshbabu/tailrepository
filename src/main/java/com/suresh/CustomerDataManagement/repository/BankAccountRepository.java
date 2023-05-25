package com.suresh.CustomerDataManagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.suresh.CustomerDataManagement.entity.BankAccount;

public interface BankAccountRepository extends JpaRepository<BankAccount, Long> {

}
