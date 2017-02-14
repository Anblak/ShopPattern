package com.shopPattern.service;

import java.util.List;

import com.shopPattern.entity.Buy;


public interface BuyService {
	void save(Buy buy);
	List<Buy> findAll();
	Buy findOne(int id);
	void delete(int id);
}
