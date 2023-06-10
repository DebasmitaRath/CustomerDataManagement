package com.jsp.CustomerDataManagement.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.jsp.CustomerDataManagement.Entity.Person;
import com.jsp.CustomerDataManagement.Service.PersonService;

@RestController
public class PersonController {
	@Autowired
	private PersonService service;
	
	@PostMapping("/person")
	public Person savePerson(@RequestBody Person person) {
		return service.savePerson(person);  
	}

}
