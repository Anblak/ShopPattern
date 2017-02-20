package com.shopPattern.controller;


import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.shopPattern.entity.Buy;
import com.shopPattern.service.BuyService;

@RestController
public class BuyController {
	@Autowired
	private BuyService buyService;
	
	@RequestMapping(value="/buy",method=RequestMethod.POST)
	public void buy(@RequestBody Buy buy){
		buy.setDateOfPublic(LocalDate.now());
		buyService.save(buy);
	}
}
