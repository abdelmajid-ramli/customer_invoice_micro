package com.example.demo.dto;

import java.util.Date;

import com.example.demo.models.Customer;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @NoArgsConstructor @AllArgsConstructor
public class InvoiceResponseDTO {
	private String id;
	private Date InvoiceDate;
	private double ammount;
	private Customer customer;
}

