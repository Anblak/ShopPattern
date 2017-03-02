package com.shopPattern.controller;




import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.shopPattern.entity.Book;
import com.shopPattern.service.BookService;

@RestController
public class BookController {

	@Autowired
	private BookService bookService;
	
	@RequestMapping(value = "/saveBook", method = RequestMethod.POST)
	public void saveBook(@RequestBody Book book) {

		bookService.save(book);
		
		
	}	
	

	
}