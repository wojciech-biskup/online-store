package com.wojciechbiskup.online_store.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class PowerSupply {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long powerSupplyId;

	private Integer amount;

	private String certification;

	private String name;

	private Double price;

	private Integer wattage;

	public PowerSupply() {
		
	}

	public PowerSupply(Long powerSupplyId, Integer amount, String certification, String name, Double price, Integer wattage) {
		this.powerSupplyId = powerSupplyId;
		this.amount = amount;
		this.certification = certification;
		this.name = name;
		this.price = price;
		this.wattage = wattage;
	}

	public Long getPowerSupplyId() {
		return powerSupplyId;
	}

	public Integer getAmount() {
		return amount;
	}

	public String getCertification() {
		return certification;
	}

	public String getName() {
		return name;
	}

	public Double getPrice() {
		return price;
	}

	public Integer getWattage() {
		return wattage;
	}

	public void setAmount(Integer amount) {
		this.amount = amount;
	}

	public void setCertification(String certification) {
		this.certification = certification;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public void setWattage(Integer wattage) {
		this.wattage = wattage;
	}
}
