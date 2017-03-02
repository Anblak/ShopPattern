package com.shopPattern.service;

import java.util.List;

import com.shopPattern.entity.Book;

public interface BookService {

	void save(Book book);
	List<Book> findAll();
	Book findOne(int id);
	void delete(int id);

}