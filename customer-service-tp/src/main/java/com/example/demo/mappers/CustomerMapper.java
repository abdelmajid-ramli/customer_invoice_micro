package com.example.demo.mappers;

import com.example.demo.dto.CustomerRequestDTO;
import com.example.demo.dto.CustomerResponseDTO;
import com.example.demo.entities.Customer;


public interface CustomerMapper {
	
	CustomerRequestDTO requestDTOfromCustomer(Customer customer);
	
	CustomerResponseDTO ResponseDTOfromCustomer(Customer customer);
	
	Customer fromCustomerRequestDTO(CustomerRequestDTO customer);
	
	Customer fromCustomerResponseDTO(CustomerResponseDTO customer);


}
