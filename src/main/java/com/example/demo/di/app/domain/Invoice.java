package com.example.demo.di.app.domain;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.RequestScope;

@Component
@RequestScope
//@SessionScope
//@ApplicationScope
public class Invoice implements Serializable {

	private static final long serialVersionUID = 2173944026085396212L;

	@Value("${invoice.description}")
	private String description;
	@Autowired
	private Client client;
	@Autowired
	@Qualifier("createOfficeItems")
	private List<InvoiceItem> items;
	
	@PostConstruct
	public void init() {
		client.setFirstName("done");
		System.out.println("cliente modificado");
	}

	@PreDestroy
	public void done() {
		client.setFirstName("end");
		System.out.println("facura destruida");
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public List<InvoiceItem> getItems() {
		return items;
	}

	public void setItems(List<InvoiceItem> items) {
		this.items = items;
	}
}
