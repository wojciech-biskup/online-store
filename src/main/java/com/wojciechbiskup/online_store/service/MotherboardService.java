package com.wojciechbiskup.online_store.service;

import com.wojciechbiskup.online_store.entity.Motherboard;

public interface MotherboardService {

	public Iterable<Motherboard> findAll();

	public void save(Motherboard motherboard);
}
