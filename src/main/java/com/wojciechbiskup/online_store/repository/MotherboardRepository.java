package com.wojciechbiskup.online_store.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.wojciechbiskup.online_store.entity.Motherboard;

@Repository("motherboardRepository")
public interface MotherboardRepository extends CrudRepository<Motherboard, Integer> {
	
}
