package com.shopPattern.service;

import java.util.List;

import com.shopPattern.entity.Category;



public interface CategoryService {
	void save(Category category);
	List<Category> findAll();
	Category findOne(int id);
	void delete(int id);
}
