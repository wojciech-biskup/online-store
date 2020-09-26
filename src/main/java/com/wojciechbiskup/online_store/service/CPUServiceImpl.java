package com.wojciechbiskup.online_store.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.wojciechbiskup.online_store.entity.CPU;
import com.wojciechbiskup.online_store.repository.CPURepository;

@Transactional
@Service("cpuService")
public class CPUServiceImpl implements CPUService {

	@Autowired
	private CPURepository cpuRepository;

	@Override
	public Iterable<CPU> findAll() {
		return cpuRepository.findAll();
	}

	@Override
	public void save(CPU cpu) {
		cpuRepository.save(cpu);
	}
}
