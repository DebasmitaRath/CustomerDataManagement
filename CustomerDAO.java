package com.jsp.CustomerDataManagement.Repository;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Repository;

import com.jsp.CustomerDataManagement.Entity.Customer;

@Repository
@Qualifier(value="primary")
public class CustomerDAO {
	@Autowired
	private CustomerRepository repository;
	
	public Customer saveCustomer(Customer customer) {
		return repository.save(customer);
	}
	
	public List<Customer> getAllCustomerData(){
		return repository.findAll();
	}
	
	public Customer getCustomerDataById(int id) {
		return repository.findById(id).orElse(new Customer(HttpStatus.NOT_FOUND.value(),HttpStatus.NOT_FOUND.name(),HttpStatus.NOT_FOUND.name()));
	}
	
	public Customer deleteCustomerDataById(int id) {
		Customer dataById = getCustomerDataById(id);
		if(dataById.getId()!=404) {
			 repository.deleteById(id);
		}
		return dataById; 
	}
	public List<Customer> getCustomerByName(String name){
		return repository.findByName(name);
	}
	public List<Customer> validateCustomer(String name,String email){
		return repository.validateCustomer(name,email);
	}
	
}
