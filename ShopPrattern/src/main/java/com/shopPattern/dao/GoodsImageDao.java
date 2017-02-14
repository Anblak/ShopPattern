package com.shopPattern.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shopPattern.entity.GoodsImage;

public interface GoodsImageDao extends JpaRepository<GoodsImage, Integer>{

}
