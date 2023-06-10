package com.jsp.CustomerDataManagement.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jsp.CustomerDataManagement.Entity.Person;
import com.jsp.CustomerDataManagement.Repository.PersonDAO;

@Service
public class PersonService {
	@Autowired
	private PersonDAO dao;
	public Person savePerson(Person person) {
		return dao.save(person);
	}

}
