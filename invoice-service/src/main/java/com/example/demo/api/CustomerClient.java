package com.example.demo.api;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.demo.models.Customer;

@FeignClient(name = "CUSTOMER-SERVICE")
public interface CustomerClient {
	@GetMapping(path="/api/customers/{id}")
	public Customer getCustomerById(@PathVariable(name="id") String id);

}
