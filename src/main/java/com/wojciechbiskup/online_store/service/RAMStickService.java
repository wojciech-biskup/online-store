package com.wojciechbiskup.online_store.service;

import com.wojciechbiskup.online_store.entity.RAMStick;

public interface RAMStickService {

	public Iterable<RAMStick> findAll();

	public void save(RAMStick ramStick);
}
