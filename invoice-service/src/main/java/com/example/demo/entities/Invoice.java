package com.example.demo.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Transient;

import com.example.demo.models.Customer;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data @NoArgsConstructor @AllArgsConstructor
public class Invoice {
	@Id
	private String id;
	private Date InvoiceDate;
	private double ammount;
	private String customerId;
	@Transient
	private Customer customer;
	

}
