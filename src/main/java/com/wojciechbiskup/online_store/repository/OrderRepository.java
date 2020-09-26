package com.wojciechbiskup.online_store.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.wojciechbiskup.online_store.entity.Order;

@Repository("orderRepository")
public interface OrderRepository extends CrudRepository<Order, Integer> {
	
}
