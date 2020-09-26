package com.wojciechbiskup.online_store.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Motherboard {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long motherboardId;

	private Integer amount;

	private String chipset;

	private Integer memorySlots;

	private String name;

	private Double price;

	private String socket;

	private String type;

	public Motherboard() {
		
	}

	public Motherboard(Long motherboardId, Integer amount, String chipset, Integer memorySlots, String name, Double price, String socket, String type) {
		this.motherboardId = motherboardId;
		this.amount = amount;
		this.chipset = chipset;
		this.memorySlots = memorySlots;
		this.name = name;
		this.price = price;
		this.socket = socket;
		this.type = type;
	}

	public Long getMotherboardId() {
		return motherboardId;
	}

	public Integer getAmount() {
		return amount;
	}

	public String getChipset() {
		return chipset;
	}

	public Integer getMemorySlots() {
		return memorySlots;
	}

	public String getName() {
		return name;
	}

	public Double getPrice() {
		return price;
	}

	public String getSocket() {
		return socket;
	}

	public String getType() {
		return type;
	}

	public void setAmount(Integer amount) {
		this.amount = amount;
	}

	public void setChipset(String chipset) {
		this.chipset = chipset;
	}

	public void setMemorySlots(Integer memorySlots) {
		this.memorySlots = memorySlots;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public void setSocket(String socket) {
		this.socket = socket;
	}

	public void setType(String type) {
		this.type = type;
	}
}
