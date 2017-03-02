package com.shopPattern.dao;



import org.springframework.data.jpa.repository.JpaRepository;

import com.shopPattern.entity.Book;

public interface BookDao extends JpaRepository<Book, Integer> {

}