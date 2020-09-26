package com.wojciechbiskup.online_store.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.wojciechbiskup.online_store.entity.GraphicsCard;
import com.wojciechbiskup.online_store.repository.GraphicsCardRepository;

@Transactional
@Service("graphicsCardService")
public class GraphicsCardServiceImpl implements GraphicsCardService {

	@Autowired
	private GraphicsCardRepository graphicsCardRepository;

	@Override
	public Iterable<GraphicsCard> findAll() {
		return graphicsCardRepository.findAll();
	}

	@Override
	public void save(GraphicsCard graphicsCard) {
		graphicsCardRepository.save(graphicsCard);
	}
}
