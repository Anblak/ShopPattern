package com.shopPattern.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shopPattern.dao.BuyDao;
import com.shopPattern.entity.Buy;
import com.shopPattern.service.BuyService;


@Service
public class BuyServiceImpl implements BuyService{
	@Autowired
	private BuyDao buyDao;

	@Override
	public void save(Buy buy) {

		buyDao.save(buy);

	}

	@Override
	public List<Buy> findAll() {

		return buyDao.findAll();
	}

	@Override
	public Buy findOne(int id) {

		return buyDao.findOne(id);
	}

	@Override
	public void delete(int id) {

		buyDao.delete(id);

	}
}
