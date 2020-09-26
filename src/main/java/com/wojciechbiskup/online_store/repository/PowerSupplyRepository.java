package com.wojciechbiskup.online_store.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.wojciechbiskup.online_store.entity.PowerSupply;

@Repository("powerSupplyRepository")
public interface PowerSupplyRepository extends CrudRepository<PowerSupply, Integer> {
	
}
