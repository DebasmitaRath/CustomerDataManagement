package com.jsp.CustomerDataManagement.Entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.Data;

@Entity
@Data
public class Person implements Serializable {
	
	@Id
	private Integer id;
	private String name;
	private String email;
	@OneToMany(cascade = CascadeType.ALL,mappedBy ="person")
	private List<BankAccount> accounts;
	

}
