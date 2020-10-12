package com.example.demo.di.app;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.example.demo.di.app.domain.InvoiceItem;
import com.example.demo.di.app.domain.Product;

//import com.example.demo.di.app.models.service.IService;
//import com.example.demo.di.app.models.service.MyComplexService;
//import com.example.demo.di.app.models.service.MySimpleService;

@Configuration
public class AppConfig {

	@Primary
	@Bean("createItems")
	public List<InvoiceItem> createItems() {
		List<InvoiceItem> items = new ArrayList<>();
		
		items.add(new InvoiceItem(new Product("Cerveza", 7), 12));
		items.add(new InvoiceItem(new Product("Chicharrones", 12), 2));
		items.add(new InvoiceItem(new Product("Clamato", 7), 4));
		
		return items;
	}

	@Bean("createOfficeItems")
	public List<InvoiceItem> createOfficeItems() {
		List<InvoiceItem> items = new ArrayList<>();
		
		items.add(new InvoiceItem(new Product("Notebook", 7), 12));
		items.add(new InvoiceItem(new Product("Impresora", 12), 2));
		items.add(new InvoiceItem(new Product("Escritorio", 7), 4));
		
		return items;
	}

//	@Primary
//	@Bean("mySimpleService")
//	public IService registerMySimpleService() {
//		return new MySimpleService();
//	}
//
//	@Bean("myComplexService")
//	public IService registerMyComplexService() {
//		return new MyComplexService();
//	}
}
