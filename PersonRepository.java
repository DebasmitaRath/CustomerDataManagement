package com.jsp.CustomerDataManagement.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jsp.CustomerDataManagement.Entity.Person;

public interface PersonRepository extends JpaRepository<Person, Integer> {

}
