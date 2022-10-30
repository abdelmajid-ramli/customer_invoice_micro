package com.example.demo.mappers;

import java.util.Date;
import java.util.UUID;

import org.springframework.stereotype.Component;

import com.example.demo.api.CustomerClient;
import com.example.demo.dto.InvoiceRequestDTO;
import com.example.demo.dto.InvoiceResponseDTO;
import com.example.demo.entities.Invoice;

import lombok.AllArgsConstructor;

@Component
@AllArgsConstructor
public class InvoiceMapperDTO implements InvoiceMapper{
	CustomerClient customerClient;

	@Override
	public Invoice toInvoice(InvoiceRequestDTO invoiceRequestDTO) {
		Invoice invoice=new Invoice();
		invoice.setId(UUID.randomUUID().toString());
		invoice.setAmmount(invoiceRequestDTO.getAmmount());
		invoice.setCustomerId(invoiceRequestDTO.getCustomerId());
		invoice.setInvoiceDate(new Date());
		invoice.setCustomer(customerClient.getCustomerById(invoice.getCustomerId()));
		return invoice;
	}

	@Override
	public InvoiceResponseDTO toInvoiceResponseDTO(Invoice invoice) {
		InvoiceResponseDTO  response=new InvoiceResponseDTO();
		response.setId(invoice.getId());
		response.setAmmount(invoice.getAmmount());
		response.setInvoiceDate(invoice.getInvoiceDate());
		response.setCustomer(invoice.getCustomer());
		response.setCustomer(customerClient.getCustomerById(invoice.getCustomerId()));
		return response;
	}

}
