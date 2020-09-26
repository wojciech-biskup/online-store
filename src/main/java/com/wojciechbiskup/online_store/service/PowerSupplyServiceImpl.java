package com.wojciechbiskup.online_store.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.wojciechbiskup.online_store.entity.PowerSupply;
import com.wojciechbiskup.online_store.repository.PowerSupplyRepository;

@Transactional
@Service("powerSupplyService")
public class PowerSupplyServiceImpl implements PowerSupplyService {

	@Autowired
	private PowerSupplyRepository powerSupplyRepository;

	@Override
	public Iterable<PowerSupply> findAll() {
		return powerSupplyRepository.findAll();
	}

	@Override
	public void save(PowerSupply powerSupply) {
		powerSupplyRepository.save(powerSupply);
	}
}
