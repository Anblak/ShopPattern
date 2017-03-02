package com.shopPattern.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shopPattern.entity.Catalog;



public interface CatalogDao extends JpaRepository<Catalog, Integer> {
}
