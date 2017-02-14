package com.shopPattern.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shopPattern.dao.CategoryDao;
import com.shopPattern.entity.Category;
import com.shopPattern.service.CategoryService;

@Service
public class CategoryServiceImpl implements CategoryService {
	@Autowired
	private CategoryDao categoryDao;

	@Override
	public void save(Category category) {

		categoryDao.save(category);

	}

	@Override
	public List<Category> findAll() {

		return categoryDao.findAll();
	}

	@Override
	public Category findOne(int id) {

		return categoryDao.findOne(id);
	}

	@Override
	public void delete(int id) {

		categoryDao.delete(id);

	}
}
