package com.example.demo.di.app.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.di.app.domain.Invoice;

@Controller
@RequestMapping("/invoice")
public class InvoiceController {
	
	@Autowired
	private Invoice invoice;

	@GetMapping("/")
	public String getDetails(Model model) {
		
		model.addAttribute("title", "Ejemplo de detalle de factura");
		model.addAttribute("invoice", invoice);

		return "invoice/index";
	}
}
