package com.shopPattern.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.shopPattern.dto.DtoUtilMapper;
import com.shopPattern.dto.GoodsDTO;
import com.shopPattern.entity.Goods;
import com.shopPattern.service.GoodsService;

@RestController
public class GoodsController {

	@Autowired
	private GoodsService goodsService;

	@RequestMapping(value = "saveGoods", method = RequestMethod.POST)
	public List<GoodsDTO> saveGoods(@RequestBody Goods goods) {

		goodsService.save(goods);

		return DtoUtilMapper.goodsToGoodsDTO(goodsService.findAll());
	}

	@RequestMapping(value = "loadGoods", method = RequestMethod.POST)
	public List<GoodsDTO> loadGoods(@RequestBody Goods goods) {
		return DtoUtilMapper.goodsToGoodsDTO(goodsService.findAll());
	}

	@RequestMapping(value = "deleteGoods", method = RequestMethod.POST)
	public List<GoodsDTO> deleteGoods(@RequestBody String index) {

		goodsService.delete(Integer.parseInt(index));

		return DtoUtilMapper.goodsToGoodsDTO(goodsService.findAll());
	}
}
