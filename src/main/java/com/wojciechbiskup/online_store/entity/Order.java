package com.wojciechbiskup.online_store.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ORDERS")
public class Order {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long orderId;

	private String address;

	private String city;

	private String customerEmail;

	private String customerFirstName;

	private String customerLastName;

	private String customerPhoneNumber;

	private String postalCode;

	private String productName;

	public Order() {
		
	}

	public Order(Long orderId, String address, String city, String customerEmail, String customerFirstName, String customerLastName, String customerPhoneNumber, String postalCode, String productName) {
		this.orderId = orderId;
		this.address = address;
		this.city = city;
		this.customerEmail = customerEmail;
		this.customerFirstName = customerFirstName;
		this.customerLastName = customerLastName;
		this.customerPhoneNumber = customerPhoneNumber;
		this.postalCode = postalCode;
		this.productName = productName;
	}

	public Long getOrderId() {
		return orderId;
	}

	public String getAddress() {
		return address;
	}

	public String getCity() {
		return city;
	}

	public String getCustomerEmail() {
		return customerEmail;
	}

	public String getCustomerFirstName() {
		return customerFirstName;
	}

	public String getCustomerLastName() {
		return customerLastName;
	}

	public String getCustomerPhoneNumber() {
		return customerPhoneNumber;
	}

	public String getPostalCode() {
		return postalCode;
	}

	public String getProductName() {
		return productName;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public void setCustomerEmail(String customerEmail) {
		this.customerEmail = customerEmail;
	}

	public void setCustomerFirstName(String customerFirstName) {
		this.customerFirstName = customerFirstName;
	}

	public void setCustomerLastName(String customerLastName) {
		this.customerLastName = customerLastName;
	}

	public void setCustomerPhoneNumber(String customerPhoneNumber) {
		this.customerPhoneNumber = customerPhoneNumber;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}
}
