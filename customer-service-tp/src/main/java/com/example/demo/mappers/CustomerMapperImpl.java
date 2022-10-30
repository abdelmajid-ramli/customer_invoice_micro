package com.example.demo.mappers;

import org.springframework.stereotype.Component;

import com.example.demo.dto.CustomerRequestDTO;
import com.example.demo.dto.CustomerResponseDTO;
import com.example.demo.entities.Customer;

@Component
public class CustomerMapperImpl implements CustomerMapper{

	@Override
	public CustomerRequestDTO requestDTOfromCustomer(Customer customer) {
		CustomerRequestDTO request = new CustomerRequestDTO();
		request.setId(customer.getId());
		request.setName(customer.getName());
		request.setEmail(customer.getEmail());
		return request;
	}

	@Override
	public CustomerResponseDTO ResponseDTOfromCustomer(Customer customer) {
		CustomerResponseDTO response = new CustomerResponseDTO();
		response.setId(customer.getId());
		response.setName(customer.getName());
		response.setEmail(customer.getEmail());
		return response;
	}

	@Override
	public Customer fromCustomerRequestDTO(CustomerRequestDTO customer) {
		Customer c = new Customer();
		c.setId(customer.getId());
		c.setName(customer.getName());
		c.setEmail(customer.getEmail());
		
		return c;
	}
	
	@Override
	public Customer fromCustomerResponseDTO(CustomerResponseDTO customer) {
		Customer c = new Customer();
		c.setId(customer.getId());
		c.setName(customer.getName());
		c.setEmail(customer.getEmail());
		
		return c;
	}

}
