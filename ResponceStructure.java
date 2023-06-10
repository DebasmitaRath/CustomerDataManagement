package com.jsp.CustomerDataManagement.dto;

import java.time.LocalDate;
import java.time.LocalDateTime;

import lombok.Data;
@Data
public class ResponceStructure<T> {
	
	private Integer ststudCode;
	private T data;
	private String message;
	private LocalDateTime timeStamp;
	
}
