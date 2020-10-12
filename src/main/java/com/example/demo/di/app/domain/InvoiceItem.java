package com.example.demo.di.app.domain;

public class InvoiceItem {

	public InvoiceItem() {
	}

	public InvoiceItem(Product product, Integer amount) {
		this.product = product;
		this.amount = amount;
	}

	private Product product;
	private Integer amount;

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public Integer getAmount() {
		return amount;
	}

	public void setAmount(Integer amount) {
		this.amount = amount;
	}

}
