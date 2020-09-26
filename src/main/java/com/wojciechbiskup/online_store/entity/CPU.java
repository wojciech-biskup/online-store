package com.wojciechbiskup.online_store.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class CPU {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long cpuId;

	private Integer amount;

	private Double clockRate;

	private Integer coreAmount;

	private String name;

	private Double price;

	private String socket;

	public CPU() {
		
	}

	public CPU(Long cpuId, Integer amount, Double clockRate, Integer coreAmount, String name, Double price, String socket) {
		this.cpuId = cpuId;
		this.amount = amount;
		this.clockRate = clockRate;
		this.coreAmount = coreAmount;
		this.name = name;
		this.price = price;
		this.socket = socket;
	}

	public Long getCpuId() {
		return cpuId;
	}

	public Integer getAmount() {
		return amount;
	}

	public Double getClockRate() {
		return clockRate;
	}

	public Integer getCoreAmount() {
		return coreAmount;
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

	public void setAmount(Integer amount) {
		this.amount = amount;
	}

	public void setClockRate(Double clockRate) {
		this.clockRate = clockRate;
	}

	public void setCoreAmount(Integer coreAmount) {
		this.coreAmount = coreAmount;
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
}
