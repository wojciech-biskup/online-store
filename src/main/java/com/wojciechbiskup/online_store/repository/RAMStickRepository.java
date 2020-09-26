package com.wojciechbiskup.online_store.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.wojciechbiskup.online_store.entity.RAMStick;

@Repository("ramStickRepository")
public interface RAMStickRepository extends CrudRepository<RAMStick, Integer> {
	
}
