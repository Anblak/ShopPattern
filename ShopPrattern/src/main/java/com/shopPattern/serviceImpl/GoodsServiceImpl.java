package com.shopPattern.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shopPattern.dao.GoodsDao;
import com.shopPattern.entity.Goods;
import com.shopPattern.service.GoodsService;

@Service
public class GoodsServiceImpl implements GoodsService {

	@Autowired
	private GoodsDao goodsDao;

	@Override
	public void save(Goods goods) {

		goodsDao.save(goods);

	}

	@Override
	public List<Goods> findAll() {

		return goodsDao.findAll();
	}

	@Override
	public Goods findOne(int id) {

		return goodsDao.findOne(id);
	}

	@Override
	public void delete(int id) {

		goodsDao.delete(id);

	}

}
