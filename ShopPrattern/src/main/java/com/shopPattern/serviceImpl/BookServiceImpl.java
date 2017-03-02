package com.shopPattern.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shopPattern.dao.BookDao;
import com.shopPattern.entity.Book;
import com.shopPattern.service.BookService;

@Service
public class BookServiceImpl implements BookService{

	@Autowired
	private BookDao bookDao;

	public void save(Book book) {
		bookDao.save(book);
	}

	public List<Book> findAll() {
		return bookDao.findAll();
	}

	public Book findOne(int id) {
		return bookDao.findOne(id);
	}

	public void delete(int id) {
		bookDao.delete(id);
	}

}
