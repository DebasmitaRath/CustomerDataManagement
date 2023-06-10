package com.jsp.CustomerDataManagement.Service;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.jsp.CustomerDataManagement.Entity.Customer;
import com.jsp.CustomerDataManagement.Repository.CustomerDAO;
import com.jsp.CustomerDataManagement.dto.CustomerDTO;
import com.jsp.CustomerDataManagement.dto.ResponceStructure;
@Service
public class CustomerService {
	@Autowired
	@Qualifier("dao")
	private CustomerDAO customerDAO;
	
	public ResponceStructure<Customer> saveCustomer(CustomerDTO dto) {
		Customer cus = new Customer(dto);
		ResponceStructure<Customer> rs = new ResponceStructure<>();
		 rs.setData(cus);
		 rs.setStstudCode(HttpStatus.ACCEPTED.value());
		 rs.setTimeStamp(LocalDateTime.now());
		 rs.setMessage(HttpStatus.ACCEPTED.name());
		 return rs;
	}
	public ResponceStructure<Customer> updateCustomer(Customer customer) {
		Customer cus=customerDAO.saveCustomer(customer);
		ResponceStructure<Customer> rs=new ResponceStructure<>();
		rs.setData(cus);
		rs.setStstudCode(HttpStatus.ACCEPTED.value());
		rs.setTimeStamp(LocalDateTime.now());
		rs.setMessage(HttpStatus.ACCEPTED.name());
		return rs;
	}
	public ResponceStructure<List<Customer>> getAllCustomerData(){
		List<Customer> list= customerDAO.getAllCustomerData();
		ResponceStructure<List<Customer>> rs= new ResponceStructure<>();
		if(list.size() !=0) {
			rs.setStstudCode(HttpStatus.FOUND.value());
			rs.setData(list);
			rs.setTimeStamp(LocalDateTime.now());
			rs.setMessage("Customer entery found in database");
		}else {
			rs.setStstudCode(HttpStatus.NOT_FOUND.value());
			rs.setData(list);
			rs.setTimeStamp(LocalDateTime.now());
			rs.setMessage("No Customer entity found in database");
		}
		return rs;
	}
	public ResponceStructure<Customer> getCustomerDataById(int id) {
		Customer customer = customerDAO.getCustomerDataById(id);
		 ResponceStructure<Customer> rs = new ResponceStructure<>();
		 if(customer.getId()!=404 ) {
			 rs.setStstudCode(HttpStatus.FOUND.value());
			 rs.setData(customer);
			 rs.setTimeStamp(LocalDateTime.now());
			 rs.setMessage("The details of customer of ID: "+ id );
		 }else {
			  rs.setStstudCode(HttpStatus.NOT_FOUND.value());
			  rs.setData(null);
			  rs.setTimeStamp(LocalDateTime.now());
			  rs.setMessage("No Customer found in database with id: "+id);
		  }
		return rs;
	}
	public ResponceStructure<Customer> deleteCustomerById(int id) {
		 Customer customer = customerDAO.deleteCustomerDataById(id);
		 ResponceStructure<Customer> rs = new ResponceStructure<>();
		 if(customer!=null) {
			 rs.setStstudCode(HttpStatus.FOUND.value());
			 rs.setData(customer);
			 rs.setTimeStamp(LocalDateTime.now());
			 rs.setMessage("The deleted details of customer of ID: "+ id );
		 }else {
			  rs.setStstudCode(HttpStatus.NOT_FOUND.value());
			  rs.setData(null);
			  rs.setTimeStamp(LocalDateTime.now());
			  rs.setMessage("No Customer are found in database");
		  }
		return rs;
	}
	public ResponceStructure<List<Customer>> getCustomerByName(String name){
		 List<Customer> customer = customerDAO.getCustomerByName(name);
		 ResponceStructure<List<Customer>> rs = new ResponceStructure<>();
		 if(customer.size()!=0) {
			 rs.setStstudCode(HttpStatus.FOUND.value());
			 rs.setData(customer);
			 rs.setTimeStamp(LocalDateTime.now());
			 rs.setMessage("The details of customer of name: "+ name );
		 }else {
			  rs.setStstudCode(HttpStatus.NOT_FOUND.value());
			  rs.setData(null);
			  rs.setTimeStamp(LocalDateTime.now());
			  rs.setMessage("No Customere are found in database");
		  }
		return rs;
	}
	public ResponceStructure<List<Customer>> validateCustomer(String name, String email){
		 List<Customer> customer = customerDAO.validateCustomer(name, email);
		 ResponceStructure<List<Customer>> rs = new ResponceStructure<>();
		 if(customer.size()!=0) {
			 rs.setStstudCode(HttpStatus.FOUND.value());
			 rs.setData(customer);
			 rs.setTimeStamp(LocalDateTime.now());
			 rs.setMessage("The validation of customer is Sucessful");
		 }else {
			  rs.setStstudCode(HttpStatus.NOT_FOUND.value());
			  rs.setData(null);
			  rs.setTimeStamp(LocalDateTime.now());
			  rs.setMessage("No Customere are found in database with name: "+name+" and email: "+email);
		  }
		return rs;
	}

}
