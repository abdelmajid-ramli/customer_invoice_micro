package com.example.demo;

import java.util.UUID;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.demo.entities.Customer;
import com.example.demo.repository.CustomerRepository;

@SpringBootApplication
public class CustomerServiceTpApplication {

	public static void main(String[] args) {
		SpringApplication.run(CustomerServiceTpApplication.class, args);
		System.out.println("customer service started");
	}
	
	//@Bean
	CommandLineRunner start(CustomerRepository customerRepository) {
		return args -> {
			customerRepository.save(new Customer(UUID.randomUUID().toString(),"ali","ali@email.com"));
			customerRepository.save(new Customer(UUID.randomUUID().toString(),"ahmed","ahmed@email.com"));
			customerRepository.save(new Customer(UUID.randomUUID().toString(),"sara","sara@email.com"));
		};
	}

}
