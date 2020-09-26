package com.wojciechbiskup.online_store.service;

import com.wojciechbiskup.online_store.entity.Order;

public interface OrderService {

	public Iterable<Order> findAll();

	public void save(Order order);
}
