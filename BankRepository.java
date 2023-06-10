package com.jsp.CustomerDataManagement.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jsp.CustomerDataManagement.Entity.BankAccount;


public interface BankRepository extends JpaRepository<BankAccount, Integer> {

}
