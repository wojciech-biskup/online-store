package com.wojciechbiskup.online_store.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "RAM_STICK")
public class RAMStick {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long ramStickId;

	private Integer amount;

	private Integer capacity;

	private Integer frequency;

	private String name;

	private Double price;

	private String type;

	public RAMStick() {
		
	}

	public RAMStick(Long ramStickId, Integer amount, Integer capacity, Integer frequency, String name, Double price, String type) {
		this.ramStickId = ramStickId;
		this.amount = amount;
		this.capacity = capacity;
		this.frequency = frequency;
		this.name = name;
		this.price = price;
		this.type = type;
	}

	public Long getRamStickId() {
		return ramStickId;
	}

	public Integer getAmount() {
		return amount;
	}

	public Integer getCapacity() {
		return capacity;
	}

	public Integer getFrequency() {
		return frequency;
	}

	public String getName() {
		return name;
	}

	public Double getPrice() {
		return price;
	}

	public String getType() {
		return type;
	}

	public void setAmount(Integer amount) {
		this.amount = amount;
	}

	public void setCapacity(Integer capacity) {
		this.capacity = capacity;
	}

	public void setFrequency(Integer frequency) {
		this.frequency = frequency;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public void setType(String type) {
		this.type = type;
	}
}
