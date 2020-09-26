package com.wojciechbiskup.online_store.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.wojciechbiskup.online_store.entity.CPU;

@Repository("cpuRepository")
public interface CPURepository extends CrudRepository<CPU, Integer> {
	
}
