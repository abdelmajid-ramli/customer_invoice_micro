package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.api.CustomerClient;
import com.example.demo.dto.InvoiceRequestDTO;
import com.example.demo.dto.InvoiceResponseDTO;
import com.example.demo.entities.Invoice;
import com.example.demo.mappers.InvoiceMapper;
import com.example.demo.repository.InvoiceRepository;

import lombok.AllArgsConstructor;

@Service
@Transactional
@AllArgsConstructor
public class InvoiceServiceImpl implements InvoiceService{
	InvoiceRepository invoiceRepository;
	InvoiceMapper invoiceMapper;
	CustomerClient customerClient;

	@Override
	public InvoiceResponseDTO getInvoice(String id) {
		Invoice invoice=invoiceRepository.findById(id).orElseThrow();
		return invoiceMapper.toInvoiceResponseDTO(invoice);
	}

	@Override
	public List<InvoiceResponseDTO> getInvoices() {
		List<Invoice> invoices=invoiceRepository.findAll();
		List<InvoiceResponseDTO> list=new ArrayList<>();
		for(int i=0;i<invoices.size();i++) {
			invoices.get(i).setCustomer(customerClient.getCustomerById(invoices.get(i).getCustomerId()));
			list.add(invoiceMapper.toInvoiceResponseDTO(invoices.get(i)));
		}
		
		return list;
	}

	@Override
	public InvoiceResponseDTO saveInvoice(InvoiceRequestDTO dto) {
		Invoice invoice=invoiceMapper.toInvoice(dto);
		invoice=invoiceRepository.save(invoice);
		return invoiceMapper.toInvoiceResponseDTO(invoice);
	}

	@Override
	public InvoiceResponseDTO updateInvoice(InvoiceRequestDTO dto) {
		Invoice invoice=invoiceMapper.toInvoice(dto);
		invoice=invoiceRepository.save(invoice);
		return invoiceMapper.toInvoiceResponseDTO(invoice);
	}

	@Override
	public void deleteInvoice(String id) {
		invoiceRepository.deleteById(id);
		
	}

}
