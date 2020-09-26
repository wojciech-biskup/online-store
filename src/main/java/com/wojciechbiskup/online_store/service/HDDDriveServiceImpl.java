package com.wojciechbiskup.online_store.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.wojciechbiskup.online_store.entity.HDDDrive;
import com.wojciechbiskup.online_store.repository.HDDDriveRepository;

@Transactional
@Service("hddDriveService")
public class HDDDriveServiceImpl implements HDDDriveService {

	@Autowired
	private HDDDriveRepository hddDriveRepository;

	@Override
	public Iterable<HDDDrive> findAll() {
		return hddDriveRepository.findAll();
	}

	@Override
	public void save(HDDDrive hddDrive) {
		hddDriveRepository.save(hddDrive);
	}
}
