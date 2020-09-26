package com.wojciechbiskup.online_store.service;

import com.wojciechbiskup.online_store.entity.HDDDrive;

public interface HDDDriveService {

	public Iterable<HDDDrive> findAll();

	public void save(HDDDrive hddDrive);
}
