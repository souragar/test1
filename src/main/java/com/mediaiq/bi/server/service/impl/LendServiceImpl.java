package com.mediaiq.bi.server.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mediaiq.bi.server.domain.Book;
import com.mediaiq.bi.server.domain.LendRecords;
import com.mediaiq.bi.server.repo.LendRepo;
import com.mediaiq.bi.server.service.LendService;

@Service
public class LendServiceImpl extends
		AbstractCrudServiceImpl<LendRecords, Long, LendRepo> implements
		LendService {

	
	@Autowired
	private LendRepo LendRepo;

	@Override
	public LendRepo getRepository() {
		return LendRepo;
	}
	public List<LendRecords> findByPersonName(String name)
	{
		return LendRepo.findByPersonName(name);
	}
	@Override
	public List<Book> fetchAvailableBook() {
		// TODO Auto-generated method stub
		return LendRepo.fetchAvailableBook();
	}
}
