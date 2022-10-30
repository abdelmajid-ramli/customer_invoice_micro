package com.example.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

import com.example.demo.dto.InvoiceRequestDTO;
import com.example.demo.mappers.InvoiceMapper;
import com.example.demo.repository.InvoiceRepository;

@SpringBootApplication
@EnableFeignClients
public class InvoiceServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(InvoiceServiceApplication.class, args);
		System.out.println("invoice service started");
	}
	
	//@Bean
	CommandLineRunner start(InvoiceRepository invoiceRepository,InvoiceMapper invoiceMapper) {
		return args -> {
			invoiceRepository.save(invoiceMapper.toInvoice(new InvoiceRequestDTO(200, "4df7bbd2-98fa-44f5-8575-6d3cd6c9f2f8")));
			invoiceRepository.save(invoiceMapper.toInvoice(new InvoiceRequestDTO(100, "4df7bbd2-98fa-44f5-8575-6d3cd6c9f2f8")));
			invoiceRepository.save(invoiceMapper.toInvoice(new InvoiceRequestDTO(150, "4eaf965d-e79d-436e-989e-bde80b72a89a")));
		};
	}

}
