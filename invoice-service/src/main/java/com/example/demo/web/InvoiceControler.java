package com.example.demo.web;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.InvoiceRequestDTO;
import com.example.demo.dto.InvoiceResponseDTO;
import com.example.demo.service.InvoiceService;

import io.swagger.v3.oas.annotations.parameters.RequestBody;
import lombok.AllArgsConstructor;

@RestController
@RequestMapping(path = "api")
@AllArgsConstructor
public class InvoiceControler {
	InvoiceService invoiceService;
	
	@GetMapping(path = "/invoices/{id}")
	public InvoiceResponseDTO getInvoice(@PathVariable String id) {
		return invoiceService.getInvoice(id);
	}
	
	@GetMapping(path = "/invoices")
	public List<InvoiceResponseDTO> getInvoices() {
		return invoiceService.getInvoices();
	}
	
	@PostMapping(path = "/invoices")
	public InvoiceResponseDTO addInvoice(@RequestBody InvoiceRequestDTO dto) {
		return invoiceService.saveInvoice(dto);
	}
	
	@PutMapping(path = "/invoices")
	public InvoiceResponseDTO updateInvoice(@RequestBody InvoiceRequestDTO dto) {
		return invoiceService.updateInvoice(dto);
	}
	
	@DeleteMapping(path = "/invoices/{id}")
	public void deleteInvoice(@PathVariable String id) {
		 invoiceService.deleteInvoice(id);
	}

}
