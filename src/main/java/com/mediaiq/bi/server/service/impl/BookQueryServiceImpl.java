package com.mediaiq.bi.server.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mediaiq.bi.server.domain.Book;
import com.mediaiq.bi.server.repo.BookRepo;
import com.mediaiq.bi.server.service.BookQueryService;



@Service
public class BookQueryServiceImpl extends
		AbstractCrudServiceImpl<Book, Long, BookRepo> implements
		BookQueryService {

	@Autowired
	private BookRepo bookRepo;

	@Override
	public BookRepo getRepository() {
		return bookRepo;
	}

	@Override
	public List<Book> getByName(String name) {
		// TODO Auto-generated method stub
		return bookRepo.findByName(name);
	}

	@Override
	public List<Book> getByAuthor(String author) {
		// TODO Auto-generated method stub
		return bookRepo.findByAuthor(author);
	}

	
}
