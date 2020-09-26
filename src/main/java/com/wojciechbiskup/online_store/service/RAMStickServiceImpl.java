package com.wojciechbiskup.online_store.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.wojciechbiskup.online_store.entity.RAMStick;
import com.wojciechbiskup.online_store.repository.RAMStickRepository;

@Transactional
@Service("ramStickService")
public class RAMStickServiceImpl implements RAMStickService {

	@Autowired
	private RAMStickRepository ramStickRepository;

	@Override
	public Iterable<RAMStick> findAll() {
		return ramStickRepository.findAll();
	}

	@Override
	public void save(RAMStick ramStick) {
		ramStickRepository.save(ramStick);
	}
}
