package com.wojciechbiskup.online_store.service;

import com.wojciechbiskup.online_store.entity.CPU;

public interface CPUService {

	public Iterable<CPU> findAll();

	public void save(CPU cpu);
}
