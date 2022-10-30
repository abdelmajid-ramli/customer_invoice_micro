package com.example.demo.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.dto.CustomerRequestDTO;
import com.example.demo.dto.CustomerResponseDTO;
import com.example.demo.entities.Customer;
import com.example.demo.mappers.CustomerMapper;
import com.example.demo.repository.CustomerRepository;

import lombok.AllArgsConstructor;

@Service
@Transactional
@AllArgsConstructor
public class CustomerImlService implements CustomerService {
	
	CustomerRepository customerRepository;
	CustomerMapper customerMapper;

	@Override
	public CustomerResponseDTO save(CustomerRequestDTO customer) {
		Customer c = customerMapper.fromCustomerRequestDTO(customer);
		c=customerRepository.save(c);
		
		CustomerResponseDTO response=customerMapper.ResponseDTOfromCustomer(c);
		return response;
	}

	@Override
	public CustomerResponseDTO getCustomer(String id) {
		Customer c = customerRepository.findById(id).orElseThrow();
		CustomerResponseDTO response=customerMapper.ResponseDTOfromCustomer(c);
		return response;
	}

	@Override
	public CustomerResponseDTO update(CustomerRequestDTO customer) {
		Customer c = customerMapper.fromCustomerRequestDTO(customer);
		c=customerRepository.save(c);
		
		CustomerResponseDTO response=customerMapper.ResponseDTOfromCustomer(c);
		return response;
	}

	@Override
	public List<CustomerResponseDTO> listCustomers() {
		 
		return customerRepository.findAll().stream().map(customer->{
			return customerMapper.ResponseDTOfromCustomer(customer);
		}).collect(Collectors.toList());
	}

}
