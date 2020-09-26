package com.wojciechbiskup.online_store.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.wojciechbiskup.online_store.entity.Motherboard;
import com.wojciechbiskup.online_store.repository.MotherboardRepository;

@Transactional
@Service("motherboardService")
public class MotherboardServiceImpl implements MotherboardService {

	@Autowired
	private MotherboardRepository motherboardRepository;

	@Override
	public Iterable<Motherboard> findAll() {
		return motherboardRepository.findAll();
	}

	@Override
	public void save(Motherboard motherboard) {
		motherboardRepository.save(motherboard);
	}
}
