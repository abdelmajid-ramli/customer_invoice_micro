package com.example.demo.mappers;

import com.example.demo.dto.InvoiceRequestDTO;
import com.example.demo.dto.InvoiceResponseDTO;
import com.example.demo.entities.Invoice;

public interface InvoiceMapper {
	Invoice toInvoice(InvoiceRequestDTO invoiceRequestDTO );
	InvoiceResponseDTO toInvoiceResponseDTO(Invoice invoice);

}
