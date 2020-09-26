package com.wojciechbiskup.online_store.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class GraphicsCard {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long graphicsCardId;

	private Integer amount;

	private Integer clockRate;

	private Integer lenght;

	private String name;

	private Double price;

	private Integer ramMemorySize;

	public GraphicsCard() {
		
	}

	public GraphicsCard(Long graphicsCardId, Integer amount, Integer clockRate, Integer lenght, String name, Double price, Integer ramMemorySize) {
		this.graphicsCardId = graphicsCardId;
		this.amount = amount;
		this.clockRate = clockRate;
		this.lenght = lenght;
		this.name = name;
		this.price = price;
		this.ramMemorySize = ramMemorySize;
	}

	public Long getGraphicsCardId() {
		return graphicsCardId;
	}

	public Integer getAmount() {
		return amount;
	}

	public Integer getClockRate() {
		return clockRate;
	}

	public Integer getLenght() {
		return lenght;
	}

	public String getName() {
		return name;
	}

	public Double getPrice() {
		return price;
	}

	public Integer getRamMemorySize() {
		return ramMemorySize;
	}

	public void setAmount(Integer amount) {
		this.amount = amount;
	}

	public void setClockRate(Integer clockRate) {
		this.clockRate = clockRate;
	}

	public void setLenght(Integer lenght) {
		this.lenght = lenght;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public void setRamMemorySize(Integer ramMemorySize) {
		this.ramMemorySize = ramMemorySize;
	}
}
