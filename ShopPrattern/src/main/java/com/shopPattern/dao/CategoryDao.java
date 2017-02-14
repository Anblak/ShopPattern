package com.shopPattern.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shopPattern.entity.Category;

public interface CategoryDao extends JpaRepository<Category, Integer>{

}
