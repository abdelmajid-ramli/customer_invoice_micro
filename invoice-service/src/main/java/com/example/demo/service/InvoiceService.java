package com.example.demo.service;

import java.util.List;

import com.example.demo.dto.InvoiceRequestDTO;
import com.example.demo.dto.InvoiceResponseDTO;

public interface InvoiceService {
	InvoiceResponseDTO getInvoice(String id);
	List<InvoiceResponseDTO> getInvoices();
	InvoiceResponseDTO saveInvoice(InvoiceRequestDTO dto);
	InvoiceResponseDTO updateInvoice(InvoiceRequestDTO dto);
	void deleteInvoice(String id);
	

}
