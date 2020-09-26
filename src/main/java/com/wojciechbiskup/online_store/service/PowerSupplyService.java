package com.wojciechbiskup.online_store.service;

import com.wojciechbiskup.online_store.entity.PowerSupply;

public interface PowerSupplyService {

	public Iterable<PowerSupply> findAll();

	public void save(PowerSupply powerSupply);
}
