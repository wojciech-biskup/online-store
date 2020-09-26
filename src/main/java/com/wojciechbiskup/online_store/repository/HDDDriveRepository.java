package com.wojciechbiskup.online_store.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.wojciechbiskup.online_store.entity.HDDDrive;

@Repository("hddDriveRepository")
public interface HDDDriveRepository extends CrudRepository<HDDDrive, Integer> {
	
}
