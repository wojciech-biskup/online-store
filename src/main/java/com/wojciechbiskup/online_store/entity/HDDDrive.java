package com.wojciechbiskup.online_store.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "HDD_DRIVE")
public class HDDDrive {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long hddDriveId;

	private Integer amount;

	private Integer capacity;

	private String name;

	private Double price;

	private Integer rotationSpeed;

	private Double size;

	public HDDDrive() {
		
	}

	public HDDDrive(Long hddDriveId, Integer amount, Integer capacity, String name, Double price, Integer rotationSpeed, Double size) {
		this.hddDriveId = hddDriveId;
		this.amount = amount;
		this.capacity = capacity;
		this.name = name;
		this.price = price;
		this.rotationSpeed = rotationSpeed;
		this.size = size;
	}

	public Long getHddDriveId() {
		return hddDriveId;
	}

	public Integer getAmount() {
		return amount;
	}

	public Integer getCapacity() {
		return capacity;
	}

	public String getName() {
		return name;
	}

	public Double getPrice() {
		return price;
	}

	public Integer getRotationSpeed() {
		return rotationSpeed;
	}

	public Double getSize() {
		return size;
	}

	public void setAmount(Integer amount) {
		this.amount = amount;
	}

	public void setCapacity(Integer capacity) {
		this.capacity = capacity;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public void setRotationSpeed(Integer rotationSpeed) {
		this.rotationSpeed = rotationSpeed;
	}

	public void setSize(Double size) {
		this.size = size;
	}
}
