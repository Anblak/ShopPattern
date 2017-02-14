package com.shopPattern.service;

import java.util.List;

import com.shopPattern.entity.Goods;



public interface GoodsService {
	void save(Goods goods);
	List<Goods> findAll();
	Goods findOne(int id);
	void delete(int id);
}
