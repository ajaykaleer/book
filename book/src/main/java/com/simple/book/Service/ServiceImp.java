package com.simple.book.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import entity.Book;
import repository.Bookrepo;

@Service
public class ServiceImp {

	@Autowired
	private Bookrepo bookrepo;
	
	public List<Book> getAllBooks()
	{
		return bookrepo.findAll();
		
		
	}
	
}
