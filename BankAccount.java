package com.jsp.CustomerDataManagement.Entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.hibernate.mapping.Selectable;

import lombok.Data;

@Entity
@Data
public class BankAccount implements Serializable  {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "p_id")
	private Integer PId;
	private String name;
	@Column(name = "account number")
	private Long accountNumber;
	@ManyToOne
	@JoinColumn
	private Person person;

}
