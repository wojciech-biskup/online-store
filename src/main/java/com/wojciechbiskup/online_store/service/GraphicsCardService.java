package com.wojciechbiskup.online_store.service;

import com.wojciechbiskup.online_store.entity.GraphicsCard;

public interface GraphicsCardService {

	public Iterable<GraphicsCard> findAll();

	public void save(GraphicsCard graphicsCard);
}
