package com.example.demo.service;

import java.util.List;

import com.example.demo.dto.CustomerRequestDTO;
import com.example.demo.dto.CustomerResponseDTO;

public interface CustomerService {
	
	CustomerResponseDTO save(CustomerRequestDTO customer); 
	
	CustomerResponseDTO getCustomer(String id);
	
	CustomerResponseDTO update(CustomerRequestDTO customer); 
	
	List<CustomerResponseDTO> listCustomers();


}
