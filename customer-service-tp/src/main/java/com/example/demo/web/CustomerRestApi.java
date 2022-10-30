package com.example.demo.web;

import java.util.List;
import java.util.UUID;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.CustomerRequestDTO;
import com.example.demo.dto.CustomerResponseDTO;
import com.example.demo.service.CustomerService;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping(path="/api")
@AllArgsConstructor
public class CustomerRestApi {
	private CustomerService customerService;
	
	@GetMapping(path="/customers")
	public List<CustomerResponseDTO> getCustomers(){
		return customerService.listCustomers();
	}
	
	@PostMapping(path="/customers")
	public CustomerResponseDTO addCustomer(@RequestBody CustomerRequestDTO customerRequestDTO){
		customerRequestDTO.setId(UUID.randomUUID().toString());
		return customerService.save(customerRequestDTO);
	}
	
	@GetMapping(path="/customers/{id}")
	public CustomerResponseDTO getCustomer(@PathVariable String id){
		return customerService.getCustomer(id);
	}

}
