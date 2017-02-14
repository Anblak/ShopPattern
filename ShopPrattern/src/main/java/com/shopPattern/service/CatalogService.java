package com.shopPattern.service;

import java.util.List;

import com.shopPattern.entity.Catalog;



public interface CatalogService {
	void save(Catalog catalog);
	List<Catalog> findAll();
	Catalog findOne(int id);
	void delete(int id);
}
